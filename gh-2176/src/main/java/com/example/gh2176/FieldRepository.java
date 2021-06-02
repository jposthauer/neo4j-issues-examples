package com.example.gh2176;

import java.util.List;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.neo4j.repository.query.Query;

public interface FieldRepository extends Neo4jRepository<Field, String> {

  @Query("MATCH (field:Field {id:$id}) RETURN field")
  Field findByIdCustom(String id);

  @Query("MATCH (field:Field {fieldProp:$prop}) RETURN field")
  List<Field> findByFieldProp(String prop);
}
