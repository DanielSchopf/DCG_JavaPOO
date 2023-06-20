import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Aeroporto aeroporto = new Aeroporto();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            exibirMenu();
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer

            switch(opcao) {
                case 1:
                    Voo voo = criarVoo(scanner);
                    aeroporto.adicionarVoo(voo);
                    System.out.println("Voo cadastrado com sucesso!");
                    break;
                case 2:
                    System.out.println("Digite o número do voo a ser alterado: ");
                    int numeroVooAlterar = scanner.nextInt();
                    scanner.nextLine(); // Limpar o buffer
                    Voo novoVoo = criarVoo(scanner);
                    aeroporto.alterarVoo(numeroVooAlterar, novoVoo);
                    System.out.println("Voo alterado com sucesso!");
                    break;
                case 3:
                    System.out.println("Digite o número do voo a ser excluído: ");
                    int numeroVooExcluir = scanner.nextInt();
                    scanner.nextLine(); // Limpar o buffer
                    aeroporto.removerVoo(numeroVooExcluir);
                    System.out.println("Voo excluído com sucesso!");
                    break;
                case 4:
                    double lucro = aeroporto.calcularLucroAeroporto();
                    System.out.println("Lucro do aeroporto: R$ " + lucro);
                    break;
                case 5:
                    aeroporto.exibirVoosDoDia();
                    break;
                case 6:
                    System.out.println("Digite o número do voo para listar os passageiros: ");
                    int numeroVooListar = scanner.nextInt();
                    scanner.nextLine(); // Limpar o buffer

                    Voo vooListar = aeroporto.buscarVoo(numeroVooListar); // Buscar o voo pelo número
                    if (vooListar != null) {
                        vooListar.listarPassageiros(); // Chamar o método na instância do voo
                    } else {
                        System.out.println("Voo não encontrado");
                    }
                    break;
                case 0:
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }

            System.out.println();
        } while (opcao != 0);

        scanner.close();
    }

    public static void exibirMenu() {
        System.out.println("----- MENU -----");
        System.out.println("1. Cadastro de voo");
        System.out.println("2. Alteração de voo");
        System.out.println("3. Exclusão de voo");
        System.out.println("4. Cálculo de lucro do aeroporto");
        System.out.println("5. Exibir voos do dia");
        System.out.println("6. Listar passageiros de um voo");
        System.out.println("0. Sair do programa");
        System.out.println("Digite a opção desejada: ");
    }

    public static Voo criarVoo(Scanner scanner) {
        Voo voo = new Voo();

        System.out.println("Digite o número do voo: ");
        voo.setNumeroVoo(scanner.nextInt());
        scanner.nextLine(); // Limpar o buffer

        System.out.println("Digite a companhia aérea: ");
        voo.setCompanhiaAerea(scanner.nextLine());

        System.out.println("Digite o avião: ");
        String nomeAviao = scanner.nextLine();
        Aviao aviao = new Aviao(nomeAviao);
        voo.setAviao(aviao);

        System.out.println("Digite a data: ");
        voo.setData(scanner.nextLine());

        System.out.println("Digite o horário de voo: ");
        voo.setHorario(scanner.nextLine());

        System.out.println("Digite o status do voo: ");
        voo.setStatus(scanner.nextLine());

        System.out.println("Digite o destino: ");
        voo.setDestino(scanner.nextLine());

        System.out.println("Digite a origem: ");
        voo.setOrigem(scanner.nextLine());

        System.out.println("Digite a quantidade de passageiros: ");
        int quantidadePassageiros = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer

        for (int i = 0; i < quantidadePassageiros; i++) {
            Passageiro passageiro = criarPassageiro(scanner);
            voo.adicionarPassageiro(passageiro);
        }

        return voo;
    }

    public static Passageiro criarPassageiro(Scanner scanner) {
        Passageiro passageiro = new Passageiro();

        System.out.println("Digite o nome do passageiro: ");
        passageiro.setNomeCompleto(scanner.nextLine());

        System.out.println("Digite o telefone do passageiro: ");
        passageiro.setTelefone(scanner.nextLine());

        String email;
        boolean emailValido;
        do {
            System.out.println("Digite o e-mail do passageiro: ");
            email = scanner.nextLine();
            emailValido = Validar.validarEmail(email);
            if (!emailValido) {
                System.out.println("E-mail inválido. Digite um e-mail válido.");
            }
        } while (!emailValido);
        passageiro.setEmail(email);

        String cpf;
        boolean cpfValido;
        do {
            System.out.println("Digite o CPF do passageiro: ");
            cpf = scanner.nextLine();
            cpfValido = Validar.validarCPF(cpf);
            if (!cpfValido) {
                System.out.println("CPF inválido. Digite um CPF válido.");
            }
        } while (!cpfValido);
        passageiro.setCpf(cpf);

        System.out.println("Digite a data de nascimento do passageiro: ");
        passageiro.setDataNascimento(scanner.nextLine());

        return passageiro;
    }

}

