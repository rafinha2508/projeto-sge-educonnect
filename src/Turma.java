import java.util.ArrayList;

public class Turma {
    String codigo;
    Professor professor;
    Curso curso;
    ArrayList<Aluno> listaAlunos = new ArrayList<>();

    public void matricularAluno(Aluno aluno){
        listaAlunos.add(aluno);
    }

    public void removerAluno(Aluno aluno){
        listaAlunos.remove(aluno);
    }

    public void listarAlunos(){
        System.out.println("Quantidade de alunos matriculados: "  + listaAlunos.size() + "Professor: " + professor.getNome() + "Curso: " + curso.getNome() );
    }
}