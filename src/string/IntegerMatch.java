package string;
/**
 * @author zhaoxudong
 * ������ʽ
 */
import Mr.zhao.util.*;
public class IntegerMatch {
public static void main(String[] args){
	Print.print("-1234".matches("-?\\d+"));
	Print.print("5678".matches("-?\\d+"));
	Print.print("+911".matches("-?\\d+"));
	Print.print("+911".matches("(-|\\+)?\\d+"));
	Print.print("zhaoxudong".matches("(-|\\+)?\\w+"));
}
}
