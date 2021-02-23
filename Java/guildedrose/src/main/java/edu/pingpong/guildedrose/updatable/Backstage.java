package edu.pingpong.guildedrose.updatable;

public class Backstage extends NormalItem {

    public Backstage(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    public void updateQuality() {
        setSellIn();
        computeQuality(1);
        if (getItem().getSell_in() < 11) {
            computeQuality(1);
        }
        if (getItem().getSell_in() < 6) {
            computeQuality(1);
        }
        if (getItem().getSell_in() <= 0) {
            computeQuality(-getItem().getQuality());
        }
    }

}