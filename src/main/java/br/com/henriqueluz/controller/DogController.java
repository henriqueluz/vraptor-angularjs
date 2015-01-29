package br.com.henriqueluz.controller;

import javax.inject.Inject;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Result;
import br.com.henriqueluz.entity.Dog;

@Controller
@Path("dog")
public class DogController {

	private final Result result;

	/**
	 * @deprecated CDI eyes only
	 */
	protected DogController() {
		this(null);
	}
	
	@Inject
	public DogController(Result result) {
		this.result = result;
	}

	@Path("/")
	public void index() {
		Dog gadu = new Dog();
		gadu.setName("Gadu");
		result.include("dog", gadu);
	}
}