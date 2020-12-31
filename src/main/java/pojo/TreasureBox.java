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

	private String status;

	public TreasureBox(Integer id, String hashValue, String lastHashValue, Integer secretNum, String status) {
		this.id = id;
		this.hashValue = hashValue;
		this.lastHashValue = lastHashValue;
		this.secretNum = secretNum;
		this.status = status;
	}

	public int getId() {
		return id;
	}

	public String getHashValue() {
		return hashValue;
	}

	public String getLastHashValue() {
		return lastHashValue;
	}

	public Integer getSecretNum() {
		return secretNum;
	}

	public String getStatus() {
		return status;
	}

	@Override
	public String toString() {
		return id + "号宝箱的神秘数字为：" + secretNum;
	}
}
