module.exports = function(context) {
    var fs = require('fs');
    var path = require('path'); 
    var exec = require('child_process').exec;
    
    try {
        var xml2js = require('xml2js');
    }catch(e) {
        exec("npm install xml2js");
        var xml2js = require('xml2js');
    }
    
    var json;
    try {
        var configFile = fs.readFileSync('config.xml', 'ascii');
        var parser = new xml2js.Parser();
        parser.parseString(configFile.substring(0, configFile.length), function (err, result) {
            json = result;
        });
    } catch (e) {
        console.log(e)
    }
    
    var cordova_app_id = json.widget.$.id;
    console.log('The id is: ' + cordova_app_id);

};