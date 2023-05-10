package Rendering;

import Fonts.FontInterface;
import Fonts.InvalidGlyphFormatException;

public class Renderer implements RendererInterface {
    private int glyphHeight;
    public Renderer(FontInterface font) {

        try {
            glyphHeight = font.getGlyphHeight();
        } catch (InvalidGlyphFormatException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String render(String input, FontInterface font) {
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < glyphHeight; i++) {

            for (char a : input.toCharArray()){
                if(font.hasGlyph(a)){
                    builder.append(font.getGlyph(a)[i]);
                }
            }
            builder.append("\n");
        }
        return builder.toString();
    }
}
