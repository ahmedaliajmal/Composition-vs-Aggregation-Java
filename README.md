1. Composition (Strong Ownership)
In Composition, the child object is tightly bound to the parent object. If the parent object is garbage collected, the child object is destroyed with it.

2. Aggregation (Weak Ownership)
In Aggregation, the child object can exist independently. It is usually passed to the parent object via a constructor or setter method (Dependency Injection).

