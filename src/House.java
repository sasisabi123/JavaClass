public class House {
    String id;
    String name;

    double price;

//Constructor
    public House(String id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;

    }


    void printDetails() {
        System.out.println("Id of the house is " + this.id);
        System.out.println("Name of the house is " + this.name);
        System.out.println("Price of the house is $" + this.price);
    }
}




