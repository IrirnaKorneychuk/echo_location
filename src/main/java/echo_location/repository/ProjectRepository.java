package echo_location.repository;

import echo_location.entity.Project;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProjectRepository extends MongoRepository<Project, String> {//работа с бд

}
