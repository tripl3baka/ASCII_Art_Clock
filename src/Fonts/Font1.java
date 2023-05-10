package Fonts;

import java.util.Map;

public class Font1 implements FontInterface {
    private final Map<Character, String[]> glyphs = Map.ofEntries(
            Map.entry('1', new String[]{
                    "    $$\\      ",
                    "  $$$$ |     ",
                    "  \\_$$ |     ",
                    "    $$ |     ",
                    "    $$ |     ",
                    "    $$ |     ",
                    "  $$$$$$\\    ",
                    "  \\______|   "}),
            Map.entry('2', new String[]{
                    "   $$$$$$\\    ",
                    "  $$  __$$\\   ",
                    "  \\__/  $$ |  ",
                    "   $$$$$$  |  ",
                    "  $$  ____/   ",
                    "  $$ |        ",
                    "  $$$$$$$$\\   ",
                    "   \\________|"}),
            Map.entry('3', new String[]{
                    "   $$$$$$\\    ",
                    "  $$ ___$$\\   ",
                    "  \\_/   $$ |  ",
                    "    $$$$$ /   ",
                    "    \\___$$\\   ",
                    "  $$\\   $$ |  ",
                    "  \\$$$$$$  |  ",
                    "    \\______/  "}),
            Map.entry('4', new String[]{
                    "  $$\\   $$\\   ",
                    "  $$ |  $$ |  ",
                    "  $$ |  $$ |  ",
                    "  $$$$$$$$ |  ",
                    "  \\_____$$ |  ",
                    "        $$ |  ",
                    "        $$ |  ",
                    "          \\__| "}),
            Map.entry('5', new String[]{
                    "  $$$$$$$\\    ",
                    "  $$  ____|   ",
                    "  $$ |        ",
                    "  $$$$$$$\\    ",
                    "  \\_____$$\\   ",
                    "  $$\\   $$ |  ",
                    "  \\$$$$$$  |  ",
                    "   \\______/  "}),
            Map.entry('6', new String[]{
                    "   $$$$$$\\    ",
                    "  $$  __$$\\   ",
                    "  $$ /  \\__|  ",
                    "  $$$$$$$\\    ",
                    "  $$  __$$\\   ",
                    "  $$ /  $$ |  ",
                    "   $$$$$$  |  ",
                    "   \\______/  "}),
            Map.entry('7', new String[]{
                    "  $$$$$$$$\\   ",
                    "  \\____$$  |  ",
                    "      $$  /   ",
                    "     $$  /    ",
                    "    $$  /     ",
                    "   $$  /      ",
                    "  $$  /       ",
                    "  \\__/      "}),
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
                    "  \\______/   "}),
            Map.entry('0', new String[]{
                    "   $$$$$$\\  ",
                    "  $$$ __$$\\ ",
                    "  $$$$\\ $$ |",
                    "  $$\\$$\\$$ |",
                    "  $$ \\$$$$ |",
                    "  $$ |\\$$$ |",
                    "  \\$$$$$$  /",
                    "   \\______/ "}),
            Map.entry(':', new String[]{
                    "        ",
                    "        ",
                    "  $$\\   ",
                    "  \\__|  ",
                    "        ",
                    "  $$\\   ",
                    "  \\__|  ",
                    "        ",})

    );


    @Override
    public String[] getGlyph(Character c) {
        return glyphs.get(c);
    }

    @Override
    public int getGlyphHeight() throws InvalidGlyphFormatException {

        int buffer = 0;
        int length = 0;
        for (Character key : glyphs.keySet()) {
                length = glyphs.get(key).length;
            for (Character key2 : glyphs.keySet()){
                buffer = glyphs.get(key2).length;
                if(length != buffer){
                    throw new InvalidGlyphFormatException("Invalid font: Height mismatch");
                }
            }
        }
        return length;
    }

    @Override
    public boolean hasGlyph(Character c) {
        return glyphs.containsKey(c);
    }


}


