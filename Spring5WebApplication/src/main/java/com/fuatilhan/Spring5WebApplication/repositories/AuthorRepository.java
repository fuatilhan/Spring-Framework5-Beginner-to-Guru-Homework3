package com.fuatilhan.Spring5WebApplication.repositories;

import com.fuatilhan.Spring5WebApplication.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author,Long> {
}
