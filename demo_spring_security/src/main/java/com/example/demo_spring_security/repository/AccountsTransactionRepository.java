package com.example.demo_spring_security.repository;

import com.example.demo_spring_security.entity.AccountTransactions;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface AccountsTransactionRepository extends CardsRepository<AccountsRepository,String>{
    List<AccountTransactions> findByCystomeriderByTransaction
}
