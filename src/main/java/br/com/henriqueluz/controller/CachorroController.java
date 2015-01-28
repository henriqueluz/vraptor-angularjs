package br.com.henriqueluz.controller;

import javax.inject.Inject;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Result;
import br.com.henriqueluz.entity.Cachorro;
import br.com.henriqueluz.entity.Canil;
import br.com.henriqueluz.entity.Raca;

@Controller
public class CachorroController {

	private final Result result;

	/**
	 * @deprecated CDI eyes only
	 */
	protected CachorroController() {
		this(null);
	}
	
	@Inject
	public CachorroController(Result result) {
		this.result = result;
	}

	@Path("/")
	public void index() {
		Raca labrador = new Raca("Labrador Retriever");
		Canil sierraLab = new Canil("SierraLab", "Bonaldo");
		Cachorro gadu = new Cachorro("Gadu", "Chocolate", labrador, sierraLab);
		result.include("cachorro", gadu);
	}
}