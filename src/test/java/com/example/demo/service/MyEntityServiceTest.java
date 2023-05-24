package com.example.demo.service;

import com.example.demo.model.MyChildEntity;
import com.example.demo.model.MyMainEntity;
import io.zonky.test.db.AutoConfigureEmbeddedDatabase;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@AutoConfigureEmbeddedDatabase(provider = AutoConfigureEmbeddedDatabase.DatabaseProvider.ZONKY)
@ActiveProfiles("test")
class MyEntityServiceTest {
    @Autowired
    private MyEntityService myEntityService;

    @Test
    void shouldListInserted() {
        final var myEnt = new MyMainEntity();
        myEnt.setMyMainId("007");
        myEnt.setSomeMain("blah");
        final var myChild = new MyChildEntity();
        myChild.setMyMainId("007");
        myEnt.setChildren(List.of(myChild));

        myEntityService.create(myEnt);

        assertThat(myEntityService.getAll()).hasSize(1);
    }
}
