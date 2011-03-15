package net.orfjackal.examples;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * A Java class like this is needed for IntelliJ IDEA's JUnit plugin to find tests written in Scala.
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
        FibonacciSpec.class,
        StackSpec.class
})
public class ExampleSpecs {
}
