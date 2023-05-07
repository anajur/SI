
public class Programador extends Pessoa
{
    private String linguagemPreferida;
    
    public Programador(String nome, int idade,String linguagemPreferida ){
        super(nome, idade);
        this.linguagemPreferida = linguagemPreferida;
    }
    
    public Programador(){};
    
    public String getLinguagemPreferida()
    {
        return linguagemPreferida;
    }

    public void setLinguagemPreferida(String linguagemPreferida)
    {
        this.linguagemPreferida = linguagemPreferida;
    }
    
        @Override
     public void imprimeDados(){
        System.out.println("Nome: "+this.getNome());
        System.out.println("Idade: "+this.getIdade());
        System.out.println("Linguagem Preferida: "+this.linguagemPreferida);
    }
   
}
