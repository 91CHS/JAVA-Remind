package com.lec.ex01_list;

import java.util.*;

// ArrayList vs LinkedList 성능 비교
// ArrayList vs LinkedList 성능 비교
public class LinkedListMain {

   public static void main(String[] args) {
      
      List<String> arrList = new ArrayList<>();
      List<String> lnkList = new LinkedList<>();
      
      // ArrayList vs LinkedList 성능 비교
      // add, remove 속도 비교
      long start, finish;
      
      // a. ArrayList = 검색속도는 얘가 빠르다 90%이상은 얘를 사용.
      start = System.nanoTime();
      for(int i=0;i<100000;i++) {
         arrList.add(0,String.valueOf(i));
      }
      finish = System.nanoTime();
      System.out.println("ArrList의 소요시간 = " + (finish - start) + "ns");
      
      // b. LinkedList = 추가, 삽입이 빈번하게 일어나는 건 얘가 짱이다
      start = System.nanoTime();
      for(int i=0;i<100000;i++) {
         lnkList.add(0,String.valueOf(i));
      }
      finish = System.nanoTime();
      System.out.println("lnkList의 소요시간 = " + (finish - start) + "ns");
   }

}