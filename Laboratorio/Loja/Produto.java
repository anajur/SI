public class Produto {

	private String nome;
	private double preco;
	private String descricao;
	private int quantidadeEstoque;
	
	public Produto(String nome, double preco, String descricao, int quantidadeEstoque) {
		this.nome = nome;
		this.preco = preco;
		this.descricao = descricao;
		this.quantidadeEstoque = quantidadeEstoque;
	}
	
	public String getNome() {
        	return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getDescricao() {
        	return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public int getQuantidadeEstoque() {
		return quantidadeEstoque;
	}

	public void setQuantidadeEstoque(int quantidadeEstoque) {
		this.quantidadeEstoque = quantidadeEstoque;
        }	

}
