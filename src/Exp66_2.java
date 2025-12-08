import java.util.ArrayList;
import java.util.Arrays;
public class Exp66_2 {

	public static void main(String[] args) {

		ArrayList<String> goodLuckyCharm = new ArrayList<>(Arrays.asList("一富士","二鷹","四扇","五煙草"));
		System.out.println(goodLuckyCharm);
		goodLuckyCharm.add("六座頭");
		System.out.println(goodLuckyCharm);
		goodLuckyCharm.add(2,"三茄子");
		System.out.println(goodLuckyCharm);
		goodLuckyCharm.set(4, "五小槌");
		System.out.println(goodLuckyCharm);
	}

}
