const Product = require('../models').Product;

module.exports = {
    index: (req, res) => {
        Product.findAll().then(entries => {
            res.render('product/index', {'entries': entries})
        })

    },

    createGet: (req, res) => {
        res.render('product/create');
    },

    createPost: (req, res) => {
        let args = req.body;
        Product.create(args).then(() => {
            res.redirect('/');
        })
    },

    editGet: (req, res) => {
        let id = req.params.id;


        Product.findById(id).then(entries => {
            res.render('product/edit', entries.dataValues)
        })
    },

    editPost: (req, res) => {
        let id = req.params.id;
        let args = req.body;

        Product.findById(id).then(product => {
            product.updateAttributes(args).then(() => {

                res.redirect('/')
            })
        })
    }
};