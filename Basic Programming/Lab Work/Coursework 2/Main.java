public class Main {

    public static void main(String[] args) {
        // Do not change
        
        task1("Rahman Arif/17-02-2003/Jakarta/M/A/WNI/Single");
        task1("Alice Rebecca/17-03-1984/London/F/O/WNA/Married");
        task2("Ahmad");
        task2("Zuhro");
        task3();
        task4("150+11");
        task4("110+23");
    }
    
    public static String task1(String data){
        
        int startPosition = 0;
        //find the first slash position within string stored in variable named data
        int slashPosition = data.indexOf("/");
        //chop the string from the beginning to the first slash position (/ is excluded)
        String name = data.substring(startPosition, slashPosition);
        //split and reverse the name to correct firstname and lastname order
        String lastName=name.substring(startPosition, name.indexOf(" "));
        String firstName=name.substring(name.indexOf(" ")+1);
        //get the first character of first and last name
        String initial = ""+ firstName.charAt(0) + lastName.charAt(0);
        
        //chop the string stored in variable named data from the first slash (excluded) to the end
        data = data.substring(slashPosition+1);
        //find the position of the next slash
        slashPosition = data.indexOf("/");
        //chop the date of birth dd-mm-yyyy
        String birthDate = data.substring(startPosition, slashPosition);
        //chop the year of birth yyyy
        String birthYear = birthDate.substring(6);
        //count the age 
        int age = 2024 - (Integer.parseInt(birthYear));
        
        //chop the string stored in variable named data from the second slash (excluded) to the end
        data = data.substring(slashPosition+1);
        //find the position of the next slash
        slashPosition = data.indexOf("/");
        //chop the palce of birth
        String birthPlace = data.substring(0, slashPosition);
        
        //chop the string stored in variable named data from the third slash (excluded) to the end
        data = data.substring(slashPosition+1);
        //find the position of the next slash
        slashPosition = data.indexOf("/");
        //chop the sex data M or F
        String sex = data.substring(startPosition, slashPosition);
        //change M to Male and F to Female
        sex= sex.replace("M","Male");
        sex= sex.replace("F", "Female");
        
        //chop the string stored in variable named data from the fourth slash (excluded) to the end
        data = data.substring(slashPosition+1);
        //find the position of the next slash
        slashPosition = data.indexOf("/");
        //chop the blood type data
        String bloodType = data.substring(startPosition, slashPosition);
        
        //chop the string stored in variable named data from the fifth slash (excluded) to the end
        data = data.substring(slashPosition+1);
        //find the position of the next slash
        slashPosition = data.indexOf("/");
        //chop the citizenship data
        String citizen = data.substring(startPosition, slashPosition);
        //check whether local citizen
        boolean isLocalCitizenB = citizen.equals("WNI");
        //change true or false to Yes or No
        String isLocalCitizen =""+isLocalCitizenB;
        isLocalCitizen = isLocalCitizen.replace("true","Yes");
        isLocalCitizen = isLocalCitizen.replace("false", "No");
        
        //chop the string stored in variable named data from the sixth slash (excluded) to the end
        data = data.substring(slashPosition+1);
        //chop the marital status data
        String maritalStatus = data.substring(startPosition);
        
        //generating the output
        String line1 = "Full Name: " + firstName + " "+lastName+ " (" + initial + ")";
        String line2 = "Age: " + age;
        String line3 = "City of Birth: " + birthPlace;
        String line4 = "Sex: " + sex;
        String line5 = "Blood Type: " + bloodType;
        String line6 = "Local citizen: " + isLocalCitizen;
        String line7 = "Martial status: " + maritalStatus;
        
        //store the output to variable named output
        String output = line1 + "\n" + line2 + "\n" + line3+ "\n" + line4 + "\n" + line5 + "\n" + line6 + "\n" + line7;
        
        //print out the output
        System.out.println(output);
  
        return output; 
    }
    
    public static String task2(String name){
       
        //store all alphabet to single string
        //each alphabet with its index: a -> 0, b->1. ... z ->25
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        
        //change the input to lowercase, since tha alphabets are all in lowercase
        name = name.toLowerCase();
        
        //set the key
        
        int key = 5;
        
        //shift each character to 5 places right, if more than 25 then it back to 0
        String k1 = "" + alphabet.charAt( (alphabet.indexOf (name.charAt(0)) + key)%26);
        String k2 = "" + alphabet.charAt( (alphabet.indexOf (name.charAt(1)) + key)%26);
        String k3 = "" + alphabet.charAt( (alphabet.indexOf (name.charAt(2)) + key)%26);
        String k4 = "" + alphabet.charAt( (alphabet.indexOf (name.charAt(3)) + key)%26);
        String k5 = "" + alphabet.charAt( (alphabet.indexOf (name.charAt(4)) + key)%26);
        
        //change the first character to upper case
        k1 = k1.toUpperCase();
        
        //generate the output
        String output = k1 + k2 + k3 + k4 + k5;
        
        //print out the output
        System.out.println(output);
        
        //return the output
        return output;
    }
    
    public static void task3(){
        
        //declare and initialize the variables
        int priceOfCoffee = 15000;
        int priceOfTea = 10000;
        int priceOfPizza = 45000;
        String currency = "$";
        int numOfCoffee = 3;
        int numOfTea = 5;
        int numOfPizza = 1; 
        String nameOfCustomer = "Razan";
        
        double discountOfCoffee = (1 - 0.1);
        double discountOfTea = (1 - 0.15);
        double discountOfPizza = (1 - 0.05);
        double tax = 0.11;
        double taxPercentage = tax*100;
        double taxValue = (1 + tax);
        double cashInHand = 200000;
        
        // count number of items
        int numOfItems = numOfCoffee + numOfTea + numOfPizza;

        // count the total price
        double coffeePrice = numOfCoffee*priceOfCoffee*discountOfCoffee;
        double teaPrice = numOfTea*priceOfTea*discountOfTea;
        double pizzaPrice = numOfPizza*priceOfPizza*discountOfPizza;
        double totalPrice = coffeePrice + teaPrice + pizzaPrice;
        // count the total price after tax
        double totalPriceAfterTax = totalPrice*taxValue;
        // print total price
        System.out.println("Total Price: "+ currency + totalPrice);
        
        // count the change 
        double change = cashInHand - totalPriceAfterTax;
        //printing the changeis
        System.out.println("Change: " + currency + change);

        // count amount of donation
        double donation = change%1000;
        System.out.println("Donation: "+ currency + donation);

         
        // print the receipt
        System.out.println("-----------------------------------\n");
        System.out.println("Name Of Customer: "+ nameOfCustomer);
        System.out.println("ORDERS");
        System.out.println("Number of items: " + numOfItems);
        System.out.println("Tea\t|\t" + numOfTea + "\t|\t"  + teaPrice);
        System.out.println("Coffee\t|\t" + numOfCoffee + "\t|\t"  + coffeePrice);
        System.out.println("Pizza\t|\t" + numOfPizza + "\t|\t"  + pizzaPrice);
        System.out.println("Total Before Tax: "+ currency + totalPrice);
        System.out.println("Tax: " + taxPercentage + "%");
        System.out.println("Total After Tax: "+ currency + totalPriceAfterTax);
        System.out.println("Amount Paid: "+ currency + cashInHand);
        System.out.println("Change: " + currency + change);
        System.out.println("Donation Amount: " + currency + donation);
        System.out.println("\n-----------------------------------");
    }
    
    public static void task4(String NumberOp){
        
        // get the first digit
        String firstDigit = "" + NumberOp.charAt(0);
        firstDigit = firstDigit.replace("1", "one hundred");
        
        // get the second digit
        String secondDigitA = "" + NumberOp.charAt(1);
        String secondDigitB = "" + NumberOp.charAt(4);
        // parse into int for second digit
        int sndDigitA = Integer.parseInt(secondDigitA); 
        int sndDigitB = Integer.parseInt(secondDigitB); 
        // add value of second digit
        int addValue = sndDigitA + sndDigitB;
        String secondDigit = "" + addValue;
        // replace value of second digit
        secondDigit = secondDigit.replace("2", "twenty");
        secondDigit = secondDigit.replace("3", "thirty");
        secondDigit = secondDigit.replace("4", "fourty");
        secondDigit = secondDigit.replace("5", "fifty");
        secondDigit = secondDigit.replace("6", "sixty");
        secondDigit = secondDigit.replace("7", "seventy");
        secondDigit = secondDigit.replace("8", "eighty");
        secondDigit = secondDigit.replace("9", "ninety");

         // get the third digit
        String thirdDigitA = "" + NumberOp.charAt(2);
        String thirdDigitB = "" + NumberOp.charAt(5);
        // parse into int for third digit
        int trdDigitA = Integer.parseInt(thirdDigitA); 
        int trdDigitB = Integer.parseInt(thirdDigitB); 
        // add value of second digit
        int trdAddValue = trdDigitA + trdDigitB;
        String thirdDigit = "" + trdAddValue;
        // replace value of second digit
        thirdDigit = thirdDigit.replace("0", "zero");
        thirdDigit = thirdDigit.replace("1", "one");
        thirdDigit = thirdDigit.replace("2", "two");
        thirdDigit = thirdDigit.replace("3", "three");
        thirdDigit = thirdDigit.replace("4", "four");
        thirdDigit = thirdDigit.replace("5", "five");
        thirdDigit = thirdDigit.replace("6", "six");
        thirdDigit = thirdDigit.replace("7", "seven");
        thirdDigit = thirdDigit.replace("8", "eight");
        thirdDigit = thirdDigit.replace("9", "nine");
        
        //print the output
        String output= firstDigit + " and " + secondDigit + " " + thirdDigit;
        System.out.println(output);
    }
}
