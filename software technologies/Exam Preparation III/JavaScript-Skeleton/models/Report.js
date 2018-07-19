const Sequelize = require('sequelize');

module.exports = function (sequelize) {
    let Report= sequelize.define('Report',{
        status:{
            type:Sequelize.STRING,

        },
        message:{
            type:Sequelize.STRING,

        },
        origin:{
            type:Sequelize.STRING,

        }
    },{
        timestamps:false
    });
    return Report;
};