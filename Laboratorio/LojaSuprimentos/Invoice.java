public class Invoice {
    private String tipo;
    private String descricao;
    private double preco;
    private int quantidade;

    public Invoice(String tipo, double preco, int quantidade, String descricao) {
        this.preco = preco;
        this.quantidade = quantidade;
        this.tipo = tipo;
        this.descricao = descricao;
    }
    
    public String getTipo() {
        return tipo;
    }
    
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public double getPreco() {
        return preco;
    }
    
    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    public int getQuantidade() {
        return quantidade;
    }
    
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
        
    public String getDescricao() {
        return descricao;
    }
    
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    public double getlnvoiceAmount(){
        return this.quantidade * this.preco;
    }
}
