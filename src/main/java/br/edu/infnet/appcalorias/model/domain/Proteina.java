package br.edu.infnet.appcalorias.model.domain;

public class Proteina extends Composicao{

    private boolean vegetal;
    private float valorBiologico;
    private boolean incompletas;

    @Override
    public String toString() {
        return "Proteina{" +
                "vegetal=" + vegetal +
                ", valorBiologico=" + valorBiologico +
                ", incompletas=" + incompletas +
                "} " + super.toString();
    }
    @Override
    public float calcularCalorias() {
        return getGrama() * 4;
    }
    public boolean isVegetal() {
        return vegetal;
    }

    public void setVegetal(boolean vegetal) {
        this.vegetal = vegetal;
    }

    public float getValorBiologico() {
        return valorBiologico;
    }

    public void setValorBiologico(float valorBiologico) {
        this.valorBiologico = valorBiologico;
    }

    public boolean isIncompletas() {
        return incompletas;
    }

    public void setIncompletas(boolean incompletas) {
        this.incompletas = incompletas;
    }

    @Override
    public void impressao() {
        System.out.println("Proteina");
        System.out.println(this);
    }
}
