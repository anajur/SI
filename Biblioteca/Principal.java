
/**
 * Escreva uma descrição da classe Principal aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Principal
{
    public static void main(String[] args){
        
        String titulo = Teclado.leString();
        String autor = Teclado.leString();
        int ano = Teclado.leInt();
        double preco = Teclado.leDouble();
        int pagina = Teclado.leInt();
        
        Livro livro = new Livro(titulo, autor, pagina, preco, ano);
        
        String nome = Teclado.leString();
        String email = Teclado.leString();
        String senha = Teclado.leString();
        int idade = Teclado.leInt();
        char sexo = Teclado.leChar();
        Cliente cliente = new Cliente(nome, email, senha, idade, sexo);
        
        System.out.println(livro.calcularPrecoPorPagina());
        System.out.println(livro.toString());
        System.out.println(cliente.imprimeInformacoes());
        
        
        
    }
}
