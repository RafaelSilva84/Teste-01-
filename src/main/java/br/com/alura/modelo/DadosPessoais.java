package br.com.alura.modelo;

import javax.persistence.Embeddable;

@Embeddable
public class DadosPessoais {

		public DadosPessoais(String nome, String cpf) {
		super();
		this.nome = nome;
		this.cpf = cpf;
	}


		private String nome;
		private String cpf;
		
		public String getNome() {
			return nome;
		}

	
		public String getCpf() {
			return cpf;
		}

		
	}


