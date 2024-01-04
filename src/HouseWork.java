public class HouseWork {
    public HouseWork() {
    }

    public static void main(String[] args) {

        House h1 = new House("HOUSE1", "Bhattarai Newas", 500000.0);
        House h2 = new House("House2", "Carman Niwas", 600000);
        House h3 = new House ("House3", "Ganesh Newas", 700000);
        House h4= new House("House4", "Biswo Niwas", 8000000);

        System.out.println("The id of the house is " + h1.id);
        System.out.println("The name of the house is " +h1.name);
        System.out.println("The price of the house is $" +h1.price);
        System.out.println("....................");


        h2.printDetails ();
        System.out.println("....................");
        h3.printDetails ();
        System.out.println("....................");
        h4.printDetails ();


    }
}

