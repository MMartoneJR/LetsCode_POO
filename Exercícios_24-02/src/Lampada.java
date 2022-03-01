public class Lampada implements ILampada{

     private boolean statusLampada = false;
     private boolean erro = true;
     private String retorno;
     private String tipoLampada;


    protected void setStatusLampada(boolean status){
        this.statusLampada = status;
    }

    protected boolean getStatusLampada() {
        return statusLampada;
    }

    protected void setTipoLampada(String tipo){
        this.tipoLampada = tipo;
    }

    protected String getTipoLampada(){
        return tipoLampada;
    }

    protected void setRetorno(String retorno){
        this.retorno = retorno;
    }

    protected String getRetorno(){
        return retorno;
    }

    protected void setErro(boolean erro){
        this.erro = erro;
    }

    protected boolean getErro(){
        return erro;
    }

    protected String StatusAtual(){
        if (getStatusLampada()) {
            setRetorno("A lâmpada "+ getTipoLampada() +" está ligada");
        }
        else {
            setRetorno("A Lâmpada "+ getTipoLampada() +" está desligada");
        }
        return getRetorno();
    }

    protected void ValidaStatusLampada(boolean status){
        if (getStatusLampada() == status){
            if (!status) {
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
            setRetorno( ligar(getTipoLampada()));
        }
        else {
            setRetorno(desligar(getTipoLampada()));
        }

        return getRetorno();

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

    @Override
    public String queimada(String tipoLampada) {
        return "A Lâmpada " +tipoLampada+ " está queimada";
    }

    @Override
    public String queimou(String tipoLampada) {
        return "A Lâmpada " +tipoLampada+ " queimou";
    }

}
