package in.spa.angulr.service;

import java.io.Serializable;
import java.sql.SQLException;
import java.util.List;

public interface CrudService<T extends Serializable> {

	T save(final T entity) throws SQLException;

	void delete(final long id) throws SQLException;

	void deleteAll() throws SQLException;

	T findOne(final long id) throws SQLException;

	List<T> findAll() throws SQLException;
}

