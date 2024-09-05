package BusReserv;

public class Bus {

		// TODO Auto-generated method stub
		private int busNo;
		private int capacity;
		private boolean ac;
		Bus(int no,boolean ac,int cap){
			this.busNo=no;
			this.ac=ac;
			this.capacity=cap;
			
			
		}
//		if there any cahnge needed we can use this method get(accessor) and ser (mutator)
		public int getCapacity(){
			return capacity;
		}
		public void setcapacity(int cap) {  
			capacity=cap;
		}
		public int getBusNo(){
			return busNo;
		}
		public boolean isAc() {
			return ac;
		}
		public void setAC(boolean val) {
			ac=val;
		}
		public void displayBusInfo() {
			System.out.println("Bus no:"+busNo+" AC: "+ac+" Total Capacity: "+capacity);
		}

	}


