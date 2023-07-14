public class Item {

    //MEMBER VARIABLES
    private String name;
    private double price;

    //CONSTRUCTOR - Takes name and price and arguments and set them accordingly
    //string name and double price
    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }

    //GETTERS & SETTERS - For name and price
    
    //Getter
    public String getName() {
        return this.name;
    }

    //Setter
    public void setName(String name) {
        this.name = name;
    }

    //Getter
    public double getPrice() {
        return this.price;
    }

    //Setter
    public void setPrice(double price) {
        this.price = price;
    }

}
