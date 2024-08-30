package classesConcretas;

import classesGestao.Curso;

import java.util.ArrayList;
import java.util.HashMap;

public class Professor extends Pessoa {
    private String departamento;
    private int id;
    ArrayList<Curso> cursosLeciona = new ArrayList<Curso>();

    public Professor(String nome, String apelido, int idade, String nif, String departamento, int id, ArrayList<Curso> cursosLeciona) {
        super(nome, apelido, idade, nif);
        this.departamento = departamento;
        this.id = id;
        this.cursosLeciona = cursosLeciona;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Curso> cursosLeciona() {
        return cursosLeciona;
    }

    public void removerCurso(Curso curso) {
        this.cursosLeciona.remove(curso);
    }

    public void adicionarCurso(Curso curso) {
        this.cursosLeciona.add(curso);
    }

    public void mostrarCursos() {
        System.out.println("Cursos lecionados: ");
        for (Curso curso : this.cursosLeciona) {
            System.out.println(curso.getCodigoCurso() + " - " + curso.getNomeCurso());
        }
    }
    @Override
    public void mostrarDados() {
        System.out.println("Nome: " + getNome() + " " + getApelido());
    }
}
