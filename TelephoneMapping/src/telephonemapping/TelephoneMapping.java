package telephonemapping;
import java.util.Scanner;

public class TelephoneMapping {
    
    public static void main(String[] args) {
        String word;
        String refinedString;
        String phoneNumber = "";
        String finalPhoneNumber = "";
        char []nums = {'1', '2', '3', '4', '5', '6', '7', '8', '9', '0'};
        Scanner input = new Scanner(System.in);
        while(input.hasNext()){
            word = input.next();
            if(word.compareTo("-1") == 0){
                break;
            }
            if(word.length() > 7)
                refinedString = word.substring(0,11);
            else
                refinedString = word;
            
            refinedString = refinedString.toLowerCase();
            for(int i = 0; i < refinedString.length(); i++){
                for(int j = 0; j < nums.length; j++){
                    if(refinedString.charAt(i) == nums[j]){
                        phoneNumber += nums[j];
                    }
                }
                switch(refinedString.charAt(i)){
                    case 'a': 
                    case 'b':
                    case 'c': phoneNumber += "2";
                    break;
                    case 'd':
                    case 'e':
                    case 'f': phoneNumber += "3";
                    break;
                    case 'g':
                    case 'h':
                    case 'i': phoneNumber += "4";
                    break;
                    case 'j':
                    case 'k':
                    case 'l': phoneNumber += "5";
                    break;
                    case 'm':
                    case 'n':
                    case 'o': phoneNumber += "6";
                    break;
                    case 'p':
                    case 'q':
                    case 'r':
                    case 's': phoneNumber +=  "7";
                    break;
                    case 't':
                    case 'u':
                    case 'v': phoneNumber +=  "8";
                    break;
                    case 'w':
                    case 'x':
                    case 'y':
                    case 'z': phoneNumber += "9";
                    break;
                }
            }
            int len = phoneNumber.length();
            for(int j = 0; j < len; j++){
                if(len > 7){
                    switch(j){
                        case 1: 
                        case 4:
                        case 7: finalPhoneNumber += "-";
                    }
                }
                else{
                    switch(j){
                        case 3: finalPhoneNumber += "-";
                    }
                }
                finalPhoneNumber += phoneNumber.charAt(j);
            }
            System.out.println(finalPhoneNumber);
            phoneNumber = "";
            finalPhoneNumber = "";
        }
        
    }   
}
