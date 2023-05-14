package Fonts;

import java.util.Map;

public class VoidFont extends FontProperties {

    Map<Character, String[]> glyphs = Map.ofEntries(
            Map.entry('1', new String[]{
                    "  _  ",
                    " / | ",
                    " | | ",
                    " | | ",
                    " |_| ",
                    "     "
            }),
            Map.entry('2', new String[]{
                    "  ____   ",
                    " |___ \\  ",
                    "   __) | ",
                    "  / __/  ",
                    " |_____| ",
                    "         "
            }),
            Map.entry('3', new String[]{
                    "  _____  ",
                    " |___ /  ",
                    "   |_ \\  ",
                    "  ___) | ",
                    " |____/  ",
                    "         "
            }),
            Map.entry('4', new String[]{
                    "  _  _    ",
                    " | || |   ",
                    " | || |_  ",
                    " |__   _| ",
                    "    |_|   ",
                    "          "
            }),
            Map.entry('5', new String[]{
                    "  ____   ",
                    " | ___|  ",
                    " |___ \\  ",
                    "  ___) | ",
                    " |____/  ",
                    "         "
            }),
            Map.entry('6', new String[]{
                    "   __    ",
                    "  / /_   ",
                    " | '_ \\  ",
                    " | (_) | ",
                    "  \\___/  ",
                    "         "
            }),
            Map.entry('7', new String[]{
                    "  _____  ",
                    " |___  | ",
                    "    / /  ",
                    "   / /   ",
                    "  /_/    ",
                    "         "
            }),
            Map.entry('8', new String[]{
                    "   ___   ",
                    "  ( _ )  ",
                    "  / _ \\  ",
                    " | (_) | ",
                    "  \\___/  ",
                    "         "
            }),
            Map.entry('9', new String[]{
                    "   ___   ",
                    "  / _ \\  ",
                    " | (_) | ",
                    "  \\__, | ",
                    "    /_/  ",
                    "         "
            }),
            Map.entry('0', new String[]{
                    "   ___   ",
                    "  / _ \\  ",
                    " | | | | ",
                    " | |_| | ",
                    "  \\___/  ",
                    "         "
            }),
            Map.entry(':', new String[]{
                    "       ",
                    "  (_)  ",
                    "   _   ",
                    "  (_)  ",
                    "       ",
                    "       ",
            }));

    @Override
    public Map<Character, String[]> getGlyphs() {
        return glyphs;
    }
}
