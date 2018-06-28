package behavior.chainofresponsibility.third;

public class GeneralManager extends Handler {

	@Override
	public String handleFeeRequest(String user, double fee) {
		String str = "";

		if (fee >= 1000) { // 部门经理可以审批1000及以上的费用
			if ("张三".equals(user)) { // 为了测试，简单点，只同意张三的请求
				str = "成功：总经理同意【" + user + "】的聚餐费用申请，金额为" + fee + "元";
			} else {
				str = "失败：总经理不同意【" + user + "】的聚餐费用申请，金额为" + fee + "元"; // 其他人一律不同意
			}
		} else {
			// 如果还有下一个处理请求的对象，继续传递
			if (getHandler() != null) {
				return getHandler().handleFeeRequest(user, fee);
			}
		}

		return str;
	}
}
