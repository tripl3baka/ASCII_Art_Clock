import Fonts.FontInterface;

public class Renderer implements RendererInterface {

    @Override
    public String render(String input, FontInterface font) {
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < 8; i++) {

            for (char a : input.toCharArray()){
                if(a != ':'){ //TODO
                    builder.append(font.getGlyph(a)[i]);
                }
            }
            builder.append("\n");
        }
        return builder.toString();
    }
}
