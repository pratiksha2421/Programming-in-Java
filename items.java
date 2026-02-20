// Wap to calculate the total cost of a number of items

public class items {
    public static void main(String[] args)
    {
    int items = 20;
    float perItemCost = 50;
    char currency = '$';
    float totalCost = perItemCost*items;
    System.out.println("Total items :" + items);
    System.out.println("Per item cost is : " + perItemCost+currency );
    System.out.println("Total cost : " + totalCost+currency);
    }
}
