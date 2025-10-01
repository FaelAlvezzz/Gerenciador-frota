import java.util.Scanner;


// SUBCLASSE
public class Navio extends Veiculo {
    //Atributos específico
    private String nome;
    private int numTripulantes;
    private String dataLancamento;

    //Construtore 1: construtor vazio
    public Navio() {
        super(); //chamando o construtor da superclasse
    }

    //Construtor 2: do navio com atributos especificos
    public Navio(String nome, int numTripulantes, String dataLancamento) {
        this(); //chamando o construtor vazio da superclasse 
        this.nome = nome;
        this.numTripulantes = numTripulantes;
        this.dataLancamento = dataLancamento;
    }

    //Construtor 3: do navio com atributos da superclasse e especificos
    public Navio(String nome, int numTripulantes, String dataLancamento, double preco) {
        super();
        this.nome = nome;
        this.numTripulantes = numTripulantes;
        this.dataLancamento = dataLancamento;
        this.preco = preco;
    }

    //Construtor 4: atributos herdados
    public Navio(int capTanque, int numPassageiros, double preco) {
        super(capTanque, numPassageiros, preco);
    }

    //Construtor 5: com todos os atributos herdados e especificos
    public Navio(String nome, int numTripulantes, String dataLancamento, int capTanque, 
                    int numPassageiros, double preco) {

                super(capTanque, numPassageiros, preco);
                this.nome = nome;
                this.numTripulantes = numTripulantes;
                this.dataLancamento = dataLancamento;        
            }

    //Getters e Setters 
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        if(nome != null && !nome.isEmpty()) {
            this.nome = nome;
        }
    }

    public int getNumTripulantes() {
        return this.numTripulantes;
    }

    public void setNumTripulantes(int numTripulantes){
        if(numTripulantes > 0) {
            this.numTripulantes = numTripulantes;
        }
    }

    public String getDataLancamento() {
        return this.dataLancamento;
    }

    public void setDataLancamento(String dataLancamento) {
        if(dataLancamento != null && !dataLancamento.isEmpty()) {
            this.dataLancamento = dataLancamento;
        }
    }

    //Metodo para calcular Passageiros por tripulantes
    public double calcPassageirosPorTripulante() {
        if (numTripulantes == 0) {
            return 0;
        }else {
            return (double) numPassageiros / numTripulantes;
        }
    }

    //Metodo Imprimir
    @Override
    public void imprimir() {
        System.out.println("Nome do navio: " + this.nome);
        System.out.println("Número de tripulantes: " + this.numTripulantes);
        System.out.println("Data de lançamento: " + this.dataLancamento);
    }

    //Metodo Entrada de dados
    public void entradaDeDadosNavio() {
        super.entradaDeDados();
        Scanner sc = new Scanner(System.in);
        boolean entradaValida = false;

        //Looping para garantir a entrada de dados válidos
        while (!entradaValida) {
            try {
                 System.out.println("===================================");

                 System.out.print("DIGITE OS DADOS DO NAVIO");
                 System.out.println();

                 System.out.print("Digite o nome do navio:");
                 this.nome = sc.next();

                 System.out.print("Digite o numero de tripulante: ");
                 this.numTripulantes = sc.nextInt();

                 System.out.print("Digite a data de lançamento:");
                 this.dataLancamento = sc.next(); 

                 entradaValida = true;
            }catch (java.util.InputMismatchException e) {
                //MENSAGEM DE ERRO!!!
                System.out.print("VOCÊ ERROU TENTE NOVAMENTE!!");
                sc.next();
            }
        }
        System.out.println("====================================");
    }
}