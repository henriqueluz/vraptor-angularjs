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
import br.com.henriqueluz.dao.DogDao;
import br.com.henriqueluz.entity.Dog;

@Controller
public class DogController {

	private final Result result;
	private DogDao dao;

	/**
	 * @deprecated CDI eyes only
	 */
	protected DogController() {
		this(null, null);
	}
	
	@Inject
	public DogController(Result result, DogDao dao) {
		this.result = result;
		this.dao = dao;
	}
	
	@Get("/dog/index")
	public void index() {
		
	}

	@Get("/dog/{dog.id}")
    public void find(Dog dog) {
        result.use(Results.json()).from(dao.find(dog.getId())).serialize();
    }
	
	@Get("/dog")
	public void findAll(Dog dog) {
		result.use(Results.json()).withoutRoot().from(dao.findAll()).serialize();
	}
	
	@Post("/dog")
    @Consumes("application/json")
	public void save(Dog dog) {
		dao.save(dog);
		result.use(Results.json()).from(dog).serialize();
	}
	
	@Put("/dog/{dog.id}")
    @Consumes("application/json")
    public void update(Dog dog) {
        dao.update(dog);
        result.nothing();
    }
	
	@Delete("/dog/{dog.id}")
    public void delete(Dog dog) {
        dao.delete(dog);
        result.nothing();
    }   
	
}