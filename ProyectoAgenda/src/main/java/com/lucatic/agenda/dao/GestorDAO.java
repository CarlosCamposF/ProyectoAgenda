package com.lucatic.agenda.dao;

import java.util.List;

import com.lucatic.agenda.beans.Categoria;

public interface GestorDAO<T> extends AutoCloseable{

	
	public void persist(T transientInstance);
	public void attachDirty(T instance);
	public void attachClean(T instance);
	public void delete(T instance);
	public T merge(T detachedInstance);
	public T findById(int id);
	public List findByExample(T instance);
	
}
