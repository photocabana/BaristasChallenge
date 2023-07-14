public class TestOrders {
    public static void main(String[] args) {


        // Menu items

        Item item1 = new Item("mocha", 6.45);
        Item item2 = new Item("latte", 6.75);
        Item item3 = new Item("drip coffee", 3.50);
        Item item4 = new Item("cappuccino", 6.25);


        //2 unspecified orders

        Order order1 = new Order();
        Order order2 = new Order();


        //3 named orders

        Order order3 = new Order("Cindhuri");
        Order order4 = new Order("Jimmy");
        Order order5 = new Order("Noah");


        // Add 2 items and display

        order1.additem(item1);
        order1.additem(item2);

        order2.additem(item3);
        order2.additem(item4);

        order3.additem(item1);
        order3.additem(item4);

        order4.additem(item3);
        order4.additem(item1);

        order5.additem(item4);
        order5.additem(item4);


        // test status
        order1.setReady(true);
        System.out.println(order1.getStatusMessage());


        //Test order total
        System.out.println(order1.getOrderTotal());
        order1.display();
    }
}

