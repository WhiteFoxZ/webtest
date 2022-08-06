

EgovUnitContent.jsp
${}과 #{} 표기법의 차이
${} 즉시적용,  #{} 지연적용
https://dololak.tistory.com/744


구분		ID			PW			비고
일반사용자	USER		rhdxhd12	영문으로 공통12
기업사용자	ENTERPRISE	rhdxhd12	영문으로 공통12
업무사용자	TEST1		rhdxhd12	영문으로 공통12
master	webmaster 	rhdxhd12	영문으로 공통12


22-08-03 - https://www.egovframe.go.kr/wiki/doku.php?id=egovframework:com:v3.10:uat:%EC%9D%BC%EB%B0%98%EB%A1%9C%EA%B7%B8%EC%9D%B8 참고
스프링 시큐리티 프레임워크를 이용하는 설정


공통코드관리기능 추가
공통코드 자리수 증가.

CL_CODE               CHAR(3) -> CHAR(13)
CODE_ID               VARCHAR2(6) -> VARCHAR2(16)


vo 에 validate xml 파일을 넣으면 항목체크를 한다.
유효성검사 참고 : https://victorydntmd.tistory.com/179

https://www.egovframe.go.kr/wiki/doku.php?id=egovframework:%EC%9A%94%EC%86%8C%EA%B8%B0%EC%88%A0_validation_%EC%B2%B4%ED%81%AC
https://www.egovframe.go.kr/wiki/doku.php?id=egovframework:rte:ptl:security:jakarta_commons_validator