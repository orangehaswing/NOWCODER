import java.util.ArrayList;


public class Number_Seventeen {
    public ArrayList<Integer> asylum(int[][] ope) {
		// 有家动物收容所只收留猫和狗，但有特殊的收养规则，收养人有两种收养方式，
		// 第一种为直接收养所有动物中最早进入收容所的，
		// 第二种为选择收养的动物类型（猫或狗），并收养该种动物中最早进入收容所的。
		// 给定一个操作序列int[][2] ope(C++中为vector<vector<int>>)代表所有事件。
		// 若第一个元素为1，则代表有动物进入收容所，第二个元素为动物的编号，
		// 正数代表狗，负数代表猫；若第一个元素为2，则代表有人收养动物，第二个元素若为0，
		// 则采取第一种收养方式，若为1，则指定收养狗，若为-1则指定收养猫。
		// 请按顺序返回收养的序列。若出现不合法的操作，即没有可以符合领养要求的动物，
		// 则将这次领养操作忽略。
        // write code here
    	
    	//存放正负数，即ope[i][1],收养动物是猫还是狗
    	ArrayList<Integer> animal = new ArrayList<Integer>();
    	//存放最终收养结果
    	ArrayList<Integer> result = new ArrayList<Integer>();
    	for (int i = 0; i < ope.length; i++) {
			switch (ope[i][0]) {
			case 1:
				//动物进入收容所，统一放到一个ArrayList中
				animal.add(ope[i][1]);
				break;
			case 2:
				if(ope[i][1] == 0) {
					//第一种方法收养，直接取出第一个，并把第一个值删除
					result.add(animal.get(0));
					animal.remove(0);
				}else if(ope[i][1] == 1) {
					//第二种方法收养，狗，取出第一个为正数的值，同时删除该值，因为只取一个，需要跳出循环
					for (int j = 0; j < animal.size(); j++) {
						if (animal.get(j) >0) {
							result.add(animal.get(j));
							animal.remove(j);
							break;
						}
					}
				}else if(ope[i][1] == -1) {
					for (int j = 0; j < animal.size(); j++) {
						//第二种方法收养，猫，想法类似
						if (animal.get(j) < 0) {
							result.add(animal.get(j));
							animal.remove(j);
							break;
						}
					}
				}
				break;
			default:
				break;
			}
		}
    	return result;
    }
}
