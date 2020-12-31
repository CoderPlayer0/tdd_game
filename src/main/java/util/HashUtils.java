package util;

import org.apache.log4j.Logger;
import pojo.HashAndSecretNum;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * hash值工具类
 * @author liuYunCai
 * @date 2020/12/31 15:18
 **/
public class HashUtils {

	private static Logger logger = Logger.getLogger(HashUtils.class);
	/**
	 * 宝箱开启规则
	 */
	private static final String OPEN_RULE = "00000";

	public static HashAndSecretNum getHashAndSecretNum(String character){
		int secretNum = 0;
		String secretStr = secretNum + "";
		String hashStr = character + secretStr;
		StringBuilder stringBuilder = new StringBuilder();
		MessageDigest obj;
		byte[] encrypted;
		while (true) {
			stringBuilder.setLength(0);
			try {
				obj = MessageDigest.getInstance("SHA-256");
				encrypted = obj.digest(hashStr.getBytes("UTF-8"));
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
				return new HashAndSecretNum(stringBuilder.toString(),secretNum);
			} else {
				secretNum += 1;
			}
		}
	}
}
