package javalab.ch13;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class OptionalEx {

	public static void main(String[] args) {
		 List<TravelCustomer> customerList = new ArrayList<>();
	        
	        customerList.add(new TravelCustomer("이순신", 40, 100));
	        customerList.add(new TravelCustomer("김유신", 20, 100));
	        customerList.add(new TravelCustomer("홍길동", 13, 50));
	        
	        //이름검색
	        TravelCustomer cust = getCustomerByName("김유신", customerList);
	        System.out.println(cust.toString()); 
	        TravelCustomer cust1 = getCustomerByName("고길동", customerList);
	        
	        if (cust1 !=null) {
	        	System.out.println(cust1.toString());//nullpointerException : // 객체 주소가 없다.
	        }

	    	//opitonal -> optional 클래스(객체)를 이용하여 처리
	    	usingOptional(customerList);
	
	}
	
	//1. 이름검색(검색성명, 고객리스트) -> 반환값 :객체
	public static TravelCustomer getCustomerByName(String name,List<TravelCustomer>list) {
		 for(TravelCustomer item : list) {
			 if (name.equals(item.getName())) {
				 return item;
			 }
		 }
		 return null; //검색어를 만족하는 고객 객체가 없다
	}
		
	
	//2. 이름검색 (검색성명, 고객맅스트) ->반환값 : 옵셔널 사용
	public static Optional<TravelCustomer> getCustomerByNameOptional(String name,List<TravelCustomer>list) {
		 for(TravelCustomer item : list) {
			 if (name.equals(item.getName())) {
				 return Optional.of(item); // null 이 아닌 객체를 담을때 사용.ㅓ
			 }
		 }
		 return Optional.empty(); //값이 없는 객체
	}
	public static TravelCustomer generateDefaultCustomer(){
        return new TravelCustomer("손님",0,0);
    }
	
	//3. 다양한 optional 적용 예제
	public static void usingOptional(List<TravelCustomer>list) {
		Optional <TravelCustomer> customerOptional = getCustomerByNameOptional("고길동", list);
		//1. ifpresent() 사용:객체가 존재하는 경우
		customerOptional.ifPresent(c -> System.out.println("1. 고객명:"+ c.getName()));
		//2. ispresent() 논리값 반환
		if (customerOptional.isPresent()) {
			System.out.println("2. 고객명 :" + customerOptional.get().getName());
		}else {
			System.out.println("고객명이 없다요");
		} 
		//orelse : 없는경우 기본값을 지정하고 반환
		TravelCustomer cust = customerOptional.orElse(new TravelCustomer("손님",0,0));
		System.out.println(cust.getName());
		
		
		//elseget() : 없는 경우 기본값을 가공해서 반환
		TravelCustomer custComputed = customerOptional.orElseGet(()->generateDefaultCustomer());
		System.out.println(custComputed.getName());
		
	}
		

}
