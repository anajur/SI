public class Cliente {
    private String nome;
    private String email;
    private String senha;
    private int idade;
    private char sexo;
    private Livro livro;
    
    public Cliente(String nome,
     String email, String senha,
     int idade,
     char sexo, Livro livro) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.idade = idade;
        this.sexo = sexo;
        this.livro = livro;
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getSenha() {
        return senha;
    }
    
    public void setSenha(String senha) {
        this.senha = senha;
    }
    

    public int getIdade() {
        return idade;
    }
    
    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public char getSexo() {
        return sexo;
    }
    
    public void setSexo(char sexo) {
        this.sexo= sexo;
    }
    
    public Livro getLivro() {
        return livro;
    }
    
    public void setLivro(Livro livro) {
        this.livro = livro;
    }
    
    public void imprimeInformacoes() {
         System.out.println(this);
    }
    
    public String toString() {
        return "Nome: " + this.nome + "\n" + "Idade: " + this.idade + "\n" + "Sexo: " 
        + this.sexo +"\n" + "E-mail" + this.email + "\n" + "Senha: " + this.senha + "\n" + "Livro" + this.livro.toString();
    }

}
