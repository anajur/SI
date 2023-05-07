public class Alimentacao extends Loja
{
    private Data dataAlvara;
   
    public Alimentacao( String nome, double salarioBaseFuncionario, int quantidadeFuncionarios, Endereco endereco, Data dataFundacao, Data dataAlvara)
    {
        super( nome, salarioBaseFuncionario, quantidadeFuncionarios, endereco, dataFundacao);
        
        this.dataAlvara = dataAlvara;
    }
    
    public Data getDataAlvara() {
        return dataAlvara;
    }

    public void setDataAlvara(Data dataAlvara) {
        this.dataAlvara = dataAlvara;
    }
    
    @Override
    public String toString() {
        super.toString();
        return super.toString() +  "\n" + 
        "Data Alvará:" + this.dataAlvara;
    }
}
