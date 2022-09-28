package pck_principal;

public class Principal {
    public static void main(String[] args) {
        //DAO_Produtos obj_produtos = new DAO_Produtos();
        //obj_produtos.consultar();

       /* Produto novoProduto = new Produto(7, "Uva", 30.00, 10.0, 2);
        obj_produtos.inserir(novoProduto);*/

        /*alterar produtos
        Produto produtoAlterado = new Produto(7, "Uva Alterada", 10.00, 5, 3);
        obj_produtos.alterar(produtoAlterado);*/

        //Excluir
        //obj_produtos.excluir(6);

        DAO_Unidades obj_unidades = new DAO_Unidades();
        //obj_unidades.consultar();

        //Inserir Unidades
        /*Unidade novaUnidade = new Unidade(6, "tolenadas");
        obj_unidades.inserir(novaUnidade);*/

        //Unidade Alterada
        /*Unidade unidadeAlterada = new Unidade(6, "tolenadas alteradas");
        obj_unidades.alterar(unidadeAlterada);*/

        //Excluir
        obj_unidades.excluir(6);
    }
}
