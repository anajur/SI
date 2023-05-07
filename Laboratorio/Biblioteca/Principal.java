public class Principal
{
    public static void main(String[] args){
        
        
        String nome = Teclado.leString();
        String email = Teclado.leString();
        String senha = Teclado.leString();
        int idade = Teclado.leInt();
        char sexo = Teclado.leChar();
        
        String titulo = Teclado.leString();
        String autor = Teclado.leString();
        int ano = Teclado.leInt();
        double preco = Teclado.leDouble();
        int pagina = Teclado.leInt();
        
        Livro livro = new Livro(titulo, autor, pagina, preco, ano);
        
        Cliente cliente = new Cliente(nome, email, senha, idade, sexo, livro);
        
        System.out.printf("Preço por página livro R$%.2f",livro.calcularPrecoPorPagina());
        System.out.println("\nO cliente " + cliente.getNome() + " está com o livro " + livro.getTitulo() +
        ", e o preço por página deste livro é R$" + livro.calcularPrecoPorPagina());
       cliente.imprimeInformacoes();
        
        
        
    }
}
