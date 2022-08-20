package br.edu.infnet.appcalorias.model.domain;

public class Lipidio extends Alimento {
    private boolean gorduraBoa;
    private float acidosGraxos;
    private String tipoGordura;

    @Override
    public String toString() {
        return "Lipidio{" +
                "gorduraBoa=" + gorduraBoa +
                ", acidosGraxos=" + acidosGraxos +
                ", tipoGordura='" + tipoGordura + '\'' +
                "} " + super.toString();
    }
    @Override
    public float calcularCalorias() {
        return getGrama() * 9;
    }
    public boolean isGorduraBoa() {
        return gorduraBoa;
    }

    public void setGorduraBoa(boolean gorduraBoa) {
        this.gorduraBoa = gorduraBoa;
    }

    public float getAcidosGraxos() {
        return acidosGraxos;
    }

    public void setAcidosGraxos(float acidosGraxos) {
        this.acidosGraxos = acidosGraxos;
    }

    public String getTipoGordura() {
        return tipoGordura;
    }

    public void setTipoGordura(String tipoGordura) {
        this.tipoGordura = tipoGordura;
    }

    @Override
    public void impressao() {
        System.out.println("Lipidio");
        System.out.println(this);
    }
}
