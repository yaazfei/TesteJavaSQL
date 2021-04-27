package questao2;

import java.util.stream.IntStream;

public class Main {

	public static void main(String [] args) {

        IntStream.range(1, 100)
                .filter(number -> {
                    System.out.println("");
                    return printOrTrue(number, 3, "Foo") & printOrTrue(number, 5, "Bar");
                })
                .forEach(System.out::print);
    }

    private static boolean printOrTrue(Integer number, Integer module, String name) {
        boolean result = true;
        if(number % module == 0) {
            System.out.print(name);
            result = false;
        }
        return result;
    }
}
