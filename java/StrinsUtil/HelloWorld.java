

import org.apache.commons.lang3.*;

public class HelloWorld {

    public static void main(String[] args) {
        System.out.println("Hello, World");

  	//String serialNo= "004034556";
	//
String serialNo= "kkk";
	//String serialNo= "004-034556";
	//String serialNo= "";
	//String serialNo= " ";
	String[] parts = serialNo.split("-");
	System.out.println("length="+parts.length);


	if(!StringUtils.isEmpty(parts[0]) && StringUtils.isNumeric(parts[0])) {
	    	String string1 = parts[0]; // 004
    		//String string2 = parts[1]; // 034556
		System.out.println("part1="+string1);
		//System.out.println("part2="+string2);	
		int retentionDays = Integer.parseInt(parts[0]);
		System.out.println("retentionDays="+retentionDays);
	}

/*
	//if(!parts[0].isEmpty() && parts.length == 2) {
	if(!parts[0].isEmpty() && parts.length == 2) {
	    	String string1 = parts[0]; // 004
    		//String string2 = parts[1]; // 034556
		System.out.println("part1="+string1);
		//System.out.println("part2="+string2);	
		int retentionDays = Integer.parseInt(parts[0]);
		System.out.println("retentionDays="+retentionDays);
	}
*/
    }
}