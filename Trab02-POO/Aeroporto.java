import java.util.ArrayList;
import java.util.List;

public class Aeroporto {
    private static final int CAPACIDADE_MAX_VOOS = 100;
    private static final int LIMITE_AERONAVES_SIMULTANEAS = 4;
    private static final int TEMPO_ENTRE_VOOS_MINUTOS = 30;

    private List<Voo> voos;
    private int contadorVoos;

    public Aeroporto() {
        this.voos = new ArrayList<>();
        this.contadorVoos = 0;
    }

    public void adicionarVoo(Voo voo) {
        if (contadorVoos < CAPACIDADE_MAX_VOOS) {
            if (podeAtenderAeronaveSimultaneamente(voo)) {
                voos.add(voo);
                contadorVoos++;
            } else {
                System.out.println("O aeroporto não pode atender mais aeronaves simultaneamente no momento.");
            }
        } else {
            System.out.println("Capacidade máxima de voos alcançada. Não é possível adicionar mais voos.");
        }
    }

    public Voo removerVoo(int numeroVoo) {
        Voo vooRemovido = null;
        for (Voo voo : voos) {
            if (voo.getNumeroVoo() == numeroVoo) {
                vooRemovido = voo;
                break;
            }
        }
        if (vooRemovido != null) {
            voos.remove(vooRemovido);
            contadorVoos--;
        }
        return vooRemovido;
    }



    private boolean podeAtenderAeronaveSimultaneamente(Voo novoVoo) {
        int contagemAeronavesSimultaneas = 0;
        for (Voo voo : voos) {
            if (voo.getHorario().equals(novoVoo.getHorario())) {
                contagemAeronavesSimultaneas++;
                if (contagemAeronavesSimultaneas >= LIMITE_AERONAVES_SIMULTANEAS) {
                    return false;
                }
            }
        }
        return true;
    }

    public void reiniciarDadosDoPrograma() {
        voos.clear();
        contadorVoos = 0;
    }

    public List<Voo> getVoos() {
        return voos;
    }

    public double calcularLucroAeroporto() {
        double lucro = 0;

        for (Voo voo : voos) {
            lucro += 10000;

            double carga = voo.getAviao().getCapacidadeCarga();
            if (carga > 30) {
                double excessoCarga = carga - 30;
                lucro += excessoCarga * 1000;
            }
        }

        return lucro;
    }

    public void exibirVoosDoDia() {
        System.out.println("----- Voos do Dia -----");
        for (Voo voo : voos) {
            System.out.println("Número do voo: " + voo.getNumeroVoo());
            System.out.println("Companhia aérea: " + voo.getCompanhiaAerea());
            System.out.println("Avião: " + voo.getAviao());
            System.out.println("Data: " + voo.getData());
            System.out.println("Horário de voo: " + voo.getHorario());
            System.out.println("Status do voo: " + voo.getStatus());
            System.out.println("Destino: " + voo.getDestino());
            System.out.println("Origem: " + voo.getOrigem());
            System.out.println("------------------------");
        }
    }
    public Voo buscarVoo(int numeroVoo) {
        for (Voo voo : voos) {
            if (voo.getNumeroVoo() == numeroVoo) {
                return voo;
            }
        }
        return null;
    }

    public void alterarVoo(int numeroVoo, Voo novoVoo) {
        for (int i = 0; i < voos.size(); i++) {
            Voo voo = voos.get(i);
            if (voo.getNumeroVoo() == numeroVoo) {
                voos.set(i, novoVoo);
                return;
            }
        }
        System.out.println("Voo não encontrado.");
    }
}
