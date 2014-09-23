import java.util.Scanner;

/*
 *Programa para visualizar en pantalla el area y la circunferencia de un circulo 
 */
public class Main {

	public static void main (String args[]) {

		double numero1, resultadoArea, resultadoCircunferencia ;
		Circulo operaciones = new Circulo();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("\ningresa el radio del circulo: ");
		numero1 = sc.nextDouble();

		resultadoArea = operaciones.area(numero1);
		resultadoCircunferencia = operaciones.circunferencia(numero1);

		System.out.println("\nEl AREA del circulo es: " + resultadoArea);
		System.out.println("\nLa circunferencia del circulo es: " + resultadoCircunferencia);

	}
}
