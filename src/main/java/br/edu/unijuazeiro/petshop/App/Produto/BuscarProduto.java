package br.edu.unijuazeiro.petshop.App.Produto;

import br.edu.unijuazeiro.petshop.DAO.ProdutoDAO;
import br.edu.unijuazeiro.petshop.model.Negocios.Produto;

public class BuscarProduto {
    public static void main(String[] args) {

        
         ProdutoDAO dao = new ProdutoDAO();
         
         Produto p = dao.findId(2);
         System.out.println("Id: " + p.getCodigo());
         System.out.println("Nome: " + p.getNome());
         System.out.println("Valor: " + p.getValor());
    }   
}