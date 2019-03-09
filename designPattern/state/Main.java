/**
 * Description:
 *
 * @author houkepan
 * @date 2019/3/9 23:06
 */
public class Main {
    public static void main(String[] args) {
        VoteManager voteManager = new VoteManager();
        for (int i = 0; i < 9; i++) {
            voteManager.vote("user1", "A");
        }
    }
}
