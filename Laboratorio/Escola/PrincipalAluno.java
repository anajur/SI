public class PrincipalAluno {

    public static void main(String[] args){
        
       
        
    Aluno aluno1 = new Aluno("Roberta Pardo", "1585258", 5, 9);
    Aluno aluno2 = new Aluno("Mia Colucci", "2254879", 8, 2); 
    Aluno aluno3 = new Aluno("Lupita Fernández", "0085994", 7, 1);
    aluno1.imprimeInfo();
    aluno2.imprimeInfo();
    aluno3.imprimeInfo();
    aluno2.setGrauA(9);
    System.out.println(aluno2.calculaMediaFinal());
    System.out.println(aluno3.getMatricula());
    aluno1.setMatricula("1585228");
    double nota = Teclado.leDouble("Insira a nota de grau B");
    aluno2.setGrauB(nota);
    }
}

