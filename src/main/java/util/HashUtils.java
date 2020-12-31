package util;

import org.apache.log4j.Logger;

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
	 * 记录日志
	 */
	private static Logger logger = Logger.getLogger(HashUtils.class);

	/**
	 * UTF-8
	 */
	private static final String UTF_8 = "utf-8";

	/**
	 * SHA-256
	 */
	private static final String SHA_256 = "SHA-256";


	/**
	 * 获取hash值和神秘数字
	 *
	 * @date 2020/12/31 16:41
	 * @param character 拼接字符串
	 * @return Hash值
	 **/
	public static String getHashAndSecretNum(String character) {
		byte[] bytes;
		String result;
		try {
			bytes = character.getBytes(UTF_8);
			MessageDigest messageDigest = MessageDigest.getInstance(SHA_256);
			messageDigest.update(bytes);
			result = byte2Hex(messageDigest.digest());
		} catch (NoSuchAlgorithmException e) {
			logger.error("无此算法");
			return null;
		} catch (UnsupportedEncodingException e) {
			logger.error("不支持的编码");
			return null;
		}
		return result;
	}

	/**
	 * 将byte转为16进制
	 * @date 2020/12/31 17:10
	 * @param  bytes 字符数组
	 * @return java.lang.String
	 **/
	private static String byte2Hex(byte[] bytes) {
		StringBuilder stringBuilder = new StringBuilder();
		for(byte b: bytes){
			String temp = Integer.toHexString(b & 0xFF);
			if (temp.length() == 1) {
				stringBuilder.append("0");
			}
			stringBuilder.append(temp);
		}
		return stringBuilder.toString();
	}
}
