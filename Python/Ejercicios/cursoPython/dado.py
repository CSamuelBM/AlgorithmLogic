import random;

saco_cinco= False;
cont_cinco= 0
puntos= 0

for i in range(3):
    dado= random.randrange(1,6)
    print(f"Cara: {i+1}", dado)
    puntos+= dado
    if(dado== 5):
        saco_cinco= True
        cont_cinco+= 1;
if(saco_cinco):
    if(cont_cinco== 1):
        print(f"Sacaste cinco {cont_cinco} vez")
    else:
        print(f"Sacaste cinco {cont_cinco} veces")    
else:
    print("No saco cinco")  
print(f"Los puntos acumulados {puntos}")      