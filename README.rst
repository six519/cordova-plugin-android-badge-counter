Installation
============

``cordova plugin add https://github.com/six519/cordova-plugin-android-badge-counter.git --variable MAIN_ACTIVITY_CLASS="<FULLY_QUALIFIED_CLASS_NAME_OF_MAINACTIVITY>"``


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
