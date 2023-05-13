package Fonts;

import java.util.Map;

public class Font2 extends FontProperties {

    Map<Character, String[]> glyphs = Map.ofEntries();
    @Override
    public Map<Character, String[]> getGlyphs(){
        return glyphs;
    }
}
