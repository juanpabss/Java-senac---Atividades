public class Aluno {
    private String nome;
    private double[] notas = new double[4];

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public void setNotas(double[] notas){
        this.notas = notas;
    }
    public double[] getNotas(){
        return this.notas;
    }

    // metodo para calcular a média
    public double calcularMedia(){
        double media = 0;

        for(int contador = 0; contador < getNotas().length; contador++){
            media += getNotas()[contador];
        }

       return media /= getNotas().length;

    }


}
