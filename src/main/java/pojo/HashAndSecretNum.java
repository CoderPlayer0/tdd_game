package pojo;

/**
 * hash和神秘数字类
 *
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
	private int secretNum;

	public HashAndSecretNum(String hash, int secretNum) {
		this.hash = hash;
		this.secretNum = secretNum;
	}

	public String getHash() {
		return hash;
	}

	public int getSecretNum() {
		return secretNum;
	}

	@Override
	public String toString() {
		return "HashAndSecretNum{" +
				"hash='" + hash + '\'' +
				", secretNum=" + secretNum +
				'}';
	}
}
