import math

a= int(input("Valor A: "))
b= int(input("Valor B: "))
c= int(input("Valor C: "))

disciminante= math.pow(b, 2)- 4* a* c

if disciminante> 0:
    x1= - b+ math.sqrt(disciminante)/ 2*a
    x2= - b- math.sqrt(disciminante)/ 2* a
    print(f'x1={round(x1, 2)} \nx2={round(x2, 2)}')
elif disciminante== 0:
    x= -b/ 2* a
    print(f'x={round(x, 2)}')
else:
    print("No hay solucion")    