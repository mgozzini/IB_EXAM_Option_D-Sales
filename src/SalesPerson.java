
class SalesPerson  {

private String id;
private Sales[] salesHistory;
private int count = 0;

public SalesPerson(String id, Sales[] s, int c) {
            this.id = id;
            this.salesHistory = s;
            this.count = c;
        }
public SalesPerson(String id){
    this.id=id;
        }

public int getCount(){
    return count;
        }

public String getId(){
    return id;
        }

public void setSalesHistory(Sales s) {
            salesHistory[count] = s;
            count = count+1;
        }

public double calcTotalSales(){
            double totalSales = 0;
            for(int i = 0; i < count; i++) {
                totalSales += salesHistory[i].getQuantity() * salesHistory[i].getValue();
            }
            return totalSales;
        }

public int largestSale() {
            int max = salesHistory[0].getQuantity();
            for(int f = 0; f < salesHistory.length; f++){
                if(salesHistory[f].getQuantity()>max){
                    max = salesHistory[f].getQuantity();
                }
            }
            return max;
        }

}

