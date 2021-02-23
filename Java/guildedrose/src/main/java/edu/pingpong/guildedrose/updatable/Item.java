package edu.pingpong.guildedrose.updatable;

public class Item {

    private final String name;
    private int sellIn;
    private int quality;

    public Item(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }

    String getName() {
        return this.name;
    }


    int getSellIn() {
        return this.sellIn;
    }


    int getQuality() {
        return this.quality;
    }

    void setQuality(int newQuality) {
        this.quality = newQuality;
    }

    void setSellIn(int newSellIn) {
        this.sellIn = newSellIn;
    }

    @Override
    public String toString() {
        return "Name: " + getName() + "\nSell In: " + getSellIn() + "\nQuality: " + getQuality();
    }

}