public class Puzzle {
    private String code;
    private String answer;

    public Puzzle(String code, String answer) {
        this.code = code;
        this.answer = answer;
    }

    public String getCode() {
        return code;
    }

    public boolean isCorrect(String guess) {
        return answer.equalsIgnoreCase(guess.trim());
    }
}
