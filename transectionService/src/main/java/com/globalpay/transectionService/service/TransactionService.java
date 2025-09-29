package com.globalpay.transectionService.service;

import com.globalpay.transectionService.dto.CreateTransactionRequest;
import com.globalpay.transectionService.model.Transaction;
import com.globalpay.transectionService.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.UUID;

@Service
public class TransactionService {

    @Autowired
    private TransactionRepository transactionRepository;

    public Transaction createTransaction(CreateTransactionRequest request) {
        Transaction tx = new Transaction();
        tx.setId(UUID.randomUUID());
        tx.setSenderAccountId(request.getSenderId());
        tx.setReceiverAccountId(request.getReceiverId());
        tx.setAmount(request.getAmount());
        tx.setCurrency(request.getCurrency());
        tx.setStatus("PENDING");
        tx.setCreatedAt(Instant.now());
        return transactionRepository.save(tx);
    }

    public Transaction getTransactionById(UUID id) {
        return transactionRepository.findById(id).orElse(null);
    }

}
