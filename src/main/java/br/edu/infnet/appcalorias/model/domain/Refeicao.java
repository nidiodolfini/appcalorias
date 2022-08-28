package br.edu.infnet.appcalorias.model.domain;

import br.edu.infnet.appcalorias.interfaces.IPrinter;
import br.edu.infnet.appcalorias.model.exceptions.AlimentoException;
import br.edu.infnet.appcalorias.model.exceptions.ClienteNullException;

import java.time.LocalDateTime;
import java.util.Set;

public class Refeicao implements IPrinter {

    private int id;
    private LocalDateTime horario;
    private String descricao;
    private float calorias;
    private Cliente cliente;
    private Set<Alimento> alimentos;

    public Refeicao(Cliente cliente, Set<Alimento> alimentos) throws ClienteNullException, AlimentoException {
        this.horario = LocalDateTime.now();
        if(cliente == null){
            throw new ClienteNullException("Cliente Nulo");
        }
        if(alimentos.size() < 1){
            throw new AlimentoException("Deve contem ao menos um alimento por refeição");
        }
        this.cliente = cliente;
        this.alimentos = alimentos;
    }

    @Override
    public String toString() {
        return "Refeicao{" +
                "Id " + id+
                " horario=" + horario +
                ", descricao='" + descricao + '\'' +
                ", calorias=" + calorias +"Cliente" + cliente + " Alimentos: "+ alimentos.size()+
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public LocalDateTime getHorario() {
        return horario;
    }
}
