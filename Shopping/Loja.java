public class Loja {

	private String nome;
	private double salarioBaseFuncionario;
	private int quantidadeFuncionarios;
	private Endereco endereco;
	private Data dataFundacao;
	
	
	public Loja(String nome, double salarioBaseFuncionario, int quantidadeFuncionarios, Endereco endereco, Data dataFundacao) {
		this.nome = nome;
		this.salarioBaseFuncionario = salarioBaseFuncionario;
		this.quantidadeFuncionarios = quantidadeFuncionarios;
		this.endereco = endereco;
		this.dataFundacao = dataFundacao;
	}
	
	public Loja(String nome, int quantidadeFuncionarios, Endereco endereco, Data dataFundacao) {
		this.nome = nome;
		this.salarioBaseFuncionario = -1;
		this.quantidadeFuncionarios = quantidadeFuncionarios;
		this.endereco = endereco;
		this.dataFundacao = dataFundacao;
	}

	public String getNome() {
        	return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalarioBaseFuncionario() {
		return salarioBaseFuncionario;
	}

	public void setSalarioBaseFuncionario(double salarioBaseFuncionario) {
		this.salarioBaseFuncionario = salarioBaseFuncionario;
	}
	
	public int getQuantidadeFuncionarios() {
		return quantidadeFuncionarios;
	}

	public void setQuantidadeFuncionarios(int quantidadeFuncionarios) {
		this.quantidadeFuncionarios = quantidadeFuncionarios;
	}
	
	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	public Data getDataFundacao() {
		return dataFundacao;
	}

	public void setDataFundacao(Data dataFundacao) {
		this.dataFundacao = dataFundacao;
	}
	
	public double gastosComSalario() {
	    if (this.salarioBaseFuncionario == -1){ return -1;}
	    
            return this.quantidadeFuncionarios * this.salarioBaseFuncionario;
	}
	
	public char tamanhoDaLoja() {
	    if (this.quantidadeFuncionarios < 10){ 
	        return 'P';
	    }
	    else if (this.quantidadeFuncionarios < 30) { 
	        return 'M';
	    }
	    else {
	        return 'G';
	    }
	}
	
        public String toString() {
		return "Nome: " + this.nome + "\n" + "Salário base funcionário: " + this.salarioBaseFuncionario + "\n" + 
		"Quantidade funcionários:" + this.quantidadeFuncionarios + "Endereço:" + this.endereco.toString() + "\n" + 
		"Data de fundação:" + this.dataFundacao.toString();
	}


}
