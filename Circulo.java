/*
 * Clase para obtener resultados de distintas operaciones aritméticas.
 */
public class Circulo {


 //Método que calcula el area de un circulo.
 public double area (double num1) {

	double result = 0;	
	result = (num1*num1)* Math.PI; 
	return result;
 }
//Metodo que calcula la circunferencia de un circulo.
public double circunferencia (double num1) {

	double result = 0;	
	result = 2 * num1 * Math.PI ;
	return result;
 }

}
