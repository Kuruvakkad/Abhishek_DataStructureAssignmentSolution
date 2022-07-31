package com.gl.assignment2.SkySc;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class SkyScraper {
	static Stack<Integer> sorted_flat_sizes = new Stack<>();
	static Stack<Integer> extra_stack = new Stack<>();

	public static void main(String[] args) {		
		System.out.println("Welcome to SkyScrapper Application");
		System.out.println("-----------------------------------");
		System.out.println("");
		System.out.println("Enter the total number of floors in the Building :");
		Scanner sc=new Scanner(System.in);
		int total= sc.nextInt();
		int[] arr= new int[total];
		for(int i=0;i<total;i++) {
			int day=i+1;
			System.out.println("Enter the floor size given on day "+day);
			arr[i]=sc.nextInt();
		}
		//sorting the input values
		int[] Sortedarray=arr;
		Arrays.sort(Sortedarray);
		for(int i=0;i<total;i++) {
			try {
				sorted_flat_sizes.push(Sortedarray[i]);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			for(int day = 0; day < total; day++) {
			      extra_stack.push(arr[day]);
			      System.out.println(arr);
			      Queue<Integer> current_day_work = new LinkedList<>();
			      while(extra_stack.peek() == sorted_flat_sizes.peek()) {
			          current_day_work.add(extra_stack.pop());
			          sorted_flat_sizes.pop();
			          if (extra_stack.empty()) {
			            break;
			          }}
			      System.out.println("Day:" + (day + 1));
			      if (current_day_work.size() == 0) {
			        System.out.print("0");
			      } else {
			        while(current_day_work.size() != 0) {
			           System.out.print(current_day_work.remove() + " "); 
			        }
			      }
			      System.out.print("\n");
			      }
		}

	}




	}
