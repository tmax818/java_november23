
class BankAccount:

    BANK_CEO = "Tyler Maxwell"
    BANK_ACCOUNTS = []
    def __init__(self, int_rate, balance) -> None:
        self.int_rate = int_rate
        self.balance = balance
        BankAccount.BANK_ACCOUNTS.append(self)

    def __repr__(self) -> str:
        return f"balance of {self.balance} at {self.int_rate * 100}%"


    def deposit(self, amount):
        self.balance += amount

    def withdraw(self, amount):
        self.balance -= amount

    def printCEO(self):
        print(BankAccount.BANK_CEO)

    @classmethod
    def printBankAccounts(cls):
        return BankAccount.BANK_ACCOUNTS


tylers_account = BankAccount(.1, 10000)
tylers_checking_account = BankAccount(.1, 10000000)

print(tylers_account)
tylers_account.printCEO()

print(BankAccount.printBankAccounts())