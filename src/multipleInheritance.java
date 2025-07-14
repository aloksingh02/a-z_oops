interface A1{
    public void runs();
}
interface B1{
    public void runs();
}
class C1 implements A1, B1{
    public void runs(){
        System.out.println("This is c");
    }
}

public class multipleInheritance {
    public static void main(String[] args) {
        C1 obj = new C1();
        obj.runs();
    }
}
