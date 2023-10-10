package com.dirtylesc.comic_bo.entities.main;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ApiResponse<T> {
    private Integer     sessStat;
    private Integer     resCode;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private T           resData;

    public ApiResponse(Integer sessStat, Integer resCode, T resData) {
        this.sessStat   = sessStat;
        this.resCode    = resCode;
        this.resData    = resData;
    }

//    public ApiResponse(Integer sessStat, Integer resCode, Long resCount) {
//        this.sessStat   = sessStat;
//        this.resCode    = resCode;
//        this.resCount   = resCount;
//    }

    public ApiResponse(Integer sessStat, Integer resCode) {
        this.sessStat   = sessStat;
        this.resCode    = resCode;
    }
}
