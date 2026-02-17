package com.csc2920.group_project.repository;


import com.csc2920.group_project.entity.MemberEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<MemberEntity, String> {
}

