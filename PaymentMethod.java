public class PaymentMethod {
        private Long paymentId;
        private Long creditCard;
        private Long debitCard;
        private Long onlinePayment;
        private Long bankTransfer;
        private Long userId;

        public PaymentMethod(){
        public PaymentMethod(Long paymentId, Long creditCard, Long debitCard, Long onlinePayment, Long bankTransfer, Long userId) {
            this.paymentId = paymentId;
            this.creditCard = creditCard;
            this.debitCard = debitCard;
            this.onlinePayment = onlinePayment;
            this.bankTransfer = bankTransfer;
            this.userId = userId;
        }
        public Long getPaymentId() {
            return paymentId;
        }
    
        public void setPaymentId(Long paymentId) {
            this.paymentId = paymentId;
        }
    
        public Long getCreditCard() {
            return creditCard;
        }
    
        public void setCreditCard(Long creditCard) {
            this.creditCard = creditCard;
        }
    
        public Long getDebitCard() {
            return debitCard;
        }
    
        public void setDebitCard(Long debitCard) {
            this.debitCard = debitCard;
        }
    
        public Long getOnlinePayment() {
            return onlinePayment;
        }
    
        public void setOnlinePayment(Long onlinePayment) {
            this.onlinePayment = onlinePayment;
        }
    
        public Long getBankTransfer() {
            return bankTransfer;
        }
    
        public void setBankTransfer(Long bankTransfer) {
            this.bankTransfer = bankTransfer;
        }
    
        public Long getUserId() {
            return userId;
        }
    
        public void setUserId(Long userId) {
            this.userId = userId;
        }
    }
}