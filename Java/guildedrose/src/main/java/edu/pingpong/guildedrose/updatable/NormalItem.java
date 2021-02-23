package edu.pingpong.guildedrose.updatable;

public class NormalItem implements Updatable {

    private String name;
    private int sellIn;
    private int quality;

    public NormalItem(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }

    public String getName() {
        return this.name;
    }

    public int getSellIn() {
        return this.sellIn;
    }

    void setSellIn(int sellIn) {
        this.sellIn += sellIn;
    }

    public int getQuality() {
        return this.quality;
    }

    void computeQuality(int qty) {
        this.quality += qty;
    }
    @Override
    public void updateQuality() {
        setSellIn(-1);
        computeQuality(-1);
    }

    public String toString() {
        return "Name: " + getName() + "\n Sell in: " + getSellIn() + "\nQuality: " + getQuality();
    }
}