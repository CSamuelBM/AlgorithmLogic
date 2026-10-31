n= int(input("Numero: "))

suma= 0

for i in range(1, n):
    if(n% i== 0):
        suma+= i

if(suma== n):
    print("El numero es perfecto")
else:
    print("No es perfecto")

n1= int(input("Numeros Deceados: "))

salida= " "

for i in range(1, n):
    sum= 0
    for j in range(1, i-1):
        if(i% j== 0):
            sum+= j
    if(i== sum):
        salida= salida+str(i)+","
print(f"Los numeros entre 1 y {n} son {salida}")                