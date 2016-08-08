Installation
============

``cordova plugin add https://github.com/six519/cordova-plugin-android-badge-counter.git --variable MAIN_ACTIVITY_CLASS="<FULLY_QUALIFIED_CLASS_NAME_OF_MAINACTIVITY>"``

or via npm

``cordova plugin add cordova-plugin-android-badge-counter --variable MAIN_ACTIVITY_CLASS="<FULLY_QUALIFIED_CLASS_NAME_OF_MAINACTIVITY>"``

Note
====

If an error ``Error: Cannot find module 'xml2js'`` occurred then you need to uninstall first the plugin and install that missing module before re-installing the plugin again.
::

    cordova plugin rm cordova-plugin-android-badge-counter
    npm install xml2js

Usage
=====
::

    //set badge count
    window.badgeCounterPlugin.setBadge(1, function(e){
        //success callback
    }, function(e){
        //error callback
        alert('The error is: ' + e);
    });

    //clear badge
    window.badgeCounterPlugin.clearBadge(function(e){
        //success callback
    }, function(e){
        //error callback
    });
