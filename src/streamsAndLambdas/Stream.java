package streamsAndLambdas;

import com.sun.tools.javac.util.List;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Optional;
import java.util.stream.IntStream;

// Collectors fun

public class Stream {

    public Stream() {
        IntStream.range(0, 1000)
                .filter(s -> s < 100)
                .forEach(System.out::println);

    }
}

//Optional<FileInputStream> fis =
//                names.stream().filter(name -> !isProcessedYet(name))
//                        .findFirst()
//                        .map(name -> new FileInputStream(name));