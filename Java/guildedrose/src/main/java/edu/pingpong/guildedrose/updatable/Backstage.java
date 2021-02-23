package edu.pingpong.guildedrose.updatable;

public class Backstage extends NormalItem {

    public Backstage(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    public void updateQuality() {
        setSellIn(-1);
        computeQuality(1);
        if (getSellIn() < 11) {
            computeQuality(1);
        }
        if (getSellIn() < 6) {
            computeQuality(1);
        }
        if (getSellIn() <= 0) {
            computeQuality(-getQuality());
        }
    }

}