import java.util.Scanner;

//SUBCLASSE
public class Aviao extends Veiculo {
    //Atributos específico
    private String prefixo;
    private String dataRevisao;

    //Construtores
    public Aviao() {
        //Construtor vazio
    }

    public Aviao(String prefixo, String dataRevisao, int capTanque, int numPassageiros, double preco) {
        super(capTanque, numPassageiros, preco);
        this.prefixo = prefixo;
        this.dataRevisao = dataRevisao;
    }

    //Getters e Setters
    public String getPrefixo() {
        return this.prefixo;
    }

    public void setPrefixo(String prefixo) {
        if(prefixo !=null && !prefixo.isEmpty()) {
            this.prefixo = prefixo;
        }
    }

    public String getDataRevisao() {
        return this.dataRevisao;
    }

    public void setDataRevisao(String dataRevisao) {
        if(dataRevisao != null && !dataRevisao.isEmpty()) {
            this.dataRevisao = dataRevisao;
        }
    }

    //Metodo para desconto
    public void reajustarPreco(double percentual) {
        this.preco = this.preco * (1 - (percentual / 100));
    }

    //Metodo imprimir
    @Override
    public void imprimir() {
        super.imprimir();

        System.out.println("Prefixo do avião: " + this.prefixo);
        System.out.println("Revisão do avião: " + this.dataRevisao);
    }

    //Metodo entrada de dados
    public void entradaDeDados() {
        super.entradaDeDados();
        Scanner sc = new Scanner(System.in);
        boolean entradaValida = false;

        //Looping para garantir a entrada de dados válidos
        while (!entradaValida) {
            try{
                System.out.println("==========================================");

                System.out.println("Prefixo do avião: ");
                this.prefixo = sc.next();

                System.out.println("Revisão do avião: ");
                this.dataRevisao = sc.next();

                entradaValida = true;
            }catch (java.util.InputMismatchException e) {
                //MENSAGEM DE ERRO!!
                System.out.println("VOCÊ ERROU TENTE NOVAMENTE!!");
                sc.next();
            }
        }
        System.out.println("==========================================");
    }
}