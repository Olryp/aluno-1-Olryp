package br.ufba.poo.lista2;

public class Aluno {
    private String matricula;
    private String nome;

    public Aluno(String matricula, String nome) {
        this.matricula = matricula;
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public boolean equals(Object obj) {
        
        if (this == obj) return true;
        
        if (obj == null || getClass() != obj.getClass()) return false;
        
        Aluno outro = (Aluno) obj;
        
        return this.matricula.equals(outro.matricula);
    }
}
