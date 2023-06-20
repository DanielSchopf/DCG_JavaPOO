import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Voo {
    private int numeroVoo;
    private String companhiaAerea;
    private Aviao aviao;
    private String data;
    private String horario;
    private String status;
    private String destino;
    private String origem;
    private List<Passageiro> passageiros;

    public Voo(int numeroVoo, String companhiaAerea, Aviao aviao, String data, String horario, String status, String destino, String origem) {
        this.numeroVoo = numeroVoo;
        this.companhiaAerea = companhiaAerea;
        this.aviao = aviao;
        this.data = data;
        this.horario = horario;
        this.status = status;
        this.destino = destino;
        this.origem = origem;
        this.passageiros = new ArrayList<>();
    }

    public Voo() {
        this(0, "",new Aviao(""), "", "", "", "", "");
    }
    public void listarPassageiros() {
        if (!passageiros.isEmpty()) {
            System.out.println("Passageiros do Voo " + numeroVoo + ":");
            for (Passageiro passageiro : passageiros) {
                System.out.println("Nome: " + passageiro.getNomeCompleto());
                System.out.println("Telefone: " + passageiro.getTelefone());
                System.out.println("E-mail: " + passageiro.getEmail());
                System.out.println("CPF: " + passageiro.getCpf());
                System.out.println("Data de Nascimento: " + passageiro.getDataNascimento());
                System.out.println("------------------------");
            }
        } else {
            System.out.println("Não há passageiros cadastrados para o Voo " + numeroVoo);
        }
    }


    public int getNumeroVoo() {
        return numeroVoo;
    }

    public void setNumeroVoo(int numeroVoo) {
        this.numeroVoo = numeroVoo;
    }

    public String getCompanhiaAerea() {
        return companhiaAerea;
    }

    public void setCompanhiaAerea(String companhiaAerea) {
        this.companhiaAerea = companhiaAerea;
    }

    public Aviao getAviao() {
        return aviao;
    }

    public void setAviao(Aviao aviao) {
        this.aviao = aviao;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public List<Passageiro> getPassageiros() {
        return passageiros;
    }

    public void adicionarPassageiro(Passageiro passageiro) {
        passageiros.add(passageiro);
    }

    public void removerPassageiro(Passageiro passageiro) {
        passageiros.remove(passageiro);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Voo voo = (Voo) obj;
        return numeroVoo == voo.numeroVoo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numeroVoo);
    }
}
