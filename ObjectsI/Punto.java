package ObjectsI;

public class Punto {
    private int x;
    private int y;

    Punto() {
        this.x = 0;
        this.y = 0;
    }

    Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }
    public void mostrar() {
        System.out.println("(" + this.x + ", " + this.y + ")");
    }

    public void desplaza(int d, boolean horizontal) {
        if (horizontal) {
            this.x += d;
        } else {
            this.y += d;
        }
    }
}