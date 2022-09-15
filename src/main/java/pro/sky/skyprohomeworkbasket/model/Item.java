package pro.sky.skyprohomeworkbasket.model;

public class Item {
    private final int ID;
    private final String ITEM;
    private final int PRICE;
    public Item(int id, String item, int price) {
        ID = id;
        ITEM = item;
        PRICE = price;
    }

    public int getID() {
        return ID;
    }

    public String getITEM() {
        return ITEM;
    }

    public int getPRICE() {
        return PRICE;
    }
}
