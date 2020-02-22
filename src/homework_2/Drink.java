package homework_2;

public class Drink {

    private final String name;
    private int price;

    public Drink(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "{" + name + ", price: " + price + "}";
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
