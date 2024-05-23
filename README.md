# Command Generator (SSA EXTRA Assignment - Refactoring to Frameworks)
 CommandGenerator example from Software Systems Architecture course

# Description of parts
## 1. Part
We take two similar classes and create a template method & hook method that both can extend. **Using Inheritance.**\
`AbstractSerializer` implementation.

## 2. Part
We moved one of the variabilities from the two classes to **composition**.\
`PostProcessor` implementation.

## 3. Part
We added a new PostProcessor in order to combine multiple post processors to one. **Using recursive composition.**\
`CombinedPostProcessor` implementation.

## 4. Part
We moved the getPropertiesList method to the AbstractSerializer class. We infer the properties to print **using Reflection.**\
`AbstractSerializer` update with reflection.

## 5. Part
We added two code annotations to modify the reflection behaviour from part 4.
`CommandType` and `IgnoreInSerialization` annotations. 
