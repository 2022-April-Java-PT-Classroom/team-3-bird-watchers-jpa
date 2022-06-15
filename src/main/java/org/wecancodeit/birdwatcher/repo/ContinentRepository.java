package org.wecancodeit.birdwatcher.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.wecancodeit.birdwatcher.model.Continent;

@Repository
public interface ContinentRepository extends CrudRepository<Continent, Long> {

}
