package org.wecancodeit.birdwatcher.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.wecancodeit.birdwatcher.model.Bird;

@Repository
public interface BirdRepository extends CrudRepository<Bird, Long> {

}
