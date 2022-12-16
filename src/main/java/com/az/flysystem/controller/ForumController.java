package com.az.flysystem.controller;


import com.az.flysystem.model.Forum;
import com.az.flysystem.repo.ForumRepo;
import com.az.flysystem.service.ForumService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/f")
@RequiredArgsConstructor
public class ForumController {
    private final ForumService forumService;
    private final ForumRepo forumRepo;

    @PostMapping("/new")
    public Forum create(@RequestBody Forum forum){
        return forumService.create(forum);
    }
    @DeleteMapping("/de{id}")
    ResponseEntity<Boolean> deleteDemo(@PathVariable Long id){
        boolean deleted = false;
     deleted = forumService.delete(id);
      Map<String,Boolean> map = new HashMap<>();
        map.put("deleted",deleted);
         return  ResponseEntity.ok(deleted);
    }
}
