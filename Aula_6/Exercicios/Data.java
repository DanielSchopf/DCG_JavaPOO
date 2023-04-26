public class Data {
    private int dia;

    private int mes;

    private int ano;

    public Data(int dia, int mes, int ano) {
        this.dia= dia;
        this.mes= mes;
        this.ano= ano;
    }
    public void mostrarData(Data data1, String pais) {
        if(pais.equals("Brasil")) {
            System.out.println(data1.dia+"/"+data1.mes+"/"+data1.ano);
        }
        if(pais.equals("EUA")) {
            System.out.println(data1.mes+"/"+data1.dia+"/"+data1.ano);
        }

    }
}
