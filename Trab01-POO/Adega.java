public class Adega {

    private Vinho[][] garrafas;
    private int quantidadeGarrafas;
    public Adega() {
        this.garrafas= new Vinho[20][10];
        this.quantidadeGarrafas= 0;
    }

    public boolean incluirGarrafa(Vinho vinho) {
        if(this.quantidadeGarrafas>= 200) {
            System.out.println("A adega está cheia!");
            return false;
        }
        for(int i= 0; i<20; i++) {
            for(int j= 0; j<10; j++) {
                if(this.garrafas[i][j] == null) {
                    this.garrafas[i][j]= vinho;
                    this.quantidadeGarrafas++;
                    System.out.println("Vinho adicionado na adega!");
                    return true;
                }
            }
        }
        return true;
    }


    public void obterVinhos(String tipoVinho) {
        for(int i=0;i<20;i++){
            for(int j=0;j<10;j++){
                if(garrafas[i][j] != null && garrafas[i][j].getTipoVinho().equals(tipoVinho)){
                    System.out.println("Vinho " + tipoVinho + " na " + (i+1) + " fileira na " + (j+1) + " coluna");
                    System.out.println(garrafas[i][j].getInfoVinho());
                }
            }
        }
    }



    public int getQuantidadeGarrafas() {
        return this.quantidadeGarrafas;
    }


    public double getValorTotal() {
        double valorTotal = 0.0;

        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 10; j++) {
                if (this.garrafas[i][j] != null) {
                    valorTotal += this.garrafas[i][j].getValor();
                }
            }
        }
        return valorTotal;
    }


    public Vinho getVinhoAntigo() {
        Vinho vinhoAntigo= null;

        for (int i= 0; i<20; i++) {
            for (int j= 0; j<10; j++) {
                if (this.garrafas[i][j] != null) {
                    if (vinhoAntigo == null) {
                        vinhoAntigo= this.garrafas[i][j];
                    } else if (this.garrafas[i][j].getDataFabricacao().compareTo(vinhoAntigo.getDataFabricacao()) < 0) {
                        vinhoAntigo= this.garrafas[i][j];
                    }
                }
            }
        }

        if (vinhoAntigo == null) {
            System.out.println("Não há vinhos cadastrados na adega.");
        }

        return vinhoAntigo;
    }
}
