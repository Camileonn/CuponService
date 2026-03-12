package com.cupon.couponservice;

import org.springframework.web.bind.annotation.RestController;

import com.modules.Coupon.dto.CouponDto;

import java.time.LocalDateTime;
import java.util.UUID;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/coupons")
public class CouponController {
    
    @GetMapping("path")
    public String getMethodName(@RequestParam String param) {
        return new String();
    }

    @GetMapping("/getCoupon/{code}")
    public CouponDto getCoupon(@PathVariable String code) {
        return CouponDto.builder()
            .code(code)
            .discount(10.0)
            .description("Coupon Description")
            //.id(UUID.randomUUID().toString())
            .build();
    }
}
