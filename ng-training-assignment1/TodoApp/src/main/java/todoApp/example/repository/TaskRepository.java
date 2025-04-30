package todoApp.example.repository;

import org.springframework.data.mongodb.core.messaging.Task;
import org.springframework.data.mongodb.repository.MongoRepository;

//import todoApp.example.model.TodoAppModel;

//import com.todoapp.model.;
public interface TaskRepository  extends MongoRepository<Task, String> {

	//TodoAppModel saveAll(TodoAppModel todoAppModel);

}
