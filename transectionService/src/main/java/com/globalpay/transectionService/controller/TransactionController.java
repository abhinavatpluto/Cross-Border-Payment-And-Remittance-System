package com.globalpay.transectionService.controller;

import com.globalpay.transectionService.dto.CreateTransactionRequest;
import com.globalpay.transectionService.model.Transaction;
import com.globalpay.transectionService.service.TransactionService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/api/v1/transactionService")
public class TransactionController {

    @Autowired
    private TransactionService transactionService;

    @PostMapping("/transactions")
    public Transaction createTransaction(@Valid @RequestBody CreateTransactionRequest createTransactionRequest){
        return  transactionService.createTransaction(createTransactionRequest);
    }

    @GetMapping("/{id}")
    public Transaction getTransactionById(@PathVariable UUID id){
        return transactionService.getTransactionById(id);
    }


}
