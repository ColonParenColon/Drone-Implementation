package Project2;
public class Item {
    private String name;
    private int price;
    private int x;
    private int y;
    private int width;
    private int height;


    Item(String name, int price, int x, int y, int width, int height)
    {
        this.name = name;
        this.price = price;
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public String getName()
    {
        return this.name;
    }
    public void setName(String name)
    {
        this.name = name;
    }

    public int getPrice()
    {
        return this.price;
    }
    public void setPrice(int price)
    {
        this.price = price;
    }

    public int getX()
    {
        return this.x;
    }
    public void setX(int x)
    {
        this.x = x;
    }

    public int getY()
    {
        return this.y;
    }
    public void setY(int y)
    {
        this.y = y;
    }

    public int getWidth()
    {
        return this.width;
    }
    public void setWidth(int width)
    {
        this.width = width;
    }

    public int getHeight()
    {
        return this.height;
    }
    public void setHeight(int height)
    {
        this.height = height;
    }
}