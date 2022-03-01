public class LampadaIncandescente extends Lampada{

    private int duracao = 0;
    private boolean queimada = false;

    public LampadaIncandescente(){

    }

    protected String StatusAtual(){
        if (queimada){
            setRetorno(queimada(getTipoLampada()));
        }
        else if (getStatusLampada()) {
            setRetorno("A lâmpada "+ getTipoLampada() +" está ligada");
        }
        else {
            setRetorno("A Lâmpada "+ getTipoLampada() +" está desligada");
        }
        return getRetorno();
    }

    protected void ValidaStatusLampada(boolean status){
        if (getStatusLampada() == status){
            if (duracao == 3){
                setRetorno(queimada(getTipoLampada()));
                setErro(true);
            }
            else if (status) {
                setRetorno(jaLigada(getTipoLampada()));
                setErro(true);

            }
            else {
                setRetorno(jaDesligada(getTipoLampada()));
                setErro(true);
            }
        }
        else{
            setErro(false);
            setStatusLampada(status);
        }
    }

    protected String RetornaStatusLampada(){
        if (getErro()){
            getRetorno();
        }
        else if (getStatusLampada()){
            if(queimada){
                setRetorno(queimada(getTipoLampada()));
            }
            else if(duracao>2){
                setRetorno(queimou(getTipoLampada()));
                queimada = true;
            }
            else {
                setRetorno(ligar(getTipoLampada()));
                duracao++;
            }

        }
        else {
            if(queimada){
                setRetorno(queimada(getTipoLampada()));

            }
            else {
                setRetorno(desligar(getTipoLampada()));
            }
        }

        return getRetorno();

    }
}
