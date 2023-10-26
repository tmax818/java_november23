import java.util.ArrayList;

// Here we're creating a new data type called Order
public class Order {

    // MEMBER VARIABLES
    private String name; // default value of null
    private boolean ready; // default value false
    private ArrayList<Item> items; // defaults to null



    // CONSTRUCTOR
    // No arguments, sets name to "Guest", initializes items as an empty list.

    public Order() {
        this.items = new ArrayList<>();
    }


    // OVERLOADED CONSTRUCTOR
    // Takes a name as an argument, sets name to this custom name.
    // Initializes items as an empty list.

    public Order(String name) {
        this();
        this.name = name;
    }


    // ORDER METHODS

    public void addItem(Item item){
        items.add(item);
    }

    public String getStatusMessage(){
        if(this.ready){
            return "Your order is ready.";
        } else {
            return "Thank you for waiting. Your order will be ready soon.";
        }
    }
    public double getOrderTotal(){
        double total = 0;
        for(Item item: items){
            total += item.getPrice();
        }

        return total;
    }

    public String display(){
        return "test";
    }

    // Most of your code will go here,
    // so implement the getters and setters first!

    // GETTERS & SETTERS


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isReady() {
        return ready;
    }

    public void setReady(boolean ready) {
        this.ready = ready;
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }
}

