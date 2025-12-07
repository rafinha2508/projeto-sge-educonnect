public class CursoEAD extends Curso{
    private String plataformaVirtual;

    public CursoEAD(String nome, String codigo, float cargaHoraria, String plataformaVirtual) {
        super(nome, codigo, cargaHoraria);
        this.plataformaVirtual = plataformaVirtual;
    }

    @Override
    public String detalharCurso(){
        return super.detalharCurso() + " Plataforma utilizada: " + plataformaVirtual;
    }
}
