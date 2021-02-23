package edu.pingpong.guildedrose.guildedRose;

import edu.pingpong.guildedrose.updatable.Ubdatable;

import java.util.List;
import java.util.ArrayList;

public class GuildedRose {

    private List<Updatable> inventory = new ArrayList<Updatable>();

    public GuildedRose() {
    }

    public List<Updatable> inventory() {
        return this.inventory;
    }

    public void addItem(Updatable updatable) {
        this.inventory.add(updatable);
    }

    public void updateQuality() {
        for (Updatable item : this.inventory) {
            item.updateQuality();
        }
    }

    public String toString() {
        String string = "";
        for (Updatable item : this.inventory) {
            string += item.toString();
        }
        return string;
    }


}