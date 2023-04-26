public class Elevador {
    private boolean portaAberta;

    private int andarCorrente;

    private int andarMax;

    private int andarMin;

    public Elevador(boolean portaAberta, int andarCorrente, int andarMax, int andarMin) {
        this.portaAberta= portaAberta;
        this.andarCorrente= andarCorrente;
        this.andarMax= andarMax;
        this.andarMin= andarMin;
    }
    public void abrirPorta() {
        this.portaAberta= true;
        System.out.println("Porta Aberta");
    }
    public void fecharPorta() {
        this.portaAberta= false;
        System.out.println("Porta Fechada");
    }

    public void subir(int andar) {
        if(andar > this.andarCorrente && andar <=andarMax) {
            System.out.println("Voce esta no " + andarCorrente + " andar");
            abrirPorta();
            fecharPorta();
            abrirPorta();
            this.andarCorrente= andar;
            System.out.println("Voce chegou no " +andar + " andar");
        }
    }
    public void descer(int andar) {
        if(andar < this.andarCorrente && andar >= andarMin) {
            System.out.println("Voce esta no " + andarCorrente + " andar");
            abrirPorta();
            fecharPorta();
            abrirPorta();
            this.andarCorrente= andar;
            System.out.println("Voce chegou no " +andar + " andar");
        }
    }
}
