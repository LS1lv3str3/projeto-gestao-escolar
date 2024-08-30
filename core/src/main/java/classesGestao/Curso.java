package classesGestao;

public class Curso {
    private String nomeCurso;
    private int codigoCurso;

    public Curso(int codigoCurso, String nomeCurso) {
        this.codigoCurso = codigoCurso;
        this.nomeCurso = nomeCurso;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public int getCodigoCurso() {
        return codigoCurso;
    }

    public void setCodigoCurso(int codigoCurso) {
        this.codigoCurso = codigoCurso;
    }
}
