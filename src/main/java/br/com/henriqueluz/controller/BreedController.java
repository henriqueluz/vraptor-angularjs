package br.com.henriqueluz.controller;

import javax.inject.Inject;

import br.com.caelum.vraptor.Consumes;
import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Delete;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Put;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.view.Results;
import br.com.henriqueluz.dao.BreedDao;
import br.com.henriqueluz.entity.Breed;

@Controller
public class BreedController {
	
	private final Result result;
	private BreedDao dao;

	/**
	 * @deprecated CDI eyes only
	 */
	protected BreedController() {
		this(null, null);
	}
	
	@Inject
	public BreedController(Result result, BreedDao dao) {
		this.result = result;
		this.dao = dao;
	}
	
	@Get("/breed/index")
	public void index() {
		
	}

	@Get("/breed/{breed.id}")
    public void find(Breed breed) {
        result.use(Results.json()).withoutRoot().from(dao.find(breed.getId())).serialize();
    }
	
	@Get("/breed")
	public void findAll(Breed breed) {
		result.use(Results.json()).withoutRoot().from(dao.findAll()).serialize();
	}
	
	@Post("/breed")
    @Consumes("application/json")
	public void save(Breed breed) {
		dao.save(breed);
		result.use(Results.json()).withoutRoot().from(breed).serialize();
	}
	
	@Put("/breed/{breed.id}")
    @Consumes("application/json")
    public void update(Breed breed) {
        dao.update(breed);
        result.nothing();
    }
	
	@Delete("/breed/{breed.id}")
    public void delete(Breed breed) {
        dao.delete(breed);
        result.nothing();
    }   
}
