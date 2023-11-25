package com.todorkrastev.krastevsgym.model.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class ActivityDto {
    @NotBlank(message = "Title must not be null and must contain at least one non-whitespace character!")
    @Size(min = 1, message = "Title must have at least 1 character!")
    private String title;

    @NotBlank(message = "Description must not be null and must contain at least one non-whitespace character!")
    @Size(min = 1, message = "Description must have at least 1 character!")
    private String description;

    @NotBlank(message = "Image must not be null and must contain at least one non-whitespace character!")
    @Size(min = 1, message = "Image must have at least 1 character!")
    private String image;

    public ActivityDto() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
