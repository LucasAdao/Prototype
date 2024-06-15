package com.lucas.models;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class ProdutoRegistry {
    private static ProdutoRegistry produtoRegistry;
    private static Map<String, Produto> REGISTRY = new HashMap<>();

    static {
        Produto computador = new Produto("Computador", 5000.0);
        REGISTRY.put("COMPUTADOR", computador);
    }

    public static ProdutoRegistry getInstance() {
        if (Objects.isNull(produtoRegistry)) {
            produtoRegistry = new ProdutoRegistry();
        }
        return produtoRegistry;
    }

    public static Produto getProduto(String chave) {
        Produto produtoPrototipo = REGISTRY.get(chave);
        if (produtoPrototipo != null) {
            return ProdutoFactory.getInstance(produtoPrototipo);
        }
        return null;
    }

    public static void adicionarProduto(String chave, Produto produto) {
        REGISTRY.put(chave, produto);
    }

    public static void ListarProdutos(){
        for (Produto produto : REGISTRY.values()) {
            System.out.println(produto);
        }
    }

}
