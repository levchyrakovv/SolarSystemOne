package duxuan.zqx.Util;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import static com.sun.java.accessibility.util.AWTEventMonitor.addWindowListener;
import static com.sun.org.apache.xerces.internal.util.DOMUtil.setVisible;

public class MyFrame extends Frame {
    /**
     * Определите интерфейс нагрузки окна
     */
    public  void LoadWindow() {
        setLocation(200,200);        // Определите местоположение верхнего левого угла окна в (200,200)
        setSize(Constant.MAX_WIDTH,Constant.MAX_HEIGHT);   // Определить ширину и высоту окна
        setVisible(true);			// Визуализация окна

        new PaintThread().start();    // Позвоните в внутренний класс окна красных красных краток
        addWindowListener(new WindowAdapter() {

            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    public void setVisible(boolean b) {

    }

    public void setLocation(int i, int i1) {

    }

    public void setSize(int maxWidth, int maxHeight) {

    }

    /**
     * Определить класс резьбового окна, является внутренним классом
     */
    class PaintThread extends Thread{
        public void run() {
            while(true) {
                repaint();             // Электристый интерфейс окраски окна, повторите окно нагрузки
                try {
                    Thread.sleep(80); 	// 1s = 1000 мс, компьютер спать 80ms
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        }
    }
}
