public class LampadaFluorescente extends Lampada{


    private boolean statusLampada = true;
    private boolean erro = true;
    private String retorno;


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
                retorno = "A lâmpada Fluorescente já está ligada";
                erro = true;

            }
            else {
                retorno = "A Lâmpada Fluorescente já está desligada";
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
            retorno = "A Lâmpada Fluorescente foi ligada";
        }
        else if (statusLampada == false){
            retorno = "A Lâmpada Fluorescente foi desligada";
        }

        return retorno;

    }
}
