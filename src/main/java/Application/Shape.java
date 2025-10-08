package Application;

public abstract class Shape {
    protected Point centerPoint;
    private static int count = 0;

    public Shape(Point centerPoint) {
        this.centerPoint = centerPoint;
        count++;
    }

    public static int getCount() {
        return count;
    }

    public Point getCenterPoint() {
        return centerPoint;
    }


    @Override
    public String toString() {
        return "Center: " + centerPoint;
    }
}
