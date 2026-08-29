1. Composition (Strong Ownership)
In Composition, the child object is tightly bound to the parent object. If the parent object is garbage collected, the child object is destroyed with it.

2. Aggregation (Weak Ownership)
In Aggregation, the child object can exist independently. It is usually passed to the parent object via a constructor or setter method (Dependency Injection).


Quick ComparisonFeatureComposition (Strong Has-A)Aggregation (Weak Has-A)LifecycleChild cannot exist without the parent.Child can exist independently of the parent.OwnershipStrong / Exclusive ownership.Weak / Shared ownership.UML SymbolFilled Diamond (◆)Hollow Diamond (◇)CreationChild created inside parent constructor.Child passed in (Dependency Injection).Real WorldCar and EngineDepartment and Teacher
