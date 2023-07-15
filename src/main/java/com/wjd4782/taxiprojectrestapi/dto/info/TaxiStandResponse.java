package com.wjd4782.taxiprojectrestapi.dto.info;

import com.wjd4782.taxiprojectrestapi.domain.TaxiStand;
import lombok.Getter;

@Getter
public class TaxiStandResponse { // 택시승강장 정보를 응답받기 위한 DTO
    private double latitude; // 위도
    private double longitude; // 경도

    // domain >> dto
    public TaxiStandResponse(TaxiStand taxiStand) {
        this.latitude = taxiStand.getLatitude();
        this.longitude = taxiStand.getLongitude();
    }
}