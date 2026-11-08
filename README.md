# debug-daily

A daily Java code-guessing game: every day there's a new code snippet, and you try to guess what it prints.

> Work in progress. The window and answer checking work, but the daily puzzles are still being added.

## How it works

1. Run the program and a window opens showing today's date.
2. Read the day's code snippet.
3. Type what you think the output is and press **Submit**.
4. The game tells you whether you got it right.

## Requirements

- Java JDK 11 or newer (the game uses Swing, which comes with the JDK)

## Running it

Download or clone the repo, then in the project folder run:

```bash
javac Framework.java HintTextField.java
java Framework
```

## Project files

| File | What it does |
|------|--------------|
| `Framework.java` | Main window, date display, and answer checking |
| `HintTextField.java` | Text field that shows gray hint text when empty |
| `prototype.java` | Early prototype of the game |

## Roadmap

- [ ] Show a real code snippet in the window
- [ ] Store a list of puzzles and pick one based on the date
- [ ] Give feedback on wrong answers
- [ ] Track streaks or scores

## About

Built by [f9ngs](https://github.com/f9ngs) as a learning project while studying Java.
