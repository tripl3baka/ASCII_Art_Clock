import Fonts.Font1;
import Fonts.Font2;
import Fonts.FontProperties;
import Rendering.Renderer;

import java.util.Calendar;
import java.util.Scanner;

public class Main {
    StringBuilder st = new StringBuilder();
    Renderer renderer = new Renderer(font);
    static FontProperties font = new Font1(); //default font

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String sel = "";
        System.out.println("Select font:");
        System.out.print("1. Big Money" + "\n" + "2. Test");
        System.out.println();
        do {
            sel = sc.nextLine();
        }
        while (Integer.parseInt(sel) < 1 || Integer.parseInt(sel) > 2);
        int selInt = Integer.parseInt(sel);
        sc.close();
        System.out.print("\033[H\033[2J");

        switch(selInt) {
            case 1 -> font = new Font1();
            case 2 -> font = new Font2();
        }

        Main main = new Main();
    }

    public Main() {
        int exit = 0;
        while (true) {
            Calendar calendar = Calendar.getInstance();
            String hours = ((Integer) calendar.get(Calendar.HOUR_OF_DAY)).toString();
            String minutes = ((Integer) calendar.get(Calendar.MINUTE)).toString();
            String seconds = ((Integer) calendar.get(Calendar.SECOND)).toString();
            st.setLength(0);
            st.append(hours).append(":").append(minutes).append(":").append(seconds);
            printTime();
            try {
                Thread.sleep(1000);
                System.out.print("\033[H\033[2J");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    void printTime() {
        System.out.println(renderer.render(st.toString(), font));
    }
}