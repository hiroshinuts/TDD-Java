package nuts.hiro.cap2;

import org.junit.Test;

import junit.framework.Assert;

public class TestaMaiorEMenor {
	
	@Test
	public void ordemDescrescente() {
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		carrinho.adiciona(new Produto("Geladeira", 450.0));
		carrinho.adiciona(new Produto("Liquificador", 250.0));
		carrinho.adiciona(new Produto("Jogo de Pratos", 70.0));
		
		MaiorEMenor algoritmo = new MaiorEMenor();
		algoritmo.encontra(carrinho);
		
		Assert.assertEquals("Jogo de Pratos", algoritmo.getMenor().getNome());
		Assert.assertEquals("Geladeira", algoritmo.getMaior().getNome());
		
		
	}
	
	@Test
	public void apenasUmProduto(){
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		carrinho.adiciona(new Produto("Geladeira", 450.0));
		
		MaiorEMenor algoritmo = new MaiorEMenor();
		algoritmo.encontra(carrinho);
		
		Assert.assertEquals("Geladeira", algoritmo.getMenor().getNome());
		Assert.assertEquals("Geladeira", algoritmo.getMaior().getNome());
		
	}

}
