interface Car{
    public void start();
}
class electricVehicle implements Car{
    public void start(){
        System.out.println("It is electric car");
    }
}
class petrol implements Car{
    public void start(){
        System.out.println("It is petrol car");
    }
}
public class Interface1 {
    public static void main(String[] args) {
        Car tesla = new electricVehicle();
        Car alto = new petrol();
        tesla.start();
        alto.start();
    }
}
