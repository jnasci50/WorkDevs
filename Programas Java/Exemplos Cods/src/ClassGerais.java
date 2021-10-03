import javax.swing.*;
import java.util.Scanner;

public class ClassGerais {

         public static void main(String[] args) {

            /**
             *1º Declaração de Constates em Java.
             */

            final double Pi = 3.1416;

            System.out.println(Pi);

            /**
             * 2° Criação de Objeto utilizando a Classe Scanner.
             */

            System.out.println("digite a sua senha");

            Scanner EntradaTeclado = new Scanner(System.in);

            String Senha = EntradaTeclado.nextLine();

            System.out.println(Senha);

            /**
             *3° Converter String em inteiro Usando a Classe Interger.
             */

            System.out.println(Senha.concat(" Senha: convertida para números inteiro"));

            Integer ConvertSenha = Integer.parseInt(Senha) ;

            System.out.println(ConvertSenha);

            /**
             *4° Realizar entrada de dados Via Janela dialogo. Tipo de Dados deve ser String.
             */

            String CaixaDialogo = JOptionPane.showInputDialog("digite os dados de entrada via teclado");

            /**
             * MeTodos Java Para Strings
             * 1° .charAt(); Utilizado para indicar o caracter alocado na respectiva posição da string.
             * 2° .concat(); Utilizado para concatenar Strings.
             * 3° .toUpperCase(); Utilizado para Trnasformar todos os caracteres em maiusculas.
             * 4° .startWith(); Utilizada para comparar(verificar) se a String inicia-se com as palavras passadas no Argumento.retorna true/false
             * 5° .length(); Utilizado para verificar o cumprimento de uma String.
             * 6° .equals(); Utilizado para comparação de string.
             * 7° .equalsIgnoreCase(); Utilizada para comparação String desconsiderando entre maiusculas e minusculas.
             * 8° .contains(); Utilizado para verificar se uma String contém uma respectiva frase.
             *9°  .toString(); Utilizado para converter um tipo Warpper em String.
             * OBS: palavra reservada (var) pode ser utilizada para definir uma String.
             * */

            String Teste = "senha foi convertida"; //Declaração de String
            var Teste2 ="senha foi convertida"; //Declaração de String

            System.out.println(Teste.charAt(5));

            System.out.println(Teste.concat(",com sucesso para inteiros."));

            System.out.println(Teste.toUpperCase().concat(",com sucesso para inteiros.".toUpperCase()));

            System.out.println(Teste.startsWith("senha"));


            if(Teste.startsWith("senha")){
                System.out.println("String iniciada pela palavra senha");
            };

            System.out.println(Teste.length());



            if (Teste.equals(Teste2)){

                System.out.println("As strings são iguais:");
            };



        }
    }


