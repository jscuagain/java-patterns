package behavior.state.example;

/**
 * 上黑名单
 */
public class BlackVoteState implements VoteState {

	@Override
	public void vote(String user, String voteItem, VoteManager voteManager) {
		// 记入黑名单，禁止登录和使用投票系统
		System.out.println("记入黑名单，禁止登录和使用投票系统");
	}

}
