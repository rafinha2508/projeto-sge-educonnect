package ui;
import model.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Curso meuCurso = new Curso("Eng. de Software", "ENGS01", 4000);
        Avaliacao avaliacao1 = new Avaliacao();
        Aluno aluno1 = new Aluno("Rafael ", "rafael2508", "senha123", "123123", meuCurso);
        Professor professorJose = new Professor("Jose deodo ", "josedeodo123", "senha123", "Calculo I", "profcal01");
        Turma turmaA = new Turma("T-001", professorJose, meuCurso);
        CursoEAD CursoWeb = new CursoEAD("ADS", "ADSEAD01", 4000, "Studeo");
        CursoPresencial CursoPre = new CursoPresencial("Cyber Seg.", "CS01", 4000, "Sala 37");
        Administrador admin1 = new Administrador("admin123", "admin1", "sena123");


        aluno1.setAvaliacao(avaliacao1);
        avaliacao1.setNota(7.2);
        turmaA.matricularAluno(aluno1);
        turmaA.listarAlunos();

        System.out.println("Nome: " + aluno1.getNome() + " nota: " + aluno1.getAvaliacao().getNota());
        System.out.println(CursoPre.detalharCurso());
        System.out.println(CursoWeb.detalharCurso());
        System.out.println("Login do admin: " + admin1.getLogin());

        if (admin1.autenticar("admin123", "senha123")) {
            System.out.println("Logado com sucesso");
        } else  {
            System.out.println("Senha ou login invalidos");
        }

        ArrayList<GeradorRelatorio> listarRelatorio = new ArrayList<>();
        listarRelatorio.add(aluno1);
        listarRelatorio.add(professorJose);
        listarRelatorio.add(CursoWeb);
        listarRelatorio.add(admin1);

        for (GeradorRelatorio item : listarRelatorio) {
            item.gerarRelatorio();
            System.out.println("Relatorio: ");
        }

    }
}