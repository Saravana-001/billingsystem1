// this is the overview of the billing system that first we have to declaring the variables
// name and a price .next declaring the class section and then a billing system follwed by the main method and 
// inside the main method we have to check the entered list is equal to the choice enterd by the user or not
// with using the boolean and switch case statement to select the choice after that everything will be satisfied we have to
// move for the printing bill section inside it the added item list will be calculted as a total amount and eventually  bill will be primted...... 


import java.util.ArrayList;
import java.util.Scanner;

// represent a class

class Item {
    private String name;
    private double price;
     
    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

// represent a section

      // Array list holds the items list thats why we use the <> diamond operator
//<> refer the type of context and specify the type of parameter in this line the item is a parameter
class Section {
    private String name;
    private ArrayList<Item> items;

    public Section(String name) {
        this.name = name;
        this.items = new ArrayList<>();
    }

    public void addItem(Item item) {
        items.add(item);
    }
        
 // display the available items
    public void displayItems() {
        System.out.println("Items available in " + name + " section:");
        for (Item item : items) {
            System.out.println(item.getName() + " - $" + item.getPrice());
        }
    }

// returning the holded items in the list
    public ArrayList<Item> getItems() {
        return items;
    }
}
// main method for the billing system
public class billingSystem {
    public static void main(String[] args) {
      // object creation for the mobile section
        Section mobilesSection = new Section("mobiles");
        //adding the item list
        mobilesSection.addItem(new Item("iPhone 14", 100000));
        mobilesSection.addItem(new Item("Samsung Galaxy S20", 80000));
        mobilesSection.addItem(new Item("Oneplus", 70000));
        mobilesSection.addItem(new Item("Samsung Galaxy F42 5G", 30000));
        mobilesSection.addItem(new Item("oppo", 20000));
        mobilesSection.addItem(new Item("vivo", 20000));
        mobilesSection.addItem(new Item("motorolo", 18000));
        mobilesSection.addItem(new Item("Iphone 13", 40000));
        mobilesSection.addItem(new Item("Redmi 12 5g", 15000));
        mobilesSection.addItem(new Item("poco", 15000));


        // object creation for the fashion section
        Section fashionSection = new Section("Fashion");
        //adding the item list
        fashionSection.addItem(new Item("Shirt", 700));
        fashionSection.addItem(new Item("cotton Pants", 900));
        fashionSection.addItem(new Item("T-Shirt", 400));
        fashionSection.addItem(new Item("Shorts", 400));
        fashionSection.addItem(new Item("jeans", 700));
        fashionSection.addItem(new Item("sparx shoe", 1000));
        fashionSection.addItem(new Item("formal Black", 800));
        fashionSection.addItem(new Item("white-sneaker", 700));
        fashionSection.addItem(new Item(" kurtas ", 500));
        fashionSection.addItem(new  Item("cotton-saree", 1500));
        fashionSection.addItem(new Item("flip flops", 400));
        fashionSection.addItem(new Item("slippers", 600));

          //object Creation for the watch section
          Section watchSection = new Section("watches");
          watchSection.addItem(new Item("firebolt", 2000));
          watchSection.addItem(new Item("sonata", 1500));
          watchSection.addItem(new Item("Titan", 6000));
          watchSection.addItem(new Item("wrongn", 5000));
          watchSection.addItem(new Item("Rolex", 20000));
          watchSection.addItem(new Item("fastrack", 3000));
          watchSection.addItem(new Item("quartz", 2000));
          watchSection.addItem(new Item("allen solly", 10000));
          watchSection.addItem(new Item("timex", 5000));
          watchSection.addItem(new Item("fossil", 10000));

        
    // object creation for the appliances
       Section appliancesSection =new Section("appliances");
       appliancesSection.addItem(new Item("Samsung Led tv", 40000));
       appliancesSection.addItem(new Item("fan", 3500));
       appliancesSection.addItem(new Item("LED bulb", 2000));
       appliancesSection.addItem(new Item("chandalier", 20000));
       appliancesSection.addItem(new Item("AC", 60000));
       appliancesSection.addItem(new Item("refrigerator", 40000));
       appliancesSection.addItem(new Item("table fan", 15000));
       appliancesSection.addItem(new Item("washing machine", 20000));
       appliancesSection.addItem(new Item("water purifier", 15000));
       appliancesSection.addItem(new Item("dry irons", 8000));
    

    //object creation for the electronics
        Section electronicsSection =new Section("electronics");
        electronicsSection.addItem(new Item("laptop", 60000));
        electronicsSection.addItem(new Item("headphones", 800));
        electronicsSection.addItem(new Item("bluetooth headphones", 2000));
        electronicsSection.addItem(new Item("earpods", 4000));
        electronicsSection.addItem(new Item("smartwatches", 8000));
        electronicsSection.addItem(new Item("hairdryers", 7000));
        electronicsSection.addItem(new Item("tablets", 30000));
        electronicsSection.addItem(new Item("printers", 20000));
        electronicsSection.addItem(new Item("projectors", 30000));
        electronicsSection.addItem(new Item("monitors", 25000));
        
    
    // object creation for the furniture
    Section furniturSection = new Section("furnitures");
    furniturSection.addItem(new Item("beds", 40000));
    furniturSection.addItem(new Item("mattress", 20000));
    furniturSection.addItem(new Item("wardrobes", 30000));
    furniturSection.addItem(new Item("dressing table", 25000));
    furniturSection.addItem(new Item("side tables", 8000));
    furniturSection.addItem(new Item("sofas", 30000));
    furniturSection.addItem(new Item("shoe racks", 6000));
    furniturSection.addItem(new Item("office chairs", 8000));
    furniturSection.addItem(new Item("dining sets", 25000));
    furniturSection.addItem(new Item("laptop table", 12000));


    // object creation for the toys
    Section toysSection = new Section("toys");
    toysSection.addItem(new Item("tricycles", 5000));
    toysSection.addItem(new Item("teddysoft toy", 4000));
    toysSection.addItem(new Item("musical toys", 3500));
    toysSection.addItem(new Item("remote control car", 12000));
    toysSection.addItem(new Item("remote control flight", 15000));
    toysSection.addItem(new Item("panda soft toy", 4000));
    toysSection.addItem(new Item("duck toy", 3000));
    toysSection.addItem(new Item("rabbit toy", 3500));
    toysSection.addItem(new Item("kids scooter", 12000));
    toysSection.addItem(new Item("piano toys", 4000));


 // object creation for the sports hub
 Section sportsSection =new Section("sports hub");
 sportsSection.addItem(new Item("cricket bat",10000));
 sportsSection.addItem(new Item("cricket ball",500));
 sportsSection.addItem(new Item("cricket stumps",3000));
 sportsSection.addItem(new Item("cricket kit",15000));
 sportsSection.addItem(new Item("football",5000));
 sportsSection.addItem(new Item("volley ball",5000));
 sportsSection.addItem(new Item("basket ball",7000));
 sportsSection.addItem(new Item("hockey stick",2000));
 sportsSection.addItem(new Item("sports arm sleeves",1000));
 sportsSection.addItem(new Item("cricket helmet",6000));


//object creation for the Grocery
Section grocerySection = new Section("grocery");
grocerySection.addItem(new Item("rice 25kg", 2200));
grocerySection.addItem(new Item("dates 1kg", 1000));
grocerySection.addItem(new Item("dhoor dhal 1kg", 200));
grocerySection.addItem(new Item("ghee", 300));
grocerySection.addItem(new Item("oils", 200));
grocerySection.addItem(new Item("aashirvaad atta 5kg", 400));
grocerySection.addItem(new Item("samba rice 1kg", 100));
grocerySection.addItem(new Item("chiili powder", 300));
grocerySection.addItem(new Item("turmeric powder", 300));
grocerySection.addItem(new Item("sambar powder", 300));

//object creation for the personal care 
Section personalcareSection = new Section("personal care");
personalcareSection.addItem(new Item("facewash", 500));
personalcareSection.addItem(new Item("sunscreen", 600));
personalcareSection.addItem(new Item("face serum", 700));
personalcareSection.addItem(new Item("moisturizer", 800));
personalcareSection.addItem(new Item("perfume", 1500));
personalcareSection.addItem(new Item("hair serum", 500));
personalcareSection.addItem(new Item("shampoo", 300));
personalcareSection.addItem(new Item("hair oil", 400));
personalcareSection.addItem(new Item("conditioner", 700));
personalcareSection.addItem(new Item("hair color", 300));


 // if we want to give more data we have to continue from this................

// creating Arraylist to hold selected items
               ArrayList<Item> selectedItems = new ArrayList<>();
               Scanner scanner = new Scanner(System.in);
               System.out.println("Welcome to the  Billing System");
               //displaying the available sections
               while (true) {
                   System.out.println("Available Sections:");
                   System.out.println("1. Mobiles");
                   System.out.println("2. Fashion");
                   System.out.println("3. Watches");
                   System.out.println("4. Appliances");
                   System.out.println("5. Electronics");
                   System.out.println("6. Furnitures");
                   System.out.println("7. Toys");
                   System.out.println("8. Sports Hub");
                   System.out.println("9. Grocery");
                   System.out.println("10. Personal Care");

                   //if we added show the further sections1

       
                   System.out.print("Select a section (or type 'done' to finish): ");
                   String choice = scanner.nextLine();

                   if (choice.equals("done"))
                   {
                    break;
                   }
                   Section selectedSection=null;
                   // select a choice to access the section
                   switch (choice.toLowerCase()) {
                    
                    case "mobiles":
                       selectedSection = mobilesSection;
                        break;
                      case"fashion":
                      selectedSection = fashionSection;
                      break;
                      // if you are added the more sections you have to add more possibilities
                      case "watches":
                      selectedSection = watchSection;
                      break;
                    case "appliances":
                    selectedSection = appliancesSection;
                    break;
                    case "electronics":
                    selectedSection = electronicsSection;
                    break;
                    case "furnitures":
                    selectedSection = furniturSection;
                    break;
                    case "toys":
                    selectedSection = toysSection;
                    break;
                    case " sports hub":
                    selectedSection = sportsSection;
                    break;
                    case "grocery":
                    selectedSection = grocerySection;
                    break;
                   case "personal care":
                   selectedSection = personalcareSection;
                   break;

                    default:
                    System.out.println("Invalid Section:");
                     continue;
                   }

                   selectedSection.displayItems();
                   while (true)
                    {
                      // getting the input from the user
                    System.out.println("enter the item name to add to cart (or type 'done' to go back to sections):");
                    String itemName =scanner.nextLine();
                    if (itemName.equals("done"))
                     {
                      break;
                    }
                    boolean found =false;
                    // starts a loop item belongs to the selected section
                    for (Item item : selectedSection.getItems())
                    {
                      if(item.getName().equals(itemName))
                      {
  // selected items belongs to items
                        selectedItems.add(item);
                        found=true;
                        
                        System.out.println(itemName + "-added to cart.");
                        break;
                      }
                    }
                    if (!found)
                     {
                      System.out.println("item not found in this section. Please try again.");
                    }

                   }
                   }
                   // this section is used to generate the bill after the purchase
                   double totalAmount =0.0;
                   System.out.println("\n Generating Bill......Please wait");
                   System.out.println("------------------");
                   System.out.println("Items Purchased:");
                   for (Item item : selectedItems) {
                    System.out.println(item.getName() + "\t $" + item.getPrice());
                    totalAmount += item.getPrice();
                }
                System.out.println("---------------------------------");
                System.out.println("Total Amount: $" + totalAmount);
                System.out.println("Thank you for shopping with us!");
            }
        }
        //coding avlothan ithuku keela la illa so paakathinga
  
