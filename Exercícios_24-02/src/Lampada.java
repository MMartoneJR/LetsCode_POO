public class Lampada implements ILampada{

     protected boolean statusLampada = false;
     protected boolean erro = true;
     protected String retorno;


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
