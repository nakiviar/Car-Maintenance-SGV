package com.sgv.demo.services;

import java.util.List;

public interface CRUDServices<T, ID> {

	String create(T t);

	T get(ID id);

	List<T> getAll();

	T update(T t);

	void delete(ID id);

	
}
