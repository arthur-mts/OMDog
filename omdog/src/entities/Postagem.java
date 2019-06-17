package entities;

import java.util.Date;

public class Postagem {
	
	private long idPosta;
	private Date DataEHora;
	private String texto;
	
	public long getIdPosta() {
		return idPosta;
	}
	public void setIdPosta(long idPosta) {
		this.idPosta = idPosta;
	}
	public Date getDataEHora() {
		return DataEHora;
	}
	public void setDataEHora(Date dataEHora) {
		DataEHora = dataEHora;
	}
	public String getTexto() {
		return texto;
	}
	public void setTexto(String texto) {
		this.texto = texto;
	}

	

	

}
