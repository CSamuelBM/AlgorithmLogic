Algoritmo Area_C_T_R_C
 	Escribir "Seleccione Una Opcion: "
	
	Escribir "1: Area De Un Cuadrado: "
	Escribir "2: Area De Un Triangulo: "
	Escribir "3: Area De Un Rectangulo: "
	Escribir "4: Area De Un Circulo: "
	Leer eleccion
	Segun eleccion Hacer
		1:
			Escribir "Ingresa La Mediad De Un Lado: "
			Leer Lado
			areac<-lado*lado
			Escribir "El Area De Un Cuadrado Es: ", areac
		2:
			Escribir "Ingresa La Base Y Altura Del Triangulo:"
			Leer b,h
			Area <- b*h/2
			Escribir "La Base Del Triangulo Es: ", Area
		3:
			Escribir "Ingresa La Base Y Altura Del Rectangulo"
			Leer b,h
			Area <- b*h
			Escribir "La Base Del Triangulo Es: ", Area
		4:
			pi_ <- 3.1416
			Escribir "Ingresa El Valor Del Radio Del Circulo: "
			Leer r
			Area <- pi_*r*r
			Escribir "El Radio Del Circulo Es: ", Area
			
		De Otro Modo:
			Escribir "Opcion No Valida: "	
	FinSegun
	
FinAlgoritmo
