package homework_2;

public enum DrinkEnum {
    SPRITE(1, "Sprite", 65),
    PEPSI(2, "Pepsi", 65),
    MIRINDA(3, "Mirinda", 65),
    LEMONADE(4, "Lemonade", 55),
    WATER(5, "Water", 50);

    @Override
    public String toString() {
        return number + ". " + '{' + NAME + ", price=" + price + "}\n";
    }

    private final String NAME;
    private final int number;
    private int price;

    DrinkEnum(int number, String NAME, int price) {
        this.number = number;
        this.NAME = NAME;
        this.price = price;
    }

    public String getName() {
        return NAME;
    }

    public int getPrice() {
        return price;
    }

}