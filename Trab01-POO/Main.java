import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler= new Scanner(System.in);
        Adega adega= new Adega();
        int escolha;
        int parar=0;
        while(parar==0) {
            System.out.println("Digite a opcao que voce deseja:\n");
            System.out.println("1 - Incluir uma garrafa na adega");
            System.out.println("2 - Obter vinhos por classificação");
            System.out.println("3 - Quantidade de garrafas cadastradas na adega");
            System.out.println("4 - Valor da adega");
            System.out.println("5 - Vinho mais antigo da adega");
            escolha= ler.nextInt();
            switch (escolha) {
                case 1:
                    System.out.println("Cadastro de vinho\n");
                    System.out.println("Nome: ");
                    String nome = ler.nextLine(); // consome a nova linha pendente
                    ler.nextLine();
                    System.out.println("Tipo de Uva: ");
                    String tipoUva = ler.nextLine();
                    System.out.println("Tipo de Vinho(tinto ou branco): ");
                    String tipoVinho = ler.nextLine();
                    System.out.println("Fabricante: ");
                    String fabricante = ler.nextLine();
                    System.out.println("Data de fabricação(dd/mm/aaaa): ");
                    String dataFabricacao = ler.nextLine();
                    System.out.println("Valor: ");
                    double valor = ler.nextDouble();
                    ler.nextLine(); // consome a nova linha pendente
                    System.out.println("Safra: ");
                    int safra = ler.nextInt();

                    ler.nextLine(); // consome a nova linha pendente
                    Vinho vinho = new Vinho(nome, tipoUva, tipoVinho, fabricante, dataFabricacao, valor, safra);
                    boolean adicionar = adega.incluirGarrafa(vinho);

                    if (adicionar) {
                        System.out.println("Vinho cadastrado com sucesso!");
                    } else {
                        System.out.println("Não foi possível cadastrar o vinho. A adega está cheia.");
                    }
                    break;
                case 2:
                    System.out.println("Digite a classificação (tinto ou branco) para busca: ");
                    String classificacao = ler.nextLine();
                    while (!classificacao.equals("tinto") && !classificacao.equals("branco")) {
                        classificacao = ler.nextLine();
                        if(!classificacao.equals("tinto") && !classificacao.equals("branco")) {
                            System.out.println("Classificação inválida, insira novamente (tinto ou branco): ");
                        }
                    }
                    adega.obterVinhos(classificacao);
                    break;
                case 3:
                    System.out.println("Quantidade de garrafas cadastradas na adega: " + adega.getQuantidadeGarrafas());
                    break;
                case 4:
                    System.out.println("Valor total da adega: R$ " + adega.getValorTotal());
                    break;
                case 5:
                    Vinho vinhoMaisAntigo = adega.getVinhoAntigo();
                    if (vinhoMaisAntigo == null) {
                        System.out.println("Não há vinhos cadastrados na adega.");
                    } else {
                        System.out.println("Vinho mais antigo da adega: " + vinhoMaisAntigo.getNome() + " (" + vinhoMaisAntigo.getDataFabricacao() + ")");
                    }
                    break;
                default:
                    System.out.println("Opcao invalida!");
                    break;
            }
            System.out.println("\n\nDeseja continuar? (0 para continuar | 1 para encerrar)\n");
            parar= ler.nextInt();
        }
    }
}