public class Data {

    private int dia;
    private int mes;
    private int ano;

    public Data(int dia, int mes, int ano) {

        boolean diaValido = false;
        boolean mesValido = false;
        boolean anoBissexto = (ano % 4 == 0) && (ano % 100 != 0 || ano % 400 == 0);
        //ver se precisa validar ano
        int[] mesesTrintaDias = {
            4,
            6,
            9,
            11
        };

        int[] mesesTrintaUmDias = {
            1,
            3,
            5,
            7,
            8,
            10,
            12
        };
        
        if (mes >= 1 && mes <= 12) {
            mesValido = true;
        }

        if (dia == 29 && mes == 2 && anoBissexto) {
            diaValido = true;
        } else if (dia == 28 && mes == 2 && !anoBissexto) {
            diaValido = true;
        } else if (dia <= 30) {
            for (int i = 0; i < mesesTrintaDias.length; i++) {
                if (mesesTrintaDias[i] == mes) {
                    diaValido = true;
                    break;
                }
            }
        } else if (dia <= 31) {
            for (int i = 0; i < mesesTrintaUmDias.length; i++) {
                if (mesesTrintaUmDias[i] == mes) {
                    diaValido = true;
                    break;
                }
            }
        }

        if (diaValido && mesValido) {
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
        } else {
            System.out.println("Data inserida inválida");
            this.dia = 1;
            this.mes = 1;
            this.ano = 2000;
        }
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    
    public boolean verificaAnoBissexto(){
        return (this.ano % 4 == 0) && (this.ano % 100 != 0 || this.ano % 400 == 0);
    }

    public String toString() {
        return this.dia + "/" + this.mes + "/" + this.ano;
    }


}