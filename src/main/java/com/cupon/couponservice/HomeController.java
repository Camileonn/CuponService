package com.cupon.couponservice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

    @GetMapping("/")
    public String home() {
        logger.info("Endpoint '/' fue llamado en CouponService");

        try {
            return "Hola Mundo";
        } catch (Exception e) {
            logger.error("Error en endpoint '/'", e);
            throw e;
        }
    }
}