var fs, path;

module.exports = function(context) {
    fs = require('fs');
    path = require('path'); 

    console.log("The main activity is " + process.env.MAIN_ACTIVITY_CLASS);    

};