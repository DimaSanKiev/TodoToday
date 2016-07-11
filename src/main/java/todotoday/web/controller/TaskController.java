package todotoday.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import todotoday.model.Task;
import todotoday.service.TaskService;
import todotoday.service.UserService;

@Controller
public class TaskController {
    @Autowired
    private TaskService taskService;

    @Autowired
    private UserService userService;

    @RequestMapping({"/", "/todo"})
    public String taskList(Model model) {
        Iterable<Task> tasks = taskService.findAll();
        model.addAttribute("tasks", tasks);
        return "todo";
    }
}
