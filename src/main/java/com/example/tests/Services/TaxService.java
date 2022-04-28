package com.example.tests.Services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;

@Service
@Slf4j
public class TaxService {

    public HashMap<Integer, Integer> generateTaxValues(int numberOfDays, BigDecimal amount){

        HashMap<Integer, Integer> taxInfo = new HashMap<>();

        BigDecimal coveredRate = BigDecimal.valueOf(0);

        for(int i = 1; (i<=numberOfDays); i++){
            taxInfo.put(i,randomRate());
            coveredRate = coveredRate.add(BigDecimal.valueOf(randomRate()));
            log.info("covered......"+coveredRate);
            if (coveredRate.compareTo(amountRate(amount)) >= 0){
                log.info("coverd......"+coveredRate);
                log.info("Total Amount is ............"+coveredRate.multiply(BigDecimal.valueOf(500)));
                break;
            }
        }

        return taxInfo;

    }

    private BigDecimal amountRate(BigDecimal amount){
        return amount.divide(BigDecimal.valueOf(500));
    }

    private Integer randomRate(){
        return new Random().nextInt(2)+1;
    }


}
