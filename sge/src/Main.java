public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("Sistema Educacional");
            System.out.println("1 - Adicionar Aluno");
            System.out.println("2 - Remover Aluno");
            System.out.println("3 - Listar alunos matriculados, curso e professor");

            System.out.println("3 - Escolha uma opcao");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o nome do aluno: ");
                    String nomeAluno = sc.nextLine();

            } while (opcao < 1 != opcao > 5);
        }
    }
}