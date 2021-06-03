package com.example.gh2176;

import org.springframework.data.neo4j.core.schema.Node;

@Node(primaryLabel = "OuterDomain")
public abstract class OuterDomain extends ParentDomain<OuterDomain> {

  @Node(primaryLabel = "InnerDomainOne")
  public static class InnerDomainOne extends OuterDomain {
    // constructors
  }

  @Node(primaryLabel = "InnerDomainTwo")
  public static class InnerDomainTwo extends OuterDomain {
    // constructors
  }

  @Node(primaryLabel = "InnerDomainThree")
  public static class InnerDomainThree extends OuterDomain {
    // constructors
  }

  @Node(primaryLabel = "InnerDomainFour")
  public static class InnerDomainFour extends OuterDomain {
    // constructors
  }

  @Node(primaryLabel = "InnerDomainFive")
  public static class InnerDomainFive extends OuterDomain {
    // constructors
  }
}
