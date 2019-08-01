package action;

public class Treasure {

    private String type;
    private int amount;
    private int value;

    public Treasure(String type, int amount, int value) {
        this.type = type;
        this.amount = amount;
        this.value = value;
    }

    public String getType() {
        return type;
    }

    public int getAmount() {
        return amount;
    }

    public int getValue() {
        return value;
    }
}
