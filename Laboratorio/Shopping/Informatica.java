public class Informatica extends Loja
{
    private double seguroEletronicos;
   
    public Informatica(String nome, double salarioBaseFuncionario, int quantidadeFuncionarios, Endereco endereco, Data dataFundacao, double seguroEletronicos)
    {
        super( nome, salarioBaseFuncionario, quantidadeFuncionarios, endereco, dataFundacao);
        
        this.seguroEletronicos = seguroEletronicos;
    }
    
    public double getSeguroEletronicos() {
        return seguroEletronicos;
    }

    public void setSeguroEletronicos(double seguroEletronicos) {
        this.seguroEletronicos = seguroEletronicos;
    }
    
    @Override
    public String toString() {
        super.toString();
        return super.toString() +  "\n" + 
        "Seguro Eletrônicos:" + this.seguroEletronicos;
    }
}
