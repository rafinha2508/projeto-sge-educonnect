package model;

public class Professor extends Usuario implements Autenticavel, GeradorRelatorio{
    private String especialidade;
    private String registro;

    public Professor (String nome, String login, String senha, String especialidade, String registro) {
        super(nome, login, senha);
        this.especialidade = especialidade;
        this.registro = registro;
    }

    @Override
    public boolean autenticar(String login, String senha) {
        return getLogin().equals(login) && getSenha().equals(senha);
    }

    @Override
    public void gerarRelatorio() {
        System.out.println("Nome do professor: " + getNome() + "Especialidade: " + especialidade);
    }

    public String getEspecialidade(String especialidade) {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public String getRegistro() {
        return registro;
    }

    public void setRegistro(String registro) {
        this.registro = registro;
    }
}
