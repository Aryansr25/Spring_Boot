package com.tracker.Personal_Tracker;

import java.util.List;
import java.util.Optional;

import org.apache.catalina.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.tracker.Personal_Tracker.dao.TaskRepository;
import com.tracker.Personal_Tracker.entities.Task;

@SpringBootApplication
public class PersonalTrackerApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(PersonalTrackerApplication.class, args);
		TaskRepository tr=context.getBean(TaskRepository.class);
		
		/*Save single object
		 * Task t=new Task(); t.setName("running"); t.setCompleted(false);
		 * 
		 * Task t1=tr.save(t);
		 * System.out.println(t1);
		 */
		/*Save multiple tasks
		 * Task t1=new Task(); t1.setName("jooging"); t1.setCompleted(true); Task t2=new
		 * Task(); t2.setName("singing"); t2.setCompleted(true); Task t3=new Task();
		 * t3.setName("Skating"); t3.setCompleted(false);
		 * 
		 * List<Task> tasks=List.of(t1,t2,t3);
		 * 
		 * Iterable<Task> t=tr.saveAll(tasks);
		 * t.forEach(task->System.out.println(task));
		 */
		
		
		/*finding by id -GET operation
		 * Optional<Task>opt=tr.findById(5L); Task t1=opt.get(); System.out.println(t1);
		 */
		
		/*Finding all tasks
		 * Iterable<Task>it=tr.findAll(); it.forEach(System.out::println);
		 */
		
		/*Update operation
		 * Optional<Task> op=tr.findById(5l); Task t1=op.get();
		 * t1.setName("5k jogging"); Task res=tr.save(t1); System.out.println(res);
		 */
		
		//deleting by id
//		tr.deleteById(5l);
		
		/*Delete all from a list
		 * Iterable<Task>itr=tr.findAll(); itr.forEach(System.out::println);
		 * tr.deleteAll(itr); System.out.println("Deleted");
		 */
	}

}
