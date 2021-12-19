package com.gildedrose.items;

import com.gildedrose.core.GildedRose;
import com.gildedrose.core.Item;
import com.gildedrose.items.SwitchItem;

public class TestSwitchItem {
    public static void main(String[] args) {
        SwitchItem s = new SwitchItem("Test",1,1);
        SwitchItem s1 = new SwitchItem("Test1",-1,-1);

        s.updateQuality();
        s1.updateQuality();
    }
}
