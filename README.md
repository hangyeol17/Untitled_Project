# Untitled_Project
스프링 프레임워크 학습을 위한 연습용 프로젝트






## 1주차 학습내용
스프링 개발환경 세팅


- Java
  - jdk11
- Framework
  - Spring 5.0.7
- WAS
  - Tomcat 9.0
- IDE
  - STS3(Eclipse)
- DB
  - mysql
- Maven dependancy
  - org.springframework:spring-web:5.3.20
  - org.mybatis:mybatis:3.5.6
  - org.mybatis:mybatis-spring:1.3.2
  - org.slf4j:slf4j-api:1.7.25
  - org.apache.tomcat:tomcat-juli:10.1.7
  - org.apache.tomcat:tomcat-dbcp:10.1.7
  - mysql:mysql-connector-java:8.0.28
  - javax.inject:javax.inject:1
  - commons-fileupload:commons-fileupload:1.3.1
  - javax.servlet.jsp:jsp-api:2.1
  - javax.servlet:javax.servlet-api:3.1.0




---
1. 스프링 환경
개발 환경을 수동으로 구성 및 정의해야하기 때문에 설정하는 방법이 복잡한 게 단점이다. 
WAS가 내장되어 있지 않아 직접 설치해야하며 XML이나 자바 코드로 직접 설정해야 한다.


2. 스프링 부트 환경
스프링보다 더 쉽고 빠르다. 
스프링 프로젝트 설정, 의존성 세트 등으로 관리가 더 편하다. 
WAS가 내장되어 있고 XML 설정이 필요없다. 








## 2주차 학습내용
1. SW 활용 API 가이드 문서 작성

     - [SW 활용 현황 API.pdf](https://github.com/hangyeol17/Untitled_Project/files/12558677/SW.API.pdf)

2. 학습내용
   - Rest Api : url의 설계 방식, 주소와 메소드만을 보고 요청 내용을 파악하기 편하다.
   - HTTP 메소드 : POST, GET, PUT, DELETE (CRUD)
   - 톰캣에 GET 요청이 오면 URL을 분석하고 처리할 컨트롤러와 매치된다. 해당 컨트롤러의 메서드를 통해 비즈니스 계층(Service), 퍼시스턴스 계층(Repository)을 통하면서 필요한 데이터를 가져온다. 스프링 컨테이너의 뷰 리졸버는 템플릿 엔진을 이용해 html 문서를 만들거나 json, xml 등의 데이터를 생성하여 결과를 return한다.
   



