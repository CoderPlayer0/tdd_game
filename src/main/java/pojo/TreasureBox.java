package pojo;

import java.sql.Timestamp;

/**
 * 宝箱对象
 *
 * @author liuYunCai
 * @date 2020/12/31 14:59
 **/
public class TreasureBox {

	private Integer id;

	private Timestamp timestamp;

	private String hashValue;

	private String lastHashValue;

	private int secretNum;

	private String status;



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
