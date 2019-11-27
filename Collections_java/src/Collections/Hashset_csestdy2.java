package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class Hashset_csestdy2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String symbol;
		Set<Newclass> sc = new HashSet<Newclass>();
		Newclass[] c = new Newclass[40];
		int n = s.nextInt();
		System.out.println("Menu");
		System.out.println("1.Booking");
		System.out.println("2.Check Status");
		System.out.println("3.Exit");
		System.out.println("Choos Your Choice");
	}
	private Set<Newclass> sc;
	Iterator<Newclass> itr3=sc.iterator();
	int i=0;
	while(itr3.hasNext());
	{
		Newclass e=(Newclass)itr3.next();
		int total,b=0,c1,d,e1,f,ii=1;
		if(e.getAc().contentEquals("AC")==true)
		{
			b=1500;
		}
		else
		{
			b=700;
		}
		if(e.getCot().contentEquals("Single")==true)

	{
			c1=50;
			}
		else
		{
			c1=100;
		}
		if(e.getCot().contentEquals("cable")==true)

		{
				d=50;
				}
			else
			{
				d=0;
			}
		if(e.getWifi().contentEquals("wifi")==true)

		{
				d=50;
				}
			else
			{
				c1=100;
			}
		if(e.getCot().contentEquals("Single")==true)

		{
				d=50;
				}
			else
			{
				c1=100;
			}
	}
}

class Newclass {
	String ac;
	String cot;
	String wifi;
	String lun;

	public String getAc() {
		return ac;
	}

	public void setAc(String ac) {
		this.ac = ac;
	}

	public String getCot() {
		return cot;
	}

	public void setCot(String cot) {
		this.cot = cot;
	}

	public String getWifi() {
		return wifi;
	}

	public void setWifi(String wifi) {
		this.wifi = wifi;
	}

	public String getLun() {
		return lun;
	}

	public void setLun(String lun) {
		this.lun = lun;
	}

}}