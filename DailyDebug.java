import javax.swing.*;
import java.awt.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DailyDebug {
    static String answer = "a";
    public static void main(String[] args) {
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

        JFrame frame = new JFrame("DailyDebug");
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());
        JLabel weclome = new JLabel("Hello, today's date is " + day + suffix + " of " + month + " " + today.getYear() + ".");
        JLabel givePuzzle = new JLabel("Here's today's puzzle. Good luck!\n");
        HintTextField submit = new HintTextField("give your answer", 30);
        JButton button = new JButton("Submit");
        button.addActionListener(e -> { answer = submit.getText();
            if (answer.equals("example")) {
                JLabel congrats = new JLabel("Correct Answer!");
                frame.add(congrats);
                frame.setVisible(true);
            }
        });
        frame.add(button);
        frame.add(weclome);
        frame.add(givePuzzle);
        frame.add(submit);
        frame.setVisible(true);

    }}
