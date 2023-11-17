package Enumm;

public enum MessPlan {
	
		MONTHLY(3000),QUARTERLY(11700),HALFYEAR(17500),YEARLY(32000),NONE(0);
		
		private int plan;
		private double price;
		
		
		MessPlan(int plan) {
			this.plan=plan;
		
		}
		MessPlan(double price) {
			this.price=price;
		}
		
		public int getPlan() {
			return plan;
		}
		public double getPrice() {
			return price;
		}
	
	}



