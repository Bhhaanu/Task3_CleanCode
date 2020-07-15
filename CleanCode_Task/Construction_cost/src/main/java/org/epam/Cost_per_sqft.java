package org.epam;

public class Cost_per_sqft
{
    public double cost_estimator(int standard,double area) throws StandardInvalidException {
        //if(standard>4) assert(false):"Enter values ranging 1 to 4"; we can use assert while testing
        if(standard>4) throw new StandardInvalidException("Standard should range from 1 to 4 only");
        int[] standards={
                1200,1500,1800,2500
        };
        return standards[standard-1]*area;
    }
}
