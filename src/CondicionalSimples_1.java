public class CondicionalSimples_1 {
    public static void main(String[] args) {
        double saldo = 25.0;
        double valorSolicitado = 27.0;

        if (valorSolicitado < saldo) 
            saldo = saldo - valorSolicitado;
            System.out.println(saldo);
        
    }
}
