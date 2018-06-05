package com.bruce;

import java.util.Scanner;
/*陽春版本販賣機*/
class Coins{//硬幣類別
    private int one;
    private int five;
    private int ten;
    private int money;
    public void setMoney(int n){//應找金額硬幣數量
            money = n;
            ten=(int)n/10;
            five = (int)(n-ten*10)/5;
            one = n-(ten*10+five*5);
    }
    public void getMoney(){//印出硬幣數量
            System.out.println("退"+ten+"個10元硬幣");
            System.out.println("退"+five+"個5元硬幣");
            System.out.println("退"+one+"個1元硬幣");
            System.out.println("共退"+money+"元");
    }
}        
class Vma{
            private int money;
            private int[] moneyObj;
            public void inPutMoney(int n){//投幣
                    money = n;
            }
            public void outPutMoney(){//找零
                    Coins c = new Coins();
                    c.setMoney(this.money);
                    c.getMoney();
            }
            public void setObj(String s,int s1 , String ss,int ss1 , String sss,int sss1){//設定三種商品
                    int[] moneyObj1 = {s1,ss1,sss1};
                    moneyObj = moneyObj1;
                    System.out.print("品項   1:"+s+"   ");
                    System.out.print("2:"+ss+"   ");
                    System.out.print("3:"+sss+"\n\n");
            }
            public void moneyCount(int n){//計算金額
                    int a = money;
                    if((a-n)>=0){
                            money-=n;
                    }else{
                            System.out.println("投入金額不足");
                    }
                    
            }
            public int chooseObj(int n){//選擇項目
                    if(n==1)
                            return moneyObj[0];
                    else if(n==2)
                            return moneyObj[1];
                    else if(n==3)
                            return moneyObj[2];
                    else
                            System.out.println("輸入錯誤");
                            return 0;
            }
}
public class Practice4 {
    public static void main(String[] args){
            Scanner s = new Scanner(System.in);           
            System.out.println("******自動販賣機******");
            Vma v = new Vma();
            v.setObj("可樂100元",100,"紅茶50元",50,"果汁120元",120);
            System.out.print("@@@@@@請輸入投幣金額:");
            int n=s.nextInt();
            v.inPutMoney(n);
            System.out.print("\n======請輸入購買品項例如買第一個品項就輸入1)");
            int n1 = s.nextInt();
            v.moneyCount(v.chooseObj(n1));
            v.outPutMoney();
            
    }
}