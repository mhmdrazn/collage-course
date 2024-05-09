import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Do not change
        
        task1();
        task2();
        task3();
    }
    
   public static void task1(){
        System.out.println("===========================================");
        System.out.println("<b> Alpro Medical Diagnostic Centre</b>");
        System.out.println("-------------------------------------------");
        
        //getting user input
        Scanner sc = new Scanner(System.in);
        System.out.print("Please input your name : ");
        String name = sc.nextLine();

        System.out.print("Please input your sex ( m / f ) : ");
        String sex = sc.nextLine();
        
        System.out.print("Please input your height ( cm ) : ");
        int height = sc.nextInt();
        sc.nextLine();
        
        System.out.print("Please input your weight ( kg ) : ");
        int weight = sc.nextInt();
        sc.nextLine();
        
        //generating output
        System.out.println("-------------------------------------------");
        
        
        String salutation;
        if(sex.equals("m"))
        {
            salutation = "Mr";
        } else {
            salutation = "Ms";
        }
        
        //computing Body Mass Index (BMI)
        double heightInMeter = height/100.0;
        double bmi = weight/(heightInMeter*heightInMeter);
        String bmiCategory;
        
        // Based on https://www.siloamhospitals.com/en/informasi-siloam/artikel/cara-menghitung-bmi
        if(bmi < 18.5)
        {
            bmiCategory = "underweight";
        } else if (bmi < 25)
        {
            bmiCategory = "normal";
        } else if (bmi < 30)
        {
            bmiCategory = "overweight";
        } else {
            bmiCategory = "obese";
        }
        
        System.out.println("Customer Name\t: "+ salutation + " " + name );
        System.out.println("BMI\t\t: "+ bmi);
        System.out.println("Category\t: <b><font color='b'>"+ bmiCategory +"</b></font>");
        System.out.println("===========================================");
         
    }
    
    public static void task2(){
        //getting user input
        Scanner sc = new Scanner(System.in);
        System.out.print("Please input your name \t: ");
        String fullName = sc.nextLine();
        System.out.print("Please input your student id \t: ");
        String studentID = sc.nextLine();
        
        //generating output
        System.out.println();
        System.out.println("-------------------------------------------------------------------------------");
        System.out.println("<b>Academic Report</b>");
        System.out.println("-------------------------------------------------------------------------------");
        System.out.println("Student ID.:" + studentID + "\t\t" + "Fullname:" + fullName);
        System.out.println("===============================================================================");
        System.out.println("<b>No.\tCode\tName\t\t\t\tCredit\tGrade\tScore\tW.Score</b>");
        
        //creating a variable of type Scanner
        Scanner scFile = new Scanner(Main.class.getResourceAsStream("transcript.csv"));
        //declare variable to read file per line
        String line;
        //declare array variable of String
        String [] lineSplit;
        
        //initialize varibles to store credits, total credits, and total to 0
        int credit = 0;
        int totalCredit = 0;
        double totalScore = 0;
        
        //declare and initialize the variables
        int no=0;
        String code;
        String course;
        String grade;
        double score;
        double wscore;
        
        // read the file from beginning to the end
        
        while(scFile.hasNext()){
            //read the current line
            line = scFile.nextLine();
            //split the current line by comma and save to an array variables
            lineSplit = line.split(",");
            
            code=lineSplit[0];
            course=lineSplit[1];
            credit = Integer.parseInt(lineSplit[2]);
            grade=lineSplit[3];
            
            //update the total credit by adding the current line credit
            totalCredit += credit;
            
            score= convertGradeToNumeric(grade);
            wscore= credit * score;
            //update the total score by adding the current line weighted score
            totalScore += wscore;
            
            //print out the current line
            System.out.println(no+"\t"+code+"\t"+course+"\t\t"+credit+"\t"+grade+"\t"+score+"\t"+wscore);
            //update varible no by 1
            no++;
            
        }
        System.out.println("-------------------------------------------------------------------------------");
        
        double cgpa = totalScore/totalCredit;
        String category="";
        if (cgpa>= 2.0)  category="passed";
        else category="failed";
        
        System.out.println("\t\t\t CGPA \t:<b>"+cgpa+" ("+category+")</b>");
        System.out.println("-------------------------------------------------------------------------------");
        
    }
    
    public static double convertGradeToNumeric(String grade){
        switch(grade){
            case "A":
                return 4.0;
            case "AB":
                return 3.5;
            case "B":
                return 3.0;
            case "BC":
                return 2.5;
            case "C":
                return 2.0;
            case "D":
                return 1.0;
            case "E":
                return 0.0;
        }
        return 0.0;
    }
    
    
    public static void task3(){
        Scanner scan = new Scanner(Main.class.getResourceAsStream("gacha.csv"));
        int t = scan.nextInt();
        scan.nextLine();
        
        int [] playerID = new int[t];
        String [] name = new String[t];
        int [] nextCoin1 = new int[t];
        int [] nextCoin2 = new int[t];
        
        int luckiest = 0;
        int unluckiest = 0;
        
        int firstCoin;
        int secondCoin;
        
        System.out.println("Luck Status\tID\tPlayer\t\tNext 5-Star Item");
        System.out.println("--------------------------------------------------------");

        
        for (int i=0; i<t; i++){
            String line = scan.nextLine();
            String [] lineSplit = line.split(", ");
           
            playerID[i] = Integer.parseInt(lineSplit[0]);
            name[i] = lineSplit[1];
            firstCoin = Integer.parseInt(lineSplit[2]);
            secondCoin = Integer.parseInt(lineSplit[3]);
            
            if(firstCoin%2 == 0 && secondCoin%2 == 0 || firstCoin%2 == 1 && secondCoin%2 == 1){
                nextCoin1[i] = Math.abs(firstCoin-secondCoin); 
                if(nextCoin1[i] != 0) luckiest = i;
            } else if (firstCoin%2 == 1 && secondCoin%2 == 0 || firstCoin%2 == 0 && secondCoin%2 == 1){
                nextCoin2[i] = (firstCoin+secondCoin)/2;
                if(nextCoin2[i] != 0) unluckiest = i;
            }
            if(nextCoin1[i] == 0) nextCoin1[i] = 100;
        }
        
        for (int i=0; i<t; i++) {
            if (nextCoin1[i] < nextCoin1[luckiest]) luckiest = i;
            if (nextCoin2[i] > nextCoin2[unluckiest]) unluckiest = i;
        }
        
        System.out.println("Luckiest\t"+playerID[luckiest]+"\t"+name[luckiest]+"\t\t"+nextCoin1[luckiest]+" coins"); 
        System.out.println("Unluckiest\t"+playerID[unluckiest]+"\t"+name[unluckiest]+"\t\t"+nextCoin2[unluckiest]+" coins"); 
    }
}
