package poo.letscode.cadastroSenha;

public class SenhaIncorretaException extends  Exception{

    public SenhaIncorretaException(String message){
        super(message);
        final int SENHA_INCORRETA = 1;
        System.out.println(message);
        System.exit(SENHA_INCORRETA);
    }
}
