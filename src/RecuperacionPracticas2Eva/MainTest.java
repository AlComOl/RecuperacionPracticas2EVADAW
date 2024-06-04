package RecuperacionPracticas2Eva;
import java.util.*;

public class MainTest {
	

	public static void main (String [] args) {
		
		ArrayList <Obra> Obras= new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		int key = 0;
		String titulo,any,n,p,d = null,ini,fin;
		int ncanciones,npaginas,elim;
		float duracion;
		int contador=0;
		
		

	do {
		getmenu();
		System.out.println("Introduce opcion");
		key=sc.nextInt();
		sc.nextLine();
		switch (key) {
		
		  case 1:
              System.out.print("Introduce título del Libro: ");
              titulo = sc.nextLine();
             
          
              System.out.print("Introduce año del Libro: ");
              any = sc.next();
           
              System.out.print("Introduce el número de páginas: ");
              npaginas = sc.nextInt();
              sc.nextLine();  // Consumir el salto de línea residual
              
              

              Libro libro1 = new Libro(titulo, any, npaginas);
              
              do {
            	  System.out.println("Introduce  nombre autor");
            	  n=sc.next();
            	  System.out.println("Introduce  pais autor");
            	  	p=sc.next();
            	  		contador++;
            	  autor autor1=new autor(n,p);
            	  
            	  	libro1.addAutor(autor1);
            	  System.out.println("quieres anyadir otro autor s/n");
            	  d=sc.next();
			  } while (contador<3&&d.equalsIgnoreCase("s"));
              
              
              
              try {
                  Obras.add(libro1);
                  System.out.println("Se añadió el libro a la colección");
              } catch (Exception e) {
                  System.out.println("El libro no se añadió a la colección: " + e);
              }
              
              
              break;
		case 2:
			System.out.println("introduce titulo del pelicula");
			 titulo=sc.nextLine();
			
			 System.out.println("introduce any del Pelicula");
			 any=sc.nextLine();
			
			 System.out.println("Introduce la duracion");
			 duracion= sc.nextFloat();
			 sc.nextLine(); // Consumir el salto de línea residual
			 Pelicula pelicula1=new Pelicula(titulo,any,duracion);
			 
			 do {
           	  System.out.println("Introduce  nombre autor");
           	  n=sc.next();
           	  System.out.println("Introduce  pais autor");
           	  	p=sc.next();
           	  		contador++;
           	  autor autor1=new autor(n,p);
           	  
           	  	pelicula1.addAutor(autor1);
           	  	
           	  System.out.println("quieres anyadir otro autor s/n");
           	  d=sc.next();
           	  
			  } while (contador<3&&d.equalsIgnoreCase("s"));
			 
			 try {
                 Obras.add(pelicula1);
                 System.out.println("Se añadió el libro a la colección");
             } catch (Exception e) {
                 System.out.println("El libro no se añadió a la colección: " + e);
             }
             break;
		case 3:
			System.out.println("introduce titulo del CD");
			 titulo=sc.nextLine();
            
			 System.out.println("introduce any del CD");
			 any=sc.next();
			 
			 System.out.println("Introduce el numero de canciones del CD");
			 ncanciones = sc.nextInt();
			 sc.nextLine(); // Consumir el salto de línea residual
			 Cd cd1=new Cd(titulo,any,ncanciones);
			 do {
           	  System.out.println("Introduce  nombre autor");
           	  n=sc.next();
           	  System.out.println("Introduce  pais autor");
           	  	p=sc.next();
           	  		contador++;
           	  autor autor1=new autor(n,p);
           	  
           	  	cd1.addAutor(autor1);
           	  System.out.println("quieres anyadir otro autor s/n");
           	  d=sc.next();
			  } while (contador<3&&d.equalsIgnoreCase("s"));
			 
			 try {
                 Obras.add(cd1);
                 System.out.println("Se añadió el libro a la colección");
             } catch (Exception e) {
                 System.out.println("El libro no se añadió a la colección: " + e);
             }
             break;
		case 4:
			System.out.println("Introduce la Obra a eliminar");
			elim=sc.nextInt();
			
			Obra.eliminarObra(elim, Obras);
			
			
			break;
		case 5:
			ordenarObrasPorAnyo(Obras);
			System.out.println("Introduce obras anyo inicial");
			ini=sc.next();
			System.out.println("Introduce obras anyo final");
			fin=sc.next();
			for(Obra x : Obras) {
				if(Integer.parseInt(x.getAnyo())<=(Integer.parseInt(fin))&&Integer.parseInt(x.getAnyo())>(Integer.parseInt(ini))) {
					System.out.println(x);
				}
			}
			
			break;
		case 6:
			
			break;
		case 0:
			System.out.println(Obras.toString());
			break;
		default:
			break;
		}
		
	}while(key!=0);
	
	
}
	
	public static void getmenu() {
		System.out.println("1. Registrar libro \n"+
							"2. Registrar película \n"+
							"3. Registrar CD \n"+
							"4. Eliminar una obra por su identificador \n"+
							"5. Mostrar las obras publicadas entre dos años ordenadas por año(utilizar un algoritmo de ordenación de los vistos en clase) \n"+
							"6. Buscar las obras que contengan un texto en el título \n");
	}
	
	public static void ordenarObrasPorAnyo(ArrayList<Obra> Obras) {
	    int n = Obras.size();
	    for (int i = 0; i < n - 1; i++) {
	        for (int j = 0; j < n - i - 1; j++) {
	            if (Integer.parseInt(Obras.get(j).getAnyo()) > Integer.parseInt(Obras.get(j + 1).getAnyo())) {
	                // Intercambiar Obras[j] y Obras[j + 1]
	                Obra aux = Obras.get(j);
	                Obras.set(j, Obras.get(j + 1));
	                Obras.set(j + 1, aux);
	            }
	        }
	    }
	}
}

