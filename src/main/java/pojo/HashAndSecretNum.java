package pojo;

/**
 * hash和神秘数字类
 * @author liuYunCai
 * @date 2020/12/31 15:21
 **/
public class HashAndSecretNum {

	/**
	 * hash值
	 */
	private String hash;

	/**
	 * 神秘数字
	 */
	private Integer secretNum;

	public String getHash() {
		return hash;
	}

	public Integer getSecretNum() {
		return secretNum;
	}

	public HashAndSecretNum(String hash, Integer secretNum) {
		this.hash = hash;
		this.secretNum = secretNum;
	}

	@Override
	public String toString() {
		return "HashAndSecretNum{" +
				"hash='" + hash + '\'' +
				", secretNum=" + secretNum +
				'}';
	}
}
