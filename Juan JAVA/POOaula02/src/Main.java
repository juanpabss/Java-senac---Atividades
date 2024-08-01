public class Main {
    public static void main(String[] args) {

        Pessoa eu = new Pessoa();

        eu.setNome("Juan");
        eu.setAnoDeNascimento(2004);
        eu.setAltura(1.79f);
        eu.setPeso(74.5f);

        System.out.printf("\nMeu nome é %s ", eu.getNome());
        System.out.printf("\nMeu ano de nascimento é %d ", eu.getanoDeNasciemnto());
        System.out.printf("\nMinha altura é %.2f", eu.getAltura());
        System.out.printf("\nMeu peso é %.2f", eu.getPeso());
        System.out.printf("\nMinha idade é %d", eu.calcularIdade());
        System.out.printf("\nMeu IMC é %.2f", eu.calcularImc());

    }
}