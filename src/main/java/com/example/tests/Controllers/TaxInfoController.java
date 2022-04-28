package com.example.tests.Controllers;

import com.example.tests.Services.TaxService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
@RequestMapping("/tax")
@RequiredArgsConstructor
public class TaxInfoController {

    private final TaxService taxService;

    @GetMapping
    public ResponseEntity<?>getTaxRates(@RequestParam("numberOfDays") int numberOfDays,  @RequestParam("amount") BigDecimal amount){
        return ResponseEntity.ok(taxService.generateTaxValues(numberOfDays,amount));
    }



}
