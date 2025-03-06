package test3;

public class faturamentoDistribuidora {
    public static void main(String[] args) {

        double[] faturamentoDiario = {1000, 2500, 3000, 1500, 1800, 2200, 5000, 4300, 2000, 1900, 2500, 3200, 3600};

        double menorFaturamento = faturamentoDiario[0];
        double maiorFaturamento = faturamentoDiario[0];
        double somaFaturamento = 0;
        int diasAcimaMedia = 0;
        int totalDias = faturamentoDiario.length;

        for (double faturamento : faturamentoDiario) {
            if (faturamento < menorFaturamento) {
                menorFaturamento = faturamento;
            }
            if (faturamento > maiorFaturamento) {
                maiorFaturamento = faturamento;
            }
            somaFaturamento += faturamento;
        }

        double mediaMensal = somaFaturamento / totalDias;

        for (double faturamento : faturamentoDiario) {
            if (faturamento > mediaMensal) {
                diasAcimaMedia++;
            }
        }

        System.out.println("Menor faturamento diário: R$ " + menorFaturamento);
        System.out.println("Maior faturamento diário: R$ " + maiorFaturamento);
        System.out.println("Número de dias com faturamento superior à média mensal: " + diasAcimaMedia);
    }
}