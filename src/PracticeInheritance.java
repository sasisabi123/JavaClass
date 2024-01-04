public class PracticeInheritance {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.setName("Tinku");
        d1.setBreed("Shitshu");
        System.out.println("Name of the dog is: " + d1.getName());
        System.out.println("Breed of the dog is : " + d1.getBreed());
    }
}
    class Dog{
    private String name;
    private String breed;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}

