package todotoday.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import todotoday.model.Task;
import todotoday.model.User;
import todotoday.service.TaskService;
import todotoday.service.UserService;

import java.security.Principal;

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
        model.addAttribute("newTask", new Task());
        return "todo";
    }

    @RequestMapping(path = "/mark", method = RequestMethod.POST)
    public String toggleComplete(@RequestParam Long id) {
        taskService.toggleComplete(id);
        return "redirect:/";
    }

    @RequestMapping(path = "/tasks", method = RequestMethod.POST)
    public String addTask(@ModelAttribute Task task, Principal principal) {
        taskService.save(task);
        return "redirect:/";
    }
}
