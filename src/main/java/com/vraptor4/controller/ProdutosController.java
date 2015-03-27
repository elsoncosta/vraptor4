package com.vraptor4.controller;

import java.util.List;

import javax.inject.Inject;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Result;

import com.vraptor4.model.entity.Produto;
import com.vraptor4.model.repository.ProdutoDao;

@Controller
public class ProdutosController {
	
	@Inject
    private ProdutoDao dao;

    @Inject
    private Result result;
    
    public void form() {}
    
	
    public List<Produto> lista() {
        return dao.list();
    }
    
    public void adiciona(Produto produto) {
        dao.adiciona(produto);
        result.redirectTo(ProdutosController.class).lista();
    }
}
