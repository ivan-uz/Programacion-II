from multimethod import multimethod
class AlgebraVectorial:
    def __init__(self, a, b=None):
        self.a = a
        self.b = b

    def __add__(self,b):
        vec=[]
        for i in range(len(self.a)):
            vec.append(self.a[i] + b[i])
        return vec

    def __mul__(self, r):
        vec=[]
        for i in range(len(self.a)):
            vec.append(r*self.a[i])
        return vec
    
    def __len__(self):
        longitud=0
        for i in range(len(self.a)):
            longitud= longitud+(self.a[i]**2)
        return int(longitud**0.5)
   
    def __abs__(self):
        mag=0
        vec=[]
        for i in range(len(self.a)):
            mag=mag+ self.a[i]**2
        mag=mag**0.5
        for i in range(len(self.a)):
            vec.append(self.a[i]/mag)
        return vec
    
    @multimethod
    def __matmul__(self, b: 'AlgebraVectorial'):
        producto = 0
        for i in range(len(self.a)):
            producto += self.a[i] * b.a[i]
        return producto
    
    @multimethod
    def __matmul__(self, b: list):
        
        vec1 = self.a[1]*b[2] - self.a[2]*b[1]
        vec2 = self.a[2]*b[0] - self.a[0]*b[2]
        vec3 = self.a[0]*b[1] - self.a[1]*b[0]
        return [vec1, vec2, vec3]
        
a=AlgebraVectorial([1,2,3])
b1 = AlgebraVectorial([4, 5, 6])
b=[4,5,6]
print(a+b)
print(a*2)
print(len(a))
print(abs(a))
print(a@b1)
print(a@b)
