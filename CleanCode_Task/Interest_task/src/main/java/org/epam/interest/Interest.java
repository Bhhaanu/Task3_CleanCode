package org.epam.interest;

import static java.lang.Math.pow;

public class Interest
{
    public double simple_interest(double principal,double rate,double time){
        return (principal*time*rate)/100;
    }
    public double compound_interest(double principal,double rate,double time){
        return principal*pow((1.0+rate/100.0),time)-principal;
    }
}
