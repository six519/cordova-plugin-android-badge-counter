"use strict";

var exec = require("cordova/exec");

var badgeCounterPlugin = {
	setBadge: function(badge_count, sc, ec) {
		exec(sc, ec, "BadgeCounterPlugin", "login", [badge_count]);
	},
	clearBadge: function(sc, ec) {
		exec(sc, ec, "BadgeCounterPlugin", "clearBadge", []);	
	}
};

module.exports = badgeCounterPlugin;