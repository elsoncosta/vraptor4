package com.vraptor4.model.repository;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

import org.hibernate.Criteria;
import org.hibernate.Session;

import com.vraptor4.model.entity.Produto;

@RequestScoped
public class ProdutoDao {

    @Inject
    private Session session;

    private Criteria createCriteria() {
        return session.createCriteria(Produto.class);
    }

    @SuppressWarnings("unchecked")
    public List<Produto> list() {
        return createCriteria().list();
    }
    
    public void adiciona(Produto produto) {
        session.save(produto);
    }
}