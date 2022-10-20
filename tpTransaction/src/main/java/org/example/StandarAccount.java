package org.example;

import static org.example.Priority.*;

public enum StandarAccount {
    public static void getEnum(){
       switch (priority){
           case MONEY_TRANSFER_SEND:
               System.out.println("");

           case  MONEY_TRANSFER_RECEIVE:
               System.out.println("");
               break;
           case CANCEL_OPERATION:
               System.out.println();
               break;

       }
    }
}
