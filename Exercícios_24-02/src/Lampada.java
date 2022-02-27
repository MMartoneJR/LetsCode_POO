public class Lampada implements ILampada{

    private boolean statusLampada = true;
    private boolean erro = true;
    private String retorno;

    public Lampada(){

    }


    public void setStatusLampada(boolean status){
        statusLampada = status;
    }

    private boolean getStatusLampada() {
        return statusLampada;
    }

    public void ValidaStatusLampada(boolean status){
        if (statusLampada == status){
            if (status == true) {
                retorno = "A lâmpada já está ligada";
                erro = true;

            }
            else {
                retorno = "A Lâmpada já está desligada";
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
            retorno = "A Lâmpada foi ligada";
        }
        else if (statusLampada == false){
            retorno = "A Lâmpada foi desligada";
        }

        return retorno;

    }

}
