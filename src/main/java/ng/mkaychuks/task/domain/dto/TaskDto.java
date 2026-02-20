package ng.mkaychuks.task.domain.dto;

import ng.mkaychuks.task.domain.entities.TaskPriority;
import ng.mkaychuks.task.domain.entities.TaskStatus;

import java.time.LocalDateTime;
import java.util.UUID;

public record TaskDto(
        UUID id,
        String title,
        String description,
        LocalDateTime dueDate,
        TaskPriority priority,
        TaskStatus status
) {
}
