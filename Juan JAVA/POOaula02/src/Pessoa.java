public class Pessoa {

    private String nome;
    private int anoDeNascimento;
    private double altura;
    private double peso;

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public void setAnoDeNascimento(int anoDeNascimento){
        this.anoDeNascimento = anoDeNascimento;
    }

    public int getanoDeNasciemnto(){
        return this.anoDeNascimento;
    }

    public void setAltura(double altura){
        this.altura = altura;
    }

    public double getAltura(){
        return this.altura;
    }

    public void setPeso(double peso){
        this.peso = peso;
    }

    public double getPeso(){
        return this.peso;
    }

    public int calcularIdade(){
        return 2024 - getanoDeNasciemnto();
    }

    public double calcularImc(){
        return getPeso() / Math.pow(getAltura(), 2);
    }

}
