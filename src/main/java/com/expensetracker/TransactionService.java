package com.expensetracker;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TransactionService {
    public TransactionService(TransactionRepository transactionRepository) {
        this.transactionRepository = transactionRepository;
    }

    TransactionRepository transactionRepository;

    public List<Transaction> getTransactions(){
       return transactionRepository.findAll();
    }

    public Transaction createTransaction(Transaction transaction){
        return transactionRepository.save(transaction);
    }

    public Transaction updateTransaction(Long id,Transaction transaction){
        Optional<Transaction> existingTransaction = transactionRepository.findById(id);
        if (existingTransaction.isPresent()){
            return transactionRepository.save(transaction);

        }
        return new Transaction();

    }
    public  void deleteTransaction(Long id){
         transactionRepository.deleteById(id);
    }
}
