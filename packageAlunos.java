public class packageAlunos{

    public double professor;
    public String[] alunos;
    public int notasDosAlunos = 11;
     public double[] valorDasAvaliaçoeis;


public double[] ValorDasAvaliaçoeis(){
    valorDasAvaliaçoeis = new double[]{};
    return valorDasAvaliaçoeis;
}

    public void setAlunos(String alunos) {
        this.alunos = new String[]{alunos};
    }

    public void setValorDasAvaliaçoeis(double[] valorDasAvaliaçoeis) {
        this.valorDasAvaliaçoeis = new double[]{};
    }

    public int getNotasDosAlunos() {
        return notasDosAlunos;
    }


    }

