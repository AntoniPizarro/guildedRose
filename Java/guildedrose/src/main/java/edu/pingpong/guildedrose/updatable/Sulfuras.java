package edu.pingpong.guildedrose.updatable;

public class Sulfuras extends NormalItem{

    public Sulfuras(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    public void updateQuality() {
        while (getQuality() < 80) {
            computeQuality(1);
        }
        while (getQuality() > 80) {
            computeQuality(-1);
        }
    }

}