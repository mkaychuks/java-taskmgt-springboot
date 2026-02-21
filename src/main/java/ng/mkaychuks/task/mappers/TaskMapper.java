package ng.mkaychuks.task.mappers;

import ng.mkaychuks.task.domain.dto.TaskDto;
import ng.mkaychuks.task.domain.entities.Task;

public interface TaskMapper {
    Task fromDto(TaskDto taskDto);
    TaskDto toDto(Task task);
}
