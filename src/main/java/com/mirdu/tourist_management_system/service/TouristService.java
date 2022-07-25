package com.mirdu.tourist_management_system.service;

import java.util.ArrayList;

import com.mirdu.tourist_management_system.entity.Tourist;

public class TouristService {
	private ArrayList<Tourist> empList;
	
	public TouristService(ArrayList<Tourist> empList)
	{
		this.empList = empList;
	}
	public void addTourist(Tourist e)
	{
		empList.add(e);
		System.out.println("Tourist got added successfully");
	}
	public void viewTourist()
	{
		for(Tourist e:empList)
		{
			System.out.println(e);
		}
	}
	public void updateTourist(Tourist e)
	{
		boolean flag = false;
		for(Tourist e1: empList)
		{
			if(e1.getEmpId()==e.getEmpId())
			{
				e1.setEmpName(e.getEmpName());
				e1.setEmpDsignation(e.getEmpDsignation());
				e1.setEmpSalary(e.getEmpSalary());
				flag = true;
			}
		}
		if(flag)
		{
			System.out.println("Tourist data updated..");
		}
		else
		{
			System.out.println("Tourist unavailable...");
		}
	}
	public void deleteTourist(int empid)
	{
		boolean flag = false;
		for(Tourist e1: empList)
		{
			if(e1.getEmpId()==empid)
			{
				empList.remove(e1);
				flag = true;
			}
		}
		if(flag)
		{
			System.out.println("Tourist data deleted..");
		}
		else
		{
			System.out.println("Tourist unavailable...");
		}
	}
	public void increment(int empid, int percentage)
	{
		boolean flag = false;
		for(Tourist e1: empList)
		{
			if(e1.getEmpId()== empid)
			{
				double sal = e1.getEmpSalary();
				e1.setEmpSalary(sal+(sal*percentage/100));
				flag = true;
			}
		}
		if(flag)
		{
			System.out.println("Tourist package Incremented..");
		}
		else
		{
			System.out.println("Tourist unavailable...");
		}
	}
}
