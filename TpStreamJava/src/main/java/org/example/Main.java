package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
         Trader abdallah = new Trader("Abdallah","Cambridge");
         Trader audrey = new Trader("Audrey","Milan");
         Trader corentin = new Trader("Corentin","Cambridge");
         Trader tristan = new Trader("Tristan","Cambridge");

        List<Transaction> transactions= Arrays.asList(new Transaction(abdallah,2011,400)
                ,new Transaction(abdallah,2012,300)
                ,new Transaction(audrey,2012,1000)
                ,new Transaction(audrey,2011,400)
                ,new Transaction(corentin,2012,700)
                ,new Transaction(tristan,2012,950)
                ,new Transaction(tristan,2022,900));
        transactions.stream().allMatch(year ->transactions.getYear()==2011);
    transactions.stream().filter(transactions.year==2011);
    transactions.stream().sorted().forEach(System.out.println(););

        Map<String,Trader>traderMap=transactions.stream().collect(Collectors.toList())

    /*
   if(transactions.stream().anyMatch())
    )*/
    }
    /*idée 2 question 1
    Trader trader1=new Trader();
    Trader trader2=new Trader();

    Transaction[] transactions1=transactions.stream()
            .filter(trader->getYear()<2012 || getYear()>2010);*/

//4
Trader[] traderMilan= transctions.stream()
        .filter(c-> c=="Milan");
if c!=null{
        System.out.println("oui il y a des commerçant a milan");
    }else {
        System.out.println(
                "aucun commçant trouvé"
        );
    }
}

