package com.main.hyj.springmvc.v3.servlet.convert;

public class IntegerTypeStrategy implements TypeStrategy{
    @Override
    public Object doConvert(String value) {
        return Integer.valueOf(value);
    }
}
