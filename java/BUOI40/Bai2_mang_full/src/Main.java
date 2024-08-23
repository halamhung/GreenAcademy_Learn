import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        String[] colorsArray = {"red", "blue", "green"};

        //tạo ArrayList từ mảng
        // Tạo ArrayList từ mảng
        ArrayList<String> colorsList = new ArrayList<>(Arrays.asList(colorsArray));
// Sắp xếp mảng: cách thường
        Collections.sort(colorsList);
// Sử dụng biểu thức lambda để sắp xếp danh sách theo thứ tự tăng dần
        Collections.sort(colorsList, (s1, s2) -> s1.compareTo(s2));
        System.out.println(colorsList); // Output: [Red, Green, Blue]

        ArrayList<Point> points = new ArrayList<>();
        points.add(new Point( 3, 5));
        points.add(new Point( 2,  6));
        points.add(new Point( 5,  2));
        points.add(new Point( 6,  0));


        Comparator<Point> x_y_compare = new Comparator<Point>() {
            @Override
//            public int compare(Point o1, Point o2) {
//                return Integer.compare(o1.getX(), o2.getX());
//            }
//
//            public int compare(Point p1, Point p2) {
//                int tmp = Integer.compare(p1.getX(), p2.getX());
//                if (tmp == 0)
//                    return Integer.compare(p1.getY(), p2.getY());
//                return tmp;
//            }

            public int compare(Point p1, Point p2) {
                return Integer.compare(p1.getX() + p1.getY(), p2.getX() + p2.getY());
            }
        };

        Collections.sort(points, x_y_compare);
        for (Point p : points) {
            System.out.println(p);
        }

    }
}