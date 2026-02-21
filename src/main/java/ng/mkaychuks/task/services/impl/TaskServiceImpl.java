package ng.mkaychuks.task.services.impl;

import ng.mkaychuks.task.domain.entities.Task;
import ng.mkaychuks.task.repositories.TaskRepository;
import ng.mkaychuks.task.services.TaskService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class TaskServiceImpl implements TaskService {

    private final TaskRepository taskRepository;

    public TaskServiceImpl(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @Override
    public List<Task> listTasks(UUID taskListId) {
        return taskRepository.findByTaskListId(taskListId);
    }
}
