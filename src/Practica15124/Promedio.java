package Practica15124;

import java.util.*;
	/**************************************************************************************************************************
	 * Autor : Álvaro Comenge
	 * 
	 * Fecha 16-01-24
	 * 
	 * 	Desarrolle un programa que permita calcular el promedio y la desviación estándar de un conjunto de números ingresados por el usuario.
	 *  El programa deberá finalizar cuando se introduzca un valor centinela. Para el cálculo de la desviación estándar, se deberá implementar 
	 *  una función que reciba como parámetros un array con los números ingresados y la cantidad de elementos, y que retorne la desviación estándar. 
	 *  El promedio deberá ser calculado en la función principal del programa. Asegúrese de utilizar correctamente el paso por valor y 
	 *  el paso por referencia en las funciones correspondientes.
	  
	 *******************************************************************************************************************************/
	public class Promedio {

		public static void main(String[] args) {
			
			Scanner sc=new Scanner(System.in);
//			final int CENTINELA=-1;
			double n, suma=0,aux=0;
			double v[]=new double[5];
			double m[]=new double[0];
				
			System.out.println("Introduce valores para cargar el array");
			
			for(int i=0;i<v.length;i++) {
				n=sc.nextDouble();
				suma+=n;
				v[i]=n;
			}
			
			System.out.println(prodesviacion(v,suma));
			
			}
			
			
			public static double prodesviacion(double v[], double suma) {
				double res = 0;
				double aux=0;
				double media=suma/5;
				for(int i=0;i<v.length;i++) {
					 v[i]=Math.pow((v[i]-media),2);
					 aux+=v[i];
					 res=Math.sqrt(aux/(5-1));	 
				}
				
				
				return res;
			}
		}
	
