public class Main {
    public static void main(String[] args) {

        Curso meuCurso = new Curso("Eng. de Software", "ENGS01", 4000);
        Avaliacao avaliacao1 = new Avaliacao();
        Aluno aluno1 = new Aluno("Rafael", "123123", meuCurso);
        Professor professorJose = new Professor("Jose deodo ", "Calculo I ", "1515");
        Turma turmaA = new Turma("T-001", professorJose, meuCurso);
        CursoEAD CursoWeb = new CursoEAD("ADS", "ADSEAD01", 4000, "Studeo");
        CursoPresencial CursoPre = new CursoPresencial("Cyber Seg.", "CS01", 4000, "Sala 37");

        aluno1.setAvaliacao(avaliacao1);
        avaliacao1.setNota(7.2);
        turmaA.matricularAluno(aluno1);
        turmaA.listarAlunos();

        System.out.println("Nome: " + aluno1.getNome() + " nota: " + aluno1.getAvaliacao().getNota());
        System.out.println(CursoPre.detalharCurso());
        System.out.println(CursoWeb.detalharCurso());

    }
}