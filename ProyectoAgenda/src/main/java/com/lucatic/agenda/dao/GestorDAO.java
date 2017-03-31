package com.lucatic.agenda.dao;

import java.util.List;


import com.lucatic.agenda.beans.Categoria;

public interface GestorDAO<T> extends AutoCloseable{

	
		public List <T> list();
		
		public T get(int id);
		
		public void saveOrUpdate(T item);
		
		public void delete(int id);
}
