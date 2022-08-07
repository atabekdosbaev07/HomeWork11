package com.company;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        FileWriter writer = new FileWriter("Alphabet.txt");
        writer.write("Aa Bb Cc Dd Ee Ff Gg Hh Ii\n " +
                           "Jj Kk Ll Mm Nn Oo Pp Qq\n" +
                         "RrSs Tt Uu Vv Ww Xx Yy Zz\n" +
                         "1 2 3 4 5 6 7 8 9");
        writer.close();

        FileReader reader = new FileReader("Alphabet.txt");
        Scanner scan = new Scanner(reader);
        while(scan.hasNextLine()){
            System.out.println(scan.nextLine());
        }
        reader.close();
    }
}