package com.example.gh2176;

import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.neo4j.repository.query.Query;

public interface OuterDomainRepository extends Neo4jRepository<OuterDomain, String> {

  @Query("MATCH (o:OuterDomain {id:$id}) RETURN o;")
  OuterDomain findByIdCustom(String id);
}
