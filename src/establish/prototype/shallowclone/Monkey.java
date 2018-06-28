package establish.prototype.shallowclone;

import java.util.Date;

/**
 * 大圣本尊
 */
public class Monkey implements Cloneable {

	private int height; // 身高
	private int weight; // 体重
	private Date birthDate; // 出生日期
	private GoldRingedStaff staff; // 金箍棒

	public Monkey() {
		birthDate = new Date();
		staff = new GoldRingedStaff();
	}

	/**
	 * 浅克隆
	 */
	public Object shallowClone() {
		Monkey temp = null;
		try {
			temp = (Monkey) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		} finally {
			return temp;
		}
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public GoldRingedStaff getStaff() {
		return staff;
	}

	public void setStaff(GoldRingedStaff staff) {
		this.staff = staff;
	}

}
