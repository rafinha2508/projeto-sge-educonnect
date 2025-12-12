package model;

public class Aluno extends  Usuario implements Autenticavel, GeradorRelatorio{
    private String matricula;
    private Curso curso;
    private Avaliacao avaliacao;

    public Aluno(String nome, String login, String senha, String matricula, Curso curso) {
        super(nome, login, senha);
        this.matricula = matricula;
        this.curso = curso;
    }

    @Override
    public boolean autenticar(String login, String senha) {
        return getLogin().equals(login) && getSenha().equals(senha);
    }

    @Override
    public void gerarRelatorio() {
        System.out.println("Relatorio de model.Aluno: " + getNome() + "Matricula: " + matricula);
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public void setAvaliacao(Avaliacao avaliacao) {
        this.avaliacao = avaliacao;
    }

    public Avaliacao getAvaliacao() {
        return avaliacao;
    }
}
