#Los input provocan la entrada en String y hay que parsearlo al tipo de dato deseado
cal1= input("Calificacion 1: ")
calif1= int(cal1)

cal2= input("Calificacion 2: ")
calif2= int(cal2)

media= (calif1+calif2)/ 2

print("Promedio: ", media)

if(media> 90.0 and calif1> 85.0 and calif2> 85.0):
  print("Exelente")
elif(calif1>= 70.0 and calif2>= 70.0):
  print("Aporbo")
else: 
  print("No aprobado")