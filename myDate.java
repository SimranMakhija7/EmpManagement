package myDate;

public class myDate{
	int date;
	int month;
	int year;
	public myDate(String d){
		date = Integer.parseInt(d.substring(0,2));
		month = Integer.parseInt(d.substring(3,5));
		year = Integer.parseInt(d.substring(6, d.length()));
	}
	public int getDate(){
		return date;
	}
	public int getMonth(){
		return month;
	}
	public int getYear(){
		return year;
	}
}
