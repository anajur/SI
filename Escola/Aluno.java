public class Aluno {
    private String nome;
    private String matricula;
    private double grauB;
   private double grauA;
    
    public Aluno(   String nome,
     String matricula,
     double grauB,
    double grauA) {
        this.nome = nome;
        this.matricula = matricula;
        this.grauB = grauB;
        this.grauA = grauA;
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getMatricula() {
        return matricula;
    }
    
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
    public double getGrauA() {
        return grauA;
    }
    
    public void setGrauA(double grauA) {
        this.grauA = grauA;
    }
    
      public double getGrauB() {
        return grauB;
    }
    
    public void setGrauB(double grauB) {
        this.grauB = grauB;
    }
    
    public double calculaMediaFinal(){
        return  (this.grauA * 0.33) + (this.grauB * 0.67);
    }
    
    
    public void imprimeInfo() {
       System.out.println( "Nome: " + this.nome + "\n" + "Matrícula: " + this.matricula + "\n" + "Grau A: " 
       + this.grauA +"\n" + "Grau B:" + this.grauB + "\n" + "Média Final: " + this.calculaMediaFinal());
    }

}
