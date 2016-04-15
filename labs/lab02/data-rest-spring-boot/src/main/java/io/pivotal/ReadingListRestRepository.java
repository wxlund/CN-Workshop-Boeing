package io.pivotal;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface ReadingListRestRepository extends CrudRepository<Book, Long> {
	
	List<Book> findByReader(@Param("reader") String reader);

}
