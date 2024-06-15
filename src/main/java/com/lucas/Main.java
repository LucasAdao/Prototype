package com.lucas;

import com.lucas.models.Produto;
import com.lucas.models.ProdutoRegistry;

public class Main {
    public static void main(String[] args) {
    //TODO: Criar um menu para adicionar, remover e listar produtos inseridos!

        Produto produto1 = ProdutoRegistry.getProduto("COMPUTADOR");

        String chave1 = "NOTEBOOK";
        Produto produto2 = new Produto("Notebook", 7000.0);
        ProdutoRegistry.adicionarProduto(chave1, produto2);


        String chave2 = "TABLET";
        Produto produto3 = new Produto("Tablet", 3000.0);
        ProdutoRegistry.adicionarProduto(chave2, produto3);


        Produto produto4 = ProdutoRegistry.getProduto("TABLET");


        ProdutoRegistry.ListarProdutos();
    }
}
