package todotoday.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import todotoday.model.Task;

import java.util.List;

@Repository
public interface TaskDao extends CrudRepository<Task, Long> {

    @Query("SELECT t FROM Task t WHERE t.user.id = :#{principal.id}")
    List<Task> findAll();
}
