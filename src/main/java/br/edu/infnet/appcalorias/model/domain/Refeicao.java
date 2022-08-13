package br.edu.infnet.appcalorias.model.domain;

import java.time.LocalDateTime;

public class Refeicao {

    private LocalDateTime horario;
    private String descricao;
    private float calorias;

    @Override
    public String toString() {
        return "Refeicao{" +
                "horario=" + horario +
                ", descricao='" + descricao + '\'' +
                ", calorias=" + calorias +
                '}';
    }

    public LocalDateTime getHorario() {
        return horario;
    }

    public void setHorario(LocalDateTime horario) {
        this.horario = horario;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public float getCalorias() {
        return calorias;
    }

    public void setCalorias(float calorias) {
        this.calorias = calorias;
    }
}
