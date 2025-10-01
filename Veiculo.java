import java.util.Scanner;

//SUPERCLASSE
public class Veiculo {
    //Atributos
    protected int capTanque;
    protected int numPassageiros;
    protected double preco;

    //Construtores
    public Veiculo() {
        //Construtor vazio
    }

    public Veiculo(int capTanque, int numPassageiros, double preco) {
        this.capTanque = capTanque;
        this.numPassageiros = numPassageiros;
        this.preco = preco;
    }

    //Getters e Setters
    public int getCapTanque() {
        return this.capTanque;
    }

    public void setCapTanque(int capTanque) {
        if (capTanque  > 0) {
            this.capTanque = capTanque;
        }
    }

    public int getNumPassageiros() {
        return this.numPassageiros;
    }

    public void setNumPassageiros(int numPassageiros) {
        if (numPassageiros > 0) {
            this.numPassageiros = numPassageiros;
        }
    }

    public double getPreco() {
        return this.preco;
    }

    public void setPreco(double preco) {
        if (preco > 0) {
            this.preco = preco;
        }
    }

    //Metodo imprimir
    public void imprimir() {
        System.out.println("Capacidade do tanque: " + this.capTanque + "litros");
        System.out.println("Número de passageiros: " + this.numPassageiros);
        System.out.println("Preço da passagem: R$ " + this.preco);
    }

    //Metodo entrada de dados
    public void entradaDeDados() {
        Scanner sc = new Scanner(System.in);
        boolean entradaValida = false;

        //Looping para garantir a entrada de dados válidos
        while (!entradaValida) {
            try {
                System.out.println("======================================");

                System.out.println();
                System.out.print("Digite a capacidade do tanque: ");
                this.capTanque = sc.nextInt();

                System.out.print("Quantos passageiros: ");
                this.numPassageiros = sc.nextInt();

                System.out.print("Preço da passagem: R$");
                this.preco = sc.nextDouble();

                entradaValida = true; 
            } catch (java.util.InputMismatchException e) {
                //MENSAGEM DE ERRO!!
                System.out.println("VOCÊ ERROU TENTE NOVAMENTE!!");
                sc.next();
            }
        }
                System.out.println("=========================================");
    }
}