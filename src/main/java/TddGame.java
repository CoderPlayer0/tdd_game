import common.TreasureBoxCommon;
import pojo.HashAndSecretNum;
import pojo.TreasureBox;
import util.HashUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * 主函数，打开宝箱的启动类
 * @author liuYunCai
 * @date 2020/12/31 15:38
 **/
public class TddGame {

	private static final int DEFAULT_SIZE = 10;

	/**
	 * 打开宝箱的启动类
	 * @author liuYunCai
	 * @date 2020/12/31 15:38
	 **/
	public static void main(String[] args){
		List<TreasureBox> result = new ArrayList<TreasureBox>(DEFAULT_SIZE);
		String lastHash = "0";
		for(int id=1;id<=10;id++){
			if(id!=1){
				lastHash = result.get(id-2).getHashValue();
			}
			TreasureBox treasureBox = TreasureBoxCommon.getTreasureBox(id, lastHash);
			if(treasureBox!=null){
				System.out.println(treasureBox.toString());
			}else{
				System.out.println("打开失败！");
			}
			result.add(treasureBox);
		}
	}
}
