

Packages

    * Named groups of related classes

Abstract classes

    * Can't be instantiated, but can be inherited
    * Allows both abstract method declaration and implementations
    * Abstract methods can't be private

Interface

    * Set of constant declarations and method signatures
    * Methods must be implemented in class that `implements` interface

Inheritance vs. Composition

    * Inheritance: IS-A relationship
        * Ex: Car extends Vehicle, "Car is a vehicle."
        * Strict and doesn't allow for exceptions to heirarchy
    * Composition: HAS-A relationship
        * Ex: Car implements VehicleInterface, "Car has an engine. Car can drive."
        * Easier to come up with ad hoc solutions to business problems

Multiple Inheritance
    
    * Java doesn't support it to remain a "Simple Object Oriented" language
    * Problem of MI summed up in "diamond problem"
        * D inherits B and C, which both override method in A
        * Crash when A's overridden method is called

Access level modifiers: `public`, `private`, `protected`

    | Modifier    | Class | Package | Subclass | World     |
    |-------------|-------|---- ----|----- ----|-----------|
    | public      | Y     | Y       | Y        | Y         |
    | protected   | Y     | Y       | Y        | N         |
    | no modifier | Y     | Y       | N        | N         |
    | private     | Y     | N       | N        | N         |
    
`static` keyword

    * Can apply to variables, methods, blocks, and nested classes
    * Renders a common property across all object instantiations
    * Can be accessed without instantiation
    * Memory efficient

`this` and `super`

    * This always refers to the current class
    * Super refers to the parent of the current class

`final` variables, methods, and classes

    * Variable: can't change value
    * Method: can't be overridden
    * Class: can't be inherited

`.equals()` vs `==`

    * `.equals()` compares non-null values
    * `==` compares references (memory locations)
    
`polymorphism`
