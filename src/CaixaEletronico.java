public class CaixaEletronico {

    public static void main(String[] args) {
        
        double saldo = 50;
        double valorSolicitado = 49;

        if (valorSolicitado < saldo) {
            saldo = saldo - valorSolicitado;
            System.out.println("novo saldo: " + saldo);            
        }else
        System.out.println("saldo insuficiente");
    }
}