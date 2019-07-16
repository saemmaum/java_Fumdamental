package java_20190716;

public class CalendarDemo {
	public static void main(String[] args) 
	/*
	 
	 -달력 만들기
	 1. 1년 1월 1일 월요일
	 2. 1년 365일 이고, 윤년일떄는 366일- 2월 29일
	 3. 윤년은 4년마다 발생하고 그중에서 100의 배수는 제외하고 400배수는 제외하지 않는다. 
	 4. 2019년 12월25일 무슨일까요?
	 5. 2018년까지 총일수, 11월까지 총일수, 25일 더해서 나머지 7로 나눈 나머지가 1이면 월요일, 2이면 화요일...
     */
	int year = 2019;
	int month = 12;
    int day = 25;
    
    int preYear = year -1;
    int preMonth = month -1;
    int totalCount =0;
    
    totalCount = preYear *365 +
    		(preYear / 4- preYear / 100 + preYear /4 )
    		
    		totalCount += 365 -31;
    
    		totalCount += day;
    		
    		int day
    
    totalCount = preYear *365 + ();
  
    		
    		
    
}

