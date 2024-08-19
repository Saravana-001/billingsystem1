
class Item:
    def __init__(self, name, price):
        self.name = name
        self.price = price

    def get_name(self):
        return self.name

    def get_price(self):
        return self.price


class Section:
    def __init__(self, name):
        self.name = name
        self.items = []

    def add_item(self, item):
        self.items.append(item)

    def display_items(self):
        print(f"Items available in {self.name} section:")
        for item in self.items:
            print(f"{item.get_name()} - ${item.get_price()}")

    def get_items(self):
        return self.items


def main():
    # Sections and items setup
    mobiles_section = Section("Mobiles")
    mobiles_section.add_item(Item("iPhone 14", 100000))
    mobiles_section.add_item(Item("Samsung Galaxy S20", 80000))
    mobiles_section.add_item(Item("Oneplus", 70000))
    mobiles_section.add_item(Item("Samsung Galaxy F42 5G", 30000))
    mobiles_section.add_item(Item("Oppo", 20000))
    mobiles_section.add_item(Item("Vivo", 20000))
    mobiles_section.add_item(Item("Motorola", 18000))
    mobiles_section.add_item(Item("iPhone 13", 40000))
    mobiles_section.add_item(Item("Redmi 12 5G", 15000))
    mobiles_section.add_item(Item("Poco", 15000))

    fashion_section = Section("Fashion")
    fashion_section.add_item(Item("Shirt", 700))
    fashion_section.add_item(Item("Cotton Pants", 900))
    fashion_section.add_item(Item("T-Shirt", 400))
    fashion_section.add_item(Item("Shorts", 400))
    fashion_section.add_item(Item("Jeans", 700))
    fashion_section.add_item(Item("Sparx Shoe", 1000))
    fashion_section.add_item(Item("Formal Black", 800))
    fashion_section.add_item(Item("White Sneaker", 700))
    fashion_section.add_item(Item("Kurtas", 500))
    fashion_section.add_item(Item("Cotton Saree", 1500))
    fashion_section.add_item(Item("Flip Flops", 400))
    fashion_section.add_item(Item("Slippers", 600))

    watch_section = Section("Watches")
    watch_section.add_item(Item("Firebolt", 2000))
    watch_section.add_item(Item("Sonata", 1500))
    watch_section.add_item(Item("Titan", 6000))
    watch_section.add_item(Item("Wrangn", 5000))
    watch_section.add_item(Item("Rolex", 20000))
    watch_section.add_item(Item("Fastrack", 3000))
    watch_section.add_item(Item("Quartz", 2000))
    watch_section.add_item(Item("Allen Solly", 10000))
    watch_section.add_item(Item("Timex", 5000))
    watch_section.add_item(Item("Fossil", 10000))

    appliances_section = Section("Appliances")
    appliances_section.add_item(Item("Samsung LED TV", 40000))
    appliances_section.add_item(Item("Fan", 3500))
    appliances_section.add_item(Item("LED Bulb", 2000))
    appliances_section.add_item(Item("Chandelier", 20000))
    appliances_section.add_item(Item("AC", 60000))
    appliances_section.add_item(Item("Refrigerator", 40000))
    appliances_section.add_item(Item("Table Fan", 15000))
    appliances_section.add_item(Item("Washing Machine", 20000))
    appliances_section.add_item(Item("Water Purifier", 15000))
    appliances_section.add_item(Item("Dry Irons", 8000))

    electronics_section = Section("Electronics")
    electronics_section.add_item(Item("Laptop", 60000))
    electronics_section.add_item(Item("Headphones", 800))
    electronics_section.add_item(Item("Bluetooth Headphones", 2000))
    electronics_section.add_item(Item("Earpods", 4000))
    electronics_section.add_item(Item("Smartwatches", 8000))
    electronics_section.add_item(Item("Hairdryers", 7000))
    electronics_section.add_item(Item("Tablets", 30000))
    electronics_section.add_item(Item("Printers", 20000))
    electronics_section.add_item(Item("Projectors", 30000))
    electronics_section.add_item(Item("Monitors", 25000))

    furniture_section = Section("Furniture")
    furniture_section.add_item(Item("Beds", 40000))
    furniture_section.add_item(Item("Mattress", 20000))
    furniture_section.add_item(Item("Wardrobes", 30000))
    furniture_section.add_item(Item("Dressing Table", 25000))
    furniture_section.add_item(Item("Side Tables", 8000))
    furniture_section.add_item(Item("Sofas", 30000))
    furniture_section.add_item(Item("Shoe Racks", 6000))
    furniture_section.add_item(Item("Office Chairs", 8000))
    furniture_section.add_item(Item("Dining Sets", 25000))
    furniture_section.add_item(Item("Laptop Table", 12000))

    toys_section = Section("Toys")
    toys_section.add_item(Item("Tricycles", 5000))
    toys_section.add_item(Item("Teddy Soft Toy", 4000))
    toys_section.add_item(Item("Musical Toys", 3500))
    toys_section.add_item(Item("Remote Control Car", 12000))
    toys_section.add_item(Item("Remote Control Flight", 15000))
    toys_section.add_item(Item("Panda Soft Toy", 4000))
    toys_section.add_item(Item("Duck Toy", 3000))
    toys_section.add_item(Item("Rabbit Toy", 3500))
    toys_section.add_item(Item("Kids Scooter", 12000))
    toys_section.add_item(Item("Piano Toys", 4000))

    sports_section = Section("Sports Hub")
    sports_section.add_item(Item("Cricket Bat", 10000))
    sports_section.add_item(Item("Cricket Ball", 500))
    sports_section.add_item(Item("Cricket Stumps", 3000))
    sports_section.add_item(Item("Cricket Kit", 15000))
    sports_section.add_item(Item("Football", 5000))
    sports_section.add_item(Item("Volley Ball", 5000))
    sports_section.add_item(Item("Basketball", 7000))
    sports_section.add_item(Item("Hockey Stick", 2000))
    sports_section.add_item(Item("Sports Arm Sleeves", 1000))
    sports_section.add_item(Item("Cricket Helmet", 6000))

    grocery_section = Section("Grocery")
    grocery_section.add_item(Item("Rice 25kg", 2200))
    grocery_section.add_item(Item("Dates 1kg", 1000))
    grocery_section.add_item(Item("Dhoor Dhal 1kg", 200))
    grocery_section.add_item(Item("Ghee", 300))
    grocery_section.add_item(Item("Oils", 200))
    grocery_section.add_item(Item("Aashirvaad Atta 5kg", 400))
    grocery_section.add_item(Item("Samba Rice 1kg", 100))
    grocery_section.add_item(Item("Chili Powder", 300))
    grocery_section.add_item(Item("Turmeric Powder", 300))
    grocery_section.add_item(Item("Sambar Powder", 300))

    personalcare_section = Section("Personal Care")
    personalcare_section.add_item(Item("Facewash", 500))
    personalcare_section.add_item(Item("Sunscreen", 600))
    personalcare_section.add_item(Item("Face Serum", 700))
    personalcare_section.add_item(Item("Moisturizer", 800))
    personalcare_section.add_item(Item("Perfume", 1500))
    personalcare_section.add_item(Item("Hair Serum", 500))
    personalcare_section.add_item(Item("Shampoo", 300))
    personalcare_section.add_item(Item("Hair Oil", 400))
    personalcare_section.add_item(Item("Conditioner", 700))
    personalcare_section.add_item(Item("Hair Color", 300))

    sections = {
        "mobiles": mobiles_section,
        "fashion": fashion_section,
        "watches": watch_section,
        "appliances": appliances_section,
        "electronics": electronics_section,
        "furnitures": furniture_section,
        "toys": toys_section,
        "sports hub": sports_section,
        "grocery": grocery_section,
        "personal care": personalcare_section
    }

    selected_items = []
    print("Welcome to the Billing System")

    while True:
        print("Available Sections:")
        for index, section_name in enumerate(sections.keys(), 1):
            print(f"{index}. {section_name.capitalize()}")

        choice = input("Select a section (or type 'done' to finish): ").strip().lower()

        if choice == "done":
            break

        if choice in sections:
            selected_section = sections[choice]
            selected_section.display_items()

            while True:
                item_name = input("Enter the item name to add to cart (or type 'done' to go back to sections): ").strip()

                if item_name.lower() == "done":
                    break

                found = False
                for item in selected_section.get_items():
                    if item.get_name().lower() == item_name.lower():
                        selected_items.append(item)
                        found = True
                        print(f"{item_name} - added to cart.")
                        break

                if not found:
                    print("Item not found in this section. Please try again.")

    # Billing process
    print("\nItems in your cart:")
    total_amount = 0
    for item in selected_items:
        print(f"{item.get_name()} - ${item.get_price()}")
        total_amount += item.get_price()

    print(f"\nTotal amount: ${total_amount}")


if __name__ == "__main__":
    main()
