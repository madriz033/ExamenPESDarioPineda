package es.curso.model.Entity;

public class Tarjeta {
	
	private int id;
	private int numero;
	private int cupoMaximo;
	private int saldoDisponible;
	private String tipo;
	private int numComprobacion;
	private int contrasenha;
	private boolean bloqueada; 
	
	
	public Tarjeta() {
		super();
	}
	public Tarjeta (int id, int numero, int cupoMaximo, 
			int saldoDisponible, String tipo, int numComprobacion, 
			int contrasenha, Boolean bloqueada) {
		super();
		this.id = id;
		this.numero = numero;
		this.cupoMaximo = cupoMaximo;
		this.saldoDisponible = saldoDisponible;
		this.numComprobacion = numComprobacion;
		this.contrasenha = contrasenha;
		this.bloqueada = bloqueada;
	}

// getters setters 	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public int getCupoMaximo() {
		return cupoMaximo;
	}
	public void setCupoMaximo(int cupoMaximo) {
		this.cupoMaximo = cupoMaximo;
	}
	public int getSaldoDisponible() {
		return saldoDisponible;
	}
	public void setSaldoDisponible(int saldoDisponible) {
		this.saldoDisponible = saldoDisponible;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public int getNumComprobacion() {
		return numComprobacion;
	}
	public void setNumComprobacion(int numComprobacion) {
		this.numComprobacion = numComprobacion;
	}
	public int getContrasenha() {
		return contrasenha;
	}
	public void setContrasenha(int contrasenha) {
		this.contrasenha = contrasenha;
	}
	public boolean isBloqueada() {
		return bloqueada;
	}
	public void setBloqueada(boolean bloqueada) {
		this.bloqueada = bloqueada;
	}
	
	
	// metodo generate to string
	@Override
	public String toString() {
		return "Tarjeta [id=" + id + ", numero=" + numero + ", cupoMaximo="
				+ cupoMaximo + ", saldoDisponible=" + saldoDisponible + ", tipo="
				+ tipo + ", numComprobacion=" + numComprobacion
				+ ", contrasenha=" + contrasenha + ", bloqueada=" + bloqueada
				+ "]";
	}
	
	
	

	

	
	
	
	


	
	
	

}
