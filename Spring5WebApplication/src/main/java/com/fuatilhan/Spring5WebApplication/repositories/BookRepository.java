package com.fuatilhan.Spring5WebApplication.repositories;

import com.fuatilhan.Spring5WebApplication.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository <Book,Long>{

}
