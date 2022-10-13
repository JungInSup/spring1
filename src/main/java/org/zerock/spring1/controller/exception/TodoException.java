package org.zerock.spring1.controller.exception;

import lombok.Getter;
import lombok.ToString;


// 사용자 정의 예외
// 비즈니스를 처리하다가 메시지를 전달하고 싶다.
@Getter
@ToString
public class TodoException extends Exception{

    // 수정 , 삭제, 업데이트 마다 Exception을 달아줘야 한다.

    private int errorCode;
    private String msg;

    public TodoException(int code, String msg) {
        this.errorCode = code;
        this.msg = msg;
    }



//    private ErrorCode errorCode;
//
//
//
//    enum ErrorCode{
//        NONEXIST(404);
//
//        private int code;
//
//        ErrorCode(int code) {
//
//            this.code = code;
//        }
//
//        public int getCode() {
//            return this.code;
//        }
//    }


}
