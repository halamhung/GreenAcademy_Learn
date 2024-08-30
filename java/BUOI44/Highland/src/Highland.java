import java.util.Scanner;

public class Highland {
    private String name;
    private String diachi;
    private int StoreId;
    private double thu ;
    private double chi;
    public Highland(String name, String diachi, int storeId) {
        this.name = name;
        this.diachi = diachi;
        this.StoreId = storeId;
    }
    public String getName() {
        return name;
    }
    public String getDiachi() {
        return diachi;
    }
    public int getStoreId() {
        return StoreId;
    }

    //viet ham nhap
    public void nhap(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ten cua highland:");
        this.name = scanner.nextLine();
        System.out.println("Nhap dia chi cua highland:");
        this.diachi = scanner.nextLine();
        System.out.println("Nhap store id cua highland:");
        this.StoreId = scanner.nextInt();
        System.out.println("doanh thu cua highland:");
        this.thu = scanner.nextDouble();
        System.out.println("chi cua highland:");
        this.chi = scanner.nextDouble();
        scanner.close();
    }


    @Override
    public String toString() {
        return "Highland{" +
                "name='" + name + '\'' +
                ", diachi='" + diachi + '\'' +
                ", StoreId=" + StoreId +
                '}';
    }
}
