package br.edu.infnet.appcalorias.model.domain;

import br.edu.infnet.appcalorias.interfaces.IPrinter;
import br.edu.infnet.appcalorias.model.exceptions.CpfInvalidoException;

public class Cliente implements IPrinter {
    private String cpf;
    private String nome;
    private float peso;
    private float altura;
    private float consumoBasal;
    private int id;

    public Cliente(String cpf, String nome, float peso, float altura, float consumoBasal) throws CpfInvalidoException {

        if(cpf == null){
            throw new CpfInvalidoException("CPF invalido ");
        }else if(cpf.isEmpty()){
            throw new CpfInvalidoException("CPF invalido ");
        }
//       if (peso <= 0){
//           throw new Exception("Valor deve ser positivo");
//       }
//        if (altura <= 0){
//            throw new Exception("Valor deve ser positivo");
//        }
//        if (consumoBasal <= 0){
//            throw new Exception("Valor deve ser positivo");
//        }
        this.nome = nome;
        this.peso = peso;
        this.altura = altura;
        this.consumoBasal = consumoBasal;
    }
    @Override
    public String toString() {
        return "Cliente{" +
                "Id: " + id +
                "nome='" + nome + '\'' +
                ", peso=" + peso +
                ", altura=" + altura +
                ", consumoBasal=" + consumoBasal +
                '}';
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
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
