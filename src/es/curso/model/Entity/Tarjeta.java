package es.curso.model.Entity;

public class Tarjeta {
	
	private int id;
	private String numero;
	private int cupoMaximo;
	private int saldoDisponible;
	private String tipo;
	private int numComprobacion;
	private String contrasenha;
	private boolean bloqueada; 
	
	
	public Tarjeta() {
		super();
	}
	public Tarjeta (int id, String numero, int cupoMaximo, 
			int saldoDisponible, String tipo, int numComprobacion, 
			String contrasenha, Boolean bloqueada) {
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
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
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
	public String getContrasenha() {
		return contrasenha;
	}
	public void setContrasenha(String contrasenha) {
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
	
	
	
	// hash and equals
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (bloqueada ? 1231 : 1237);
		result = prime * result
				+ ((contrasenha == null) ? 0 : contrasenha.hashCode());
		result = prime * result + saldoDisponible;
		result = prime * result + cupoMaximo;
		result = prime * result + id;
		result = prime * result + numComprobacion;
		result = prime * result + ((numero == null) ? 0 : numero.hashCode());
		result = prime * result + ((tipo == null) ? 0 : tipo.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Tarjeta other = (Tarjeta) obj;
		if (bloqueada != other.bloqueada)
			return false;
		if (contrasenha == null) {
			if (other.contrasenha != null)
				return false;
		} else if (!contrasenha.equals(other.contrasenha))
			return false;
		if (saldoDisponible != other.saldoDisponible)
			return false;
		if (cupoMaximo != other.cupoMaximo)
			return false;
		if (id != other.id)
			return false;
		if (numComprobacion != other.numComprobacion)
			return false;
		if (numero == null) {
			if (other.numero != null)
				return false;
		} else if (!numero.equals(other.numero))
			return false;
		if (tipo == null) {
			if (other.tipo != null)
				return false;
		} else if (!tipo.equals(other.tipo))
			return false;
		return true;
	}
	
	
	
	
	


	
	
	

}
