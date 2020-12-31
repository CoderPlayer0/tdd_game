package util;

import org.apache.log4j.Logger;
import pojo.HashAndSecretNum;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * hash值工具类
 *
 * @author liuYunCai
 * @date 2020/12/31 15:18
 **/
public class HashUtils {

	/**
	 * 宝箱开启规则
	 */
	private static final String OPEN_RULE = "00000";

	/**
	 * 记录日志
	 */
	private static Logger logger = Logger.getLogger(HashUtils.class);

	/**
	 * 获取hash值和神秘数字
	 *
	 * @date 2020/12/31 16:41
	 * @param character 拼接字符串
	 * @return pojo.HashAndSecretNum
	 **/
	public static HashAndSecretNum getHashAndSecretNum(String character) {
		int secretNum = 0;
		String secretStr = secretNum + "";
		String hashStr = character + secretStr;
		StringBuilder stringBuilder = new StringBuilder();
		while (true) {
			stringBuilder.setLength(0);
			try {
				MessageDigest obj = MessageDigest.getInstance("SHA-256");
				byte[] encrypted = obj.digest(hashStr.getBytes("UTF-8"));
				for (byte b : encrypted) {
					stringBuilder.append(String.format("%02x", b));
				}
			} catch (NoSuchAlgorithmException e) {
				logger.error("无此算法");
				return null;
			} catch (UnsupportedEncodingException e) {
				logger.error("不支持的编码");
				return null;
			}
			String firstToFive = stringBuilder.toString().substring(0, 5);
			if (OPEN_RULE.equals(firstToFive)) {
				return new HashAndSecretNum(stringBuilder.toString(), secretNum);
			} else {
				secretNum += 1;
			}
		}
	}
}
