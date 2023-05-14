package Rendering;

import Fonts.FontProperties;
import Fonts.InvalidGlyphFormatException;

public class Renderer implements RendererInterface {
    private int glyphHeight;

    public Renderer(FontProperties font) {

        try {
            glyphHeight = font.getGlyphHeight();
        } catch (InvalidGlyphFormatException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String render(String input, FontProperties font) {
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < glyphHeight; i++) {

            for (char a : input.toCharArray()) {
                if (font.hasGlyph(a)) {
                    builder.append(font.getGlyph(a)[i]);
                }
            }
            builder.append("\n");
        }
        return builder.toString();
    }
}
