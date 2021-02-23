package edu.pingpong.guildedrose.updatable;

public class AgedBrie extends NormalItem{

    public AgedBrie(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    public void updateQuality() {
        getItem().setSell_in();
        computeQuality(1);
    }

}