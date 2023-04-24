package br.com.alura.loja.dao;

import javax.persistence.EntityManager;

import br.com.alura.modelo.Cliente;
import br.com.alura.modelo.Produto;

public class ClienteDao {
	
	private EntityManager em;

	public ClienteDao(EntityManager em) {
		super();
		this.em = em;
	}
	
	

	public void cadastrar(Cliente cliente) {
		this.em.persist(cliente);
	}

	public Cliente buscarPorId(Long id) {
			 return em.find(Cliente.class, id);
		}

	 }



