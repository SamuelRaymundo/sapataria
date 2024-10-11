package org.samuelraymundo.sapataria.model.enums;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonValue;

@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum PaymentMethodEnum {
    CREDIT("1"),
    DEBIT("2"),
    CASH("3"),
    PIX("4");
    
    private String code;
    
    private PaymentMethodEnum(String code) {
        this.code = code;
    }

    @JsonValue
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @JsonCreator
    public static PaymentMethodEnum fromCode(String code) {
        code = code.trim(); // Clean the input by trimming spaces

        System.out.println("Received code: " + code); // Debugging log

        switch (code) {
            case "1":
                return PaymentMethodEnum.CREDIT;
            case "2":
                return PaymentMethodEnum.DEBIT;
            case "3":
                return PaymentMethodEnum.CASH;
            case "4":
                return PaymentMethodEnum.PIX;
            default:
                throw new IllegalArgumentException("Invalid code for PaymentMethodEnum: " + code);
        }
    }

}
