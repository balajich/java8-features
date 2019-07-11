# java8-features
Contains examples of Java 8 Features
# Functional Interfaces
* A functional interface is an interface with only one abstract method
* Methods from the Object class doesn't count
* A functional interface can be annotated
* It is just here for convenience, the compiler can tell me whether the interface is functional or not
* java.util.function contains rich set of functional interfaces
# java.util.function 
is divided into four categories
## Supplier
## Consumer or BiConsumer
## Predicate or BiPredicate
## Function(UnaryOperator) or BiFunction (BinaryOperator)
# Method References
It's just another way of writing a lambda expression, that it's strictly equivalent to the other
# Lambda Expression
The lambda expression introduces a new syntax element and operator into the Java language.
The new operator, sometimes referred to as the lambda operator or the arrow operator, is −>.
It divides a lambda expression into two parts. The left side specifies any parameters required
by the lambda expression. (If no parameters are needed, an empty parameter list is used.)
On the right side is the lambda body, which specifies the actions of the lambda expression.
The −> can be verbalized as “becomes” or “goes to.”