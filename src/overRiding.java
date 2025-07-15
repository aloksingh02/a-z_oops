class Bank{
    public void rateOfInterest(){
        System.out.println("Generally rate of interest is 8%");
    }
}
class SBI extends Bank{
    public void rateOfInterest(){
        System.out.println("but interest of SBI is 7%");
    }
}
class PNB extends Bank{
    public void rateOfInterest(){
        System.out.println("Pnb interest is 5%");
    }
}
public class overRiding {
    public static void main(String[] args) {
        Bank obj = new Bank();
        SBI obj1 = new SBI();
        PNB obj2 = new PNB();
        obj1.rateOfInterest();
        obj2.rateOfInterest();
        obj.rateOfInterest();
    }
}
