public class Livro {
	private String titulo;
	private String autor;
	private int anoPublicacao;
	private double preco;
	private int quantidadePaginas;
	
	public Livro( String titulo,
	 String autor,
	 int anoPublicacao,
	 double preco,
	 int quantidadePaginas) {
		this.titulo = titulo;
		this.autor = autor;
		this.quantidadePaginas = quantidadePaginas;
		this.anoPublicacao = anoPublicacao;
		this.preco = preco;
	}
	
	public String getTitulo() {
        	return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
		public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	

	public int getAnoPublicacao() {
		return anoPublicacao;
	}
	
	public void setAnoPublicacao(int anoPublicacao) {
		this.anoPublicacao = anoPublicacao;
	}
	


	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	
	public int getQuantidadePaginas() {
		return quantidadePaginas;
	}
	
	public void setQuantidadePaginas(int quantidadePaginas) {
		this.quantidadePaginas = quantidadePaginas;
	}
	
	 public double calcularPrecoPorPagina(){
             return preco / quantidadePaginas;
         }

	
        public String toString() {
		return "Título: " + this.titulo + "\n" + "Autor: " + this.autor + "\n" + "Ano de publicação: " + this.anoPublicacao +"\n" + "Preço: R$ " + this.preco + "\n" + "Quantidade de páginas:" + this.quantidadePaginas;
	}


}
