package com.team13.teamplay2insta.dto.post;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class ResponseDto {
    private String result;
    private Object data;

    public ResponseDto(String result, Object data) {
        this.result = result;
        this.data = data;
    }
}
