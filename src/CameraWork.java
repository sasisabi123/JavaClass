//Write a java program to create a class Camera with private properties [id, brand, color, price]. Create a getter and setter to get and set values. Also, create 3 objects of it and print all details.

public class CameraWork {
    public static void main(String[] args) {
            Camera c1 = new Camera();
            c1.setName("Shashi");
            c1.setBrand("Sony");
            c1.setColor("Blue");
            c1.setPrice(5000);
        System.out.println(c1.getPrice());
        }
    }

    class Camera{
        private String name;
        private String brand;
        private double price;
        private String color;

        String getName() {
            return this.name;
        }
        String getBrand() {
            return this.brand;
        }
            String getColor() {
                return this.color;
            }
                double getPrice(){
                    return this.price;
                    }

                    public void setName(String name) {
                        this.name = name;
                    }
                        public void setBrand(String brand) {
                            this.brand = brand;
                        }
                        public void setColor(String color) {
                            this.color = color;
                        }
                        public void setPrice(double price) {
                            if(price>0){
                                this.price = price;
                            }


        }



}








