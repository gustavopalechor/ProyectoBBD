package modelo;

import java.util.Calendar;
import java.util.List;

public class Interpretacion {
	private int idInterpretacion;
	private Calendar fecha;
	private Tema temaInterpretacion;
	private Estilo estiloInterpretacion;
	private List<Interprete> listaInterpretes;
	public Interpretacion(int idInterpretacion, Calendar fecha, Tema temaInterpretacion, Estilo estiloInterpretacion,
			List<Interprete> listaInterpretes) {
		super();
		this.idInterpretacion = idInterpretacion;
		this.fecha = fecha;
		this.temaInterpretacion = temaInterpretacion;
		this.estiloInterpretacion = estiloInterpretacion;
		this.listaInterpretes = listaInterpretes;
	}
	public Interpretacion() {
		super();
	}
	public int getIdInterpretacion() {
		return idInterpretacion;
	}
	public void setIdInterpretacion(int idInterpretacion) {
		this.idInterpretacion = idInterpretacion;
	}
	public Calendar getFecha() {
		return fecha;
	}
	public void setFecha(Calendar fecha) {
		this.fecha = fecha;
	}
	public Tema getTemaInterpretacion() {
		return temaInterpretacion;
	}
	public void setTemaInterpretacion(Tema temaInterpretacion) {
		this.temaInterpretacion = temaInterpretacion;
	}
	public Estilo getEstiloInterpretacion() {
		return estiloInterpretacion;
	}
	public void setEstiloInterpretacion(Estilo estiloInterpretacion) {
		this.estiloInterpretacion = estiloInterpretacion;
	}
	public List<Interprete> getListaInterpretes() {
		return listaInterpretes;
	}
	public void setListaInterpretes(List<Interprete> listaInterpretes) {
		this.listaInterpretes = listaInterpretes;
	}
	@Override
	public String toString() {
		return "Interpretacion [idInterpretacion=" + idInterpretacion + ", fecha=" + fecha + ", temaInterpretacion="
				+ temaInterpretacion + ", estiloInterpretacion=" + estiloInterpretacion + ", listaInterpretes="
				+ listaInterpretes + "]";
	}
	
}
