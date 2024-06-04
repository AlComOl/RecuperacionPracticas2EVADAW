package PracticaU4_1_24;

public  final class ControlPotencia extends ControlInstalacion{

	
	private final int POTMAX=10000, POT=100;//no puden ser estaticas las clases porque sino tendrian que ser publicas
	private int alerta=0;
	
	
	public ControlPotencia(String nombre,int dato, int pot,int potMax,int alerta) {
		super(nombre,dato);
		
		pot=this.POT;
		potMax=this.POTMAX;
//		this.alerta=alerta;//porque no se pasa la alerta
		
	}



	@Override
	public void procesarValor() {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void setLectura(float a) {
		dato=a;
		
	}

	@Override
	public float getLectura() {
		// TODO Auto-generated method stub
		return 0;
	}
}
