public class Produto {

    private String nome;
    private double preco;
    private Data dataValidade;
    
    public Produto(String nome, double preco, Data dataValidade) {
        this.nome = nome;
        this.preco = preco;
        this.dataValidade = dataValidade;
    }
    
    public String getNome() {
            return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    public Data getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(Data dataValidade) {
        this.dataValidade = dataValidade;
    }
    
    public boolean estaVencido(Data data){
       if(this.dataValidade.getAno() < data.getAno()){
           return true;
       } else if (this.dataValidade.getMes() == data.getMes() && data.getDia() >= this.dataValidade.getDia()){
               return true;
       } else if (this.dataValidade.getMes() < data.getMes()){
           return true;
        }
            
            return false;
            
    }
    
        public String toString() {
        return "Nome: " + this.nome + "\n" + "Preço: " + this.preco + "\n" + "Data de Validade:" + this.dataValidade.toString();
    }


}
