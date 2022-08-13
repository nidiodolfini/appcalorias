package br.edu.infnet.appcalorias.model.domain;

public class Carboidrato extends Composicao {
    private boolean complexo;
    private int indiceGlicemico;
    private float fibra;

    @Override
    public String toString() {
        return "Carboidrato{" +
                "complexo=" + complexo +
                ", indiceGlicemico=" + indiceGlicemico +
                ", fibra=" + fibra +
                "} " + super.toString();
    }

    public boolean isComplexo() {
        return complexo;
    }

    public void setComplexo(boolean complexo) {
        this.complexo = complexo;
    }

    public int getIndiceGlicemico() {
        return indiceGlicemico;
    }

    public void setIndiceGlicemico(int indiceGlicemico) {
        this.indiceGlicemico = indiceGlicemico;
    }

    public float getFibra() {
        return fibra;
    }

    public void setFibra(float fibra) {
        this.fibra = fibra;
    }
}
