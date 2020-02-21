
public class TennisGame1 implements TennisGame {

    private Player player1;
    private Player player2;


    public TennisGame1(String player1Name, String player2Name) {
        player1 = new Player(0, player1Name);
        player2 = new Player(0, player2Name);
    }

    public void wonPoint(String playerName) {
        if (playerName == "player1") {
            player1.Won();
        } else {
            player2.Won();
        }
    }

    public String getScore() {
        if (isSameScore()) {
            return getSameScore();
        } else if (isWinOrAdvantageScore()) {
            return getWinOrAdvantageScore();
        }
        return getInProgressScore();
    }

    private boolean isSameScore() {
        return player1.m_score == player2.m_score;
    }

    private boolean isWinOrAdvantageScore() {
        return player1.m_score >= 4 || player2.m_score >= 4;
    }

    private String getSameScore() {
        if (player1.m_score == 0) {
            return "Love-All";
        }

        if (player1.m_score == 1) {
            return "Fifteen-All";
        }

        if (player1.m_score == 2) {
            return "Thirty-All";
        }
        return "Deuce";
    }

    private String getWinOrAdvantageScore() {
        String score;
        int minusResult = player1.m_score - player2.m_score;
        if (minusResult == 1) return "Advantage " + player1.playerName;
        else if (minusResult == -1) return "Advantage " + player2.playerName;
        else if (minusResult >= 2) return "Win for " + player1.playerName;
        return "Win for " + player2.playerName;

    }

    private String getInProgressScore() {
        String score = "";
        score += player1.getScoreName();
        score += "-";
        score += player2.getScoreName();
        return score;
    }

}
