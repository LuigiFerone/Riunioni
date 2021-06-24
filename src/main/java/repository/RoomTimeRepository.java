package repository;

import entity.Roomtime;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RoomTimeRepository extends MongoRepository<Roomtime,String> {

}
