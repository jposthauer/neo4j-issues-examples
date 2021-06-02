package com.example.gh2176;

import lombok.Data;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Property;

@Data
public abstract class InfiniteField extends Field {

  @Override
  public InfiniteField getThis() {
    return this;
  }

  @Data
  @Node(primaryLabel = "TextField")
  public static class TextField extends InfiniteField {

    @Property
    private String text;

  }

}
