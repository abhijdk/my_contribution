package mar_27_2023_oops;

//Abstract class Cake
abstract  class Cake {
    private String shape;
    private String flavour;
    private int qty;
    private float price;

    protected Cake(String shape, String flavour, int qty) {
        this.shape = shape;
        this.flavour = flavour;
        this.qty = qty;
        this.price = qty * 400.0f;
    }

    protected String getShape() {
        return shape;
    }

    protected void setShape(String shape) {
        this.shape = shape;
    }

    protected String getFlavour() {
        return flavour;
    }

    protected void setFlavour(String flavour) {
        this.flavour = flavour;
    }

    protected int getQty() {
        return qty;
    }

    protected void setQty(int qty) {
        this.qty = qty;
        this.price = qty * 400.0f;
    }

    protected float getPrice() {
        return price;
    }

    protected void setPrice(float price) {
        this.price = price;
    }

    protected void showCake() {
        System.out.println("A " + shape + " " + flavour + " Cake of " + qty + " Kg/Kg's Ready @ Rs." + price + "/-");
    }
}

//OrderCake class
class OrderedCake extends Cake {
    private String message;

    public OrderedCake() {
        super("Round", "Vanilla", 1);
        this.message = "";
    }

    public OrderedCake(String shape, String flavour, int qty) {
        super(shape, flavour, qty);
        this.message = "";
    }

    public OrderedCake(String shape, String flavour, int qty, String message) {
        super(shape, flavour, qty);
        this.message = message;
    }

    @Override
    public void showCake() {
        if (!message.isEmpty()) {
            System.out.println("A " + super.getShape() + " " + super.getFlavour() + " Cake of " + super.getQty() + " Kg/Kg's ready with message " + message + " @ Rs." + super.getPrice() + "/-");
        } else {
            super.showCake();
        }
    }
}
//CakeMain class with main
public class CakeMain {
    public static void main(String[] args) {
        Cake cake = new OrderedCake("Square", "Chocolate", 2);
        OrderedCake orderedCake1 = new OrderedCake();
        OrderedCake orderedCake2 = new OrderedCake("Square", "Strawberry", 3);
        OrderedCake orderedCake3 = new OrderedCake("Round", "Butterscotch", 2, "Happy Birthday");

        cake.showCake(); 
        orderedCake1.showCake();
        orderedCake2.showCake();
        orderedCake3.showCake(); 
  }
}
