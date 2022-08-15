package br.edu.infnet.appcalorias.model.domain;

import br.edu.infnet.appcalorias.interfaces.IPrinter;

public abstract class Composicao implements IPrinter {
    private String nome;
    private float calorias;
    private float grama;
    private float proteina;
    private float carboidrato;
    private float gordura;

    public abstract float calcularCalorias();


    @Override
    public String toString() {
        return "Composicao{" +
                "nome='" + nome + '\'' +
                ", calorias=" + calorias +
                ", grama=" + grama +
                ", proteina=" + proteina +
                ", carboidrato=" + carboidrato +
                ", gordura=" + gordura +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getCalorias() {
        return calorias;
    }

    public void setCalorias(float calorias) {
        this.calorias = calorias;
    }

    public float getGrama() {
        return grama;
    }

    public void setGrama(float grama) {
        this.grama = grama;
    }

    public float getProteina() {
        return proteina;
    }

    public void setProteina(float proteina) {
        this.proteina = proteina;
    }

    public float getCarboidrato() {
        return carboidrato;
    }

    public void setCarboidrato(float carboidrato) {
        this.carboidrato = carboidrato;
    }

    public float getGordura() {
        return gordura;
    }

    public void setGordura(float gordura) {
        this.gordura = gordura;
    }

//    @Override
//    public void impressao() {
//        System.out.println("Composição");
//        System.out.println(this);
//    }
}
