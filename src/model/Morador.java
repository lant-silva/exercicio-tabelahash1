package model;

import java.util.Objects;

public class Morador {
	
	private String nomeMorador;
	private int numApartamento;
	private String placaCarro;
	private String corCarro;
	private String modeloCarro;
	
	public Morador(String nomeMorador, int numApartamento, String placaCarro, String corCarro, String modeloCarro) {
		super();
		this.nomeMorador = nomeMorador;
		this.numApartamento = numApartamento;
		this.placaCarro = placaCarro;
		this.corCarro = corCarro;
		this.modeloCarro = modeloCarro;
	}
	
	public String getNomeMorador() {
		return nomeMorador;
	}
	public void setNomeMorador(String nomeMorador) {
		this.nomeMorador = nomeMorador;
	}
	public int getNumApartamento() {
		return numApartamento;
	}
	public void setNumApartamento(int numApartamento) {
		this.numApartamento = numApartamento;
	}
	public String getPlacaCarro() {
		return placaCarro;
	}
	public void setPlacaCarro(String placaCarro) {
		this.placaCarro = placaCarro;
	}
	public String getCorCarro() {
		return corCarro;
	}
	public void setCorCarro(String corCarro) {
		this.corCarro = corCarro;
	}
	public String getModeloCarro() {
		return modeloCarro;
	}
	public void setModeloCarro(String modeloCarro) {
		this.modeloCarro = modeloCarro;
	}
	@Override
	public int hashCode() {
		int andar = numApartamento / 100;
		return andar-1;
	}
	@Override
	public String toString() {
		return "Morador [nomeMorador=" + nomeMorador + ", numApartamento=" + numApartamento + ", placaCarro="
				+ placaCarro + ", corCarro=" + corCarro + ", modeloCarro=" + modeloCarro + "]";
	}
	
}
