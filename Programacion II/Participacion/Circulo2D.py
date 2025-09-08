import math
from multimethod import multimethod
class Circulo2D:
    def __init__(self, x=0.0, y=0.0, radio=1.0):
        self._x = x
        self._y = y
        self._radio = radio
    def getX(self):
        return self._x
    def getY(self):
        return self._y
    def get_radio(self):
        return self._radio  
    
    def get_area(self):
        return math.pi * self._radio ** 2

    def get_perimetro(self):
        return 2 * math.pi * self._radio
    @multimethod
    def contiene(self, x:float, y:float):
        distancia = math.sqrt((x - self._x) ** 2 + (y - self._y) ** 2)
        if(distancia < self._radio):
            return True
        return False
    @multimethod
    def contiene(self, otro):
        distancia = math.sqrt((otro._x - self._x) ** 2 + (otro._y - self._y) ** 2)
        if distancia < (self._radio - otro._radio):
            return True
        return False

    def sobrepone(self, otro):
        distancia = math.sqrt((otro._x - self._x) ** 2 + (otro._y - self._y) ** 2)
        if(distancia < (self._radio + otro._radio)):
            return True
        return False


    
c1 = Circulo2D(2, 0, 1)
c2 = Circulo2D(2, 0, 0.5)
c3 = Circulo2D(0, 0, 2)
print(c1.get_area())
print(c1.get_perimetro())

print(c1.contiene(2.5, 0.0))
print(c1.contiene(c2))
print(c1.sobrepone(c3))
