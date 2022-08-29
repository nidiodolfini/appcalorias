package br.edu.infnet.appcalorias.model.domain;

import br.edu.infnet.appcalorias.model.exceptions.CalcularCaloriasException;

public class Proteina extends Alimento {

    private boolean vegetal;
    private float valorBiologico;
    private boolean incompleta;

    @Override
    public String toString() {
        return "Proteina{" +
                "vegetal=" + vegetal +
                ", valorBiologico=" + valorBiologico +
                ", incompletas=" + incompleta +
                "} " + super.toString();
    }
    @Override
    public float calcularCalorias() throws CalcularCaloriasException {
        if(getProteina() * 4 < 25){
            throw new CalcularCaloriasException(" Calorias inferior ao necessário");
        }
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

    public boolean isIncompleta() {
        return incompleta;
    }

    public void setIncompleta(boolean incompleta) {
        this.incompleta = incompleta;
    }

    @Override
    public void impressao() {
        System.out.println("Proteina");
        System.out.println(this);
    }
}
