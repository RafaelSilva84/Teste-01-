package br.com.alura.loja.dao;

import javax.persistence.EntityManager;

import br.com.alura.modelo.Produto;

public class ProdutoDao {
	
	private EntityManager em;

	public ProdutoDao(EntityManager em) {
		super();
		this.em = em;
	}
	
	

	public void cadastrar(Produto produto) {
		this.em.persist(produto);
	}



	public Produto buscarPorId(int i) {
		
		return null;
	}



	public Produto buscarPorId(long l) {
		// TODO Auto-generated method stub
		return null;
	}
	
	// para fazer busca do produto
	
	//public Produto buscarPorId(Long id) {
	//	 return em.find(Produto.class, id);
	//}

     // para buscar todos os produtos
	// public List<Produto> buscarTodos() {
	//	 String jpql = "SELECT p FROM Produto p ";
	 //  return em.createQuery(jpql, Produto.class).getResultList();
	// }
	
	 
		// public List<Produto> buscarPorNome(String nome) {	 
		//  return em.createNamedQuery("Produto.produtosPorCategoria", Produto.class)
		//.steParameter("nome", nome)
	    //.getResultList();
		// }
	
	// public List<Produto> buscarPorNomeDaCategoria(String nome) {
	//	 String jpql = "SELECT p FROM Produto p WHERE p.categoria.nome = :nome ";
	//  return em.createQuery(jpql, Produto.class)
	//.steParameter("nome", nome)
    //.getResultList();
	// }
	
	// public BigDecimal buscarPrecoDoProdutoComNome(String nome) {
			//	 String jpql = "SELECT p.preco FROM Produto p WHERE p.nome = :nome ";
			//  return em.createQuery(jpql, BigDecimal.class)
			//.steParameter("nome", nome)
		    //.getSingleResult();
			
	// }
	
	// public List<Produto> buscarPorParametros(String nome, BigDecimal preco. LocalDate dataCadatro)
	// String jpql = "SELECT p FROM Produto p WHERE 1=1 ";
	// if (nome != null && !nome.trim().isEmpty()) {
	// jpql = "AND p.mome - :nome";
    
	// }
	
	// if (preco != null) {
	// jpql = "AND p.preco - :preco";
	
	//}
	
	// if (dataCadastro != null) {
		// jpql = "AND p.dataCadastro - :dataCadastro";
		
		//}
	
	//  TypeQuery<Produto> query = em.createQuery(jpql, Produto.class);
	// if (nome != null && !nome.trim().isEmpty()) {
	// query.setParamete("nome", nome);
    
	// }
	
	// if (preco != null) {
	// jpql = "AND p.preco - :preco";
	// query.setParamete("preco", preco);
	
	//}
	
	// if (dataCadastro != null) {
	// jpql = "AND p.dataCadastro - :dataCadastro";
	// query.setParamete("dataCadastro", dataCadastro);
		
	//}
	
	// return query.getResultList();
	
	 }



