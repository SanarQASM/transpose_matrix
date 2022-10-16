package first_guthub;

import java.util.Scanner;

public class first_Project {//this code used for transpose matrix , dynamic code 
        public static int colomn_lenght=0;
        public static int row_lenght=0;
        public static  Scanner scn=new Scanner (System.in);
	public static void main(String[] args) {
		get_lenght();
		Entered_number_for_matrix();
		again();
	}
	private static void get_lenght() {
		try {
			System.out.println("please Enter your row lenght:⩔⩔");
			System.out.print("Enter here: ");
			row_lenght =scn.nextInt();
			System.out.println("Please Enter your colomn length:⩔⩔");
			System.out.print("Enter here: ");
			colomn_lenght=scn.nextInt();
            }
		catch (Exception e) {
			System.out.println("please Enter correct number!!!");
			System.out.println("⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝");
			get_lenght();
		}
	    finally {
		System.out.println("your lenght is: ");
		System.out.println("lenght of row is: "+row_lenght);
		System.out.println("lenght of colomn is: "+colomn_lenght);    
	     }
	}
	private static void Entered_number_for_matrix() {
	    	 int[][]GET_number=new int[row_lenght][colomn_lenght];
		try {
			int count=1;
			System.out.println("please Enter your number for row AND colomn:⩔⩔");
			for (int i=0;i<row_lenght;i++) {
		    	for (int j=0;j<colomn_lenght;j++) {
		    		System.out.println("Enter "+count+"Th number:");
		    	GET_number[i][j]=scn.nextInt();
		    	count++;
		    	System.out.println("⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝");
		        }
			}
		}
		catch (Exception e) {
			System.out.println("Please complete the application correctly!!!");
			System.out.println("⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝");
			Entered_number_for_matrix();
		}finally {
			System.out.println("YOur normal matrix is: ");
	    	for(int []x:GET_number){
	            for(int y:x){
	            System.out.print(y+" ");
	            }
	            System.out.println();
	        }
	    	transpose(GET_number);
		}
	}
	private static void transpose(int[][] gET_number) {
		int transpose[][]=new int[colomn_lenght][row_lenght];
		for (int i=0;i<row_lenght;i++) {
		     for (int j=0;j<colomn_lenght;j++) {
		    	 transpose[j][i]=gET_number[i][j];
		     }
		}
		System.out.println("YOur transpose is: ");
		for(int []x:transpose){
	        for(int y:x){
	        System.out.print(y+" ");
	        }
	        System.out.println();
	           }
	}
	private static void again() {
		System.out.println("DO you want to repeat it?");
		System.out.println("Please Entered \"1\" for \"yes\" AND \"2\" for \"no\"");
		int again=scn.nextInt();
		if (again==1) {
			main(null);//return to main method
		}else if(again==2) {
			System.out.println("you are quite...");
		}else {
			System.out.println("Please Enter the requested Number!!!");
			again();//return to again method for repeat
		}
	        }
	}
