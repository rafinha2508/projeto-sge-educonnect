package model;

public class Curso implements GeradorRelatorio {
    private String nome;
    private String codigo;
    private float cargaHoraria;

    public Curso(String nome, String codigo, float cargaHoraria) {
        this.nome = nome;
        this.codigo = codigo;
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public void gerarRelatorio() {
        System.out.println(detalharCurso());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public float getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(float cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public String detalharCurso(){
        return "Nome: " + nome + " | Código: " + codigo + " | Carga Horária: " + cargaHoraria;
    }
}
