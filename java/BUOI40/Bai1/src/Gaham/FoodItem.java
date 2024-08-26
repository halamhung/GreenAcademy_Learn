package Gaham;

public class FoodItem {
    protected int Weight;
    protected int Carb;
    protected int Fat;
    protected int Fatbaohoa;
    protected int Protein;
    protected int Calo;

    public FoodItem(){

    }

    public int getWeight() {
        return Weight;
    }

    public void setWeight(int weight) {
        Weight = weight;
    }

    public int getCarb() {
        return Carb;
    }

    public void setCarb(int carb) {
        Carb = carb;
    }

    public int getFat() {
        return Fat;
    }

    public void setFat(int fat) {
        Fat = fat;
    }

    public int getFatbaohoa() {
        return Fatbaohoa;
    }

    public void setFatbaohoa(int fatbaohoa) {
        Fatbaohoa = fatbaohoa;
    }

    public int getProtein() {
        return Protein;
    }

    public void setProtein(int protein) {
        Protein = protein;
    }

    public int getCalo() {
        return Calo;
    }

    public void setCalo(int calo) {
        Calo = calo;
    }

    public void nhap(){
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Nhập khối lượng: ");
        this.Weight = sc.nextInt();
    }

}
