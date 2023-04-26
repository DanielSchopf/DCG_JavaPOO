public class Temperatura {
    private double valor;
    private String tipo;

    public Temperatura(double valor, String tipo) {
        this.valor= valor;
        this.tipo= tipo;
    }
    public double conversao(Temperatura t, String tipoconversao) {
        if (t.tipo.equals("Celsius")) {
            if (tipoconversao.equals("Kelvin")) {
                return t.valor + 273;
            }
            if (tipoconversao.equals("Fahrenheit")) {
                return (t.valor * 1.8) + 32;
            }
        }
        if (t.tipo.equals("Kelvin")) {
            if (tipoconversao.equals("Celsius")) {
                return t.valor - 273;
            }
            if (tipoconversao.equals("Fahrenheit")) {
                return (t.valor - 273) * 1.8 + 32;
            }
        }
        if (t.tipo.equals("Fahrenheit")) {
            if (tipoconversao.equals("Celsius")) {
                return (t.valor - 32) / 1.8;
            }
            if (tipoconversao.equals("Kelvin")) {
                return ((t.valor - 32) * 5) / 9 + 273;
            }
        }
        return 0;
    }
}
