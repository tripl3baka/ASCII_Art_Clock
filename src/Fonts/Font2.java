package Fonts;

public class Font2 implements FontInterface{
    @Override
    public String[] getGlyph(Character c) {
        return new String[0];
    }

    @Override
    public int getGlyphHeight() throws InvalidGlyphFormatException {
        return 0;
    }

    @Override
    public boolean hasGlyph(Character c) {
        return false;
    }
}
