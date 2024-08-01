import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean tenhoQueContinuar = true;
        int opcao;

        do{
            menu();
            opcao = scanner.nextInt();

            switch(opcao){
                case 0:
                    System.out.println("\nEncerrando!");
                    tenhoQueContinuar = false;
                break;

                case 1:
                    cadastarProduto();

                break;

                case 2:
                    cadastarCliente();
                break;

                case 3:
                    cadastarFornecedor();
                break;

                case 4:
                    cadastarColaborador();
                break;

                case 5:
                    cadastarvendedor();
                break;

                case 6:
                break;

                default:
                    System.out.println("Opção digitada é invalida!");
                    break;
            }





        }while(tenhoQueContinuar);
    }



    public static void menu(){

        System.out.println("********** MENU ***********");
        System.out.println("1 - Cadastrar Produto");
        System.out.println("2 - Cadastrar Cliente");
        System.out.println("3 - Cadastrar Fornecedor");
        System.out.println("4 - Cadastrar Colaborador");
        System.out.println("5 - Cadastrar Vendedor");
        System.out.println("6 - Relatorios");
        System.out.println("0 - Sair");
        System.out.println("********** MENU ***********");
        System.out.printf("\nEscolha entre uma as opções: ");

    }

    public static void cadastarProduto(){
        Scanner scanner = new Scanner(System.in);
        String nomeDoProduto;
        System.out.println("********** Cadastrar Produto ***********");
        System.out.println("Digite o nome do produto: ");
        nomeDoProduto = scanner.nextLine();

        System.out.println("O produto " + nomeDoProduto + " foi cadastrado com sucesso.");
    }

    public static void cadastarCliente(){
        Scanner scanner = new Scanner(System.in);
        String nomeDoCliente;
        System.out.println("********** Cadastrar Cliente ***********");
        System.out.println("Digite o nome do cliente: ");
        nomeDoCliente = scanner.nextLine();

        System.out.println("O cliente " + nomeDoCliente + " foi cadastrado com sucesso.");
    }

    public static void cadastarFornecedor(){
        Scanner scanner = new Scanner(System.in);
        String nomeDoFornecedor;
        System.out.println("********** Cadastrar fornecedor ***********");
        System.out.println("Digite o nome do fornecedor: ");
        nomeDoFornecedor = scanner.nextLine();

        System.out.println("O fornecedor " + nomeDoFornecedor + " foi cadastrado com sucesso.");
    }

    public static void cadastarColaborador(){
        Scanner scanner = new Scanner(System.in);
        String nomeDocolaborador;
        System.out.println("********** Cadastrar Colaborador ***********");
        System.out.println("Digite o nome do colaborador: ");
        nomeDocolaborador = scanner.nextLine();

        System.out.println("O colaborador " + nomeDocolaborador + " foi cadastrado com sucesso.");
    }

    public static void cadastarvendedor(){
        Scanner scanner = new Scanner(System.in);
        String nomeDoFornecedor;
        System.out.println("********** Cadastrar Cliente ***********");
        System.out.println("Digite o nome do vendedor: ");
        nomeDoFornecedor = scanner.nextLine();

        System.out.println("O vendedor " + nomeDoFornecedor + " foi cadastrado com sucesso.");
    }



}