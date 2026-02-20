package ng.mkaychuks.task.domain.dto;

import ng.mkaychuks.task.domain.entities.TaskPriority;
import ng.mkaychuks.task.domain.entities.TaskStatus;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

public record TaskListDto(
        UUID id,
        String title,
        String description,
        Integer count,
        Double progress,
        List<TaskDto> tasks
) {
}
