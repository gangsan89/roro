package sample.enumtest;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ContEnumUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(USACoins.QUARTER);
		System.out.println(USACoinService.QUARTER);
		
		Date   today; //class  Date
		USACoinService  coin1;  // interface USACoinService
		USACoins coin2;// enum USACoins
		today= new Date();
		coin1= new USACoinService() {
			// 인스턴스를 만들수 없는 클래스 이므로 
			// 익명이너 클래스를 만드는 명령으로 대입
		};
		coin2 = USACoins.QUARTER;
		
		int coinx= USACoinService.QUARTER;
		String coinxStr = 
				(coinx==USACoinService.QUARTER)?"QUARTER":"";	
		
		System.out.println(coin2+"\n"+coinxStr);
		System.out.println(coin2.toString());
		System.out.println(USACoins.QUARTER.toString());
		//USACoins.
		System.out.println("name():"+coin2.name());
		System.out.println("name():"+USACoins.QUARTER.name());
		
		USACoins coin90 = USACoins.PENNY;
		USACoins coin91 = USACoins.valueOf( USACoins.class, "PENNY"); 
		USACoins coin92 = USACoins.valueOf("PENNY");
	
		
		List<USACoins> coins = new ArrayList<USACoins>(); 
		coins.add(coin90);
		coins.add(coin91);
		coins.add(coin92);
		System.out.println("coins의 0번째 데이터가 PENNY인가?" +
				(coins.get(0).compareTo(coin90)==0?"맞다":"아니다"));
		System.out.println("coins의 0번째 데이터가 DIME인가?" +
				(coins.get(0).compareTo(USACoins.DIME)==0?"맞다":"아니다"));
		
		System.out.println(coins.get(0).compareTo(USACoins.DIME));
		System.out.println(USACoins.DIME.compareTo(coins.get(0)));
	}

}




