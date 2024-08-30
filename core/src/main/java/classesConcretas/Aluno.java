package classesConcretas;

import classesGestao.Curso;
import interfaces.Avaliavel;

import java.util.ArrayList;
import java.util.HashMap;

public class Aluno extends Pessoa implements Avaliavel {

    private int id;
    private HashMap<Integer, Double> notas = new HashMap<Integer, Double>();
    private ArrayList<Curso> cursoInscrito = new ArrayList<Curso>();

    public Aluno(String nome, String apelido, int idade, String nif, int id, HashMap<Integer, Double> notas, ArrayList<Curso> cursoInscrito) {
        super(nome, apelido, idade, nif);
        this.id = id;
        this.notas = notas;
        this.cursoInscrito = cursoInscrito;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public HashMap<Integer, Double> getNotas() {
        return notas;
    }

    public void setNotas(HashMap<Integer, Double> notas) {
        this.notas = notas;
    }

    public ArrayList<Curso> getCursoInscrito() {
        return cursoInscrito;
    }

    public void adicionarCurso(Curso curso) {
        this.cursoInscrito.add(curso);
    }

    public void removerCurso(Curso curso) {
        this.cursoInscrito.remove(curso);
    }

    public void mostrarCursos() {
        System.out.println("Cursos inscritos: ");
        for (Curso curso : this.cursoInscrito) {
            System.out.println(curso.getCodigoCurso() + " - " + curso.getNomeCurso());
        }
    }

    @Override
    public void mostrarDados() {
        System.out.println("Nome: " + getNome() + " " + getApelido());

    }
}
