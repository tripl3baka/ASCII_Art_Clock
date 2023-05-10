import Fonts.Font1;
import Rendering.Renderer;

import java.util.Calendar;

public class Main {
    public static void main(String[] args) {

        TimeWorker timeWorker = new TimeWorker();
        Thread thread = new Thread(timeWorker);
        thread.start();
    }
}