package ExEscrito2Eva6324;
import java.util.*;
/*Realice una funcion que elimine los caracteres que no son ASCII estandar
 * imprimibles de cada cadena de caracteres (String):La funcion recibira un String y devolvera un String 
 * Solo con los caracteres ASII estandar que contenia y el numero de caracteres 
 * eliminados. El primer caracter imprimible de la tabla ASII estandar es el espacio en blanco y 
 * el ultimo el caracter es el tilde o virgurilla*/
public class tarea5 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		String param="Holó me ü llamo Alavaro";
		
		System.out.println(elimina(param));
		
		
		

	}
	
	public static String elimina(String c) {
		String cadena="";
		
		for(int i=0;i<c.length();i++) {
			if(c.charAt(i)>=' '&&c.charAt(i)<='~') {
				cadena+=c.charAt(i);
				
			}
		}
		
		
		return cadena;
		
	}
}
