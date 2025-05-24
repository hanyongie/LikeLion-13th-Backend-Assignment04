package com.likelion.likelionassignmentud.common.error;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public enum SuccessCode {

    //200 ok
    GET_SUCCESS(HttpStatus.OK, "성공적으로 조회했습니다."),
    RESTAURANT_UPDATE_SUCCESS(HttpStatus.OK, "식당이 성공적으로 수정되었습니다."),
    MENU_UPDATE_SUCCESS(HttpStatus.OK, "메뉴가 성공적으로 수정되었습니다."),
    RESTAURANT_DELETE_SUCCESS(HttpStatus.OK, "식당이 성공적으로 삭제되었습니다."),
    MENU_DELETE_SUCCESS(HttpStatus.OK, "메뉴가 성공적으로 샥제되었습니다."),

    //201 create
    RESTAURANT_SAVE_SUCCESS(HttpStatus.CREATED, "식당이 성공적으로 생성되었습니다."),
    MENU_SAVE_SUCCESS(HttpStatus.CREATED, "메뉴가 성공적으로 생성되었습니다.");

    private final HttpStatus httpStatus;
    private final String message;

    public int getHttpStatusCode() {
        return httpStatus.value();
    }
}