n= int(input("Numero: "))
while n< 0:
    print("Numero Positivo")
    n= int(input("Numero Nuevo: "))
print("Numero Positivo!!")    

n1= int(input("Numero 1: "))
n2= int(input("Numero 2: "))

opc= int(input("1.-Suma\n2.-Resta\n3.-Multiplicar\n4.-Salir\nOpcion: "))
while opc!= 4:
    if(opc== 1):
        print(f"La Suma es: {n1+n2}")
    elif(opc== 2):
        print(f"La Resta es: {n1-n2}")
    else:
        print(f"La Multiplicacion es: {n1*n2}")
    opc= int(input("1.-Suma\n2.-Resta\n3.-Multiplicar\n4.-Salir\nOpcion: "))             