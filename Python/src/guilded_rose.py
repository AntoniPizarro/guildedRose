# -*- coding: utf-8 -*-

class GildedRose(object):

    def __init__(self, inventory):
        self.inventory = inventory

    def update_quality(self):
        for item in self.inventory:
            item.update_quality()
    
    def getItems(self):
        return self.inventory


class Item:
    def __init__(self, name, sell_in, quality):
        self.name = name
        self.sell_in = sell_in
        self.quality = quality

    def __repr__(self):
        return "%s, %s, %s" % (self.name, self.sell_in, self.quality)


class NormalItem(Item, Interfaz):

    def __init__(self):
        pass

    def update_quality(self):
        pass


class Interfaz():

    def update_quality(self):
        pass


class AdgedBrie(NormalItem):

    def __init__(self):
        pass

    def update_quality(self):
        pass


class Sulfuras(NormalItem):

    def __init__(self):
        pass

    def update_quality(self):
        pass


class Backstage(NormalItem):

    def __init__(self):
        pass

    def update_quality(self):
        pass


class Conjured(NormalItem):

    def __init__(self):
        pass

    def update_quality(self):
        pass