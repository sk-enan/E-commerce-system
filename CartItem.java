//Name: SK MD ENAN BIN KHALED
//ID: 501036145
public class CartItem
{
    private String productOption;
    private Product item;
    public CartItem(Product item, String productOption)
    {
        this.productOption = productOption;
        this.item = item;
    }

    public String getProductOption()
    {
        return productOption;
    }

    public void setProductOption(String productOption)
    {
        this.productOption = productOption;
    }

    public Product getItem()
    {
        return item;
    }

    public void setItem(Product item) {
        this.item = item;
    }

    public void print()
    {
        item.print();
    }
}