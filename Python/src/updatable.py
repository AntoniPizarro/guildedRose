class Updatable:

    def __init__(self, item, normalItem):
        self.item = item
        self.normalItem = normalItem

    def update_quality(self):
        self.normalItem.update_quality()