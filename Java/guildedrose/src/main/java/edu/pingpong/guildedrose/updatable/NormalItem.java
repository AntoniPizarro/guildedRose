package edu.pingpong.guildedrose.updatable;

public class NormalItem implements Updatable {

    private final Item item;

    public NormalItem(String name, int sellIn, int quality) {
        this.item = new Item(name, sellIn, quality);
    }

    Item getItem() {
        return this.item;
    }

    public String getName() {
        return item.getName();
    }

    public int getSellIn() {
        return item.getSell_in();
    }

    void setSellIn() {
        item.setSell_in();
    }

    public int getQuality() {
        return item.getQuality();
    }

    void computeQuality(int qty) {
        item.setQuality(item.getQuality() + qty);
    }
    
    @Override
    public void updateQuality() {
        if (item.getSell_in() > 0) {
            item.setSell_in();
        }
        while (item.getQuality() > 50) {
            computeQuality(-1);
        }
        while (item.getQuality() < 0) {
            computeQuality(1);
        }
        if (getQuality() > 0) {
            computeQuality(-1);
        }
    }

    public String toString() {
        return "Name: " + item.getName() + "\n Sell in: " + item.getSell_in() + "\nQuality: " + item.getQuality();
    }
}