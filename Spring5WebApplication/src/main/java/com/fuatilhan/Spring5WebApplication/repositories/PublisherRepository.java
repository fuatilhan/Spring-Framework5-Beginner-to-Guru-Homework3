package com.fuatilhan.Spring5WebApplication.repositories;

import com.fuatilhan.Spring5WebApplication.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher,Long> {
}
