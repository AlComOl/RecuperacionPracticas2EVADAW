package Practica15124;
import java.util.*;
//Tarea 2.- Realice un programa que muestra el seno y coseno de los valores devueltos por una función que calcula y 
//el seno y coseno de un ángulo introducido por teclado. El programa termina cuando se introduce por teclado un valor centinela.
//Para convertir de grados a radianes, multiplica el número de grados por π/180. Esto dará la medida en radianes.
//Si tienes un ángulo de 90 grados y quieres saber cuánto mide en radianes, multiplica 90 por π/180.


public class Tarea2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		final int CENTINELA=-1;//Centinela cuando se ontroduce este valor sale y pide otro Angulo
		double Grados;
		
		
		System.out.println("Introduce Angulo");
		Grados=sc.nextDouble();
		double referencia[]= {Grados};//cargar la referencia despues de pedir el valor.
		while(Grados>=0) {
		//Utilizo el valor que devuelve la funcion para encontrar devolver el seno	*PASO POR VALOR
		System.out.println("El coseno del Angulo es :"+	senCos(referencia,Grados));
//		Calculo el seno y lo meto en la referencia que no devuelve la funcion
//		pero al modificarse cada vez el valor pasado por referencia en la pos1,
//		lo llamo en el main y me muestra el ultimo valor calulado en funcion.
		
		System.out.println("El valor del seno es:"+referencia[0]);
		
		System.out.println("Introduce Angulo*");//para el programa introduciendo otro angulo y haciendo valer en centinela
		Grados=sc.nextDouble();
		
		}
		
	}
	public static double senCos(double referencia[],double valor) {
		
		referencia[0]=Math.sin(referencia[0]*Math.PI/180);
		
		valor=Math.cos(valor*Math.PI/180);
		
		return valor;

	}

}

