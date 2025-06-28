package Hashing;
//character hashing or basic understanding using loop
public class Hashing {
    public static void main(String[] args) {
        char [] character=new char [5];
        character[0]='a';
        character[1]='b';
        character[2]='A';
        character[3]='a';
        character[4]='e';
        int n=256; 
        int [] hash=new int [n];
        for(int i=0;i<5;i++){
            hash[((int)(character[i]))%n]+=1;
        }
        char c='a';
        System.out.println(hash[(int)c%n]);
    }
}
