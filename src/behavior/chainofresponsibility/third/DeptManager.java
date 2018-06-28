package behavior.chainofresponsibility.third;

public class DeptManager extends Handler {

	@Override
	public String handleFeeRequest(String user, double fee) {
		String str = "";

		if (fee >= 500 && fee < 1000) { // 部门经理可以审批1000以内的费用
			if ("张三".equals(user)) { // 为了测试，简单点，只同意张三的请求
				str = "成功：部门经理同意【" + user + "】的聚餐费用申请，金额为" + fee + "元";
			} else {
				str = "失败：部门经理不同意【" + user + "】的聚餐费用申请，金额为" + fee + "元"; // 其他人一律不同意
			}
		} else {
			// 等于或超过1000，传递给级别更高的人处理
			if (getHandler() != null) {
				return getHandler().handleFeeRequest(user, fee);
			}
		}

		return str;
	}
}
