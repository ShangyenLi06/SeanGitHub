package com.customer.model;

public class Customer implements java.io.Serializable {
		private String username;
		private String addr;
		private int yee1;
		private String sex;

		public Customer(){}
		
		public String getUsername(){
			return username;
		}
		
		public String getAddr(){
			return addr;
		}
		
		public void setUsername(String username){
			this.username=username;
		}
		
		public void setAddr(String addr){
			this.addr=addr;
		}
}