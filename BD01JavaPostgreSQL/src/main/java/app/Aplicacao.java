package app;

import java.util.List;
import java.util.Scanner;

import dao.UsuarioDAO;
import model.Usuario;

public class Aplicacao {

    public static void main(String[] args) throws Exception {

        UsuarioDAO usuarioDAO = new UsuarioDAO();
        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("Menu:");
            System.out.println("1-Inserir usuário");
            System.out.println("2-Listar usuários");
            System.out.println("3-Excluir usuário");
            System.out.println("4-Atualizar Senha");
            System.out.println("5-Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine(); // Consumir nova linha após nextInt()

            switch (opcao) {
                case 1:
                    System.out.println("\n\n==== Inserir usuário === ");
                    System.out.print("Digite o login: ");
                    String login = sc.nextLine();
                    System.out.print("Digite o código: ");
                    int codigo = sc.nextInt();
                    sc.nextLine(); // Consumir nova linha após nextInt()
                    System.out.print("Digite a senha: ");
                    String senha = sc.nextLine();
                    System.out.print("Digite o sexo (M/F): ");
                    char sexo = sc.nextLine().charAt(0);

                    Usuario usuario1 = new Usuario(codigo, login, senha, sexo);
                    if (usuarioDAO.insert(usuario1)) {
                        System.out.println("Inserção com sucesso -> " + usuario1.toString());
                    }

                    System.out.println("\n\n==== Testando autenticação ===");
                    System.out.println("Usuário (" + usuario1.getLogin() + "): " + usuarioDAO.autenticar(login, senha));
                    break;

                case 2:
                    System.out.println("\n\n==== Listar usuários === ");
                    List<Usuario> usuarios = usuarioDAO.getAllUsuarios();
                    for (Usuario u : usuarios) {
                        System.out.println(u.toString());
                    }
                    break;

                case 3:
                    System.out.println("\n\n==== Excluir usuário === ");
                    System.out.print("Digite o código do usuário que deseja excluir: ");
                    int codigoParaExcluir = sc.nextInt();

                    if (usuarioDAO.delete(codigoParaExcluir)) {
                        System.out.println("Usuário com código " + codigoParaExcluir + " excluído com sucesso.");
                    } else {
                        System.out.println("Não foi possível excluir o usuário com código " + codigoParaExcluir);
                    }
                    break;

                case 4:
                    System.out.println("\n\n==== Atualizar Senha === ");
                    System.out.print("Digite o código do usuário que deseja atualizar a senha: ");
                    int codigoParaAtualizar = sc.nextInt();
                    sc.nextLine(); // Consumir nova linha após nextInt()

                    System.out.print("Digite a nova senha: ");
                    String novaSenha = sc.nextLine();

                    if (usuarioDAO.updateSenha(codigoParaAtualizar, novaSenha)) {
                        System.out.println("Senha do usuário com código " + codigoParaAtualizar + " atualizada com sucesso.");
                    } else {
                        System.out.println("Não foi possível atualizar a senha do usuário com código " + codigoParaAtualizar);
                    }
                    break;

                case 5:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        } while (opcao != 5);

        sc.close();
    }
}
