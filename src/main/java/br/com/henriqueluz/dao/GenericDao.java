package br.com.henriqueluz.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import br.com.henriqueluz.entity.BasicEntity;

public abstract class GenericDao {

	private static final Map<Long, BasicEntity> repository = new TreeMap<Long, BasicEntity>();
	private static Long currentId = 0L;
	
	public BasicEntity find(Long id) {
		return repository.get(id);
	}

	public List<BasicEntity> findAll() {
		return new ArrayList<BasicEntity>(repository.values());
	}
	
	public void save(BasicEntity entity) {
		entity.setId(++currentId);
		repository.put(entity.getId(), entity);
	}
	
	public void delete(BasicEntity entity) {
		repository.remove(entity.getId());
	}
	
	public BasicEntity update(BasicEntity entity) {
		repository.put(entity.getId(), entity);
		return repository.get(entity.getId());
	}
	
}
