package model;

public class Administrador extends Usuario implements Autenticavel, GeradorRelatorio {
    public Administrador(String nome, String login, String senha){
        super(nome, login, senha);
    }

    @Override
    public boolean autenticar(String login, String senha) {
        return getLogin().equals(login) && getSenha().equals(senha);
    }

    @Override
    public void gerarRelatorio() {
        System.out.println("relatorio administrador: " + getLogin());
    }
}
