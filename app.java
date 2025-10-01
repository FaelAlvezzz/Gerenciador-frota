import java.util.Scanner;

//Classe Aplicação
public class app {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);        
        Veiculo[] veiculo = new Veiculo[10];
        int contador = 0;

        int opcao;
        do {
            System.out.println("-----------Menu------------");
            System.out.println("1. Adicionar Avião");
            System.out.println("2. Adicionar Navio");
            System.out.println("3. Listar todos os Veículos");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção:");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1: 
                if (contador < veiculo.length) {
                    Aviao novoAviao = new Aviao();
                    novoAviao.entradaDeDados();

                    //Metodo de desconto
                    System.out.println("Digite o valor do desconto: ");
                    double percentualDesconto = sc.nextDouble();
                    novoAviao.reajustarPreco(percentualDesconto);

                    veiculo[contador] = novoAviao;
                    contador++;
                    System.out.println("Avião adicionado com sucesso!");
                } else {
                    System.out.println("Capacidade máxima de veículos atingida!!!");
                }
                break;

                case 2:
                if (contador < veiculo.length) {
                    Navio novoNavio = new Navio();
                    novoNavio.entradaDeDados();

                    //Metodo de Tripulantes
                    System.out.println("Digite o número de tripulantes: ");
                    int numTripulantes = sc.nextInt();
                    novoNavio.setNumTripulantes(numTripulantes);
                    veiculo[contador] = novoNavio;
                    contador++;
                    System.out.println("Navio adicionado com sucesso!!!");
                }else {
                    System.out.println("Capacidade máxima de veículos atingida!!!!");
                }
                break;

                case 3:
                System.out.println("VEÍCULOS CADASTRADOS: ");
                for (int i = 0; i < contador; i++) {
                    System.out.println("Veículo " + (i + 1) + ":");
                    veiculo[i].imprimir();
                }
                break;

                case 4:
                System.out.println("Até logo!!!");
            }
            } while (opcao != 4);
        }
    }