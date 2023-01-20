package duxuan.zqx.Solar;

import java.awt.Graphics;
import java.awt.Image;

import duxuan.zqx.Util.Constant;
import duxuan.zqx.Util.GameUtil;
import duxuan.zqx.Util.MyFrame;
import duxuan.zqx.Util.Planet;
import duxuan.zqx.Util.Star;

/**
 * Главное окно солнечной системы
 *
 */
public class SolarSystem extends MyFrame{
    Image img = GameUtil.getImage("images/bg.jpg");   // Получить путь к фоновым изображении
    Star sun = new Star("images/sun.jpg",Constant.MAX_WIDTH/2,Constant.MAX_HEIGHT/2);  // Определить свойства Солнца
    Planet earth = new Planet(sun, "images/earth.jpg", 150, 80, 3.14/3, 0.17);  // Определить свойства земли

//	Planet neptune = new Planet(sun, "images/Ueptune.jpg", 400, 240, 3.14/3, 0.08);

    public void paint(Graphics g) {
        g.drawImage(img, 0, 0, null);
        sun.draw(g);
        earth.draw(g);

// neptune.draw (g); Исключение загрузки изображения
    }
    public static void main(String[] args) {
        new SolarSystem().LoadWindow();         // Позвоните в окно нагрузки на LoadWindow () класса MyFram.
//		Star sun = new Star();
//		sun.Star(i, Constant.MAX_WIDTH/2, Constant.MAX_HEIGHT/2);
    }
}
