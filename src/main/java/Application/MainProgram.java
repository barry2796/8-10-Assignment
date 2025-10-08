package Application;

import java.util.ArrayList;

public class MainProgram {
    public static void main(String[] args) {
        ArrayList<Shape> shapes = new ArrayList<>();

        shapes.add(new Rectangle(new Point(2, 3), 4, 6));
        shapes.add(new Square(new Point(0, 0), 5));
        shapes.add(new Circle(new Point(1, -2), 3.5));

        // 1️⃣ Số lượng hình đã khởi tạo
        System.out.println("Number of Shaeps: " + Shape.getCount());

        // 2️⃣ Danh sách chi tiết các hình
        System.out.println("\nDetails:");
        for (Shape s : shapes) {
            System.out.println(" - " + s);
        }

        // 3️⃣ Danh sách tâm điểm
        System.out.println("\nCenterPoint list:");
        for (Shape s : shapes) {
            System.out.println(" - " + s.getCenterPoint());
        }
    }
}
