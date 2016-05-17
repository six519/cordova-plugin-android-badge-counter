module.exports = function(context) {
    var fs = require('fs');
    var path = require('path'); 
    var exec = require('child_process').exec;
    
    try {
        var xml2js = require('xml2js');
    }catch(e) {
        exec("npm install xml2js");
    }

};