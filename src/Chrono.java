/**
 * Created by lb685 on 27/11/2016.
 */

import javax.swing.*;
import java.text.DecimalFormat;

public class Chrono extends Thread {

    private JLabel labelChrono;
    private boolean startChrono;
    private String strChrono;
    private Model model;

    public Chrono(JLabel labelChrono) {

        this.labelChrono = labelChrono;

    }

    public String getStrChrono() {
        return strChrono;
    }

    public void run() {

        startChrono = true;
        double time = 0;

        while (startChrono) {

            try {
                sleep(10);
                time = time + 0.01;
                DecimalFormat df = new DecimalFormat("######0.00");
                strChrono = df.format(time);
                labelChrono.setText("Chrono : " + strChrono);
            } catch (InterruptedException e) {
                interrupt();
            }

        }

    }

    public void stopChrono() {

        interrupt();

    }

    public String toString() {
        return strChrono;
    }

}


