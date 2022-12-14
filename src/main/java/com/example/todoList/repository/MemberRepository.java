package com.example.todoList.repository;

import com.example.todoList.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MemberRepository extends JpaRepository<Member,String> {

    Optional<Member> findByUserId(String userid);
}
