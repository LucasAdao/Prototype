package com.lucas.models;

public class Produto {
    private Integer id;
    private String nome;
    private Double valor;

    public Produto(){
        // Construtor padrão deve ser usado apenas para criar produtos sem nome e valor inicial.
        // Este construtor chama o gerador de ID.
        this.id = IdGenerator.getNextId();
    }

    public Produto(String nome, Double valor) {
        // O construtor parametrizado deve chamar diretamente o gerador de ID
        // e inicializar os campos nome e valor.
        this.id = IdGenerator.getNextId();
        this.nome = nome;
        this.valor = valor;
    }

    public Integer getId() {
        return id;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Double getValor() {
        return valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", valor=" + valor +
                '}';
    }
}
