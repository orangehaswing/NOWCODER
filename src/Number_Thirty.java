
public class Number_Thirty {

	public int exchangeOddEven(int x) {
		// 请编写程序交换一个数的二进制的奇数位和偶数位。（使用越少的指令越好）
		// 给定一个int x，请返回交换后的数int。
		// write code here
		//掩码提取奇数位和偶数位
		//左移、右移交换奇偶，相加或相与
		// 用0xAAAAAAAA与x相与求的奇数位上数字(偶数位上数字为0)
		// 用0x 55555555 与x相与求的偶数位上数字(奇数位上数字为0)

		return (((x & 0xaaaaaaaa) >> 1 | (x & 0x55555555) << 1));
	}
}
