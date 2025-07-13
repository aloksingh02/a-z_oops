class employee{
    void salary(){
        System.out.println("salary is 70000");
    }
}
class hr extends employee{
    void bonus(){
        System.out.println("bonus is 2000");
    }
}

public class inherit_singleInherit {
    public static void main(String[] args) {
        hr obj = new hr();
        obj.salary();
        System.out.println();
        obj.bonus();
    }
}


