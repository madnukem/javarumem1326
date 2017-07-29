package com.javarush.task.task13.task1326;

/* 
Сортировка четных чисел из файла
*/

import org.omg.CORBA.portable.InputStream;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream stream = new FileInputStream(reader.readLine());
        DataInputStream dataStream = new DataInputStream(stream);
        ArrayList<Integer> arr = new ArrayList<>();
        while (stream.available() > 1){
         int d = Integer.parseInt(dataStream.readLine());
          //  System.out.println(d);
         if (d!= 0 && d % 2 == 0) arr.add(d);
        }
        Collections.sort(arr);
        for(int b : arr){
            System.out.println(b);
        }
        stream.close();

    }
}
