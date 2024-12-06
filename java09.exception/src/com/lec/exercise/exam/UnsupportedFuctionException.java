package com.lec.exercise.exam;

class UnsupportedFuctionException extends RuntimeException {

    private final int ERR_CODE; // 초기화시 값이 고정

    public UnsupportedFuctionException(String s, int i) {
        super(s);
        ERR_CODE = i;
    }

    public UnsupportedFuctionException(String s) {
        this(s,100); // 메세지만 있을시에 에러코드 기본값 100으로 만듬

    }



    public int getErrCode() { // 에러코드를 얻을 수 있는 메서드

        return ERR_CODE;

    }




    public String getMessage() { // Exception의 getMessage()를 오버라이딩 한다.

        return  "[" + getErrCode() + "]" + super.getMessage();

    }
}
