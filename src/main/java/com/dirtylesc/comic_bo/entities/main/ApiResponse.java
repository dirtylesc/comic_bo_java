package com.dirtylesc.comic_bo.entities.main;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class ApiResponse {
    private Integer     sessStat;
    private Integer     resCode;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Object      resData;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Long        resCount;

    public ApiResponse(Integer sessStat, Integer resCode, Object resData) {
        this.sessStat   = sessStat;
        this.resCode    = resCode;
        this.resData    = resData;
    }

    public ApiResponse(Integer sessStat, Integer resCode, Long resCount) {
        this.sessStat   = sessStat;
        this.resCode    = resCode;
        this.resCount   = resCount;
    }

    public ApiResponse(Integer sessStat, Integer resCode) {
        this.sessStat   = sessStat;
        this.resCode    = resCode;
    }
}
