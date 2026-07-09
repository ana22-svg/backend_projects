package com.example.taskmanager.dtos;

import lombok.Builder;

@Builder
public record CategoryResponse(Long categoryId,
                               String name,
                               String description) {
}
