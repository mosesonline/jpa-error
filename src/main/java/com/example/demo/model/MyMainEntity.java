package com.example.demo.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Singular;

import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(schema = "mydb", name = "main_entites")
public class MyMainEntity {
    @Id
    @Column(name = "my_main_id")
    private String myMainId;
    @Column(name = "some_main")
    private String someMain;
    @OneToMany(
            cascade = CascadeType.ALL,
            orphanRemoval = true,
            fetch = FetchType.EAGER,
            targetEntity = MyChildEntity.class,
            mappedBy = "myMainId"
    )
    @Singular
    private List<MyChildEntity> children = new ArrayList<>();
}
