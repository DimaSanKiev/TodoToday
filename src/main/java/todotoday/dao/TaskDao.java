package todotoday.dao;

import org.springframework.data.repository.CrudRepository;
import todotoday.model.Task;

public interface TaskDao extends CrudRepository<Task, Long> {
}
