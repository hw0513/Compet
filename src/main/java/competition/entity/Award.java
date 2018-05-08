package competition.entity;


public class Award {
    private String id;
    private Message_board message_board;
    private User player;
    private String lev;
    private Integer playernum;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Message_board getMessage_board() {
        return message_board;
    }

    public void setMessage_board(Message_board message_board) {
        this.message_board = message_board;
    }

    public User getPlayer() {
        return player;
    }

    public void setPlayer(User player) {
        this.player = player;
    }

    public String getLev() {
        return lev;
    }

    public void setLev(String lev) {
        this.lev = lev;
    }

    public Integer getPlayernum() {
        return playernum;
    }

    public void setPlayernum(Integer playernum) {
        this.playernum = playernum;
    }

    @Override
    public String toString() {
        return "Award{" +
                "id='" + id + '\'' +
                ", message_board=" + message_board +
                ", player=" + player +
                ", lev='" + lev + '\'' +
                ", playernum=" + playernum +
                '}';
    }
}
