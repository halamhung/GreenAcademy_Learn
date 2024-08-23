import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

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
        System.out.println("#####");
        Predicate<Point> SumPoint = point -> point.getX() + point.getY() > 7;
        Predicate<Point> SumPoint2 = point -> {
            if(point.getX() > 5){
                return point.getX() + point.getY() > 7;
            }else{
                return point.getX() + point.getY() > 6;
            }
        };
        for(Point point : points){
            if(SumPoint2.test(point)){
                System.out.println(point.toString());
            }
        }
        Function<Point,Integer> sumPoint3 = p->p.getY() + p.getX();
        Function<Point,Integer> sumPoint4 = p->{
          return p.getX() > p.getY() ? p.getY() - p.getX() : p.getX() + p.getY();
        };
        for(Point point : points){
           System.out.println(sumPoint4.apply(point));
        }
        Consumer<Point> printMessage = p ->{
            if(p.getX() > p.getY()){
                System.out.println(p.getY() - p.getX());
            }
            else{
                System.out.println(p.getX() + p.getY());
            }
        };
        System.out.println("#####");
        points.forEach(printMessage);
        System.out.println("#####");
        for(Point point : points){
            printMessage.accept(point);
        }
        System.out.println("#####");
        points.stream()
                .filter(p->p.getX()>3)
                .forEach(System.out::println);
        System.out.println("#########");
        for(Point a:points){
            if(a.getX()>3){
                System.out.println(a.toString());
            }
        }
        System.out.println("#########");
        Predicate<Point> pre_x = point -> point.getX() > 3;
        for(Point point : points){
            if(pre_x.test(point)){
                System.out.println(point.toString());
            }
        }
        System.out.println("#########");
        Consumer<Point> consum_x = p->{
          if(p.getX()>3){
              System.out.println(p.toString());
          }
        };
        points.forEach(consum_x);
        System.out.println("#########");
        //List<String>
    }
}