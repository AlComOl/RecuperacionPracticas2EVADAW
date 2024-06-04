package RecuperacionPracticas2Eva;


import java.util.*;

public abstract class Obra implements InterfaceObra {
	private static int incremento=0;
	protected ArrayList <autor> autores;
 	protected int IdObra;
	protected String titulo;
	protected String anyo;
	
	
	
	
	public Obra() {
		incremento++;
		this.autores = new ArrayList<autor>();
		this.IdObra=incremento;
		
	}
	
	public Obra(String titulo,String any) {
		incremento++;
		this.autores = new ArrayList<autor>();
		this.IdObra=incremento;
		this.titulo=titulo;
		this.anyo=any;
		
	}

	

	public String getTitulo() {
		return titulo;
	}
	
	/**
	 * Este metodo es para anyador los autores y no anyade mas de 3 
	 * @param a
	 */
	public void addAutor(autor a) {
		
		if(autores.size()<3) {
			
			autores.add(a);
		}
	}
	/**
	 * Este metodo es para borrar la obra 
	 * @param a
	 */
	public static void eliminarObra(int idEliminar, ArrayList<Obra> Obras) {
	    Iterator<Obra> iterator = Obras.iterator();
	    while (iterator.hasNext()) {
	        Obra obra = iterator.next();
	        if (obra.getIdObra() == idEliminar) {
	            iterator.remove();
	            System.out.println("Obra eliminada con éxito.");
	            
	        }else {
	        	System.out.println("Obra no encontrada.");	
	        }
	        	
	        } 
	}
	
	
	public static void ordenarObrasPorAnyo(ArrayList<Obra> Obras) {
	    int n = Obras.size();
		int i, j;
		Obra aux1;
	
			for(i = 0; i < n - 1; i++) {/* Se realizan N_EL-1 pasadas */
				for(j = n - 1; j > i; j--) { 
					if (Integer.parseInt(Obras.get(j).getAnyo())>Integer.parseInt(Obras.get(j+1).getAnyo())) {
						 aux1 = Obras.get(j);
						 
						 Obras.set(j,Obras.get(j-1));
						 
						 Obras.set(j+1, aux1);
						 
						 
					}
				}
			}
				
				}
	
	
	public String getAnyo() {
		return anyo;
	}

	public void setAnyo(String anyo) {
		this.anyo = anyo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	
	
	
	 @Override
	public String toString() {
		return "Obra [autores=" + autores + ", IdObra=" + IdObra + ", titulo=" + titulo + ", anyo=" + anyo + "]";
	}

	@Override
	    public int getAutores() {
			return autores.size();
	 }

		public int getIdObra() {
			return IdObra;
		}
	
		public void setIdObra(int idObra) {
			IdObra = idObra;
		}    
	

}
