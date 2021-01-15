class NormalItem:

    def __init__(self, item, type):
        self.item = item
        self.type = type
    
    def update_quality(self):
        self.type.update_quality(self.item)