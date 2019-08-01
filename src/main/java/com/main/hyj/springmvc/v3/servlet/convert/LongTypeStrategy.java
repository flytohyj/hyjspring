package com.main.hyj.springmvc.v3.servlet.convert;

public class LongTypeStrategy implements TypeStrategy{
    @Override
    public Object doConvert(String value) {
        return Long.parseLong(value);
    }
}
