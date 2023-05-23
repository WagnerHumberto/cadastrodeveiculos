package sistema;


import java.util.ArrayList;
import java.util.Scanner;

public class Cadastro {


    private static String modelo;
    private static String fabricante;
    private static String combustivel;
    private static String cor;
    private static int ano;
    private static Scanner sc = new Scanner(System.in);
    private static ArrayList<Veiculo> veiculos;

    public static void main(String[] args) {
        veiculos = new ArrayList<>();
        cadastro();

    }

    public static void cadastro() {

            System.out.println("|**********************************************************|");
            System.out.println("|********Você está no Menu de Cadastro para Veículos*******|");
            System.out.println("|**********************************************************|");
            System.out.println("|********Selecione uma das opções abaixo para começar******|");
            System.out.println("|**********************************************************|");
            System.out.println("|    1 - Cadastrar automóvel              |");
            System.out.println("|    2 - Cadastrar Onibus                 |");
            System.out.println("|    3 - Cadastrar Motocicleta            |");
            System.out.println("|    4 - Listar veículos                  |");
            System.out.println("|    5 - Sair                             |");

        int opcao = sc.nextInt();

        switch (opcao){
            case 1:
                cadastroAutomovel();
                break;
            case 2:
                cadastroOnibus();
                break;
            case 3:
                cadastroMotocicleta();
                break;
            case 4:
                listar();
            case 5:
                System.out.println("Até Logo!");
                System.exit(0);
            default:
                System.out.println("Opcão Inválida!");
                cadastro();
                break;
        }
    }

        public static void cadastroAutomovel(){
            System.out.println("Sistema de criação de cadastro de Automóveis!");
            System.out.println("Preencha as informações abaixo!");

            System.out.println("\nModelo");
            String modelo = sc.next();
            System.out.println("\nFabricante");
            String fabricante = sc.next();
            System.out.println("\nCombustível");
            String combustivel = sc.next();
            System.out.println("\nCor");
            String cor = sc.next();
            System.out.println("\nAno de Fabricação");
            int ano = sc.nextInt();
            System.out.println("\nQuantidade de Marchas");
            int qtd = sc.nextInt();

            Automovel automovel = new Automovel(modelo,fabricante,combustivel,cor,ano,qtd);
            Estoque estoque = new Estoque(automovel);

            veiculos.add(automovel);
            System.out.println("Cadastro criado com sucesso!");
            System.out.println("O id do estoque criado é " + estoque.getIdEstoque());

            cadastro();

    }

        public static void cadastroOnibus(){
            System.out.println("Sistema de criação de cadastro de Onibus!");
            System.out.println("Preencha as informações abaixo!");

            System.out.println("\nModelo");
            String modelo = sc.next();
            System.out.println("\nFabricante");
            String fabricante = sc.next();
            System.out.println("\nCombustível");
            String combustivel = sc.next();
            System.out.println("\nCor");
            String cor = sc.next();
            System.out.println("\nAno de Fabricação");
            int ano = sc.nextInt();
            System.out.println("\nQuantidade de Lugares");
            int qtd = sc.nextInt();

            Onibus onibus = new Onibus(modelo,fabricante,combustivel,cor,ano,qtd);
            Estoque estoque = new Estoque(onibus);

            veiculos.add(onibus);
            System.out.println("Cadastro criado com sucesso!");
            System.out.println("O id do estoque criado é " + estoque.getIdEstoque());

            cadastro();

    }

        public static void cadastroMotocicleta(){
            System.out.println("Sistema de criação de cadastro de Motocicleta!");
            System.out.println("Preencha as informações abaixo!");

            System.out.println("\nModelo");
            String modelo = sc.next();
            System.out.println("\nFabricante");
            String fabricante = sc.next();
            System.out.println("\nCombustível");
            String combustivel = sc.next();
            System.out.println("\nCor");
            String cor = sc.next();
            System.out.println("\nAno de Fabricação");
            int ano = sc.nextInt();
            System.out.println("\nQuantidade de cilindradas");
            String qtd = sc.next();

            Motocicleta motocicleta = new Motocicleta(modelo,fabricante,combustivel,cor,ano,qtd);
            Estoque estoque = new Estoque(motocicleta);

            veiculos.add(motocicleta);
            System.out.println("Cadastro criado com sucesso!");
            System.out.println("O id do estoque criado é " + estoque.getIdEstoque());

            cadastro();

    }

        public static void listar() {
            if (veiculos.size() > 0) {
                veiculos.forEach(System.out::println);
            } else {

            System.out.println("Não há veículos cadastradas!");
            }
            cadastro();
        }
}


