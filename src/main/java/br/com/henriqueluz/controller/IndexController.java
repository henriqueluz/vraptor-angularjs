package br.com.henriqueluz.controller;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;

@Controller
public class IndexController {

	@Get("/")
	public void index() {
	}
}
