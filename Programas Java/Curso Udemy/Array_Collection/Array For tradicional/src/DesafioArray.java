import java.util.Scanner;

public class DesafioArray {



    public static void main(String[] args) {

        System.out.println("Quantas notas voçê gostaria de inserir");

        Scanner indece = new Scanner(System.in);

        int index = indece.nextInt();

        Double notas [] = new Double[index];

        int addNotas = 1;
        double totalnotas =0 ;



        for (int i=0 ; i<notas.length;i++){

            System.out.println("digite sua: " + addNotas + " nota");

            Scanner InNota = new Scanner(System.in);

            Double InNotaData = InNota.nextDouble();

            System.out.println("Sua" + addNotas +" nota digitada foi: " + InNotaData);

            addNotas ++ ;

             totalnotas += InNotaData;

            //System.out.println(totalnotas);

   
            }

        double media  = totalnotas / notas.length;
        System.out.println("Sua média é: " + media);

        if (media >=7.0){
            System.out.println("Você foi Aprovado");
        }else{
            System.out.println("Você foi Reprovado");
        }
    }



    }




