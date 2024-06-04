package Practica15124;
import java.util.*;
//Tarea 2.- Realice un programa que muestra el seno y coseno de los valores devueltos por una función que calcula y 
//el seno y coseno de un ángulo introducido por teclado. El programa termina cuando se introduce por teclado un valor centinela.
//Para convertir de grados a radianes, multiplica el número de grados por π/180. Esto dará la medida en radianes.
//Si tienes un ángulo de 90 grados y quieres saber cuánto mide en radianes, multiplica 90 por π/180.

//ESTA ES LA MEJOR SOLUCUIN DE TODAS PORQUE NO MEZCLA 
public class Tarea2_sol3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double Grado;
		final int CENTINELA=-1;
		
		System.out.println("Introduce Angulo");
		Grado=sc.nextDouble();
		double referencia[]= {Grado};
		
		while(Grado!=CENTINELA) {
			
		System.out.println("El valor del coseno es: "+seCos(Grado,referencia));
			System.out.println("El valor del seno es "+referencia[0]);
			
			System.out.println("Introduce el Angulo");
			Grado=sc.nextDouble();
			
		}
		System.out.println("Adios \n vuelve a iniciar el programa");
	}
	
	public static double seCos(double valor, double sen[]) {
		double cos;
		double radianes=valor*Math.PI/180;
		
		sen[0]=Math.sin(radianes);
		cos=Math.cos(radianes);
		
		return cos;
		
	}
}