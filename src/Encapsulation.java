class Student{
    private String name;
    private int age;
    private int roll_no;

    //GETTER
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public int getRoll_no(){
        return roll_no;
    }

    //SETTER
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setRoll_no(int roll_no){
        this.roll_no = roll_no;
    }
}


public class Encapsulation {
    public static void main(String[] args) {
        Student obj = new Student();
        obj.setAge(24);
        obj.setRoll_no(52);
        obj.setName("Alok kumar singh");
        System.out.println(obj.getName());
        System.out.println(obj.getAge());
        System.out.println(obj.getRoll_no());
    }
}
