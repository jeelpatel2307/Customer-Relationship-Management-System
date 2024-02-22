class Customer:
    def __init__(self, customer_id, name, email, phone):
        self.customer_id = customer_id
        self.name = name
        self.email = email
        self.phone = phone

    def display_customer(self):
        print(f"Customer ID: {self.customer_id}")
        print(f"Name: {self.name}")
        print(f"Email: {self.email}")
        print(f"Phone: {self.phone}\n")


class CRM:
    def __init__(self):
        self.customers = {}

    def add_customer(self, customer):
        self.customers[customer.customer_id] = customer

    def remove_customer(self, customer_id):
        if customer_id in self.customers:
            del self.customers[customer_id]
            print(f"Customer with ID {customer_id} removed successfully.")
        else:
            print(f"Customer with ID {customer_id} does not exist.")

    def display_customers(self):
        print("Customers:")
        for customer_id, customer in self.customers.items():
            customer.display_customer()


# Usage example
crm = CRM()

customer1 = Customer(1, "John Doe", "john@example.com", "123-456-7890")
customer2 = Customer(2, "Jane Smith", "jane@example.com", "987-654-3210")
customer3 = Customer(3, "Alice Johnson", "alice@example.com", "456-789-0123")

crm.add_customer(customer1)
crm.add_customer(customer2)
crm.add_customer(customer3)

crm.display_customers()

crm.remove_customer(2)

crm.display_customers()
