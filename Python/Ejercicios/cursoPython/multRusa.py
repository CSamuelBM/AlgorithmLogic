n1= int(input("Numero 1: "))
n2= int(input("Numero 2: "))
sum= 0

while n1> 1:
    if(n1% 2!= 0):
        sum= sum+ n2  
    n1= n1/ 2 
    n2= n2* 2   
print(sum)    