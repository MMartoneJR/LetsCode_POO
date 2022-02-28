public class Lampada implements ILampada{

     private boolean statusLampada = false;
     private boolean erro = true;
     private String retorno;
     private String tipoLampada;


    protected void setStatusLampada(boolean status){
        statusLampada = status;
    }

    protected boolean getStatusLampada() {
        return statusLampada;
    }

    protected void setTipoLampada(String tipo){
        tipoLampada = tipo;
    }

    protected String getTipoLampada(){
        return tipoLampada;
    }

    protected String StatusAtual(){
        if (getStatusLampada() == true) {
            retorno = "A lâmpada "+ getTipoLampada() +" está ligada";
        }
        else {
            retorno = "A Lâmpada "+ getTipoLampada() +" está desligada";
        }
        return retorno;
    }

    protected void ValidaStatusLampada(boolean status){
        if (getStatusLampada() == status){
            if (status == true) {
                retorno = jaLigada(getTipoLampada());
                erro = true;

            }
            else {
                retorno = jaDesligada(getTipoLampada());
                erro = true;
            }
        }
        else{
            erro = false;
            setStatusLampada(status);
        }
    }

    protected String RetornaStatusLampada(){
        if (erro == true){
            retorno = retorno;
        }
        else if (getStatusLampada() == true){
            retorno = ligar(getTipoLampada());
        }
        else if (getStatusLampada() == false){
            retorno = desligar(getTipoLampada());
        }

        return retorno;

    }

    public void menu(){
        System.out.println("");
        System.out.println("Qual lâmpada deseja alterar?");
        System.out.println("1 - Lampada Fluorescente");
        System.out.println("2 - Lampada Incandescente");
        System.out.println("3 - Ambas");
        System.out.println("0 - Sair");
    }


    public void opcoes(){
        System.out.println("1 - Ligar");
        System.out.println("2 - Desligar");
    }

    @Override
    public String ligar(String tipoLampada) {
        return "A Lâmpada "+tipoLampada+" foi ligada";
    }

    @Override
    public String desligar(String tipoLampada) {
        return "A Lâmpada " +tipoLampada+ " foi desligada";
    }

    @Override
    public String jaLigada(String tipoLampada) {
        return "A Lâmpada " +tipoLampada+ " já está ligada";
    }

    @Override
    public String jaDesligada(String tipoLampada) {
        return "A Lâmpada " +tipoLampada+ " já está desligada";
    }

}
