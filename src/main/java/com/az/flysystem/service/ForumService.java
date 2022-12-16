package com.az.flysystem.service;

import com.az.flysystem.model.Forum;
import com.az.flysystem.repo.ForumRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ForumService {

private final ForumRepo forumRepo;


    public boolean delete(Long id) {
        Forum forum  =  forumRepo.findBySecretKey(id);
         forumRepo.delete(forum);
         return true;
    }
public Forum create(Forum forum){
    return forumRepo.save(forum);

}
}
