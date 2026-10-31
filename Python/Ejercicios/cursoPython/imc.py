peso= input("Peso: ")
altura= input("Altura: ")

imc= float(peso)/ float(altura)**2

print("{:.2f}".format(imc))

if(imc< 18.5):
    print("Peso Bajo")
elif(imc >= 18.5 or imc <= 24.9):
    print("Peso Normal")
elif(imc >= 25 or imc <= 29.9):
    print("Sobre Peso")        
else:
    print("Obecidad")