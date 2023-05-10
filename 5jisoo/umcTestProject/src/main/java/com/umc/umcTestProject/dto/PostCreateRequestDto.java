package com.umc.umcTestProject.dto;

import com.umc.umcTestProject.domain.Post;
import lombok.Builder;

public class PostCreateRequestDto {
    private String title;
    private String content;

    @Builder
    public PostCreateRequestDto(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public Post toEntity() {
        return Post.builder()
                .title(title)
                .content(content)
                .build();
    }
}
