package by.bsu.task.product;
import by.bsu.task.product.Product;

public class Search {
    private Product[] List;
    private String NameProduct;
    private double price;
    private int Month;

    public Search(Product[] List1,String NameProduct1){
        List = List1;
        NameProduct = NameProduct1;
        price = 0;
        Month = 0;
    }

    public Search(Product[] List1,String NameProduct1,double price1){
        List = List1;
        NameProduct = NameProduct1;
        price = price1;
        Month = 0;
    }

    public Search(Product[] List1,int month){
        List = List1;
        NameProduct = null;
        price = 0;
        Month = month;
    }

    public void SearchFunction(Product[] List,String NameProduct){
        for(int i=0;i<List.length;i++){
            if(List[i].getNameProduct().equals(NameProduct)){
                List[i].show();
            } else{
                System.out.println("Такого товара нет.");
            }
        }
    }
    public void SearchFunction(Product[] List,String NameProduct,double price){
        for(int i=0;i<List.length;i++){
            if(List[i].getNameProduct().equals(NameProduct) && List[i].getPrice() < price){
                List[i].show();
            }else{
                System.out.println("Такого товара нет.");
            }
        }
    }
    public void SearchFunction(Product[] List,int Month){
        for(int i=0;i<List.length;i++){
            if(List[i].getDateSavedMonth() > Month){
                List[i].show();
            }else{
                System.out.println("Такого товара нет.");
            }
        }
    }
}
