package modelo;

public class Interprete {
	private int idInterprete;
	private String nombreInterprete;
	public Interprete(int idInterprete, String nombreInterprete) {
		super();
		this.idInterprete = idInterprete;
		this.nombreInterprete = nombreInterprete;
	}
	public Interprete() {
		super();
	}
	public int getIdInterprete() {
		return idInterprete;
	}
	public void setIdInterprete(int idInterprete) {
		this.idInterprete = idInterprete;
	}
	public String getNombreInterprete() {
		return nombreInterprete;
	}
	public void setNombreInterprete(String nombreInterprete) {
		this.nombreInterprete = nombreInterprete;
	}
	@Override
	public String toString() {
		return "Interprete [idInterprete=" + idInterprete + ", nombreInterprete=" + nombreInterprete + "]";
	}
	
}
