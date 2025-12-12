package model;

import java.util.ArrayList;

public class Turma {
    String codigo;
    Professor professor;
    Curso curso;
    ArrayList<Aluno> listaAlunos = new ArrayList<>();

    public Turma(String codigo, Professor professor, Curso curso) {
        this.codigo = codigo;
        this.professor = professor;
        this.curso = curso;
    }

    public void matricularAluno(Aluno aluno){
        listaAlunos.add(aluno);
    }

    public void removerAluno(Aluno aluno){
        listaAlunos.remove(aluno);
    }

    public void listarAlunos(){
        System.out.println("Quantidade de alunos matriculados: "  + listaAlunos.size() + " model.Professor: " + professor.getNome() + "model.Curso: " + curso.getNome() );
    }
}