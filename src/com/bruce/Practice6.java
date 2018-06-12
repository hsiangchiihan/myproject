package com.bruce;

public class Practice6{
	
    public static void main(String args[]){	
    String str =new String();
    int table[][]=new int[5][5];
    int i,j,e=0,x,bk;
    System.out.println("顯示初始數據為：");
    for(i=0;i<5;i++){
    str="";
        for (j=0;j<5;j++){						
        str=str+" "+table[i][j];
            }
        System.out.println(str);
        }
    while(e==0){
    x=(int)(Math.random()*25)+1;
    bk=1;
    for(i=0;i<5;i++){
    for(j=0;j<5;j++){
        if (table[i][j]==x){
        bk=2;
        break;
    }else {
        if(table[i][j]==0){
        table[i][j]=x;
        bk=2;
        break;
        }
    }
 }
    if(bk==2)break;
}
    int sum=0;
    for(i=0;i<5;i++){
        for (j=0;j<5;j++){
            if(table[i][j]!=0)
            sum=sum+1;
            }
        }
    if (sum==25) e=1;
    }
    System.out.println("顯示隨機變化後的數據為： ");
    for(i=0;i<5;i++){
    str="";
    for (j=0;j<5;j++){
    str=str+" "+table[i][j];
    }
    System.out.println(str);
    }
}

}