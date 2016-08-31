package br.com.caelum.vraptor.controller;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.annotations.Public;

@Controller
public class IndexController {

	@Get("/")
	@Public
	public void inicio() {

	}

}
