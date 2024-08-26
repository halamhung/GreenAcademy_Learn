package Gaham;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Monan {
    public static final int FLAG_CARB = 1;
    public static final int FLAG_FAT = 2;
    public static final int FLAG_FAT_BH = 3;
    public static final int FLAG_PROTEIN = 4;
    public static final int FLAG_CALO = 5;
    private List<FoodItem> foodItems;
    public Monan(){
        this.foodItems = new ArrayList<>();
    }
    public void nhap(){
        System.out.println("Nhập Gà (gram)");
        FoodItem ga = new Ga();
        ga.nhap();
        this.foodItems.add(ga);

        System.out.println("Nhập Hạt sen (gram)");
        FoodItem hatsen = new Hatsen();
        hatsen.nhap();
        this.foodItems.add(hatsen);

        System.out.println("Nhập Cà rốt (gram)");
        FoodItem carot = new Carot();
        carot.nhap();
        this.foodItems.add(carot);

        System.out.println("Nhập Táo đỏ (gram)");
        FoodItem taodo = new Taodo();
        taodo.nhap();
        this.foodItems.add(taodo);

        System.out.println("Nhập Nấm đông cô (gram)");
        FoodItem namdongco = new Namdongco();
        namdongco.nhap();
        this.foodItems.add(namdongco);
    }
    public float Tinhnangluong(int flag){
        float sum = 0;
        for(FoodItem a:this.foodItems){
            if(flag ==1){
                sum += a.getWeight()/100*a.getCarb();
            }else if(flag ==2){
                sum += a.getWeight()/100*a.getFat();
            }else if(flag ==3){
                sum += a.getWeight()/100*a.getFatbaohoa();
            }
            else if(flag ==4){
                sum += a.getWeight()/100*a.getProtein();
            }
            else if(flag ==5){
                sum += a.getWeight()/100*a.getCalo();
            }
        }
        return sum*0.8f;
    }
    public void cau2(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chỉ số crab cần thiết cho 1 bữa ăn:");
        int crab = sc.nextInt();
        float nangluong =Tinhnangluong(1);
        if(crab > nangluong){
            System.out.printf("có thể em cần bổ sung thêm %f crab nữa nha",crab -nangluong);
        }
        System.out.println("Mời bạn nhập chỉ số fat cần thiết cho 1 bữa ăn ");
        int fat= sc.nextInt();
        nangluong=Tinhnangluong( 2);
        if(fat> nangluong){
            System.out.printf("Có thể em cần bổ sung thêm %f fat nữa nha", fat - nangluong);
        }

        System.out.println("Mời bạn nhập chỉ số fat cần thiết cho 1 bữa ăn ");
        int fatbh= sc.nextInt();
        nangluong=Tinhnangluong( 3);
        if(fatbh> nangluong){
            System.out.printf("Có thể em cần bổ sung thêm %f fatbh nữa nha", fatbh - nangluong);
        }

        System.out.println("Mời bạn nhập chỉ số protein cần thiết cho 1 bữa ăn ");
        int protein= sc.nextInt();
        nangluong=Tinhnangluong( 4);
        if(protein> nangluong){
            System.out.printf("Có thể em cần bổ sung thêm %f protein nữa nha", protein - nangluong);
        }

        System.out.println("Mời bạn nhập chỉ số calo cần thiết cho 1 bữa ăn ");
        int calo= sc.nextInt();
        nangluong=Tinhnangluong( 5);
        if(calo> nangluong){
            System.out.printf("Có thể em cần bổ sung thêm %f calo nữa nha", calo - nangluong);
        }
    }
    public float tinhNangLuong2(int flag) {
        return (float) this.foodItems.stream()
                .mapToDouble(a -> {
                    if(flag == FLAG_CARB) {
                        return a.getWeight() / 100.0f * a.getCarb();
                    }
                    else if(flag == FLAG_FAT) {
                        return a.getWeight() / 100.0f * a.getFat();
                    }
                    else if(flag == FLAG_FAT_BH) {
                        return a.getWeight() / 100.0f * a.getFatbaohoa();
                    }
                    else if(flag == FLAG_PROTEIN) {
                        return a.getWeight() / 100.0f * a.getProtein();
                    }
                    else if(flag == FLAG_CALO) {
                        return a.getWeight() / 100.0f * a.getCalo();
                    }
                    throw new IllegalArgumentException("Invalid flag value");
                }).sum();
    }
    public float cau3(){
        if(Tinhnangluong(FLAG_CALO)-600>0){
            return 30*(Tinhnangluong(FLAG_CALO)-600)/147.5f;
        }else{
            return 0;
        }
    }
    public static void main(String[] args) {
        Monan monan = new Monan();
        monan.nhap();
        monan.cau2();
        System.out.println("Câu 3:"+monan.cau3());
    }
}