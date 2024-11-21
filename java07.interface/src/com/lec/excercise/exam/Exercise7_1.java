package com.lec.excercise.exam;

class SutdaDeck {
    final int CARD_NUM = 20;
    SutdaCard[] cards = new SutdaCard[CARD_NUM];
    
    SutdaDeck () { //생성자

        for (int i=0 ; i<20 ; i++) {
            int j = i%10+1;
            boolean k = (i==0||i==2||i==7);
            cards[i] = new SutdaCard(j,k);
        }

    }
  }
    
////////////////////////////////////////////////////////////////////////////////////
    class SutdaCard {
       int num;
       boolean isKwang;
       
       SutdaCard() {
          this(1, true);
       }
       
       SutdaCard(int num, boolean isKwang){
          this.num = num;
          this.isKwang = isKwang;
       }
       
       //info()대신 Object클래스의 toString()을 오버라이딩했다. 객체를 print하면 toString 해시코드 나옴.
       public String toString() {
          return num + (isKwang ? "K":"");
       }
    }
    
 ////////////////////////////////실행문 /////////////////////////////////////////////   
    class Exercise7_1 {
      public static void main(String args[]) {
    	  SutdaDeck deck = new SutdaDeck();
         
         for(int i=0; i < deck.cards.length;i++)
            System.out.print(deck.cards[i]+",");
      }
   }
