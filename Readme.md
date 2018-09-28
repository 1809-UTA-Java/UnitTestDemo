Javac takes two arguments: directory for bin and the classpath for all Junit related imports. 
>javac -d bin -cp lib/junit*.jar src/*.java

Java here takes classpath with multiple arguments: the location of the compiled classes (bin), the location of junit (junit-4.10.jar), and the location of hamcrest (hamcrest-core-1.3.jar), separated by (:), then it runs org.junit.runner.JUnitCore with CalculatorTest as the argument.
java -cp bin:lib/junit-4.10.jar:lib/hamcrest-core-1.3.jar org.junit.runner.JUnitCore CalculatorTest