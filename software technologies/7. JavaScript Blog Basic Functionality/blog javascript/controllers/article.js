const Article = require('../models').Article;
const User = require('../models').User;
module.exports = {
    createGet: (req, res) => {
        res.render('article/create')
    },

    createPost: (req, res) => {

        //take values from request

        const title = req.body.title;
        const content = req.body.content;

        //validate input

        let errorMsg = false;

        if (!req.isAuthenticated()) {
            errorMsg = 'You must be logged in before creating articles';
        } else if (!title) {
            errorMsg = 'Title cannot be empty';

        } else if (!content) {
            errorMsg = 'Title cannot be empty';
        }

        if (errorMsg) {
            res.render('article/create', {error: errorMsg}, title, content);
            return;
        }

        //find author

        const authorId = req.user.id;

        const article = {
            title,
            content,
            authorId
        };
        //record values
        Article.create(article).then((article) => {
            res.redirec('/');
        }).catch(e => {
            console.log(e.message);
            res.render('article/create')
        })

        //redirect to /
    },
    details: (req, res) => {
        // get article ID
        const articleID = Number(req.params.id);


        // get form DB by ID
        Article.findById(articleID, {
            include: [{
                model: User
            }]
        }).then(article => {
            if (article === null) {
                throw new Error('Article not fount: ' + articleID);
            }
            res.render('article/details', article.dataValues)
        }).catch(e => {
            console.log(e.message);
            res.redirect('/404');
        });
        //render templay with data
    }
};