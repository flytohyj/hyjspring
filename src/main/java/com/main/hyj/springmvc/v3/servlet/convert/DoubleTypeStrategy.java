package com.main.hyj.springmvc.v3.servlet.convert;

public class DoubleTypeStrategy implements TypeStrategy{
    @Override
    public Object doConvert(String value) {
        return Double.parseDouble(value);
    }
}
