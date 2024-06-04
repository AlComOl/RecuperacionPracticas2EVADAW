package PracticaU4_1_24;

public abstract class ControlInstalacion implements Controles{

	protected String nombre;
	
	protected float dato;
	
	
	public ControlInstalacion() {
		
	}
	
	public ControlInstalacion(String nombre, float dato) {
		
		this.nombre=nombre;
		this.dato=dato;
		
	}
	
	public abstract void procesarValor();

	public  void setLectura(float a){//aqui quitariamos el abstract para acabar el metodo y que lo hereden las hijas
		this.dato=a;
	}
	public float getLectura(){
		return dato;
	}
	
	
	
	
	}


