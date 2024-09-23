# Assignment1-Software-Design-and-Arch.

![Untitled Diagram drawio](https://github.com/user-attachments/assets/2e74028e-88c3-485f-9aa8-9ff719d36443)


Explanation of the Exercise:

The UML diagram demonstrates the use of the Abstract Factory and Factory Method patterns:

GroceryProductFactory is an interface that defines methods for creating grocery products.
BananaFactory and AppleFactory are concrete factories that create specific products (Banana and Apple) and set their prices from a file.
Product is an interface that defines methods for setting and getting product prices.
Banana and Apple implement the Product interface, representing specific grocery items.

The code follows this structure by using factories to create products and assign prices, with the ability to extend to other products easily.
