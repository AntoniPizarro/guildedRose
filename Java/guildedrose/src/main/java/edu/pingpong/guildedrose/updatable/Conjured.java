package edu.pingpong.guildedrose.updatable;

public class Conjured extends NormalItem {

    public Conjured(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    public void updateQuality() {
        setSellIn();
        computeQuality(-2);
    }

}