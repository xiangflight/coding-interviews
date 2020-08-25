package interview.hw;

import java.util.Scanner;
import java.util.TreeMap;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/8/24
 * <p>
 * 题目描述
 * 数据表记录包含表索引和数值（int范围的整数），请对表索引相同的记录进行合并，即将相同索引的数值进行求和运算，输出按照key值升序进行输出。
 * <p>
 * 输入描述:
 * 先输入键值对的个数
 * 然后输入成对的index和value值，以空格隔开
 * <p>
 * 输出描述:
 * 输出合并后的键值对（多行）
 * <p>
 * 输入
 * 4
 * 0 1
 * 0 2
 * 1 2
 * 3 4
 * <p>
 * 输出
 * 0 3
 * 1 2
 * 3 4
 */

public class Solution008 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        TreeMap<Integer, Integer> map = new TreeMap<>();
        while (count-- > 0) {
            int key = sc.nextInt();
            int value = sc.nextInt();
            map.put(key, map.getOrDefault(key, 0) + value);
        }
        map.forEach((k, v) -> System.out.println(k + " " + v));
    }

}
