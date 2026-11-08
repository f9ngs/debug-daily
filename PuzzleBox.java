import java.util.Random;

public class PuzzleBox {
    private Random random = new Random();

    private Puzzle[] puzzles = {
        // Puzzle 1
        new Puzzle(
            "int x = 5;
" +
            "x += 3;
" +
            "System.out.println(x * 2);",
            "16"),

        // Puzzle 2
        new Puzzle(
            "int total = 0;
" +
            "int i = 1;
" +
            "while (i <= 4) {
" +
            "    total += i;
" +
            "    i++;
" +
            "}
" +
            "System.out.println(total);",
            "10"),

        // Puzzle 3
        new Puzzle(
            "int a = 7;
" +
            "if (a % 2 == 0) {
" +
            "    System.out.println(\"even\");
" +
            "} else {
" +
            "    System.out.println(\"odd\");
" +
            "}",
            "odd"),

        // Puzzle 4
        new Puzzle(
            "int a = 7;
" +
            "int b = 2;
" +
            "System.out.println(a / b);",
            "3"),

        // Puzzle 5
        new Puzzle(
            "int a = 7;
" +
            "int b = 2;
" +
            "System.out.println(a % b);",
            "1"),

        // Puzzle 6
        new Puzzle(
            "int x = 5;
" +
            "int y = x++;
" +
            "System.out.println(x + \" \" + y);",
            "6 5"),

        // Puzzle 7
        new Puzzle(
            "int x = 5;
" +
            "int y = ++x;
" +
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
            "int n = 10;
" +
            "int count = 0;
" +
            "while (n > 0) {
" +
            "    n -= 3;
" +
            "    count++;
" +
            "}
" +
            "System.out.println(count);",
            "4"),

        // Puzzle 11
        new Puzzle(
            "int n = 10;
" +
            "while (n > 0) {
" +
            "    n -= 3;
" +
            "}
" +
            "System.out.println(n);",
            "-2"),

        // Puzzle 12
        new Puzzle(
            "int score = 75;
" +
            "if (score >= 90) {
" +
            "    System.out.println(\"A\");
" +
            "} else if (score >= 80) {
" +
            "    System.out.println(\"B\");
" +
            "} else if (score >= 70) {
" +
            "    System.out.println(\"C\");
" +
            "} else {
" +
            "    System.out.println(\"F\");
" +
            "}",
            "C"),

        // Puzzle 13
        new Puzzle(
            "int x = 3;
" +
            "if (x > 5)
" +
            "    System.out.println(\"big\");
" +
            "    System.out.println(\"done\");",
            "done"),

        // Puzzle 14
        new Puzzle(
            "int x = 10;
" +
            "x = x / 4;
" +
            "System.out.println(x * 4);",
            "8"),

        // Puzzle 15
        new Puzzle(
            "double d = 7 / 2;
" +
            "System.out.println(d);",
            "3.0"),

        // Puzzle 16
        new Puzzle(
            "int a = 4;
" +
            "int b = 6;
" +
            "if (a > 3 && b < 5) {
" +
            "    System.out.println(\"yes\");
" +
            "} else {
" +
            "    System.out.println(\"no\");
" +
            "}",
            "no"),

        // Puzzle 17
        new Puzzle(
            "int a = 4;
" +
            "int b = 6;
" +
            "if (a > 3 || b < 5) {
" +
            "    System.out.println(\"yes\");
" +
            "} else {
" +
            "    System.out.println(\"no\");
" +
            "}",
            "yes"),

        // Puzzle 18
        new Puzzle(
            "int i = 0;
" +
            "int sum = 0;
" +
            "while (i < 10) {
" +
            "    if (i % 2 == 0) {
" +
            "        sum += i;
" +
            "    }
" +
            "    i++;
" +
            "}
" +
            "System.out.println(sum);",
            "20"),

        // Puzzle 19
        new Puzzle(
            "int result = 1;
" +
            "int i = 1;
" +
            "while (i <= 5) {
" +
            "    result *= i;
" +
            "    i++;
" +
            "}
" +
            "System.out.println(result);",
            "120"),

        // Puzzle 20
        new Puzzle(
            "int x = 1;
" +
            "int steps = 0;
" +
            "while (x < 100) {
" +
            "    x *= 2;
" +
            "    steps++;
" +
            "}
" +
            "System.out.println(steps + \" \" + x);",
            "7 128"),

        // Puzzle 21
        new Puzzle(
            "int n = 4821;
" +
            "int sum = 0;
" +
            "while (n > 0) {
" +
            "    sum += n % 10;
" +
            "    n /= 10;
" +
            "}
" +
            "System.out.println(sum);",
            "15"),

        // Puzzle 22
        new Puzzle(
            "int n = 123;
" +
            "int rev = 0;
" +
            "while (n > 0) {
" +
            "    rev = rev * 10 + n % 10;
" +
            "    n /= 10;
" +
            "}
" +
            "System.out.println(rev);",
            "321"),

        // Puzzle 23
        new Puzzle(
            "int x = 2;
" +
            "if (x > 5);
" +
            "{
" +
            "    System.out.println(\"big\");
" +
            "}",
            "big"),

        // Puzzle 24
        new Puzzle(
            "int x = 2 + 3 * 4;
" +
            "System.out.println(x);",
            "14"),

        // Puzzle 25
        new Puzzle(
            "int a = 5;
" +
            "int b = 10;
" +
            "a = b;
" +
            "b = a;
" +
            "System.out.println(a + \" \" + b);",
            "10 10"),

        // Puzzle 26
        new Puzzle(
            "int a = 5;
" +
            "int b = 10;
" +
            "int temp = a;
" +
            "a = b;
" +
            "b = temp;
" +
            "System.out.println(a - b);",
            "5"),

        // Puzzle 27
        new Puzzle(
            "int i = 1;
" +
            "int count = 0;
" +
            "while (i <= 20) {
" +
            "    if (i % 3 == 0 || i % 5 == 0) {
" +
            "        count++;
" +
            "    }
" +
            "    i++;
" +
            "}
" +
            "System.out.println(count);",
            "9"),

        // Puzzle 28
        new Puzzle(
            "int x = 15;
" +
            "if (x > 10) {
" +
            "    x -= 5;
" +
            "}
" +
            "if (x > 5) {
" +
            "    x -= 5;
" +
            "}
" +
            "if (x > 0) {
" +
            "    x -= 5;
" +
            "}
" +
            "System.out.println(x);",
            "0"),

        // Puzzle 29
        new Puzzle(
            "int x = 15;
" +
            "if (x > 10) {
" +
            "    x -= 5;
" +
            "} else if (x > 5) {
" +
            "    x -= 5;
" +
            "} else if (x > 0) {
" +
            "    x -= 5;
" +
            "}
" +
            "System.out.println(x);",
            "10"),

        // Puzzle 30
        new Puzzle(
            "int i = 1;
" +
            "int total = 0;
" +
            "while (i <= 3) {
" +
            "    int j = 1;
" +
            "    while (j <= i) {
" +
            "        total++;
" +
            "        j++;
" +
            "    }
" +
            "    i++;
" +
            "}
" +
            "System.out.println(total);",
            "6")
    };

    public Puzzle getRandomPuzzle() {
        return puzzles[random.nextInt(puzzles.length)];
    }

    public int size() {
        return puzzles.length;
    }
}
