package br.edu.infnet.appcalorias.model.domain;

import br.edu.infnet.appcalorias.model.exceptions.CalcularCaloriasException;
import br.edu.infnet.appcalorias.model.exceptions.FibraException;

public class Carboidrato extends Alimento {
    private boolean complexo;
    private int indiceGlicemico;
    private float fibra;
    @Override
    public float calcularCalorias() throws CalcularCaloriasException {
        if(getCarboidrato() * 4 < 25 && getIndiceGlicemico() > 50){
            throw new CalcularCaloriasException(" Calorias inferior ao necessário");
        }
        return getGrama() * 4;
    }

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

    public void setFibra(float fibra) throws FibraException {
        if (isComplexo() && (getGrama() / fibra < 3)){
            throw new FibraException("Quantidade de fibra muito baixa para um carbo complexo");
        }
        this.fibra = fibra;
    }
    @Override
    public void impressao() {
        System.out.println("Carboidrato");
        System.out.println(this);
    }
}
