class dog{
    String color ="white";
}
class animal extends dog{
    String color ="black";
    void printColor(){
        System.out.println(color);
        System.out.println(super.color);
    }
}
public class superKeyword {
    public static void main(String[] args) {
        animal d = new animal();
        d.printColor();
    }
}
