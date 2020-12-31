import common.TreasureBoxCommon;
import pojo.HashAndSecretNum;
import pojo.TreasureBox;

/**
 * 主函数，打开宝箱的启动类
 *
 * @author liuYunCai
 * @date 2020/12/31 15:38
 **/
public class TddGame {

	private static final int SIZE = 10;

	/**
	 * 打开宝箱的启动类
	 *
	 * @date 2020/12/31 15:38
	 **/
	public static void main(String[] args) {
		String lastHash = "0";
		for (int id = 1; id <= SIZE; id++) {
			System.out.println("正在打开宝箱" + id + "。。。。");
			String hashStr = id + "" + lastHash;
			HashAndSecretNum hashAndSecretNum = TreasureBoxCommon.getHashAndSecretNum(hashStr);
			lastHash = hashAndSecretNum.getHash();
			System.out.println("宝箱"+id+"的神秘数字为："+hashAndSecretNum.getSecretNum());
		}
	}
}
