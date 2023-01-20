package duxuan.zqx.Util;            // Названия пакета

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

public class GameUtil {
    private GameUtil(){}  // Класс инструмента лучше всего подходит для частных.

    public static Image getImage(String path){
        URL u = GameUtil.class.getClassLoader().getResource(path);
        BufferedImage bi=null;
        try {
            bi = javax.imageio.ImageIO.read(u);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return bi;
    }
}
