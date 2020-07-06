package sample.enumtest;

import java.util.Date;

public class ContinuityEnumUse {
	public static void main(String[] args) {
		System.out.println(USACoins.QUARTER);
		System.out.println(USACoinService.QUARTER);
		
		Date today; //class Date
		USACoinService coin1; //interface USACoinService
		USACoins coin2; //enum USACoins
		today= new Date();
		coin1= new USACoinService() {
			// 얘는 인스턴스를 만들 수 없는 클래스 이므로 
			// 익명 이너 클래스를 만드는 명령으로 대입을 해줘야 한다 
		};
		coin2 = USACoins.QUARTER;
		int coinx= USACoinService.QUARTER;
		String coinxStr = (coinx==USACoinService.QUARTER)?"QUARTER":""; 
		System.out.println("/////////////////////");
		System.out.println(coin2+"\n"+ coinxStr);
		System.out.println(coin2.toString());
		System.out.println(USACoins.QUARTER.toString());
		//USACoins.
		//coin2.
		
		
//		USACoins coin = USACoins.PENNY;
//		
//		switch (coin) {
//		case PENNY:
//			System.out.println(coin);
//			break;
//		case NICKLE:
//			System.out.println(coin);
//			break;	
//		case DIME:
//			System.out.println(coin);
//			break;
//		case QUARTER:
//			System.out.println(coin);
//			break;
//		}
//		// 매핑된 값 출력
//		for(USACoins value : USACoins.values()){
//		    System.out.println(value);
//		}
	}
}
