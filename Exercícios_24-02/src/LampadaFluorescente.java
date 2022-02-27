public class LampadaFluorescente extends Lampada{


    private boolean statusLampada = true;
    private boolean erro = true;
    private String retorno;
    private String tipo = "fluorescente";

    public LampadaFluorescente(){

    }

    public void setStatusLampada(boolean status){
        statusLampada = status;
    }

    private boolean getStatusLampada() {
        return statusLampada;
    }

    public String StatusAtual(){
        if (statusLampada == true) {
            retorno = "A lâmpada Fluorescente está ligada";
        }
        else {
            retorno = "A Lâmpada Fluorescente está desligada";
        }
        return retorno;
    }

    public void ValidaStatusLampada(boolean status){
        if (statusLampada == status){
            if (status == true) {
                retorno = jaLigada(tipo);
                erro = true;

            }
            else {
                retorno = jaDesligada(tipo);
                erro = true;
            }
        }
        else{
            erro = false;
            setStatusLampada(status);
        }
    }

    public String RetornaStatusLampada(){
        if (erro == true){
            retorno = retorno;
        }
        else if (statusLampada == true){
            retorno = ligar(tipo);
        }
        else if (statusLampada == false){
            retorno = desligar(tipo);
        }

        return retorno;

    }
}
