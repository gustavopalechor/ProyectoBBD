package modelo;

public class Estilo {
	private int idEstilo;
	private String nombreEstilo;
	public Estilo(int idEstilo, String nombreEstilo) {
		super();
		this.idEstilo = idEstilo;
		this.nombreEstilo = nombreEstilo;
	}
	public Estilo() {
		super();
	}
	public int getIdEstilo() {
		return idEstilo;
	}
	public void setIdEstilo(int idEstilo) {
		this.idEstilo = idEstilo;
	}
	public String getNombreEstilo() {
		return nombreEstilo;
	}
	public void setNombreEstilo(String nombreEstilo) {
		this.nombreEstilo = nombreEstilo;
	}
	@Override
	public String toString() {
		return "Estilo [idEstilo=" + idEstilo + ", nombreEstilo=" + nombreEstilo + "]";
	}
	
}
