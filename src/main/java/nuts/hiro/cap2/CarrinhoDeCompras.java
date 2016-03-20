package nuts.hiro.cap2;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
	
	private List<Produto> produto;

	public List<Produto> getProdutos() {
		return this.produto;
	}
	
	public void adiciona(Produto produto){
		if(this.produto == null){
			this.produto = new ArrayList<Produto>();
		}
		this.produto.add(produto);
	}

}
