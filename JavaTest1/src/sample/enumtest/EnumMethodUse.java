package sample.enumtest;

import java.util.ArrayList;
import java.util.List;

public class EnumMethodUse {

	public static void main(String[] args) {
	
		USACoins coin = USACoins.PENNY;
		USACoins coin2 = USACoins.valueOf( USACoins.class, "PENNY"); 
		USACoins coin3 = USACoins.valueOf("PENNY");
		
		System.out.println(coin);
		System.out.println(coin2);
		System.out.println(coin3);

		// 요소들 출력
		for(USACoins value : USACoins.values()){
		    System.out.println(value);
		}
		
		System.out.println(coin.name());
		System.out.println(coin.ordinal());
		
		List<USACoins> coins = new ArrayList<USACoins>(); 
		coins.add(coin);
		coins.add(coin2);
		coins.add(coin3);
		System.out.println("coins의 0번째 데이터가 PENNY인가?" +
						    (coins.get(0).compareTo(coin)==0?"맞다":"아니다"));
		System.out.println("coins의 0번째 데이터가 DIME인가?" +
						    (coins.get(0).compareTo(USACoins.DIME)==0?"맞다":"아니다"));
		
		System.out.println(coins.get(0).compareTo(USACoins.DIME));
		System.out.println(USACoins.DIME.compareTo(coins.get(0)));//어떤걸 기준으로 어떤 데이터를 뽑아내느냐
	}

}