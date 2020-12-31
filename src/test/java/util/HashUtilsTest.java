package util;

import common.TreasureBoxCommon;
import org.junit.Assert;
import org.junit.Test;
import pojo.HashAndSecretNum;

/**
 * hash工具类测试
 *
 * @author liuYunCai
 * @date 2020/12/31 15:30
 **/
public class HashUtilsTest {

	@Test
	public void getHashAndSecretNumTest() {
		String hashStr = 1 + "" + "0" + 1;
		HashAndSecretNum hashAndSecretNum = TreasureBoxCommon.getHashAndSecretNum(hashStr);
		Assert.assertEquals("算法有误",hashAndSecretNum.getSecretNum(),26937);
	}
}
