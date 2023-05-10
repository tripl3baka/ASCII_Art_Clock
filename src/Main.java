import Fonts.Font1;

public class Main {
    public static void main(String[] args) {

        Renderer renderer = new Renderer();
        Font1 font1 = new Font1();

        System.out.println(renderer.render("21:37:00",font1));
    }
}