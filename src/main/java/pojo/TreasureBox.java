package pojo;

/**
 * 宝箱对象
 *
 * @author liuYunCai
 * @date 2020/12/31 14:59
 **/
public class TreasureBox {

	private int id;

	private String hashValue;

	private String lastHashValue;

	private Integer secretNum;

	public TreasureBox(Integer id, String hashValue, String lastHashValue, Integer secretNum) {
		this.id = id;
		this.hashValue = hashValue;
		this.lastHashValue = lastHashValue;
		this.secretNum = secretNum;
	}

	public String getHashValue() {
		return hashValue;
	}

	@Override
	public String toString() {
		return id + "号宝箱的神秘数字为：" + secretNum + "，已开启宝箱";
	}
}
