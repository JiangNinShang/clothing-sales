package main.tool;

import org.apache.shiro.crypto.hash.SimpleHash;

import main.domin.Admin;


public class PasswordHelper {

	public static final String ALGORITHM_NAME = "md5"; // 基础散列算法
	public static final int HASH_ITERATIONS = 1; // 散列次数

	public static void gainPassword(Admin admin) {
		String salt = new SimpleHash(ALGORITHM_NAME, admin.getPassword(), null, HASH_ITERATIONS).toString();
		admin.setSalt(salt);
	}

}
