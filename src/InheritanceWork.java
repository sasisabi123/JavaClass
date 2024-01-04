
public class InheritanceWork {
    public static void main(String[] args) {
       Cat a1 = new Cat();
        a1.id = "African";
        a1.name = "Alpha";
        a1.color = "white";
        a1.sound= "meow";
        a1.printAnimalInfo();
    }
}

class Animal{
    String id;
    String name;
    String color;

    void printAll(){
        System.out.println("ID is "+id);
        System.out.println("name is "+name);
        System.out.println("Color is "+color);
    }
}
class Cat extends Animal{

    String sound;

    void printAnimalInfo(){
        printAll();
        System.out.println("Sound is "+ sound);
    }
}