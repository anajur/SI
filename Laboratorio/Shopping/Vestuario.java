
public class Vestuario extends Loja
{
    private boolean produtosImportados;

    public Vestuario(String nome, double salarioBaseFuncionario, int quantidadeFuncionarios, Endereco endereco, Data dataFundacao, boolean produtosImportados)
    {
        super( nome, salarioBaseFuncionario, quantidadeFuncionarios, endereco, dataFundacao);
        
        this.produtosImportados = produtosImportados;
    }

        public boolean getProdutosImportados() {
        return produtosImportados;
    }

    public void setProdutosImportados(boolean produtosImportados) {
        this.produtosImportados = produtosImportados;
    }
    
    @Override
    public String toString() {
        super.toString();
        return super.toString() +  "\n" + 
        "Produtos Importados:" + this.produtosImportados;
    }
    
}
