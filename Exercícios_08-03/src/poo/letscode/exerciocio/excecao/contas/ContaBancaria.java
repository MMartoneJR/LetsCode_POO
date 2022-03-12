package poo.letscode.exerciocio.excecao.contas;

public class ContaBancaria {
    private double saldo; // Determina o saldo da conta
    private double limite; // Determina o limite de crédito do cheque especial


    // Construtor padrão da classe.
    public ContaBancaria(double valorSaldo, double valorLimite){
        this.saldo = valorSaldo;
        this.limite = valorLimite;

    }

    // Retorna o saldo da conta.
    public double getSaldo(){
        return saldo;
    };

    // Retorna o limite da conta.
    protected double getLimite(){
        return limite;
    };

    // Retorna o saldo da conta somado ao limite.
    public double getSaldoComLimite(){
        return saldo + limite;
    };

    // Deve decrementar o valor do saque da Conta. Retorna "true" caso a operação
    // tenha sido bem sucedida, ou seja, a conta possui este valor (lembre-se de considerar o limite).
    public boolean sacar(double valor) throws ContaException {
        if(valor > 500){
            throw new ContaException("O valor máximo permitido para saque é de R$500,00");
        }
        else if(valor > saldo + limite){
            throw new ContaException("Não há saldo/limite disponível para este saque");
        }
        else{
            saldo = saldo - valor;
            if(saldo < 0){
                limite += saldo;
                saldo = 0;
            }
            return true;
        }
    };

    // Deve incrementar o valor a Conta.
    public void depositar(double valor) throws ContaException {
        if (valor > 1000){
            throw new ContaException("Somente são aceitos depósitos de até R$1.000,00");
        }
        else{
            saldo = saldo + valor;
        }

    };
}
