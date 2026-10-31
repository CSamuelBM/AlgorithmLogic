    Algoritmo Act_9
	 Escribir "Seleccione El Mes De TU Nacimiento: "
		Escribir "1: Enero. "
		Escribir "2: Febrero. "
		Escribir "3: Marzo. "
		Escribir "4: Abril. "
		Escribir "5: Mayo. "
		Escribir "6: Junio. "
		Escribir "7: Julio. "
		Escribir "8: Agosto. "
		Escribir "9: Septiembre. "
		Escribir "10: Octubre. "
		Escribir "11: Noviembre. "
		Escribir "12: Diciembre. "
	 Leer mes	
	  Escribir "Ingresa El Dia De Tu Nacimiento: "
	  Leer dia
	  Segun mes Hacer
		  1:
			  Si dia < 20
				  Escribir "Capricornio: "
			  Sino
				  Escribir "Acuario: "
			  FinSi
		  2:
			  Si dia < 19
				  Escribir "Acuario: "
			  Sino
				  Escribir "Piscis: "
			  FinSi
		  3:
			  Si dia < 21
				  Escribir "Piscis: "
			  Sino
				  Escribir "Aries: "
			  FinSi
		  4:
			  Si dia < 20
				  Escribir "Aries: "
			  Sino
				  Escribir "Tauro: "
			  FinSi
		  5:
			  Si dia < 21
				  Escribir "Tauro: "
			  Sino
				  Escribir "Geminis: "
			  FinSi
		  6:
			  Si dia < 21
				  Escribir "Geminis: "
			  Sino
				  Escribir "Cancer: "
			  FinSi
		  7:
			  Si dia < 23
				  Escribir "Cancer: "
			  Sino
				  Escribir "Leo: "
			  FinSi
		  8:
			  Si dia < 23
				  Escribir "Leo: "
			  Sino
				  Escribir "Virgo: "
			  FinSi
		  9:
			  Si dia < 23
				  Escribir "Virgo: "
			  Sino
				  Escribir "Escorpion: "
			  FinSi
		  10:
			  Si dia < 22
				  Escribir "Escorpion: "
			  Sino
				  Escribir "Sagitario: "
			  FinSi
		  11:
			  Si dia < 22
				  Escribir "Sagitario: "
			  Sino
				  Escribir "Capricornio: "
			  FinSi
		  12:
			  Si dia < 20
				  Escribir "Capricornio: "
			  Sino
				  Escribir "Acuario: "
			  FinSi
		  De Otro Modo:
			  Escribir "Opcion No Valida: "
	  FinSegun
FinAlgoritmo
