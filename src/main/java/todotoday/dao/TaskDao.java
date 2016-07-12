package todotoday.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import todotoday.model.Task;

@Repository
public interface TaskDao extends CrudRepository<Task, Long> {
}
