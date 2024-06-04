package RecuperacionPracticas2Eva;

public class Cd extends Obra{

	private int nCanciones;
	
	public Cd(String titulo,String any,int nCanciones ) {
		super(titulo,any);
		this.nCanciones=nCanciones;
	}

	

	 @Override
	    public String toString() {
	        return "Cd [Identificador :" +IdObra+" titulo=" + titulo + ", anyo=" + anyo + ", ncanciones=" + nCanciones + "]";
	    }
	
	
	
}
