package com.lucas.models;

public class ProdutoFactory {

    public static Produto getInstance(Produto prototipo) {
        // Cria um novo produto com base no protótipo e atribui um novo ID.
        Produto novoProduto = new Produto(prototipo.getNome(), prototipo.getValor());
        return novoProduto;
    }
}
