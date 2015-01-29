package br.com.henriqueluz.controller;

import javax.inject.Inject;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Result;
import br.com.henriqueluz.entity.Dog;
import br.com.henriqueluz.entity.Kennel;
import br.com.henriqueluz.entity.Breed;

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
		Dog gadu = new Dog();
		gadu.setName("Gadu");
		result.include("dog", gadu);
	}
}