public class Player {

    public int m_score;
    public String playerName;

    public Player(int m_score, String playerName) {
        this.m_score = m_score;
        this.playerName = playerName;

    }

    public String getScoreName() {

        if (m_score == 0) {
            return new TennisScore(m_score).name();
        }

        if (m_score == 1) {
            return "Fifteen";
        }

        if (m_score == 2) {
            return "Thirty";
        }

        return "Forty";
    }

    void Won() {
        m_score += 1;
    }
}
