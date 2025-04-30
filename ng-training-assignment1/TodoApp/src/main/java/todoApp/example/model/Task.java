package todoApp.example.model;


import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.time.LocalDate;

@Data
@Document("tasks")
public class Task {
	
	    @Id
	    private String id;
	    private String assignedTo;
	    private String status;
	    private LocalDate dueDate;
	    private String priority;
	    private String comments;
	}


