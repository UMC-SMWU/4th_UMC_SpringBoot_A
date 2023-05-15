package com.umc.umcTestProject.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Getter
@NoArgsConstructor
public class PostAllListResponseDto {
    private int countPost;
    private List<PostResponseDto> posts;

    @Builder
    public PostAllListResponseDto(List<PostResponseDto> posts) {
        this.posts = posts;
        this.countPost = posts.size();
    }
}
