class Palindrome{
public static void main(String args[]){
ArrayList <integer> list= new ArrayList<integer>();
    list.add(121);
    int r; sum=0,temp;
    temp=list;
    while (list>0){
    r=list%10;
    sum=(sum*10)+r;
    list=list/10;
    }
    

