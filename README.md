# Billing System

This project implements a simple billing system using two programming languages: Java and Python. The billing system allows users to select items from various sections (e.g., Mobiles, Fashion, Electronics) and generates a bill based on the selected items.

## Table of Contents
- [Features](#features)
- [Java Implementation](#java-implementation)
- [Python Implementation](#python-implementation)
- [How to Run](#how-to-run)
- [Future Enhancements](#future-enhancements)

## Features
- **Multiple Sections**: Users can choose items from different sections like Mobiles, Fashion, Watches, Appliances, and more.
- **Item Selection**: Users can add items to their cart by selecting them from a list.
- **Bill Generation**: The system generates a bill that includes item details, quantities, and the total amount.

## Java Implementation

The Java version of the billing system is implemented using classes and objects. It features a `Section` class to represent different sections and an `Item` class to represent individual items.

### Key Classes
- **Item**: Represents an item with a name and price.
- **Section**: Represents a section containing a list of items.

### Bill Generation
```java
// Bill generation part in Java
double totalAmount = 0.0;
System.out.println("\nGenerating Bill... Please wait");
System.out.println("------------------");
System.out.println("Items Purchased:");
for (Item item : selectedItems) {
    System.out.println(item.getName() + "\t $" + item.getPrice());
    totalAmount += item.getPrice();
}
System.out.println("---------------------------------");
System.out.println("Total Amount: $" + totalAmount);
System.out.println("Thank you for shopping with us!");

## Python Implementation
#Bill generation part in Python
if selected_items:
    print("\nBill Summary:")
    item_counter = Counter([item.get_name() for item in selected_items])
    total_amount = 0

    print(f"{'Item':<25}{'Quantity':<10}{'Price':<10}{'Total':<10}")
    print("-" * 55)
    
    for item_name, quantity in item_counter.items():
        item_price = next(item.get_price() for item in selected_items if item.get_name() == item_name)
        item_total = item_price * quantity
        total_amount += item_total
        print(f"{item_name:<25}{quantity:<10}{item_price:<10}{item_total:<10}")
    
    print("-" * 55)
    print(f"{'Total Amount':<45}{total_amount:<10}")
else:
    print("\nYour cart is empty.")

