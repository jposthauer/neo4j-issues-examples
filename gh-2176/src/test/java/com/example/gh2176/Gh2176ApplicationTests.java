package com.example.gh2176;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.neo4j.driver.Driver;
import org.neo4j.driver.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Gh2176ApplicationTests {

  private final Driver driver;
  private final FieldRepository repository;

  @Autowired
  Gh2176ApplicationTests(Driver driver, FieldRepository repository) {
    this.driver = driver;
    this.repository = repository;
  }

  @AfterEach
  void cleanUp() {
    try (Session session = driver.session()) {
      session.run("MATCH (n) detach delete n").consume();
    }
  }

  @Test
  void innerDomainLoading() {
    InfiniteField.TextField textField = new InfiniteField.TextField();
    textField.setText("text");
    textField.setFieldProp("field");

    repository.save(textField);

    Field consumed = repository.findByIdCustom(textField.getId());
    assertThat(consumed).isNotNull();
    assertThat(consumed).isOfAnyClassIn(InfiniteField.TextField.class);
  }

}
