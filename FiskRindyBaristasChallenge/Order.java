import java.util.ArrayList;

public class Order {

    // MEMBER VARIABLES
    private String name;   //default value of null
    private boolean ready;  //default value false
    private ArrayList<Item> items;  // defaults to null


    // CONSTRUCTOR
    // No arguments, sets name to "Guest", initializes items as a empty list.
    public Order() {
        this.name = "Guest";
        this.items = new ArrayList<Item>();
    }



    // OVERLOADED CONSTRUCTOR
    // Takes a name as an argument, sets name to this custom name. Initializes items as an empty list.
    public Order(String name) {
        this.name = name;
        this.items = new ArrayList<Item>();
    }



    //ORDER METHODS
    //Most of your code will go here, so implement the getters and setters first.

    public void additem(Item item) {
        items.add(item);
    }

    public String getStatusMessage() {
        if(this.ready) {
            return "The order is ready to be picked up.";
        }
        return "Please wait. Your order will be ready in the order it was received.";
    }

    public double getOrderTotal() {
        double total = 0;
        for(Item item :items) {
            total += item.getPrice();
        }
        return total;
    }

    public void display() {
        System.out.println("Name: " +this.name);
        for(Item item :items) {
            System.out.println(item.getName()+" - $" +item.getPrice());
        }
        System.out.println("Total: $" +getOrderTotal());
    }



    //GETTERS AND SETTERS (ACCESSORS & MUTATORS)

    //Getters
    public String getName() {
        return this.name;
    }

    //Setter
    public void setName(String name) {
        this.name = name;
    }

    //Getter
    public boolean getReady() {
        return this.ready;
    }

    //Setter
    public void setReady(boolean ready) {
        this.ready = ready;
    }

    //Getter
    public ArrayList<Item> getItems() {
        return this.items;
    }

    //Setter
    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }


}
