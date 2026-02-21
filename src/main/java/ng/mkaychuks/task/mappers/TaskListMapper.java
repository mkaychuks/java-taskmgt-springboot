package ng.mkaychuks.task.mappers;

import ng.mkaychuks.task.domain.dto.TaskListDto;
import ng.mkaychuks.task.domain.entities.TaskList;

public interface TaskListMapper {
    TaskList fromDto(TaskListDto taskListDto);

    TaskListDto toDto(TaskList taskList);
}
