import javax.swing.*;
import java.awt.*;

class HintTextField extends JTextField {
    private String hint;

    public HintTextField(String hint, int columns) {
        super(columns);
        this.hint = hint;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (getText().isEmpty()) {
            g.setColor(Color.GRAY);
            g.setFont(getFont());
            int y = getHeight() / 2 + g.getFontMetrics().getAscent() / 2 - 2;
            g.drawString(hint, getInsets().left + 2, y);
        }
    }
}