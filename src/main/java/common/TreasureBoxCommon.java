package common;

import pojo.HashAndSecretNum;
import pojo.TreasureBox;
import util.HashUtils;

/**
 * 打开宝箱
 *
 * @author liuYunCai
 * @date 2020/12/31 15:37
 **/
public class TreasureBoxCommon {

	/**
	 * 根据宝箱编号打开宝箱
	 *
	 * @param id 宝箱编号
	 * @return 宝箱
	 * @date 2020/12/31 15:41
	 **/
	public static TreasureBox getTreasureBox(int id, String lastHash) {
		String hashStr = id + "" + lastHash;
		HashAndSecretNum hashAndSecretNum = HashUtils.getHashAndSecretNum(hashStr);
		if (hashAndSecretNum != null) {
			return new TreasureBox(id, hashAndSecretNum.getHash(), lastHash, hashAndSecretNum.getSecretNum());
		}
		return null;
	}
}
