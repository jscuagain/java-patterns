package establish.prototype.deepclone;

import java.io.IOException;

/**
 * 齐天大圣
 */
public class TheGreatestSage {

	private Monkey monkey = new Monkey();

	public void change() throws IOException, ClassNotFoundException {
		Monkey copyMonkey = (Monkey) monkey.deepClone(); // 通过深克隆得到克隆大圣
		System.out.println("大圣本尊的生日是：" + monkey.getBirthDate());
		System.out.println("克隆大圣的生日是：" + copyMonkey.getBirthDate());
		System.out.println("大圣本尊跟克隆大圣是否为同一个对象：" + (monkey == copyMonkey));
		System.out.println("大圣本尊持有的金箍棒跟克隆大圣持有的金箍棒是否为同一个对象："
				+ (monkey.getStaff() == copyMonkey.getStaff()));
	}

}
