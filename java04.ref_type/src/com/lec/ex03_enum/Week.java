package com.lec.ex03_enum;
/*
	열거타입(enum)
	
	데이터중에는 특정의 한정된 값만 가지는 경우가 흔히 있다. 예를 들어 요일에 대한
	데이터는 "월~일"이라는 7개의 값만을 계절관련 데이터는 '봄,여름,가을,겨울"이라는
	4개의 한정된 값만 가지는 것 처럼 한정된 값만 갖는 데이터를 Java에서는 "열거타입
	(Enumeration Type, enum)"이라고 한다.
	
	열거타입을 선언하기 위해서는 먼저 열거타입의 이름을 정의하고 열가타입이름의 소스
	파일(~.java)을 생성해야 한다.
	
	열거타입의 이름은 관례적으로 첫 글자를 대문자로하고 나머지는 소문자로 한다. 만약
	여러단어단위 구성된 이름이라면  class이름처럼 Camel Case방식을 준수한다.
*/
public enum Week {
	// 열거타입의 값은 상수의 성격을 가지기 때문에 상수를 선언하는 것처럼 모두 대문자
	// 로 선언하거 여러단어로 구성할 경우에는 언더바(_)로 연결해서 정의한다.
	MONDAY,
	THUSDAY,
	WENDSDAY,
	THURsDAY,
	FRIDAY,
	SATURDAY,
	SUNDAY
}
