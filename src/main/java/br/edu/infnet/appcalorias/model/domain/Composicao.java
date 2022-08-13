package br.edu.infnet.appcalorias.model.domain;

public class Composicao {
    private String nome;
    private int calorias;
    private float grama;
    private float proteina;
    private float carboidrato;
    private float gordura;


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

    public int getCalorias() {
        return calorias;
    }

    public void setCalorias(int calorias) {
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
}
