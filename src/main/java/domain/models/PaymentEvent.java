package domain.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PaymentEvent {
    String requestId, merchantId, customerId, customerBankAccount, merchantBankAccount, token, amount;
}