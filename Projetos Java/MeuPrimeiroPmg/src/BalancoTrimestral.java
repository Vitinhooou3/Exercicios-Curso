public class BalancoTrimestral {
    public static void main(String[] args) {
        int despesasJaneiro = 11000;
        int  despesasFevereiro = 22000;
        int despesasMarco = 15000;


        int despesasTrimestre = despesasJaneiro + despesasFevereiro + despesasMarco;
        int mediaPorMes = despesasTrimestre / 3;

        System.out.println("As suas despesas trimestrais foram:R$ " + despesasTrimestre);
        System.out.println("E sua média de despesas foi: R$ " + mediaPorMes); //oiii
    }
}
