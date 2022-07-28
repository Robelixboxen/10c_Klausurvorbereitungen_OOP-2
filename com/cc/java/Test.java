package com.cc.java;

public class Test {
    
    // Felder (fields) | Attribute, Eigenschaften
    // private --> Kapselung / encapsulation/ data hiding

    private String name;    // privat = nur in Test sichtbar
    private int age;        // privat = Zugriffsmodifizierer
    // die beiden oberen Zeilen ist eigentlich das einzige was ich schreiben muss


    public Test(String name, int age) {
        this.name = name;
        this.age = age;
    }  // rechte Maus, Source Action, Castom Construktor  

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    

	
}
