package com.example.gh2176;

import org.springframework.data.neo4j.core.schema.Node;

@Node(primaryLabel = "ParentDomain")
public abstract class ParentDomain<T extends ParentDomain<T>> extends BaseEntity<T> {
    // constructors
}
