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
	 * 宝箱开启规则
	 */
	private static final String OPEN_RULE = "00000";

	/**
	 * 根据宝箱编号打开宝箱
	 *
	 * @param strVal 组装字符串
	 * @return 宝箱
	 * @date 2020/12/31 15:41
	 **/
	public static HashAndSecretNum getHashAndSecretNum(String strVal) {
		int index = 1;
		String hashVal = "";
		while(true){
			strVal = strVal + index;
			hashVal = HashUtils.getHashAndSecretNum(strVal);
			if(hashVal!=null && hashVal.startsWith(OPEN_RULE)){
				break;
			}
			index++;
		}
		return new HashAndSecretNum(hashVal, index);
	}
}
