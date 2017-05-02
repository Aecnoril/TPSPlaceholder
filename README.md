# TPSPlaceholder
A PlaceholderAPI extension which shows you the server tps. In Color or plain white text.


## Installing
This plugin is an extension for the PlaceholderAPI plugin. Install it first!
You can download [PAPI here](https://www.spigotmc.org/resources/placeholderapi.6245)!

After installing PAPI, you can just drop the JAR into the extensions folder inside PAPI's plugin folder.
Want to know how to build the JAR? Look [here]!(https://maven.apache.org/run-maven/)

## Using the placeholders
After you've installed PAPI, you can start using it on your server.
The plugin currently uses the following placeholders:

### TPS rounded, plain white
- %tps_rounded_1%
- %tps_rounded_5%
- %tps_rounded_15%

These placeholders show the TPS for the last 1-5-15 minutes respectively. No coloring, just plain ol' white.

### TPS rounded, colored
- %tps_rounded_1_color%
- %tps_rounded_5_color%
- %tps_rounded_15_color%

These placeholders show the TPS for the last 1-5-15 minutes respectively too! But they're colored in the same way Spigot colors them.
- 20 - 18 is green
- 18-16 is yellow
- below 16 is red
