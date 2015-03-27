package com.vraptor4.controller;

import javax.inject.Inject;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Result;

@Controller
public class HomeController {
    @Inject
    private Result result;

    @Get("/home")
    public void home() {
        result.include("mensagem", "Olá, VRaptor 4!");
    }
}