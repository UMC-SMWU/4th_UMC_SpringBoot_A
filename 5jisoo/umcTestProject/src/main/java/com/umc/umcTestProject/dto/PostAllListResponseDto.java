package com.umc.umcTestProject.dto;

import com.umc.umcTestProject.domain.Post;
import lombok.Builder;

import java.util.List;

public class PostAllListResponseDto {
    private int countPost;
    private List<PostResponseDto> posts;

    @Builder
    public PostAllListResponseDto(List<PostResponseDto> posts) {
        this.posts = posts;
        this.countPost = posts.size();
    }
}
