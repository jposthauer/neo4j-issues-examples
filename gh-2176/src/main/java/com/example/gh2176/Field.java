package com.example.gh2176;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Property;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Node(primaryLabel = "Field")
@EqualsAndHashCode(callSuper = true)
public abstract class Field extends BaseEntity<Field> {

  @Property
  private String fieldProp;

  @Override
  public Field getThis() {
    return this;
  }

}
