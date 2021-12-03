package de.beefcafe.streams;

import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class StreamsPlayground {

    public static void iterateUsingIterate(Collection values) {
        Iterator<String> iter = values.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
    }

    public static void iterateUsingForEach(Collection values) {
        for (Object o: values) {
            System.out.println(o);
        }
    }

    public static void iterateUsingStream (Collection<String> values) {
        // benutzt einen Lambda-Ausdruck ( " -> " )
        values.stream().forEach( o -> {
            System.out.println(o);
        });
    }

    public static void iterateUsingStreamExplicitLambda (Collection<String> values) {
        // das ist eine Lambda in expliziter Schreibweise!!!
        Consumer<String> consumer = new Consumer<String>() {
            @Override
            public void accept(String o) {
                System.out.println(o);
            }
        };
        values.stream().forEach(consumer);
    }

    public static void streamWithFilter (Collection<String> values) {
        values.stream()
                .filter( s -> s.startsWith("b"))
                .forEach(s -> System.out.println(s));
    }

    public static void streamWithMap (Collection<String> values) {
        values.stream()
                .map( s -> s.toUpperCase(Locale.ROOT))
                .forEach(s -> System.out.println(s));
    }

    public static void streamWithMultipleSteps (Collection<String> values) {
        values.stream()
                .filter( s -> s.startsWith("a") || s.startsWith("b"))
                .map( s -> s.substring(0, 1))
                .map( s -> s.toUpperCase(Locale.ROOT))
                .forEach(s -> System.out.println(s));
    }

    public static void streamStepsAnalyzed(Collection<String> values) {
        Stream<String> pipeline = values.stream();
        Stream<String> pipeline2 = pipeline.filter(s -> s.startsWith("a") || s.startsWith("b"));
        Stream<String> pipeline3 = pipeline2.map( s -> s.substring(0, 1));
        Stream<String> pipeline4 = pipeline3.map( s -> s.toUpperCase(Locale.ROOT));
        // appending a "terminal" operation will start the pipeline processing
        pipeline4.forEach(s -> {
            System.out.println(s);
        });
    }

    public static void streamStepsAnalyzedArray(Collection<String> values) {
        Stream<String> pipeline = values.stream();
        Stream<String> pipeline2 = pipeline.filter(s -> s.startsWith("a") || s.startsWith("b"));
        Stream<String> pipeline3 = pipeline2.map( s -> s.substring(0, 1));
        Stream<String> pipeline4 = pipeline3.map( s -> s.toUpperCase(Locale.ROOT));
        // appending a "terminal" operation will start the pipeline processing
        Object[] processedValues = pipeline4.toArray();
    }

/*    public static void streamFilterMapReduce(Collection<String> values) {
        values.stream()
                .filter(s -> s.startsWith("a") || s.startsWith("b"))
                .map(s -> s.length())
                .r
    }*/

    public static void main(String[] args) {
        Collection<String> myColl = Arrays.asList(new String [] {
                "apple",
                "banana",
                "strawberry",
                "straße"
        });
//        iterateUsingIterate(myColl);
//        iterateUsingForEach(myColl);
//        iterateUsingStream(myColl);
//        streamWithFilter(myColl);
//          iterateUsingStreamExplicitLambda(myColl);
//        streamWithMap(myColl);
//        streamWithMultipleSteps(myColl);
        streamStepsAnalyzed(myColl);
    }

}
