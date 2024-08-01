package com.project.acc.MavenProjectActivity;
import java.util.*;

public class mapProject {

	public static void main(String[] args) {
		SortedMap<String, String> marketProjects = new TreeMap<String,String>();

      
        marketProjects.put("Technology", "Project Alpha");
        marketProjects.put("Finance", "Project Beta");
        marketProjects.put("Healthcare", "Project Gamma");
        marketProjects.put("Education", "Project Delta");

       
        System.out.println("Market to Project Mapping:");
        for (String market : marketProjects.keySet()) {
            System.out.println("Market: " + market + ", Project: " + marketProjects.get(market));
        }

       
        String marketToCheck = "Finance";
        if (marketProjects.containsKey(marketToCheck)) {
            System.out.println("Project for " + marketToCheck + ": " + marketProjects.get(marketToCheck));
        } else {
            System.out.println("No project found for market: " + marketToCheck);
        }

	}

}
