package Fonts;

import java.util.Map;

public abstract class FontProperties {

    public String[] getGlyph(Character c) {
        return getGlyphs().get(c);
    }

    public int getGlyphHeight() throws InvalidGlyphFormatException {

        int prev = -1;

        for (String[] glyph : getGlyphs().values()) {
            if (prev != -1 && prev != glyph.length) {
                throw new InvalidGlyphFormatException("Invalid font: Height mismatch");
            }
            prev = glyph.length;
        }
        return prev;
    }

    public boolean hasGlyph(Character c) {
        return getGlyphs().containsKey(c);
    }

    public abstract Map<Character, String[]> getGlyphs();
}
