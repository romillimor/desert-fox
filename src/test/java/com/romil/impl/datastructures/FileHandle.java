package com.romil.impl.datastructures;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class FileHandle {

    public static void main(String[] args) throws Exception {

        BufferedReader bin = new BufferedReader(new FileReader("/home/romil/IdeaProjects/desert-fox/src/test/java/com/romil/impl/datastructures/FlatFile"));
        Map<String, Obj> map = new HashMap<String, Obj>();
        String[] str;
        while((str = bin.readLine().split(" ")) !=null) {
            map.put(str[0], new Obj(str[0], str[1], str[2]));
        }
    }

}

class Obj {
    String salary;
    String dept;
    String name;

    Obj(String salary, String dept, String name) {
        this.salary = salary;
        this.dept = dept;
        this.name = name;

    }
}
