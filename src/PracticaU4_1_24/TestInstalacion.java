package PracticaU4_1_24;
import java.util.*;
public class TestInstalacion {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int opcion=0;

		System.out.println("Introduce niveles maximo y minimos de PH");
			float min=sc.nextFloat();
			System.err.println("Max");
			float max=sc.nextFloat();
			ControlPH piscina1=new ControlPH();
			piscina1.setMaxpH(min);
			piscina1.setMinpH(max);
		
			
			do {
				System.out.println("1) Introducir valores de medición.\r\n"
						+ "2) Procesar medición.\r\n"
						+ "3) Consultar el rango del pH a controlar.\r\n"
						+ "4) Cambiar el rango del pH a controlar.\r\n"
						+ "5) Salir del programa\n");
				
				System.out.println("Introcuce opcion");
				opcion=sc.nextInt();
				
				switch (opcion) {
				
				case 1: {
					System.out.println("Introduce Temperatura ");
					float dato=sc.nextFloat();
					 piscina1.setLectura(dato);
					System.out.println("Introduce PH");
					float dato1=sc.nextFloat();
					 piscina1.setLectura(dato);
					System.out.println("Introduce potencia");
					float dato2=sc.nextFloat();
					 piscina1.setLectura(dato);
					
				break;
				}
				case 2: {
					
				break;
				}
				case 3: {
					System.out.println("Los valores del PH de las piscina son:");
				System.out.println("El valor minimo es : "+piscina1.getMinpH());	
				System.out.println("El valor maximo es : "+piscina1.getMaxpH());	
				break;	
				}
				case 4: {
					System.out.println("Introducir los valores del PH en la piscina");
					System.out.println("Introduce Valor minimo");
					min=sc.nextFloat();
					piscina1.setMinpH(min);
					System.out.println("Introduce Valor maximo");
					max=sc.nextFloat();
					piscina1.setMinpH(max);	
				break;	
				}
				case 5: {
					
					System.out.println("Adios ");
				break;
				}
				default:
					System.out.println("No existe el valor introducido");
				break;	
				}
					

			} while (opcion!=5);
			
			
	}

}
