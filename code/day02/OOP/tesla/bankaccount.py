class BankAccount:


    ALL_ACCOUNTS = []

    def __init__(self, CheckingBalance, SavingsBalance) -> None:
        self.CheckingBalance = CheckingBalance
        self.SavingsBalance = SavingsBalance
        BankAccount.ALL_ACCOUNTS.append(self)

    @classmethod
    def get_all_accounts(cls):
        print(cls.ALL_ACCOUNTS)

    


checking = BankAccount(300, 500)
savings = BankAccount(200, 500)

print(BankAccount.ALL_ACCOUNTS)

BankAccount.get_all_accounts()