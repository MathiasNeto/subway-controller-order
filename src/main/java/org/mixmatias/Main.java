package org.mixmatias;

import org.mixmatias.model.BreadBuilder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<String> sauce = Arrays.asList("Maionese", "Ketchup");
        var bread1 = new BreadBuilder("PAO FRANCES")
                .filling("Frango")
                .sauce(sauce)
                .more("bacon")
                .createdBread();

        var bread2 = new BreadBuilder("Pao italiano")
                .filling("Frango")
                .more("Mostarda").createdBread();

        System.out.println(bread1.toString());
        System.out.println(bread2.toString());


    }
}