
public class Vuelos {
	
	//ATRIBUTOS
	private String hora;
	private String procedencia;
	private String destino;
	private boolean retraso;
	
	
	//CONTRUCTORES
	public Vuelos(String hora, String procedencia, String destino, boolean retraso) {
		this.hora = hora;
		this.procedencia = Procedencia();
		this.destino = destino;
		this.retraso = retraso;
	}
	
	public Vuelos() {
		this.hora = "00:00";
		this.procedencia = Procedencia();
		this.destino = "Punto B";
		this.retraso = false;
	}
	
	//GETTERS & SETTERS
	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	public String getProcedencia() {
		return procedencia;
	}

	public void setProcedencia(String procedencia) {
		this.procedencia = procedencia;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public boolean isRetraso() {
		return retraso;
	}

	public void setRetraso(boolean retraso) {
		this.retraso = retraso;
	}
	
	
	
	public String Procedencia() {
		Aeropuerto procedencia = new Aeropuerto();
		String ciudadA = procedencia.getCiudad();
		return ciudadA;
		
		
	}
	
	public void imprimir() {
		System.out.println("============VUELO===========");
		System.out.println("Ciudad Destino: "+procedencia);
		System.out.println("============================");
	}
	
}
