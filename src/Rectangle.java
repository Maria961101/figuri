import java.awt.*;
public abstract class Rectangle extends Shape{
    @Override
    void equals() {
        super.equals();
    }
    void get(int q, int a, int z, int p){
        super.x = q;
        super.y = a;
        super.x1 = z;
        super.y1 = p;
    }
    @Override
    void draw(Graphics risovalka, int x, int y, int x1, int y1) {
        risovalka.drawRect(x,y,x1,y1);
    }
}
