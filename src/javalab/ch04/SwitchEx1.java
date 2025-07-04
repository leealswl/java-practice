package javalab.ch04;


public class SwitchEx1 {

	public static void main(String[] args) {
		//스위치문예제 : 경기순위가 1등이면 g, 2등이면 s, 3등이면 b, 나머지 a 출력.
		//if 문으로 먼저 예제 해보고, 변수명 순위 :rank , 메달색:medalcolor 
		int rank=1;
		String medalcolor;
		if (rank==1) {
			medalcolor="G";
		} else if (rank==2) {
			medalcolor="S";
		} else if (rank==3) {
			medalcolor="B";
		} else {
			medalcolor="A";
		} 
		System.out.println(rank +"등 메달의 색깔은" + medalcolor +"입니다");
	  //1등 메달의 색깔은G입니다
		
		rank =3;
		switch (rank) {
			case 1: medalcolor ="G";
				break;
			case 2: medalcolor ="S";
				break;
			case 3: medalcolor ="B";
				break;
			default: medalcolor ="A";
		}
		System.out.println(rank +"등 메달의 색깔은" +medalcolor +"입니다"); //3등 메달의 색깔은B입니다
		
		
		
		String[] medals = {"","g1","s1","b1","a1"};
		System.out.println(medals[1]); //배열 인덱스를 이용한 방법
		System.out.println(medals[rank]);
		System.out.println(medals[(rank>3)?4:rank]); 
		
		
		// break문 안쓰는 스위치문. 화살표문법인가? 맞넹
		String medal ="gold";
		
		switch(medal) {
		case "gold" -> System.out.println("금메달");
		case "silver" -> System.out.println("은메달");
		case "bronze" -> System.out.println("동메달");
		default ->System.out.println("노메달"); //금메달
		}
		
		//스위치문 표현식
		String message = switch (medal) {
			case "gold" -> "금메달1";
			case "silver" -> "은메달1";
			case "bronze" -> "동메달1";
			default -> "노메달1";
		}; System.out.println(message); //금메달1
		
		
				
		
		// 스위치문 표현식2
		int month =12;
		int day =switch(month) {
			case 2 ->28;
			case 4,6,9,11 -> 30;
			case 1,3,5,7,8,10,12 ->31;
			default -> {
				if (month <1 || month >12) {
					System.out.println("잘못된 월 입니다.");
				}else {
					System.out.println("알수없는 오류 입니당당당.");
				}
				yield 0; 
				//yield는 switch 블록 내부에서 값을 반환할 때 사용하는 전용 키워드
				//switch 블록 {} 안에서는 return을 쓸 수 없음. 그 대신 값을 반환하려면 yield 로사용
			}
		}; System.out.println(month +"월의 날짜는 " +day +"일까지 있습니다.");
	}
}

