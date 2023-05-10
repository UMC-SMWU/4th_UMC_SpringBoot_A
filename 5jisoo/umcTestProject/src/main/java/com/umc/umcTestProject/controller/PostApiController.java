package com.umc.umcTestProject.controller;

import com.umc.umcTestProject.dto.PostAllListResponseDto;
import com.umc.umcTestProject.dto.PostCreateRequestDto;
import com.umc.umcTestProject.dto.PostResponseDto;
import com.umc.umcTestProject.dto.PostUpdateRequestDto;
import com.umc.umcTestProject.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class PostApiController {
    private final PostService postService;

    /**
     * Post 등록
     */
    @PostMapping("/api/v1/post")
    public Long savePost(@RequestBody PostCreateRequestDto postCreateRequestDto) {
        return postService.createPost(postCreateRequestDto);
    }

    /**
     * Post 조회
     */
    @GetMapping("/api/v1/post")
    public PostAllListResponseDto findAllPost() {
        return postService.findAllPosts();
    }

    @GetMapping("/api/v1/post/{id}")
    public PostResponseDto findPostById(@PathVariable Long id) {
        return postService.findPostById(id);
    }


    /**
     * Post 수정
     */
    @PutMapping("/api/v1/post/{id}")
    public Long updatePost(@PathVariable Long id, @RequestBody PostUpdateRequestDto postUpdateRequestDto) {
        return postService.updatePost(id, postUpdateRequestDto);
    }

    /**
     * Post 삭제
     */
    @DeleteMapping("/api/v1/post/{id}")
    public void deletePostById(@PathVariable Long id) {
        postService.delete(id);
    }
}