class CurrenciesDonotMatchException extends Exception{
	
}

class Amount{
	String currency;
	float amount;
	
	public Amount(String currency, float amount) {
		this.currency=currency;
		this.amount=amount;
	}
}

class AmountAdder{
	static Amount addAmounts(Amount amt1, Amount amt2) throws CurrenciesDonotMatchException{
		if(!amt1.currency.equals(amt2.currency)) {
			//System.out.println("Currencies are different.");
			//throw new RuntimeException("Different currencies exception.");
			throw new CurrenciesDonotMatchException();
		}
		System.out.println("Currency: "+amt1.currency);
		System.out.println("Amount1: "+amt1.amount);
		System.out.println("Amount2: "+amt2.amount);
		System.out.println("Total Amount: "+(amt1.amount+amt2.amount));
		return new Amount(amt1.currency,amt1.amount+amt2.amount);
	}
	static void result() {
//		System.out.println("Currency: "+amt1.currency);
	}
}
public class ExceptionTest {
	public static void main(String[] args){
//		Amount amt1=new Amount("RUPEE",50);
//		Amount amt2=new Amount("RUPEE",100);
//		AmountAdder.addAmounts(amt1, amt2);
		
		//AmountAdder.addAmounts(new Amount("RUPEE",100), new Amount("RUPEE",200));
		try {
			AmountAdder.addAmounts(new Amount("RUPEE",100), new Amount("DOLLAR",200));
		}
		catch(CurrenciesDonotMatchException e) {
			//e.printStackTrace();
			System.out.println("Exception handled "+e.getClass());
		}
		catch(Exception e) {
			//e.printStackTrace();
			System.out.println("Exception handled EXCEPTION "+e.getClass());
		}
	}
}
