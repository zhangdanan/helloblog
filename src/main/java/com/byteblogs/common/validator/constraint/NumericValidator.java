package com.byteblogs.common.validator.constraint;

import com.byteblogs.common.validator.annotion.Numeric;
import org.apache.commons.lang3.StringUtils;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;


public class NumericValidator implements ConstraintValidator<Numeric, String> {
    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        if (value == null || StringUtils.isBlank(value)) {
            return false;
        }
        if (!StringUtils.isNumeric(value)) {
            return false;
        }
        return true;
    }
}
