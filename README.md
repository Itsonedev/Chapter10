# Chapter 10-11ab video files, Fruit Market exercise & notes on chapters 5-10
Chapter 5 – Developing a class: Initially the text breaks down how developing a class goes through multiple phases sort of like a check list in its development. To begin there is the prep code, a form of pseudocode to help you focus on the logic without stressing about syntax. Then there is the test code, a class or methods that will test the real code and validate that it’s doing the right thing. Third there is the real code, which is the actual implementation of the class. This is where you will develop your real java code.

Chapter 6 – Using the java Library: Otherwise known as the Java API – Java ships with hundreds of pre built classes. The core java library is a giant pile of classes just waiting for you to use like building blocks, to assemble your own program out of largely prebuilt code. An Array List is a class in the core java library. There are multiple different key words to learn as you begin to implement an Array List. You can learn how to use all the imported classes located within the API.

Chapter 7 – Inheritance and polymorphism: Plan your programs with the future in mind. Inheritance allow classes to share Instance variables and methods with other similar classes. All of the subclasses or child classes, extend from the super class or parent class. Using this allows you to be more specific when creating methods in the child classes. Overriden methods in the child classes take priority to be called. Over riding and over loading are different. Overloading is not polymorphism.

Chapter 8 – interfaces and abstract classes: Serious Polymorphism – Inheritance is just the beginning. In interface is an 100% abstract class. An abstract class is a class that cant be instantiated. Interfaces are extremely important and will change the way you use java. Some classes should NOT be instantiated. Making a class abstract will stop it from ever being instantiated at any point by the java compiler. Meaning you can not make any objects from it. There are abstract classes and concrete classes. Concrete classes means it is okay to make objects of that type.  

Chapter 9 – constructors and garbage collection: Life and Death of an Object.  Objects are born and objects die. Once you abandon an object or simply stop using it, the garbage collector will vaporize it claiming the memory that the object was using. Chapter 9 goes into detail about the heap, the stack, scope, constructors, super constructors, null references and more. All objects live in the Heap. Methods and local variables live in the stack.

Chapter 10 - Do the math - The Math class does not need instance variables in order to be able to run. The method acts on the argument that you pass through it instead. The math class doesn't have any instance variables, in fact you couldn't make an instance of the class if you tried to. You can never make "new" math object you will recieve an error. For non static methods or regular methods you must create an object and use the reference variable to call on the method. (car.startVehicle(ferarri)) . WHile with a static method you must use the class name instead (Math.min(23,45,56)) .
