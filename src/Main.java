import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        BufferedImage result = new BufferedImage(700, 700, BufferedImage.TYPE_INT_RGB);
        Graphics risovalka = result.createGraphics();
        Circle circle = new Circle() {
        };
        circle.get(200, 200, 200, 200);
        Rectangle rectangle = new Rectangle() {
        };
        rectangle.get(200, 200, 200, 200);
        Shape[] q = {circle, rectangle};

        for (int i = 0; i < q.length; i++) {
            q[i].draw(risovalka, q[i].x, q[i].y, q[i].x1, q[i].y1);
        }
        File cdelano = new File("cdelano.png");
        try {
            ImageIO.write(result, "png", cdelano);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}