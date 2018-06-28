package behavior.chainofresponsibility.third;

public class ProjectManager extends Handler {

	@Override
	public String handleFeeRequest(String user, double fee) {
		String str = "";

		if (fee < 500) { // 项目经理可以审批500以内的费用
			if ("张三".equals(user)) { // 为了测试，简单点，只同意张三的请求
				str = "成功：项目经理同意【" + user + "】的聚餐费用申请，金额为" + fee + "元";
			} else {
				str = "失败：项目经理不同意【" + user + "】的聚餐费用申请，金额为" + fee + "元"; // 其他人一律不同意
			}
		} else {
			// 等于或超过500，传递给级别更高的人处理
			if (getHandler() != null) {
				return getHandler().handleFeeRequest(user, fee);
			}
		}

		return str;
	}
}
