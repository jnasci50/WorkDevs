import java.util.Scanner;

public class CadastroUserPassword {

            public static void main(String[] args) {
            Scanner InUser = new Scanner(System.in);
            System.out.println("Cadastre Seu usuario");
            String UsuarioCadastrado = InUser.nextLine();
            System.out.println("Seu Usuário: " + UsuarioCadastrado + ". Foi Cadastrado com sucesso!");
            System.out.println("Cadastre Seu Senha");
            Scanner InSenha = new Scanner(System.in);
            String SenhaCadastrada = InSenha.nextLine();
            System.out.println("Seu Senha " + SenhaCadastrada + ":Cadastrada com sucesso!");
            System.out.println("Por favor Confirme Se Seu Usuario E Senha Estão Válidos");
            Scanner ValidUser = new Scanner(System.in);
            System.out.println("Digite o seu usuário Cadastrado!");
            String ConfirmUser = ValidUser.nextLine();
            Scanner ValidSenha = new Scanner(System.in);
            System.out.println("Digite a seu Senha Cadastrada!");
            String ConfirmSenha = ValidSenha.nextLine();
            if (UsuarioCadastrado.equals(ConfirmUser) && SenhaCadastrada.equals(ConfirmSenha)) {
                System.out.println("Usuario e Senha Válidos");
            } else {
                System.out.println("Usuario e Senha Inválidos.");

                for(int i = 1; i >= 0; --i) {
                    System.out.println("Digite o seu usuário Cadastrado!");
                    ConfirmUser = ValidUser.nextLine();
                    System.out.println("Digite a seu Senha Cadastrada!");
                    ConfirmSenha = ValidSenha.nextLine();
                    if (UsuarioCadastrado.equals(ConfirmUser) && SenhaCadastrada.equals(ConfirmSenha)) {
                        System.out.println("Usuario e Senha Válidos");
                        System.out.println("Acesso permitido");
                        i = 0;
                    } else {
                        System.out.println("Você tem: " + i + " tentativas");
                        if (i == 0) {
                            System.out.println("Suas tentativas acabaram usuario e senha bloqueados!");
                            System.out.println("Por favor enviar email para: Jnasci50@gmail.com e recupere o seu acesso ao sistema.");
                        }
                    }
                }
            }

        }


}
