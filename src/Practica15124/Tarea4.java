package Practica15124;
import java.util.*;

//Realice mediante funciones recursivas un programa que traslade un número entero en base diez a cualquier otra base.
public class Tarea4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Introduce numero");
		int numero=sc.nextInt();
		System.out.println("Introduce base");
		int base=sc.nextInt();
		
		System.out.println(eBase(numero,base));

	}
	
	
	public static String eBase(int numero, int base) {
		char d = 0;
		String res=" ";
		
		if(numero<base) {
			res+=numero;
		}else {
			
			if(base>=10) {
				d=(char) ('A'+(numero%base-10));
//				d='A'+(numero%base-10));
			}else {
				res=eBase(numero/base,base)+d;
			}
		
		
		
		
				
	}
		return res;
}
}