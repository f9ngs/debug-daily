# debug-daily

A Java code-guessing game: you see a short code snippet and try to guess what it prints.

> 🎓 **This is a learning project, not a serious one.** I made it to practice Java while studying, so expect rough edges, simple code, and the occasional bug. It's just for fun.

## Download and play

1. Go to the [Releases page](https://github.com/f9ngs/debug-daily/releases).
2. Download `DailyDebug.jar`.
3. Double-click it to play.

You need [Java](https://adoptium.net/) 11 or newer installed. If double-clicking doesn't work, open a terminal in the folder with the file and run:

```bash
java -jar DailyDebug.jar
```

## How to play

1. A window opens showing today's date and a code snippet.
2. Work out what the code prints.
3. Type your answer and press **Submit** (or hit Enter).
4. The game tells you if you're right.

Answers are checked ignoring capital letters and spaces at the start and end, but they have to match the output exactly otherwise. For example, if the code prints `6 5`, type `6 5`.

There are 30 puzzles covering variables, `if`/`else`, `while` loops, and a few tricky cases. A random one is picked each time you start the game.

## Run from source

Clone or download the repo, then in the project folder run:

```bash
javac *.java
java DailyDebug
```

## Project files

| File | What it does |
|------|--------------|
| `DailyDebug.java` | The game window and answer checking |
| `Puzzle.java` | One puzzle: its code snippet and correct answer |
| `PuzzleBox.java` | Holds all 30 puzzles and picks a random one |
| `HintTextField.java` | Text field that shows gray hint text when empty |
| `OldPrototype.java` | Early prototype, kept for reference |

## Adding your own puzzles

Open `PuzzleBox.java` and add another entry to the list, with a comma after the previous one:

```java
new Puzzle(
    "int x = 4;\n" +
    "System.out.println(x * 3);",
    "12")
```

The first part is the code shown to the player and the last part is the answer.

## Roadmap

- [x] Show a code snippet in the window
- [x] Store a list of puzzles
- [x] Feedback on right and wrong answers
- [x] Playable `.jar` download
- [ ] One puzzle per day instead of a random one
- [ ] Streaks and scores
- [ ] More puzzles

## About

I'm a first-year CS student, and I built this project to learn Java and practice things like classes, loops, and building a simple window with Swing. It isn't meant to be a polished or serious game, and I'm still learning, so the code isn't perfect. Feedback and suggestions are welcome, but please go easy on me!

Built by [f9ngs](https://github.com/f9ngs).
