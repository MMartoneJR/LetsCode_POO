public class Lampada implements ILampada{


    @Override
    public String ligar(String tipo) {
        return "A Lâmpada "+tipo+" foi ligada";
    }

    @Override
    public String desligar(String tipo) {
        return "A Lâmpada " +tipo+ " foi desligada";
    }

    @Override
    public String jaLigada(String tipo) {
        return "A Lâmpada " +tipo+ " já está ligada";
    }

    @Override
    public String jaDesligada(String tipo) {
        return "A Lâmpada " +tipo+ " já está desligada";
    }
}
