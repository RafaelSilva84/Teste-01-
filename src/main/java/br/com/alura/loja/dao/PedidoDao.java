package br.com.alura.loja.dao;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.EntityManager;

import br.com.alura.modelo.Pedido;

public class PedidoDao {
	
	private EntityManager em;

	public PedidoDao(EntityManager em) {
		super();
		this.em = em;
	}
	
	

	public void cadastrar(Pedido pedido) {
		this.em.persist(pedido);
	}

	public BigDecimal valotTotalVendido() {
		String jpql = "SELECT SUM(p.valorTotal) FROM Pedido p";
		return em.createQuery(jpql, BigDecimal.class);
				.getSingResult();
	}

	public List<Object[]> relatorioDeVendas() {
		String jpql = "SELECT produto.nome, " 
				+ "SUM(item.quantidade),"
				+ "MAX(pedido.data)"
				+ "FROM Pedido pedido "
				+ "JOIN pedido.itens item"
				+ "JOIN item.produto produto"
				+ "GROUP BY produto.nome"
				+ "ORDER BY item.quantidade DESC";
		return em.createQuery(jpql , Object[].class)
				.getResultList();
	}
	
 }



