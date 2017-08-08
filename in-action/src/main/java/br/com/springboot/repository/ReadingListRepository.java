package br.com.springboot.repository;

import br.com.springboot.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by dgrodrigo on 25/03/17.
 */
public interface ReadingListRepository extends JpaRepository<Book,Long>{

    List<Book> findByReader(String reader);

}
