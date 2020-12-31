package pojo;

import java.sql.Timestamp;

/**
 * 宝箱对象
 *
 * @author liuYunCai
 * @date 2020/12/31 14:59
 **/
public class TreasureBox {

	private int id;

	private Long timestamp;

	private String hashValue;

	private String lastHashValue;

	private Integer secretNum;

	private String status;

	public int getId() {
		return id;
	}

	public Long getTimestamp() {
		return timestamp;
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

	public TreasureBox(Integer id, Long timestamp, String hashValue, String lastHashValue, Integer secretNum, String status) {
		this.id = id;
		this.timestamp = timestamp;
		this.hashValue = hashValue;
		this.lastHashValue = lastHashValue;
		this.secretNum = secretNum;
		this.status = status;
	}

	@Override
	public String toString() {
		return "pojo.TreasureBox{" +
				"id=" + id +
				", timestamp=" + timestamp +
				", hashValue='" + hashValue + '\'' +
				", lastHashValue='" + lastHashValue + '\'' +
				", secretNum=" + secretNum +
				", status='" + status + '\'' +
				'}';
	}
}
