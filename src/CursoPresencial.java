public class CursoPresencial extends Curso{
    private String salaAula;

    public CursoPresencial (String nome, String codigo, float cargaHoraria, String salaAula) {
        super(nome, codigo, cargaHoraria);
        this.salaAula = salaAula;
    }

    @Override
    public String detalharCurso() {
        return super.detalharCurso() + " Sala Aula: " + salaAula;
    }
}
