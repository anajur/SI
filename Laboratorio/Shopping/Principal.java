public class Principal
{
    public static void main(String[] args){
       

        int opcao = 0;
        
        while (opcao != 3) {
             System.out.println("(1) criar uma loja \n(2) criar um produto \n(3) sair");
            opcao = Teclado.leInt("Digite o número a opção: "); 
            if(opcao >3 || opcao <1){
            System.out.println("Opção inválida");
            }
          
            switch (opcao){
                case 1:
                    System.out.println("Cadastro de Loja");
                    String nome = Teclado.leString("Digite o nome: ");
                    double salarioBaseFuncionario = Teclado.leDouble("Digite o salário base dos funcionários: ");
                    int quantidadeFuncionarios = Teclado.leInt("Digite a quantidade de funcionários: ");
                    System.out.println("Endereço da Loja");
                    String nomeRua = Teclado.leString("Digite a rua: ");
                    String cidade = Teclado.leString("Digite a cidade: ");
                    String estado = Teclado.leString("Digite o estado: ");
                    String pais = Teclado.leString("Digite o país: ");
                    String cep = Teclado.leString("Digite o CEP: ");
                    String numero = Teclado.leString("Digite o numero: ");
                    String complemento = Teclado.leString("Digite o complemento: ");
                    System.out.println("Data de fundação");
                    int dia = Teclado.leInt("Digite o dia: ");
                    int mes = Teclado.leInt("Digite o mês: ");
                    int ano = Teclado.leInt("Digite o ano: ");
                    
                    Endereco endereco = new Endereco(nomeRua, cidade, estado, pais, cep, numero, complemento);
                    Data data = new Data(dia, mes, ano);
                    Loja loja = new Loja(nome, salarioBaseFuncionario, quantidadeFuncionarios, endereco,data); 
                    System.out.println(loja.toString());
                    break;
                case 2:
                    System.out.println("Cadastro de Produto");
                    String nomeProduto = Teclado.leString("Digite o nome: ");
                    double preco = Teclado.leDouble("Digite o preço: ");
                     System.out.println("Data de validade do produto: ");
                    int diaValidade = Teclado.leInt("Digite o dia: ");
                    int mesValidade = Teclado.leInt("Digite o mês: ");
                    int anoValidade = Teclado.leInt("Digite o ano: ");
                    Data dataValidade = new Data(diaValidade, mesValidade, anoValidade);
                    Produto produto = new Produto(nomeProduto, preco, dataValidade);
                    Data dataComparacao = new Data(20, 10, 2023);
                    
                    if(produto.estaVencido(dataValidade)){
                        System.out.print("PRODUTO VENCIDO");
                    } else {
                        System.out.print("PRODUTO NAO VENCIDO");
                    }
                    break;      
            }
            
        }
    
    
    }
  
}
