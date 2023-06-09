package br.com.alura.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "categorias")
public class Categoria {


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	private Long id;
	private String nome;
	public Categoria(Long id, String nome) {
		super();
		this.nome = nome;
	}
	
	public Categoria(String string) {
		
	}

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
}
