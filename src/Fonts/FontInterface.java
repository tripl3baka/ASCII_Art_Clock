package Fonts;

public interface FontInterface {

public String[] getGlyph(Character c);

public int getGlyphHeight() throws InvalidGlyphFormatException;

public boolean hasGlyph(Character c);

}
