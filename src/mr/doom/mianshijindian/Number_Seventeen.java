package mr.doom.mianshijindian;
import java.util.ArrayList;


public class Number_Seventeen {
    public ArrayList<Integer> asylum(int[][] ope) {
		// �мҶ���������ֻ����è�͹��������������������������������������ʽ��
		// ��һ��Ϊֱ���������ж�������������������ģ�
		// �ڶ���Ϊѡ�������Ķ������ͣ�è�򹷣������������ֶ�������������������ġ�
		// ����һ����������int[][2] ope(C++��Ϊvector<vector<int>>)���������¼���
		// ����һ��Ԫ��Ϊ1��������ж���������������ڶ���Ԫ��Ϊ����ı�ţ�
		// ������������������è������һ��Ԫ��Ϊ2�������������������ڶ���Ԫ����Ϊ0��
		// ���ȡ��һ��������ʽ����Ϊ1����ָ������������Ϊ-1��ָ������è��
		// �밴˳�򷵻����������С������ֲ��Ϸ��Ĳ�������û�п��Է�������Ҫ��Ķ��
		// ����������������ԡ�
        // write code here
    	
    	//�������������ope[i][1],����������è���ǹ�
    	ArrayList<Integer> animal = new ArrayList<Integer>();
    	//��������������
    	ArrayList<Integer> result = new ArrayList<Integer>();
    	for (int i = 0; i < ope.length; i++) {
			switch (ope[i][0]) {
			case 1:
				//���������������ͳһ�ŵ�һ��ArrayList��
				animal.add(ope[i][1]);
				break;
			case 2:
				if(ope[i][1] == 0) {
					//��һ�ַ���������ֱ��ȡ����һ�������ѵ�һ��ֵɾ��
					result.add(animal.get(0));
					animal.remove(0);
				}else if(ope[i][1] == 1) {
					//�ڶ��ַ�������������ȡ����һ��Ϊ������ֵ��ͬʱɾ����ֵ����Ϊֻȡһ������Ҫ����ѭ��
					for (int j = 0; j < animal.size(); j++) {
						if (animal.get(j) >0) {
							result.add(animal.get(j));
							animal.remove(j);
							break;
						}
					}
				}else if(ope[i][1] == -1) {
					for (int j = 0; j < animal.size(); j++) {
						//�ڶ��ַ���������è���뷨����
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
