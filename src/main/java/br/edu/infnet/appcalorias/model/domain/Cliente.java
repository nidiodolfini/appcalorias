package br.edu.infnet.appcalorias.model.domain;

import br.edu.infnet.appcalorias.interfaces.IPrinter;

public class Cliente implements IPrinter {
    private String nome;
    private float peso;
    private float altura;
    private float consumoBasal;

    public Cliente(String nome, float peso, float altura, float consumoBasal) {
        this.nome = nome;
        this.peso = peso;
        this.altura = altura;
        this.consumoBasal = consumoBasal;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", peso=" + peso +
                ", altura=" + altura +
                ", consumoBasal=" + consumoBasal +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getConsumoBasal() {
        return consumoBasal;
    }

    public void setConsumoBasal(float consumoBasal) {
        this.consumoBasal = consumoBasal;
    }

    @Override
    public void impressao() {
        System.out.println("Cliente");
        System.out.println(this);
    }
}
