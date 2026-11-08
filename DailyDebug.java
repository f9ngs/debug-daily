import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DailyDebug {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> createAndShowGui());
    }

    private static void createAndShowGui() {
        LocalDate today = LocalDate.now();
        int day = today.getDayOfMonth();
        String suffix;

        if (day >= 11 && day <= 13) {
            suffix = "th";
        } else if (day % 10 == 1) {
            suffix = "st";
        } else if (day % 10 == 2) {
            suffix = "nd";
        } else if (day % 10 == 3) {
            suffix = "rd";
        } else {
            suffix = "th";
        }

        String month = today.format(DateTimeFormatter.ofPattern("MMMM"));

        PuzzleBox box = new PuzzleBox();
        Puzzle puzzle = box.getRandomPuzzle();

        JFrame frame = new JFrame("DailyDebug");
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        JLabel welcome = new JLabel(
            "Hello, today's date is " + day + suffix + " of " + month + " " + today.getYear() + ".",
            SwingConstants.CENTER);
        JLabel givePuzzle = new JLabel(
            "Here's today's puzzle. What does it print? Good luck!",
            SwingConstants.CENTER);

        JPanel top = new JPanel(new GridLayout(2, 1));
        top.add(welcome);
        top.add(givePuzzle);

        JTextArea codeArea = new JTextArea(puzzle.getCode());
        codeArea.setEditable(false);
        codeArea.setFont(new Font("Monospaced", Font.PLAIN, 16));
        codeArea.setMargin(new Insets(10, 10, 10, 10));
        JScrollPane scrollPane = new JScrollPane(codeArea);

        HintTextField answerField = new HintTextField("give your answer", 20);
        JButton button = new JButton("Submit");
        JLabel result = new JLabel(" ", SwingConstants.CENTER);

        ActionListener checkAnswer = e -> {
            if (puzzle.isCorrect(answerField.getText())) {
                result.setForeground(new Color(0, 130, 0));
                result.setText("Correct Answer!");
            } else {
                result.setForeground(Color.RED);
                result.setText("Not quite, try again!");
            }
        };
        button.addActionListener(checkAnswer);
        answerField.addActionListener(checkAnswer);

        JPanel inputRow = new JPanel(new FlowLayout());
        inputRow.add(answerField);
        inputRow.add(button);

        JPanel bottom = new JPanel(new GridLayout(2, 1));
        bottom.add(inputRow);
        bottom.add(result);

        frame.add(top, BorderLayout.NORTH);
        frame.add(scrollPane, BorderLayout.CENTER);
        frame.add(bottom, BorderLayout.SOUTH);

        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
