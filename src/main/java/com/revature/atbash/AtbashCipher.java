package com.revature.atbash;

public class AtbashCipher {

    public static void main(String[] args) {
        System.out.println(atbashEncrypt("Hello World!"));
        System.out.println(atbashEncrypt("apple"));
        System.out.println(atbashEncrypt("Apple"));
    }

    private static String atbashEncrypt(String s){
        //convert string to charArray
        char[] charArr = s.toCharArray();

        //iterate over each char to convert each to the correct value
        for(int i = 0; i < charArr.length; i++){
            if(charArr[i] == 'A' || charArr[i] == 'a') charArr[i] = (char) (charArr[i] + 25);
            else if(charArr[i] == 'B' || charArr[i] == 'b') charArr[i] = (char) (charArr[i] + 23);
            else if(charArr[i] == 'C' || charArr[i] == 'c') charArr[i] = (char) (charArr[i] + 21);
            else if(charArr[i] == 'D' || charArr[i] == 'd') charArr[i] = (char) (charArr[i] + 19);
            else if(charArr[i] == 'E' || charArr[i] == 'e') charArr[i] = (char) (charArr[i] + 17);
            else if(charArr[i] == 'F' || charArr[i] == 'f') charArr[i] = (char) (charArr[i] + 15);
            else if(charArr[i] == 'G' || charArr[i] == 'g') charArr[i] = (char) (charArr[i] + 13);
            else if(charArr[i] == 'H' || charArr[i] == 'h') charArr[i] = (char) (charArr[i] + 11);
            else if(charArr[i] == 'I' || charArr[i] == 'i') charArr[i] = (char) (charArr[i] + 9);
            else if(charArr[i] == 'J' || charArr[i] == 'j') charArr[i] = (char) (charArr[i] + 7);
            else if(charArr[i] == 'K' || charArr[i] == 'k') charArr[i] = (char) (charArr[i] + 5);
            else if(charArr[i] == 'L' || charArr[i] == 'l') charArr[i] = (char) (charArr[i] + 3);
            else if(charArr[i] == 'M' || charArr[i] == 'm') charArr[i] = (char) (charArr[i] + 1);
            else if(charArr[i] == 'N' || charArr[i] == 'n') charArr[i] = (char) (charArr[i] - 1);
            else if(charArr[i] == 'O' || charArr[i] == 'o') charArr[i] = (char) (charArr[i] - 3);
            else if(charArr[i] == 'P' || charArr[i] == 'p') charArr[i] = (char) (charArr[i] - 5);
            else if(charArr[i] == 'Q' || charArr[i] == 'q') charArr[i] = (char) (charArr[i] - 7);
            else if(charArr[i] == 'R' || charArr[i] == 'r') charArr[i] = (char) (charArr[i] - 9);
            else if(charArr[i] == 'S' || charArr[i] == 's') charArr[i] = (char) (charArr[i] - 11);
            else if(charArr[i] == 'T' || charArr[i] == 't') charArr[i] = (char) (charArr[i] - 13);
            else if(charArr[i] == 'U' || charArr[i] == 'u') charArr[i] = (char) (charArr[i] - 15);
            else if(charArr[i] == 'V' || charArr[i] == 'v') charArr[i] = (char) (charArr[i] - 17);
            else if(charArr[i] == 'W' || charArr[i] == 'w') charArr[i] = (char) (charArr[i] - 19);
            else if(charArr[i] == 'X' || charArr[i] == 'x') charArr[i] = (char) (charArr[i] - 21);
            else if(charArr[i] == 'Y' || charArr[i] == 'y') charArr[i] = (char) (charArr[i] - 23);
            else if(charArr[i] == 'Z' || charArr[i] == 'z') charArr[i] = (char) (charArr[i] - 25);
        }

        return new String(charArr);
    }

}