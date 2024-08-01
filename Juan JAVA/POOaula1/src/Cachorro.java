public class Cachorro {
    private String raca;
    private String nome;
    private int idade;
    private double altura;


    //set - continuar
    //Inserir a informação dentro do atributo
    public void setRaca (String raca){
        this.raca = raca;
    }

    //get - pegar
    //Acessar o valor d o atributo
    public String getRaca(){
        return this.raca;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    //
    public String getNome(){
        return this.nome;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    //
    public int getIdade(){
        return this.idade;
    }

    public void setAltura(double altura){
        this.altura = altura;
    }
    public double getAltura(){
        return this.altura;
    }

    public void latir (){
        System.out.println("\nAUAUAUAUAUAUAUUAUAUAUAUAUAUAUUAUAUAUAAA");
    }




}
