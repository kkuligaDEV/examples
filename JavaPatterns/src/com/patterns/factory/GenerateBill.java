package com.patterns.factory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GenerateBill {
    public static void main(String[] args) throws IOException {
        GetPlanFactory planFactory = new GetPlanFactory();

        System.out.println("Enter name of the plan:");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String plan = br.readLine();
        System.out.println("Enter number of units for bill will be calculated: ");
        int units = Integer.parseInt(br.readLine());

        Plan p = planFactory.getPlan(plan);
        System.out.print("Bill amount for "+plan+" of  "+units+" units is: ");
        p.getRate();
        p.calculateBill(units);
    }
}

