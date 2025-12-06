public class Avaliacao {
    private double nota;
    private String descricao;

    public void setNota(double valor) {
        if (valor >= 0 && valor <= 10) {
            this.nota = valor;
        }  else {
            System.out.println("O valor digitado deve ser entre 0 e 10!");
        }
    }

    public double getNota() {
        return nota;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}

