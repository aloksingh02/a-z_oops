class Animal {
    public void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}

public class overriding2{
    public static void main(String[] args) {
        Animal a = new Animal();
        a.sound();  // Output: Animal makes a sound

        Dog d = new Dog();
        d.sound();  // Output: Dog barks

        Animal ref = new Dog();
        ref.sound();  // Output: Dog barks (runtime polymorphism)
    }
}
