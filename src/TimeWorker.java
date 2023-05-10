import Fonts.Font1;
import Rendering.Renderer;

import java.util.Calendar;

public class TimeWorker implements TimeWorkerInterface, Runnable{

    private StringBuilder st = new StringBuilder();
    Font1 font1 = new Font1();
    Renderer renderer = new Renderer(font1);

    @Override
    public void run() {
        while(true) {
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

    @Override
    public synchronized void printTime(){
        System.out.println(renderer.render(st.toString(), font1));

    }

}
