
public class Animal{// creamos la clase animal 


String nombre;// declaramos la variable nombre
int edad; // declaramos la variable edad
String getNombre(){// obtenemos el valor de nombre 
	return nombre; // devuelve el nombre 
}
int getEdad(){// obtenemos el valor de la edad 
	return edad; 	// devuelve la edad 
}
void setNombre(String nombre){// declara el constructor nombre
	this.nombre=nombre;
}
void setEdad(int edad){// declarar el constructor edad 
	this.edad=edad; 
}
}