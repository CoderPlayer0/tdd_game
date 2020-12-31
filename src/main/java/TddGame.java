import common.TreasureBoxCommon;
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
			TreasureBox treasureBox = TreasureBoxCommon.getTreasureBox(id, lastHash);
			if (treasureBox != null) {
				lastHash = treasureBox.getHashValue();
				System.out.println(treasureBox.toString());
			} else {
				System.out.println("当前宝箱未找到神秘数字，无法开启！");
			}
		}
	}
}
