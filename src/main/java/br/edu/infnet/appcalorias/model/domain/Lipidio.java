package br.edu.infnet.appcalorias.model.domain;

public class Lipidio extends Composicao{
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
}
