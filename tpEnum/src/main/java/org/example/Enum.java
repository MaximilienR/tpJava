package org.example;

public enum Enum {
     A(HIGH),
    B(MEDUM),
    C(LOW);


    private String random;
    private Select(String choice){
        this.random=choice;
    }
}
