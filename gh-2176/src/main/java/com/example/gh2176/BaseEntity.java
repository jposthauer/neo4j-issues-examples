package com.example.gh2176;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public abstract class BaseEntity<T extends BaseEntity<T>> {

  @Id
  @GeneratedValue(generatorClass = SomeStringGenerator.class)
  private String id;

  public abstract T getThis();
}
