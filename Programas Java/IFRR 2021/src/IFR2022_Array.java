import java.util.Scanner;

public class IFR2022_Array {

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

            String Dialogos[] = {"*********************Por Favor Digite Seu Salário Bruto********************","Salario Bruto Declarado: ",
                    "Desconto da parcela INSS que resulta na Base de calculo da Alíquota IFR 2022:","Desconto parcela INSS: ",
                    "Calcundo a Faixa (%) da Alicota do imposto","Sua Imposto 2022 é 0%.","Sua Alíquota IFR 2022 é 7,5%.",
                    "Sua Alíquota IFR 2022 é 15%.","Sua Alíquota IFR 2022 é 22,5%.","Sua Alíquota IFR 2020 é 27,5%.",
                    "Valor declarado invalido","rendimentos Anual Declarado R$:","Valor desconto Maximo de 20% Sobre a receita bruta Declarada:"," "};


            Scanner Data = new Scanner(System.in);

            System.out.println(Dialogos[0]);


            double SalarioBruto = Data.nextDouble();

            System.out.println(Dialogos[1] + SalarioBruto);

            /**
             * Percorrendo estrutura do  Array
             *
             * for (int contador=0;contador <Dialogos.length; contador++ )
             *                  {
             *                 System.out.println(Dialogos[contador]);
             *             }
             *
             */



/**
 * Calculo da Faixa (%) da Alíquota IFR 2022
 */

            DescontoInss = SalarioBruto * 11 / 100;

            System.out.println(Dialogos[2]);

            System.out.println(Dialogos[13]);

            System.out.println(Dialogos[3] + DescontoInss);

            System.out.println(Dialogos[13]);

            System.out.println(Dialogos[4]);


            if (SalarioBruto <= 1903.98) {
                System.out.println(Dialogos[13]);
                System.out.println(Dialogos[5]);
                System.out.println(Dialogos[13]);
            } else if (SalarioBruto >= 1903.99 && SalarioBruto <= 2826.65) {
                System.out.println(Dialogos[13]);
                System.out.println(Dialogos[6]);
                System.out.println(Dialogos[13]);
            } else if (SalarioBruto >= 2826.66 && SalarioBruto <= 3751.05) {
                System.out.println(Dialogos[13]);
                System.out.println(Dialogos[7]);
                System.out.println(Dialogos[13]);
            } else if (SalarioBruto >= 3751.06 && SalarioBruto <= 4664.68) {
                System.out.println(Dialogos[13]);
                System.out.println(Dialogos[8]);
                System.out.println(Dialogos[13]);
            } else if (SalarioBruto >= 4664.69) {
                System.out.println(Dialogos[13]);
                System.out.println(Dialogos[9]);
                System.out.println(Dialogos[13]);
            } else System.out.println(Dialogos[10]);

            double RendimentoBrutoAnal = SalarioBruto * 12;

            System.out.println(Dialogos[13]);
            System.out.println(Dialogos[11] + RendimentoBrutoAnal);
            System.out.println(Dialogos[13]);

            DescontoMax20 = SalarioBruto * 12 * 0.2;

            if (DescontoMax20 >= 16754.34) {

                ResultadoDesconto20 = 16754.34;
            } else {

                ResultadoDesconto20 = DescontoMax20;
            }
            System.out.println(Dialogos[13]);
            System.out.println(Dialogos[12] + ResultadoDesconto20);
            System.out.println(Dialogos[13]);

            //  IFR2022 ImpostoRenda = new IFR2022();

            //System.out.println(ImpostoRenda.Mensagens(9));


        }


}
