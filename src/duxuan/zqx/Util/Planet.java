package duxuan.zqx.Util;

import java.awt.Color;
import java.awt.Graphics;

/**
 * Определение планеты, вращение вокруг солнца эллиптически
 * @author ZQX
 *
 */
public class Planet extends Star {
    double longAxris;        // Эллиптическая длинная ось
    double shortAxris;		 // Эллиптическая короткая ось
    double degree;           //угол
    double    speed;        // Поворотность скорости
    Star   center;          // Поверните центр, солнце
    //	double x1,y1;
    public Planet(Star center,String path,double longAxris, double shortAxris, double degree, double d) {						// Метод строительства наложения
        this.center = center;
        this.img = GameUtil.getImage(path);    // Получить путь к картинке
//		this.x1 = center.x+longAxris;
//		this.y1 = center.y;
        this.x = center.x+longAxris;	       // инициализировать X координату единой планеты с собственной длинной оси
        this.y = center.y;						// инициализировать координаты Y единой планеты - координата Y Sun
        this.degree = degree;					// / / Задание на угол
        this.speed = d;							// / / Назначение скорости вращения
        this.longAxris = longAxris;				// Назначить значение для длинной оси
        this.shortAxris = shortAxris;			// Назначьте короткую ось
    }
    public Planet(String path, double x, double y) {
        super(path, x, y);					   // Позвоните конструктору родительского класса
    }
    public void draw(Graphics g) {			  // перемаскиваю метод рисования родительского класса
//		g.drawImage(img, (int)x1, (int)y1, null);
//		x1 = center.x+longAxris*Math.cos(degree);
//		y1 = center.y+shortAxris*Math.sin(degree);
        super.draw(g);						 // вызовите метод родительского класса для выполнения изображения планеты, чтобы отобразить его в окне
        drawOval(g);						// Метод для вызова эллиптической дорожки
        move();								// Позвоните на планету вокруг солнечного эллипса
    }
    public void move() {            // планета эллипс
        x = (center.x+center.width/2)+longAxris*Math.cos(degree);
        y = (center.y+center.heigth/2)+shortAxris*Math.sin(degree);
        degree +=speed;
    }
    public void drawOval(Graphics g) {
        double ovalX,ovalY,ovalWidth,ovalHeight;    // Определите координаты X, Y и ширину и высоту эллипса рисования
        ovalX = (center.x+center.width/2) -longAxris;   // эллиптическая координата X равна центру x координата солнца минус длинная ось
        ovalY = (center.y+center.heigth/2) -shortAxris;// Координата эллиптической y равна координату центра Y Sun Minus Collow Axis
        ovalWidth = longAxris*2;					// Эллиптическая ширина в два раза длинна.
        ovalHeight = shortAxris*2;					// Эллиптическая высота в два раза больше оси

        Color c = g.getColor();						// Получить цвет кисти
        g.setColor(Color.blue);						// Изменение цвета ручки на синий
        g.drawOval((int)ovalX, (int)ovalY, (int)ovalWidth, (int)ovalHeight);  // покраска эллиптической траектории
        g.setColor(c);								// Удалите ручку к оригинальному цвету кисти
    }

}
