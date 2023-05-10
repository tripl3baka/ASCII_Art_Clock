package Fonts;

import java.util.Map;

public class Font1 implements FontInterface {
    private final Map<Character, String[]> glyphs = Map.ofEntries(
            Map.entry('1', new String[]{
                    "    $$\\    ",
                    "  $$$$ |   ",
                    "  \\_$$ |   ",
                    "    $$ |   ",
                    "    $$ |   ",
                    "    $$ |   ",
                    "  $$$$$$\\  ",
                    "  \\______| "}),
            Map.entry('2', new String[]{
                    "   $$$$$$\\    ",
                    "  $$  __$$\\   ",
                    "  \\__/  $$ |  ",
                    "   $$$$$$  |  ",
                    "  $$  ____/   ",
                    "  $$ |        ",
                    "  $$$$$$$$\\   ",
                    "  \\________|  "}),
            Map.entry('3', new String[]{
                    "   $$$$$$\\   ",
                    "  $$ ___$$\\  ",
                    "  \\_/   $$ | ",
                    "    $$$$$ /  ",
                    "    \\___$$\\  ",
                    "  $$\\   $$ | ",
                    "  \\$$$$$$  | ",
                    "   \\______/  "}),
            Map.entry('4', new String[]{
                    "  $$\\   $$\\   ",
                    "  $$ |  $$ |  ",
                    "  $$ |  $$ |  ",
                    "  $$$$$$$$ |  ",
                    "  \\_____$$ |  ",
                    "        $$ |  ",
                    "        $$ |  ",
                    "        \\__|  "}),
            Map.entry('5', new String[]{
                    "  $$$$$$$\\    ",
                    "  $$  ____|   ",
                    "  $$ |        ",
                    "  $$$$$$$\\    ",
                    "  \\_____$$\\   ",
                    "  $$\\   $$ |  ",
                    "  \\$$$$$$  |  ",
                    "   \\______/   "}),
            Map.entry('6', new String[]{
                    "   $$$$$$\\    ",
                    "  $$  __$$\\   ",
                    "  $$ /  \\__|  ",
                    "  $$$$$$$\\    ",
                    "  $$  __$$\\   ",
                    "  $$ /  $$ |  ",
                    "   $$$$$$  |  ",
                    "   \\______/   "}),
            Map.entry('7', new String[]{
                    "  $$$$$$$$\\   ",
                    "  \\____$$  |  ",
                    "      $$  /   ",
                    "     $$  /    ",
                    "    $$  /     ",
                    "   $$  /      ",
                    "  $$  /       ",
                    "  \\__/        "}),
            Map.entry('8', new String[]{
                    "   $$$$$$\\    ",
                    "  $$  __$$\\   ",
                    "  $$ /  $$ |  ",
                    "   $$$$$$  |  ",
                    "  $$  __$$<   ",
                    "  $$ /  $$ |  ",
                    "  \\$$$$$$  |  ",
                    "   \\______/   "}),
            Map.entry('9', new String[]{
                    "   $$$$$$\\    ",
                    "  $$  __$$\\   ",
                    "  $$ /  $$ |  ",
                    "  \\$$$$$$$ |  ",
                    "   \\____$$ |  ",
                    "  $$\\   $$ |  ",
                    "  \\$$$$$$  |  ",
                    "   \\______/   "}),
            Map.entry('0', new String[]{
                    "   $$$$$$\\    ",
                    "  $$$ __$$\\   ",
                    "  $$$$\\ $$ |  ",
                    "  $$\\$$\\$$ |  ",
                    "  $$ \\$$$$ |  ",
                    "  $$ |\\$$$ |  ",
                    "  \\$$$$$$  /  ",
                    "   \\______/   "}),
            Map.entry(':', new String[]{
                    "        ",
                    "        ",
                    "  $$\\   ",
                    "  \\__|  ",
                    "        ",
                    "  $$\\   ",
                    "  \\__|  ",
                    "        "})

    );


    @Override
    public String[] getGlyph(Character c) {
        return glyphs.get(c);
    }

    @Override
    public int getGlyphHeight() throws InvalidGlyphFormatException {

        int prev = -1;

        for (String[] glyph : glyphs.values()) {
            if (prev != -1 && prev != glyph.length) {
                throw new InvalidGlyphFormatException("Invalid font: Height mismatch");
            }
            prev = glyph.length;
        }
        return prev;
    }

    @Override
    public boolean hasGlyph(Character c) {
        return glyphs.containsKey(c);
    }


}


