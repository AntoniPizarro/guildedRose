package edu.pingpong.guildedrose.updatable;

public class NormalItem extends Item implements Updatable {

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
        this.sellIn = sellIn;
    }

    public int getQuality() {
        return this.quality;
    }

    public String toString() {
        return "Name: " + getName() + "\n Sell in: " + getSellIn() + "\nQuality: " + getQuality();
    }
}