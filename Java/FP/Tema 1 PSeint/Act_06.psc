Algoritmo Act_06
	
	Escribir "Seleccione: "
	Escribir "1 Saludo: "
	Escribir "2 Nada: "
	Escribir "3 Prueba: "
	Leer Respuesta
	
	Segun Respuesta Hacer
	    1:
			Escribir "Hola ¿Como Estas?: "
	    2:
			Escribir "Aqui No Se Hace Nada: "
		3:
			Escribir "Ingresa Un Numero: "
			Leer Num
			Escribir "En Tu Prueba Ingresaste: " Num
		De Otro Modo:
			Escribir "Opcion No Valida"
	Fin Segun
FinAlgoritmo
