public class Bijuteria extends Loja
{
    
    private double metaVendas;

    public Bijuteria(String nome, double salarioBaseFuncionario, int quantidadeFuncionarios, Endereco endereco, Data dataFundacao, double metaVendas)
    {
        super( nome, salarioBaseFuncionario, quantidadeFuncionarios, endereco, dataFundacao);
        
        this.metaVendas = metaVendas;
    }
    
    public double getMetaVendas() {
        return metaVendas;
    }

    public void setMetaVendas(double metaVendas) {
        this.metaVendas = metaVendas;
    }
    
    @Override
    public String toString() {
        super.toString();
        return super.toString() +  "\n" + 
        "Meta vendas:" + this.metaVendas;
    }
}
