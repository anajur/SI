

public class Cosmetico extends Loja
{
   
    private double taxaComercializacao;

    public Cosmetico(String nome, double salarioBaseFuncionario, int quantidadeFuncionarios, Endereco endereco, Data dataFundacao, double taxaComercializacao)
    {
        super( nome, salarioBaseFuncionario, quantidadeFuncionarios, endereco, dataFundacao);
        
        this.taxaComercializacao = taxaComercializacao;
    }

    public double getTaxaComercializacao() {
        return taxaComercializacao;
    }

    public void setTaxaComercializacao(double taxaComercializacao) {
        this.taxaComercializacao = taxaComercializacao;
    }
    
    @Override
    public String toString() {
        super.toString();
        return super.toString() +  "\n" + 
        "Taxa Comercialização:" + this.taxaComercializacao;
    }
    
}
