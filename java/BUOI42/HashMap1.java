import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class HashMap1 {
    public static void test1(){
        HashMap<String,String> map = new HashMap<>();
        map.put("USA","Washington, D.C.");
        map.put("France","Paris");
        map.put("Japan","Tokyo");

        //kiểm tra sự tồn tại của một khóa
        if(map.containsKey("France")){
            System.out.println("Capital of France is: " + map.get("France"));
        }
        else{
            System.out.println("France is not a country in this map");
        }
        //kiểm tra sự tồn tại của một giá trị
        if(map.containsValue("Tokyo")){
            System.out.println("Tokyo is a capital of Japan");
        }
        //xóa 1 phâ tử
        map.remove("Japan");
        System.out.println("đã xóa Japan: " + map.get("Japan"));
        System.out.println("################");
        System.out.println("Các dữ liệu còn lại trong map");
        for(String key : map.keySet()){
            System.out.println(key + " : " + map.get(key));
        }
        System.out.println("################");
        //lặp qua các cặp khóa giá trị bằng cách sử dụng entrySet();
        for(Map.Entry<String,String> entry : map.entrySet()){
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println("Contry : " + key + ", Capital : " + value);
        }
        System.out.println("################");

        //lấy giá trị với khóa có sẵn
        System.out.println("Value for key 'USA': "+ map.getOrDefault("USA", "Not found"));

        //Lấy giá trị với khóa ko có sẵn
        System.out.println("Value for key 'C': "+ map.getOrDefault("C", "Not found"));

        //thêm hặc cập nhật gía trị nếu khóa không có mặt (Thay đổi kiểu giá trị thành String)
        map.putIfAbsent("Vietnam", "Ha Noi");
        System.out.println("Value for key 'Vietnam (Nếu biến việt nam không có thì sẽ hiển thị hà nội)': "+ map.get("Vietnam"));

        //Cập nhật giá trị nếu khóa có mặt (Thay đổi kiểu giá trị từ Paris -> Paris (Update))
        map.computeIfPresent("France", (k,v) -> v + "(Đã cập nhật nếu khóa tồn tại)");
        System.out.println("Update France capital : "+ map.get("France"));
    }

    public static void test2_countWords(){
        System.out.println("################");
        System.out.println("Tách từng ký tự");
        String s = "xin chào";
        HashMap<String,Integer> map = new HashMap<>();
        String[]words = s.split(""); // tách từng ký tự
        for(String x : words){
            int count = map.getOrDefault(x, 0);
            map.put(x, count + 1);
        }
        for(String key : map.keySet()){
            System.out.println(key + " : " + map.get(key));
        }
    }
    public static void test3_countWords(){
        System.out.println("################");
        System.out.println("Phần 3");
        System.out.println("Tách từng chuỗi");
        String s = "xin chào các bạn";
        HashMap<String,Integer> map = new HashMap<>();
        StringTokenizer tokenizer = new StringTokenizer(s); //tách chuỗi
        while(tokenizer.hasMoreTokens()){
            String word = tokenizer.nextToken();
            map.put(word,map.getOrDefault(word,0) + 1);
        }
        for (String key : map.keySet()){
            System.out.println(key + " : " + map.get(key));
        }
    }
    public static void test4_distionary(){
        //tạo 1 hashmap để lưu trữ từ điển
        HashMap<String,String> dictionary = new HashMap();

        //thêm một số từ và định nghĩa vào từ điển
        dictionary.put("apple","a fruit that is typically round red");
        dictionary.put("banana","a fruit that is typically round red");
        dictionary.put("cherry","a fruit that is typically round red");
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập vào tra cứu : ");
        String name = sc.nextLine();
        String res = dictionary.get(name);
        if(res!= null){
            System.out.println(name + " : " + res);
        }
        else{
            System.out.println("Từ này không tồn tại trong từ điển");
        }

    }
    public static void test5_stream(){
        System.out.println("###########");
        System.out.println("Phần 5");
        System.out.println("Tổng công ty");
        HashMap<String,Integer> map = new HashMap<>();
        map.put("USA",3);
        map.put("France",7);
        map.put("Japan",2);
        map.put("Vietnam",25);
       for(String key : map.keySet()){
           System.out.println(key + ":" + map.get(key));
       }
        System.out.println("###########");
        System.out.println("In ra cac phan tu trong hashmap");
       //In ra cac phan tu trong hashmap
        map.entrySet().stream().
                forEach(item->System.out.println(item.getKey()+":"+item.getValue()));
        System.out.println("###########");

        //Tính tổng số lượng các công ty trên
        int kq = map.values().stream()
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println("Tổng số lượng các công ty");
        System.out.println("Sum="+kq);
        System.out.println("###########");

        //Lọc các quốc gia có số lượng cty > 5
        Map<String,Integer> newMap = map.entrySet().stream()
                .filter(item -> item.getValue()>5)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        System.out.println("các quốc gia có số lượng cty > 5");
        System.out.println(newMap );

        //lọc quốc gia trên 10 công ty
        Map<String,Integer> map10 = map.entrySet().

        System.out.println("###########");
        System.out.println("Sắp xếp giảm dần");
        map.entrySet().stream()
                .sorted(Map.Entry.<String,Integer> comparingByValue().reversed())
                .forEach(item -> System.out.println(item.getKey()+":"+item.getValue()));
    }

    public static void main(String[] args) {
        test1();
        test2_countWords();
        test3_countWords();
//        test4_distionary();
        test5_stream();
    }
}
