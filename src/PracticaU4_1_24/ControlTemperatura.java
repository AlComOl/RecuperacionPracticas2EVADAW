package PracticaU4_1_24;

public final class ControlTemperatura extends ControlInstalacion{
	
	private final float lMax=30;
	private float lMin=18;
	public ControlTemperatura(String nombre, float dato, float lMin,float lMax){
		super(nombre,dato);
		
		lMax=this.lMax;
		lMin=this.lMin;
	
	
	}
	

	@Override
	public void procesarValor() {
		
	}
	
	@Override
	public  void setLectura(float a){//aqui quitariamos el abstract para acabar el metodo y que lo hereden las hijas
		this.dato=a;
	}
	@Override
	public float getLectura(){
		return dato;
	}
	
	


	

}
