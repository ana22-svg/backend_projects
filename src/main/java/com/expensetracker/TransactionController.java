package com.expensetracker;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/transaction")
public class TransactionController {
    public TransactionController(TransactionService transactionService) {
        this.transactionService = transactionService;
    }

    TransactionService transactionService;

    @GetMapping("/")
    public List<Transaction> getTransactions(){
        return transactionService.getTransactions();
    }

    @PostMapping("/")
    public Transaction createTransaction(@RequestBody Transaction transaction){
        return transactionService.createTransaction(transaction);
    }

    @PutMapping("/{id}")
    public Transaction updateTransaction(@PathVariable Long id, @RequestBody Transaction transaction){
        return transactionService.updateTransaction(id, transaction);
    }

    @DeleteMapping("/{id}")
    public String deleteTransaction(@PathVariable Long id){
        transactionService.deleteTransaction(id);
        return "Transaction deleted successfully";

    }

}
