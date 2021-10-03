
import java.util.Scanner;

public class ImpostoRenda2021 {

    public static <doulbe> void main(String[] args) {
/**
 *   Tabela do Imposto de Renda 2022
 *
 * 0% = R$ 1.903,98
 * 7,5% = R$ 1.903,99 a R$ 2.826,65
 * 15% = R$ 2.826,66 a R$ 3.751,05
 * 22,5% = R$ 3.751,06 a R$ 4.664,68
 * 27.5% = > R$ 4.664,69
 */

/**
 * Declarações de Variaveis Globais
 */

        double DescontoMax20;
        double DescontoInss;
        double ResultadoDesconto20;

        Scanner InData = new Scanner(System.in);

        System.out.println("*********************Por Favor Digite Seu Salário Bruto********************");


        double SalarioBruto = InData.nextDouble();


        System.out.println("Salario Bruto Declarado: " + SalarioBruto);

/**
 * Calculo da Faixa (%) da Alíquota IFR 2022
 */

        DescontoInss = SalarioBruto * 11 / 100;

        System.out.println("Desconto da parcela INSS que resulta na Base de calculo da Alíquota IFR 2022:");

        System.out.println("");

        System.out.println("Desconto parcela INSS: " + DescontoInss);

        System.out.println("");

        System.out.println("Calcundo a Faixa (%) da Alicota do imposto");


        if (SalarioBruto <= 1903.98) {
            System.out.println("");
            System.out.println("Sua Imposto 2022 é 0%.");
            System.out.println("");
        } else if (SalarioBruto >= 1903.99 && SalarioBruto <= 2826.65) {
            System.out.println("");
            System.out.println("Sua Alíquota IFR 2022 é 7,5%.");
            System.out.println("");
        } else if (SalarioBruto >= 2826.66 && SalarioBruto <= 3751.05) {
            System.out.println("");
            System.out.println("Sua Alíquota IFR 2022 é 15%.");
            System.out.println("");
        } else if (SalarioBruto >= 3751.06 && SalarioBruto <= 4664.68) {
            System.out.println("");
            System.out.println("Sua Alíquota IFR 2022 é 22,5%.");
            System.out.println("");
        } else if (SalarioBruto >= 4664.69) {
            System.out.println("");
            System.out.println("Sua Alíquota IFR 2020 é 27,5%.");
            System.out.println("");
        } else System.out.println("Valor declarado invalido");

        double RendimentoBrutoAnal = SalarioBruto * 12;

        System.out.println("");
        System.out.println("rendimentos Anual Declarado R$:" + RendimentoBrutoAnal);
        System.out.println("");

        DescontoMax20 = SalarioBruto * 12 * 0.2;

        if (DescontoMax20 >= 16754.34) {

            ResultadoDesconto20 = 16754.34;
        } else {

            ResultadoDesconto20 = DescontoMax20;
        }
        System.out.println("");
        System.out.println("Valor desconto Maximo de 20% Sobre a receita bruta Declarada: " + ResultadoDesconto20);
        System.out.println("");
    }
}
