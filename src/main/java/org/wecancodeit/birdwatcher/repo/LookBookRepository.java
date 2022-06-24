package org.wecancodeit.birdwatcher.repo;

import org.springframework.data.repository.CrudRepository;
import org.wecancodeit.birdwatcher.model.LookBook;

public interface LookBookRepository extends CrudRepository<LookBook,Long> {
}
