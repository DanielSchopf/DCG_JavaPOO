public class Pessoa {
    private int idade;
    private Data data;
    private String nome;

    public Pessoa(Data data, String nome) {
        this.nome= nome;
        this.data= data;
    }
    public void CalculaData(Data data) {
        int idade;
        idade=  data.getAno() - this.data.getAno();
        if(data.getMes() > this.data.getMes()) {
            this.idade= idade;
        }
        if(data.getMes() == this.data.getMes()) {
            if (data.getDia() >= this.data.getDia()) {
                this.idade = idade;
            } else {
                this.idade = idade - 1;
            }
        }
        if(data.getMes()<this.data.getMes()) {
            this.idade= idade-1;
        }
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
