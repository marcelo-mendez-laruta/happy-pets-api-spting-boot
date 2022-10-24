package cloud.pirwa.happypetsapi.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import cloud.pirwa.happypetsapi.models.petModel;

@Repository

public interface petRepository extends MongoRepository<petModel, String> {


}