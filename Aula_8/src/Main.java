public class Main {
    public static void main(String[] args) {
        Data data= new Data(9, 05, 2023);
        Pessoa pessoa= new Pessoa(new Data(19, 01, 2004), "Daniel");
        pessoa.CalculaData(data);
        System.out.println((pessoa.getIdade()));

    }
}