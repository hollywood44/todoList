package com.example.todoList.entity;

import lombok.*;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;

@Entity
@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@DynamicInsert
public class TodoList extends CreateDate{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long tno;

    @ColumnDefault("false")
    private boolean done;

    @Column(length = 100,nullable = false)
    private String todo;

    @ManyToOne(targetEntity = Member.class)
    @JoinColumn(name = "userId")
    private Member writer;
}
