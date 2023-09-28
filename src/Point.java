public class Point {
    //instance variables
    private int x;
    private int y;

    // constructors
    public Point (int x, int y) {
        this.x = x;
        this.y = y;
    }
    public Point (int x) {
        this.x = x;
        y = x;
    }
    public Point () {
        x = 0;
        y = 0;
    }

    //getters and setters
    public int getX () {
        return x;
    }
    public int getY () {
        return y;
    }
    public void setX (int newX) {
        x = newX;
    }
    public void setY (int newY) {
        y = newY;
    }

    //methods
    public String coordinate() {
        return "(" + x + "," + y + ")";
    }
    public String quadrant() {
        if (x == 0  && y == 0) {
            return "origin";
        } else if (x == 0 || y == 0) {
            return "on an axis";
        } else if (x > 0) {
            if (y > 0) {
                return "I";
            } else {
                return "IV";
            }
        } else {
            if (y > 0) {
                return "II";
            } else {
                return "III";
            }
        }
    }
}