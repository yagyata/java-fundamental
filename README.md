What is Java?
Java is a high level, object oriented programming language. Java is platform independent through the use of Java Virtual Machine(JVM). It follows the WORA principle -”Write Once, Run Anywhere”, meaning that Java applications can run on any system that supports the JVM without requiring modifications

Some key features of Java:
Object-Oriented: Java is based on OOP principles including Classes, Objects, Inheritance, Polymorphism, Encapsulation, and Abstraction. It allows reusability and ease of maintenance.
Platform Independent: Since Java code is compiled into byte code, which can run on any system with a Java Virtual Machine (JVM)
Secure: Java has many built-in security features for example: bytecode verification, security manager and also a set of APIs for encryption so that there is no unauthorized access or any other security threats.
Robust: Error checking, runtime checking, memory management through garbage collection and exception handling.
Multithreaded: Java supports simutaneous execution of multiple threads, allowing many tasks to be performed simultaneously.
Interpreted and Compiled: Java source code is compiled into bytecode, which is then interpreted or compiled at runtime by the JVM.

public class HelloWorld {
public: Access modifier allowing the class to be accessible from anywhere
class: Keyword for class
HelloWorld: Name of the class

public static void main(String[] args) {
public:  Access modifier allowing the method to be accessible from anywhere
static: A keyword indicating that the method belongs to the class, not the instances of the class.
void: Method’s return type, void doesn’t return any value.
main: Name of the method, it is the entry point of any Java program
String[] args: The parameter for the main method. It is an array of strings that stores command-line arguments.

System.out.println(“Hello World”);
System: A predefined class that provides access to the system.
out: Representing the standard output stream, also a static member of System class.
println: Method of the PrintStream class that prints a line of text to the console
“Hello World”: The string to be printed.

1) Java Development Kit (JDK)
JDK includes all the development tools needed to develop a java program. JDK is mostly required by the developers.
Components of JDK: Java Compiler (javac), Java Runtime Environment(JRE), Java Debugger (jdb), Java Archive(jar), Documentation Generator(Javadoc), Class file disassembler(javap)

2) Java Virtual Machine (JVM)
It's an abstract computing machine that enables a computer to run a Java program, It is a runtime environment for Java bytecode, ensuring that the same code can be executed on any platform that has a compatible JVM.
Components of JVM: Class Loader, Bytecode Verifier, Interpreter, Just-in-time(JIT) Compiler, Garbage Collector, Runtime

3) Java Runtime Environment (JRE)
The JRE provides the libraries, Java Virtual Machine (JVM), and other components to run applications written in Java. It does not contain development tools like compilers or debuggers. It is the implementation of the JVM.

