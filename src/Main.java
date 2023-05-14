import Fonts.BigMoneyFont;
import Fonts.VoidFont;
import Fonts.FontProperties;
import Rendering.Renderer;

import java.util.Calendar;
import java.util.Scanner;

public class Main {
    StringBuilder st = new StringBuilder();
    Renderer renderer = new Renderer(font);
    static FontProperties font = new BigMoneyFont(); //default font

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String sel = "";
        System.out.println("Select font:");
        System.out.print("1. Big Money" + "\n" + "2. Void");
        System.out.println();
        do {
            sel = sc.nextLine();
        }
        while (Integer.parseInt(sel) < 1 || Integer.parseInt(sel) > 2);
        int selInt = Integer.parseInt(sel);
        sc.close();
        System.out.print("\033[H\033[2J");

        switch(selInt) {
            case 1 -> font = new BigMoneyFont();
            case 2 -> font = new VoidFont();
        }

        Main main = new Main();
    }

    public Main() {
        int exit = 0;
        while (true) {
            Calendar calendar = Calendar.getInstance();
            String hours = String.format("%02d",(Integer) calendar.get(Calendar.HOUR_OF_DAY));
            String minutes = String.format("%02d",(Integer)calendar.get(Calendar.MINUTE));
            String seconds = String.format("%02d",(Integer)calendar.get(Calendar.SECOND));
            st.setLength(0);
            st.append(hours).append(":").append(minutes).append(":").append(seconds);

            printTime(st);
            try {
                Thread.sleep(1000);
                System.out.print("\033[H\033[2J");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    void printTime(StringBuilder st) {
        System.out.println(renderer.render(st.toString(), font));
    }
}