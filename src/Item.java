/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author cac65
 */
public class Item {
   private String name;
    private int price;
    private int xLoc;
    private int yLoc;
    private int length;
    private int width;
    private int height;
    
    
    public void addItem(String inName, int inPrice, int inX, int inY, int inLength, int inWidth, int inHeight)
    {
        this.name = inName;
        this.price = inPrice;
        this.xLoc = inX;
        this.yLoc = inY;
        this.length = inLength;
        this.width = inWidth;
        this.height = inHeight;
    }
    
    public String toString()
    {
        return this.getName();
    }
    
    public String getName()
    {
        return name;
    }
    public void setName(String inputName)
    {
        this.name = inputName;
    }
    
    public int getPrice()
    {
        return price;
    }
    public void setPrice(int inputPrice)
    {
        this.price = inputPrice;
    }
    
    public int getXLoc()
    {
        return xLoc;
    }
    public void setXLoc(int inputXLoc)
    {
        this.xLoc = inputXLoc;
    }
    
    public int getYLoc()
    {
        return yLoc;
    }
    public void setYLoc(int inputYLoc)
    {
        this.yLoc = inputYLoc;
    }
    
    public int getLength()
    {
        return length;
    }
    public void setLength(int inputLength)
    {
        this.length = inputLength;
    }
    
    public int getWidth()
    {
        return width;
    }
    public void setWidth(int inputWidth)
    {
        this.width = inputWidth;
    }
    
    public int getHeight()
    {
        return height;
    }
    public void setHeight(int inputHeight)
    {
        this.height = inputHeight;
    }
    
    
}
