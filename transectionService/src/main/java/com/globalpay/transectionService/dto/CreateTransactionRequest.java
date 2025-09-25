package com.globalpay.transectionService.dto;

import lombok.Data;
import jakarta.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.UUID;

@Data
public class CreateTransactionRequest {
    @NotNull
    private UUID senderId;
    @NotNull
    private UUID receiverId;
    @NotNull
    private BigDecimal amount;
    @NotNull
    private String currency;
}

