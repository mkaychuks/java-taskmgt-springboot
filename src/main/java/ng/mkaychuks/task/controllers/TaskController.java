package ng.mkaychuks.task.controllers;

import ng.mkaychuks.task.domain.dto.TaskDto;
import ng.mkaychuks.task.domain.entities.Task;
import ng.mkaychuks.task.mappers.TaskMapper;
import ng.mkaychuks.task.services.TaskService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping(path = "/task-lists/{task_list_id}/tasks")
public class TaskController {

    private final TaskService taskService;
    private final TaskMapper taskMapper;

    public TaskController(TaskService taskService, TaskMapper taskMapper) {
        this.taskService = taskService;
        this.taskMapper = taskMapper;
    }

    @GetMapping
    public List<TaskDto> listTasks(@PathVariable(name = "task_list_id") UUID taskListId) {
        return taskService.listTasks(taskListId).stream()
                .map(taskMapper::toDto)
                .toList();
    }

    @PostMapping
    public TaskDto createTask(@PathVariable(name = "task_list_id") UUID taskListId, @RequestBody TaskDto taskDto) {
        Task createdTask = taskService.createTask(
                taskListId,
                taskMapper.fromDto(taskDto)
        );
        return taskMapper.toDto(createdTask);
    }

    @GetMapping(path = "/{task_id}")
    public Optional<TaskDto> getTask(@PathVariable("task_list_id") UUID taskListId, @PathVariable("task_id") UUID taskID) {
        return taskService.getTask(taskListId, taskID).map(taskMapper::toDto);
    }

    @PutMapping(path = "/{task_id}")
    public TaskDto updateTask(
            @PathVariable("task_list_id") UUID taskListId, @PathVariable("task_id") UUID taskID, @RequestBody TaskDto taskDto
    ) {
        Task updatedTask = taskService.updateTask(taskListId, taskID, taskMapper.fromDto(taskDto));
        return taskMapper.toDto(updatedTask);
    }
}
