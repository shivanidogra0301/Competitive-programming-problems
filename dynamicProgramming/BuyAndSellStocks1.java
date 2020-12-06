package dynamicProgramming;
import java.util.Scanner;

//input 
//9 11 6 7 19 4 1 6 18 4
public class BuyAndSellStocks1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
        int[] arr = new int[n];
        
        for(int i = 0; i < arr.length; i++){
            arr[i] = s.nextInt();
        }
        s.close();

		BandSell1trans(arr); //when only one transaction is allowed
		BandSellInfiniteTrans(arr); // when infinite transaction is allowed
		int cost = 3;
		BandSellCost(arr, cost); // if you are allowed infinite transactions, but has to pay "fee" for every closed transaction.
		BandSellCooldown(arr); // if  you are allowed infinite transactions, but can only buy again after a day of cool down
		
	}
	public static void BandSell1trans(int[] arr) {
		int lsf = Integer.MAX_VALUE;
        int pst = 0, maxp = 0;
        
        
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < lsf){
                lsf = arr[i];
            }
            pst = arr[i] - lsf;
            
            if(pst > maxp){
                maxp = pst;
            }
        }
        
        System.out.println(maxp);
	}
	public static void BandSellInfiniteTrans(int[] arr) {
		
		 int b = 0, sell = 0;
	        int profit = 0;
	        for(int i = 1; i < arr.length; i++){
	            if(arr[i] >= arr[i-1]){
	                sell++;
	            }
	            else{
	                profit += arr[sell] - arr[b];
	                b = sell = i;
	            }
	        }
	        
	        profit += arr[sell] - arr[b]; // for last point
	        
	        System.out.println(profit);
		
	}
	
	public static void BandSellCost(int[] arr, int cost) {
		int bsp = -arr[0] , ssp = 0;
        
        for(int i = 1; i < arr.length ; i++){
            int nbsp , nssp;
            // best buying day profit
            if(ssp - arr[i] > bsp){
                nbsp = ssp - arr[i];
            }
            else{
                nbsp = bsp;
            }
            
            // best selling day profit
            if(bsp + arr[i] - cost > ssp){
                nssp = bsp + arr[i] - cost;
            }
            else{
                nssp = ssp;
            }
            
            bsp = nbsp;
            ssp = nssp;
        
        }
        
        System.out.println(ssp);
		
	}
	
	public static void BandSellCooldown(int[] arr) {
		int bsp = -arr[0] , ssp = 0 , csp = 0;
        
        for(int i = 1; i < arr.length; i++){
            int nbsp, nssp, ncsp;
            // for best buying profit
            if(csp - arr[i] > bsp){
                nbsp = csp - arr[i];
            }else{
                nbsp = bsp;
            }
            
            // for best selling profit
            
            if(bsp + arr[i] > ssp){
                nssp = bsp + arr[i];
            }
            else{
                nssp = ssp;
            }
            
            //for cool down;
            if(ssp > csp){
                ncsp = ssp;
            }
            else{
                ncsp = csp;
            }
            
            bsp = nbsp;
            ssp = nssp;
            csp = ncsp;
        }
        
        System.out.println(ssp);
	}
	
}
