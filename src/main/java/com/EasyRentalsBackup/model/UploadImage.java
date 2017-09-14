package com.EasyRentalsBackup.model;

	
	public class UploadImage {
		private String name;
		private String data;
		
		public UploadImage(){
		}
		
		
		public UploadImage(String name, String data){
			this.name = name;
			this.data = data;
		}
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getData() {
			return data;
		}
		public void setData(String data) {
			this.data = data;
		}
		
		@Override
		public String toString() {
			String info = String.format("Image name = %s, data = %s", name, data);
			return info;
		}
	
}