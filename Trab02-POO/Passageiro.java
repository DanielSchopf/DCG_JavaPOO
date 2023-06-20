import java.util.Objects;

public class Passageiro {
    private String nomeCompleto;
    private String telefone;
    private String email;
    private String cpf;
    private String dataNascimento;

    public Passageiro(String nomeCompleto, String telefone, String email, String cpf, String dataNascimento) {
        this.nomeCompleto = nomeCompleto;
        this.telefone = telefone;
        this.email = email;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
    }

    public Passageiro() {
        this("", "", "", "", "");
    }
    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Passageiro other = (Passageiro) obj;
        return Objects.equals(cpf, other.cpf);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cpf);
    }
}
