package com.sgv.demo.repositories;

import java.util.List;

public interface CRUDRepository<T, ID>{

	void save(T resourse);

	T get(ID primaryKey);

	List<T> all();

	void delete(ID primaryKey);
}
