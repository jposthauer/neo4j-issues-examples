package com.example.gh2176;

import lombok.Data;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Property;

@Data
@Node(primaryLabel = "Field")
public abstract class Field extends BaseEntity<Field> {

  @Property
  private String fieldProp;

  @Override
  public Field getThis() {
    return this;
  }

}
