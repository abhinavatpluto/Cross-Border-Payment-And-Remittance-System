CREATE TABLE IF NOT EXISTS transactions (
  id UUID PRIMARY KEY,
  sender_account_id UUID NOT NULL,
  receiver_account_id UUID NOT NULL,
  amount NUMERIC(18,6) NOT NULL,
  currency VARCHAR(3) NOT NULL,
  status VARCHAR(32) NOT NULL,
  created_at TIMESTAMP WITH TIME ZONE,
  updated_at TIMESTAMP WITH TIME ZONE
);
