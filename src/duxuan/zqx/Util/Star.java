package duxuan.zqx.Util;

import java.awt.Graphics;
import java.awt.Image;

public class Star {
    Image img;        // Планета Изображение
    double x,y;       // Координаты планеты
    double width,heigth;  // планетарная высота и ширина изображения


    public Star(String path,double x,double y) {    // Метод строительства наложения
        this.img =GameUtil.getImage(path);          // Получить путь к картинке
        this.x = x; 							    // Получить X координату планеты
        this.y = y;							        // Получить координату Y планеты
        this.width = img.getWidth(null);    		// Получить ширину изображения планеты
        this.heigth = img.getHeight(null);			// получить высоту изображения планеты
    }
    Star(){

    }
    public void draw(Graphics g) {   			   // Покажите картину планеты в окне
        g.drawImage(img, (int)x, (int)y, null);
    }
}
