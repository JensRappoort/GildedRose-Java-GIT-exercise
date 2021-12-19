package com.gildedrose.items;

public class SwitchItem {
    String name;
    int sellIn;
    int quality;

    public SwitchItem(String name, int sellIn, int quality) {
        name = this.name;
        sellIn = this.sellIn;
        quality = this.quality;
    }

    public void updateQuality() {
        int factor=0;
        if (this.sellIn >= 0 && this.quality<50)
        {factor = 1;}
        else if(this.sellIn<0) {
            factor=-1;


        }

        this.quality = Math.max(this.quality + factor, 0);

    }
}
