abstract class Car4{
    abstract public void fuelCar();
}

class tata extends Car4{
    public void fuelCar(){
        System.out.println("deisel car");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        tata nexon = new tata();
        nexon.fuelCar();
        nexon.fuelCar();
    }
}
