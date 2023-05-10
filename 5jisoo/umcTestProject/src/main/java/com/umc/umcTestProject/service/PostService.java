package com.umc.umcTestProject.service;

import com.umc.umcTestProject.domain.Post;
import com.umc.umcTestProject.dto.PostAllListResponseDto;
import com.umc.umcTestProject.dto.PostCreateRequestDto;
import com.umc.umcTestProject.dto.PostUpdateRequestDto;
import com.umc.umcTestProject.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class PostService {
    private final PostRepository postRepository;


    @Transactional
    public Long createPost(Long id, PostCreateRequestDto postCreateRequestDto) {
        return postRepository.save(postCreateRequestDto.toEntity()).getId();
    }

    public List<PostAllListResponseDto> findAllPosts() {
        return postRepository.findAll().stream().map(post -> new PostAllListResponseDto(post))
                .collect(Collectors.toList());
    }

    @Transactional
    public Long updatePost(Long id, PostUpdateRequestDto postUpdateRequestDto) {
        Post findPost = postRepository.findById(id)
                .orElseThrow(() -> new IllegalStateException("게시글이 존재하지 않습니다."));
        return id;
    }

    @Transactional
    public void delete(Long id) {
        Post post = postRepository.findById(id)
                .orElseThrow(() -> new IllegalStateException("게시글이 존재하지 않습니다."));
        postRepository.delete(post);
    }
}
