import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<String>();
        colors.add("red");
        colors.add("blue");
        colors.add("green");

        //Truy cập phần tử vị trí được chỉ định
        System.out.println(colors.get(1));

        //thay đổi phần tử tại vi trí được chỉ
        colors.set(1, "yellow");

        //xóa phần tử theo giá trị
        colors.remove("red");
        System.out.println(colors);

        //xóa phần tử theo chỉ số
        colors.remove(1);
        System.out.println(colors);

        for(String color : colors){
            System.out.println(color);
        }
        //tạo một mảng
        String[] colorsArray = {"red", "blue", "green"};

        //tạo ArrayList từ mảng
        ArrayList<String> colorList = new ArrayList<>(Arrays.asList(colorsArray));
        //sắp xếp mảng:cách thường
        Collections.sort(colorList);
        //sử dụng biểu thức lamda để sắp xếp theo thứ tự tăng dần
        Collections.sort(colorList, (s1, s2) -> s1.compareTo(s2));
        System.out.println(colorList); // out put [blue, green, red]


    }
}