package br.com.alura.modelo;

import javax.persistence.Entity;

@Entity
public class Livro extends Produto {
	
	private String autor;
	private Integer numeroDePaginas;
	
	public Livro() {
	}
	
	
	public Livro(String autor, Integer numeroDePaginas) {
		this.autor = autor;
		this.numeroDePaginas = numeroDePaginas;
	}


	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public Integer getNumeroDePginas() {
		return numeroDePaginas;
	}
	public void setNumeroDePginas(Integer numeroDePginas) {
		this.numeroDePaginas = numeroDePginas;
	}
	

}
