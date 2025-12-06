public class Main {
    public static void main(String[] args) {

        Curso meuCurso = new Curso("Egn. de Software", "ENGS01", 4000);
        Avaliacao avaliacao1 = new Avaliacao();
        Aluno aluno1 = new Aluno("Rafael", "123123", meuCurso);

        aluno1.setAvaliacao(avaliacao1);
        avaliacao1.setNota(7.2);

        System.out.println("Nome: " + aluno1.getNome() + "nota: " + aluno1.getAvaliacao().getNota());
    }
}