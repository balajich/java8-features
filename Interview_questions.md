# What Is a Lambda Expression
* To make this piece of code more readable. We want to make instances of anonymous classes easier to write, and, because it will be easier to write, it will also be easier to read, and this is extremely important to understand that.
* Another way of writing instances of anonymous classes
# Is Java 100% Object-oriented?
Not 100%. Java doesn’t satisfy all the OOP conditions (predefined types must be objects) because it uses eight primitive data types(Boolean, byte, char, int, float, double, long, short) which are not objects.
# What is Abstraction?
# What is Encapsulation?

# What are the differences between Abstraction and Encapsulation?
Abstraction and encapsulation are complementary concepts. On the one hand, abstraction focuses on the behavior of an object. On the other hand, encapsulation focuses on the implementation of an object’s behavior. Encapsulation is usually achieved by hiding information about the internal state of an object and thus, can be seen as a strategy used in order to provide abstraction.
# What is Polymorphism?
# What are the types of Polymorphism?
There are two types of Polymorphism in Java:
* Compile time polymorphism (Static binding) – Method overloading
* Runtime polymorphism (Dynamic binding) – Method overriding

We can perform polymorphism by ‘Method Overloading’ and ‘Method Overriding’
# important links
https://www.javacodegeeks.com/2014/04/java-interview-questions-and-answers.html
# Can you override private or static method in Java?
A user cannot override static methods in Java, because method overriding is based upon dynamic binding at runtime and static methods are statically bound at compile time. A static method is not associated with any instance of a class so the concept is not applicable.
#  What is Function Overriding and Overloading in Java?
Method overloading in Java occurs when two or more methods in the same class have the exact same name, but different parameters. On the other hand, method overriding is defined as the case when a child class redefines the same method as a parent class. Overridden methods must have the same name, argument list, and return type. The overriding method may not limit the access of the method it overrides.
# What is Copy-Constructor?
Java does support copy constructors like C++, but the difference lies in the fact that Java doesn’t create a default copy constructor if you don’t write your own.
# What are pass by reference and pass by value?
When an object is passed by value, this means that a copy of the object is passed. Thus, even if changes are made to that object, it doesn’t affect the original value. When an object is passed by reference, this means that the actual object is not passed, rather a reference of the object is passed. Thus, any changes made by the external method, are also reflected in all places.
# What is the purpose of a Volatile Variable?
Volatile variable values can be modified by different threads. They will never have the chance to block and hold a lock. **Synchronization** will happen whenever the variables are accessed. Using volatile may be faster than a lock, but it will not work in some situations. The range of situations in which volatile is effective was expanded in Java 5; in particular, double-checked locking now works correctly.
# What is the purpose of a Transient variable?
Transient variable would not be serialized even if the class to which it belongs is serialized.
# What is the difference between processes and threads?
A process is an execution of a program, while a Thread is a single execution sequence within a process. A process can contain multiple threads. A Thread is sometimes called a lightweight process.
# Explain different ways of creating a thread. Which one would you prefer and why?
There are three ways that can be used in order for a Thread to be created:
* A class may extend the **Thread** class.
* A class may implement the **Runnable** interface.
* An application can use the Executor framework, in order to create a thread pool.

The **Runnable** interface is preferred, as it does not require an object to inherit the Thread class. In case your application design requires multiple inheritance, only interfaces can help you. Also, the thread pool is very efficient and can be implemented and used very easily.
# What differences exist between Iterator and ListIterator?
The differences of these elements are listed below:
* An Iterator can be used to traverse the Set and List collections, while the ListIterator can be used to iterate only over Lists.
* The Iterator can traverse a collection only in forward direction, while the ListIterator can traverse a List in both directions.
* The ListIterator implements the Iterator interface and contains extra functionality, such as adding an element, replacing an element, getting the index position for previous and next elements, etc.