package br.com.alura.loja.testes;

import java.math.BigDecimal;

import javax.persistence.EntityManager;

import br.com.alura.loja.dao.CategoriaDao;
import br.com.alura.loja.dao.JPAUtil;
import br.com.alura.loja.dao.ProdutoDao;
import br.com.alura.modelo.Categoria;
import br.com.alura.modelo.Produto;

public class CadastrodeProduto {

	public static void main(String[] args) {
		cadastrarProduto();
		
	// para fazer consulta JPA
		
	//	EntityManager em = JPAUtil.getEntityManager();
	// ProdutoDao produtoDao = new ProdutoDao(em);
	//	Produto p = produtoDao.buscarPorId(1l);
	//	System.out.println(p.getPreco());
	//	List<Produto> todos = produtoDao.buscarTodos();
	//	todos.forEach(p2 -> System.out.println(p.getNome()));
		
	}

	private static void cadastrarProduto() {
		Categoria celulares = new Categoria("CELULARES");
		Produto celular = new Produto("Aplle", "Muito legal", new BigDecimal("8000" ), celulares );
		
		
		
		EntityManager em = JPAUtil.getEntityManager();
		ProdutoDao produtoDao = new ProdutoDao(em);
		CategoriaDao categoriaDao = new CategoriaDao(em);
		
		em.getTransaction().begin();
		
		categoriaDao.cadastrar(celulares);
		produtoDao.cadastrar(celular);
		
		em.getTransaction().commit();
		em.close();
	}

}
