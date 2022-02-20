/**
 * Interfaz del Stack
 * @author Maria Marta Ramirez 21342
 * Hoja de Trabajo 2
 * Universidad del Valle de Guatemala
**/

/**
* Creacion de la interfaz
**/

public interface InterfazStack<T>{
	
	void push(T value); //PUSH ingresa un valor a la pila
	
	
	T pull(); //PUll Saca el valor de la pila
	
	
	T peek(); //PEEK muestra el ultimo valor de la pila
	
	
	int count(); //COUNT cuenta los valores de la pila
	
	
	boolean isEmpty(); //retorna false si la pila tiene valores y true si esta vacia
}