package com.example.gh2176;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Property;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public abstract class InfiniteField extends Field {

  public InfiniteField(String fieldProp) {
    super(fieldProp);
  }

  @Override
  public InfiniteField getThis() {
    return this;
  }

  @Data
  @NoArgsConstructor
  @AllArgsConstructor
  @Node(primaryLabel = "TextField")
  @EqualsAndHashCode(callSuper = true)
  public static class TextField extends InfiniteField {

    @Property
    private String text;

    public TextField(String text, String fieldProp) {
      super(fieldProp);
      this.text = text;
    }

  }

}
