package com.az.flysystem.repo;

import com.az.flysystem.model.Forum;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;

@Transactional
public interface ForumRepo extends JpaRepository<Forum,Long> {
    Forum findBySecretKey(Long id);
}
