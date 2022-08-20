package br.edu.infnet.appcalorias.model.domain;

import br.edu.infnet.appcalorias.interfaces.IPrinter;

import java.time.LocalDateTime;
import java.util.Set;

public class Refeicao implements IPrinter {

    private LocalDateTime horario;
    private String descricao;
    private float calorias;
    private Cliente cliente;
    private Set<Alimento> alimentos;

    public Set<Alimento> getAlimentos() {
        return alimentos;
    }

    public void setAlimentos(Set<Alimento> alimentos) {
        this.alimentos = alimentos;
    }

    public Refeicao(Cliente cliente) {
        this.horario = LocalDateTime.now();
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "Refeicao{" +
                "horario=" + horario +
                ", descricao='" + descricao + '\'' +
                ", calorias=" + calorias +"Cliente" + cliente + " Alimentos: "+ alimentos.size()+
                '}';
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

    @Override
    public void impressao() {
        System.out.println("Refeição");
        System.out.println(this);
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
