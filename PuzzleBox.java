import java.util.Random;

public class PuzzleBox {
    private Random random = new Random();

    private Puzzle[] puzzles = {
        // Puzzle 1
        new Puzzle(
            "int x = 5;\n" +
            "x += 3;\n" +
            "System.out.println(x * 2);",
            "16"),

        // Puzzle 2
        new Puzzle(
            "int total = 0;\n" +
            "int i = 1;\n" +
            "while (i <= 4) {\n" +
            "    total += i;\n" +
            "    i++;\n" +
            "}\n" +
            "System.out.println(total);",
            "10"),

        // Puzzle 3
        new Puzzle(
            "int a = 7;\n" +
            "if (a % 2 == 0) {\n" +
            "    System.out.println(\"even\");\n" +
            "} else {\n" +
            "    System.out.println(\"odd\");\n" +
            "}",
            "odd"),

        // Puzzle 4
        new Puzzle(
            "int a = 7;\n" +
            "int b = 2;\n" +
            "System.out.println(a / b);",
            "3"),

        // Puzzle 5
        new Puzzle(
            "int a = 7;\n" +
            "int b = 2;\n" +
            "System.out.println(a % b);",
            "1"),

        // Puzzle 6
        new Puzzle(
            "int x = 5;\n" +
            "int y = x++;\n" +
            "System.out.println(x + \" \" + y);",
            "6 5"),

        // Puzzle 7
        new Puzzle(
            "int x = 5;\n" +
            "int y = ++x;\n" +
            "System.out.println(x + \" \" + y);",
            "6 6"),

        // Puzzle 8
        new Puzzle(
            "System.out.println(1 + 2 + \"3\");",
            "33"),

        // Puzzle 9
        new Puzzle(
            "System.out.println(\"1\" + 2 + 3);",
            "123"),

        // Puzzle 10
        new Puzzle(
            "int n = 10;\n" +
            "int count = 0;\n" +
            "while (n > 0) {\n" +
            "    n -= 3;\n" +
            "    count++;\n" +
            "}\n" +
            "System.out.println(count);",
            "4"),

        // Puzzle 11
        new Puzzle(
            "int n = 10;\n" +
            "while (n > 0) {\n" +
            "    n -= 3;\n" +
            "}\n" +
            "System.out.println(n);",
            "-2"),

        // Puzzle 12
        new Puzzle(
            "int score = 75;\n" +
            "if (score >= 90) {\n" +
            "    System.out.println(\"A\");\n" +
            "} else if (score >= 80) {\n" +
            "    System.out.println(\"B\");\n" +
            "} else if (score >= 70) {\n" +
            "    System.out.println(\"C\");\n" +
            "} else {\n" +
            "    System.out.println(\"F\");\n" +
            "}",
            "C"),

        // Puzzle 13
        new Puzzle(
            "int x = 3;\n" +
            "if (x > 5)\n" +
            "    System.out.println(\"big\");\n" +
            "    System.out.println(\"done\");",
            "done"),

        // Puzzle 14
        new Puzzle(
            "int x = 10;\n" +
            "x = x / 4;\n" +
            "System.out.println(x * 4);",
            "8"),

        // Puzzle 15
        new Puzzle(
            "double d = 7 / 2;\n" +
            "System.out.println(d);",
            "3.0"),

        // Puzzle 16
        new Puzzle(
            "int a = 4;\n" +
            "int b = 6;\n" +
            "if (a > 3 && b < 5) {\n" +
            "    System.out.println(\"yes\");\n" +
            "} else {\n" +
            "    System.out.println(\"no\");\n" +
            "}",
            "no"),

        // Puzzle 17
        new Puzzle(
            "int a = 4;\n" +
            "int b = 6;\n" +
            "if (a > 3 || b < 5) {\n" +
            "    System.out.println(\"yes\");\n" +
            "} else {\n" +
            "    System.out.println(\"no\");\n" +
            "}",
            "yes"),

        // Puzzle 18
        new Puzzle(
            "int i = 0;\n" +
            "int sum = 0;\n" +
            "while (i < 10) {\n" +
            "    if (i % 2 == 0) {\n" +
            "        sum += i;\n" +
            "    }\n" +
            "    i++;\n" +
            "}\n" +
            "System.out.println(sum);",
            "20"),

        // Puzzle 19
        new Puzzle(
            "int result = 1;\n" +
            "int i = 1;\n" +
            "while (i <= 5) {\n" +
            "    result *= i;\n" +
            "    i++;\n" +
            "}\n" +
            "System.out.println(result);",
            "120"),

        // Puzzle 20
        new Puzzle(
            "int x = 1;\n" +
            "int steps = 0;\n" +
            "while (x < 100) {\n" +
            "    x *= 2;\n" +
            "    steps++;\n" +
            "}\n" +
            "System.out.println(steps + \" \" + x);",
            "7 128"),

        // Puzzle 21
        new Puzzle(
            "int n = 4821;\n" +
            "int sum = 0;\n" +
            "while (n > 0) {\n" +
            "    sum += n % 10;\n" +
            "    n /= 10;\n" +
            "}\n" +
            "System.out.println(sum);",
            "15"),

        // Puzzle 22
        new Puzzle(
            "int n = 123;\n" +
            "int rev = 0;\n" +
            "while (n > 0) {\n" +
            "    rev = rev * 10 + n % 10;\n" +
            "    n /= 10;\n" +
            "}\n" +
            "System.out.println(rev);",
            "321"),

        // Puzzle 23
        new Puzzle(
            "int x = 2;\n" +
            "if (x > 5);\n" +
            "{\n" +
            "    System.out.println(\"big\");\n" +
            "}",
            "big"),

        // Puzzle 24
        new Puzzle(
            "int x = 2 + 3 * 4;\n" +
            "System.out.println(x);",
            "14"),

        // Puzzle 25
        new Puzzle(
            "int a = 5;\n" +
            "int b = 10;\n" +
            "a = b;\n" +
            "b = a;\n" +
            "System.out.println(a + \" \" + b);",
            "10 10"),

        // Puzzle 26
        new Puzzle(
            "int a = 5;\n" +
            "int b = 10;\n" +
            "int temp = a;\n" +
            "a = b;\n" +
            "b = temp;\n" +
            "System.out.println(a - b);",
            "5"),

        // Puzzle 27
        new Puzzle(
            "int i = 1;\n" +
            "int count = 0;\n" +
            "while (i <= 20) {\n" +
            "    if (i % 3 == 0 || i % 5 == 0) {\n" +
            "        count++;\n" +
            "    }\n" +
            "    i++;\n" +
            "}\n" +
            "System.out.println(count);",
            "9"),

        // Puzzle 28
        new Puzzle(
            "int x = 15;\n" +
            "if (x > 10) {\n" +
            "    x -= 5;\n" +
            "}\n" +
            "if (x > 5) {\n" +
            "    x -= 5;\n" +
            "}\n" +
            "if (x > 0) {\n" +
            "    x -= 5;\n" +
            "}\n" +
            "System.out.println(x);",
            "0"),

        // Puzzle 29
        new Puzzle(
            "int x = 15;\n" +
            "if (x > 10) {\n" +
            "    x -= 5;\n" +
            "} else if (x > 5) {\n" +
            "    x -= 5;\n" +
            "} else if (x > 0) {\n" +
            "    x -= 5;\n" +
            "}\n" +
            "System.out.println(x);",
            "10"),

        // Puzzle 30
        new Puzzle(
            "int i = 1;\n" +
            "int total = 0;\n" +
            "while (i <= 3) {\n" +
            "    int j = 1;\n" +
            "    while (j <= i) {\n" +
            "        total++;\n" +
            "        j++;\n" +
            "    }\n" +
            "    i++;\n" +
            "}\n" +
            "System.out.println(total);",
            "6")
    };

    public Puzzle getRandomPuzzle() {
        return puzzles[random.nextInt(puzzles.length)];
    }
}
