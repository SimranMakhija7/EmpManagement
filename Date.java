class Date{
	int date;
	int month;
	int year;
	Date(String d){
		date = parseInt(d.substring(0,2));
		month = parseInt(d.substring(3,5));
		year = parseInt(d.substring(6, d.lenth()));
	}
	int getDate(){
		return date;
	}
	int getMonth(){
		return month;
	}
	int getYear(){
		return year;
	}
}