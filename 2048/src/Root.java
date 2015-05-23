
import java.util.Random;
import javax.swing.JFrame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chamara
 */
public class Root {
   static int[][] arr=new int[4][4];
   static int marks;
   static boolean A=false;
   static int xPre;
   static int yPre;
   static int xTotal;
   static int yTotal;
   
   public static void testGameOver(){
       for(int i=0;i<4;i++){
           for(int j=0;j<3;j++){
               if((arr[i][j]==arr[i][j+1])||(arr[j][i]==arr[j+1][i])||arr[i][j]==0||arr[j][i]==0||arr[3][3]==0){
                   return;
  
               }
           }
       
       
       }
       Frame.jLabel18.setVisible(true);
   }
   public static int setNum(){
       int num;            
           Random r= new Random();
           num=r.nextInt(2)+2;
           if(num==2){
               return num;
           }
           num=r.nextInt(2)+2;
           if(num==2){
               return num;
           }
           num=r.nextInt(2)+2;
           if(num==2){
               return num;
           }
           return 4;  
   }
   public static void addNum(){
       A=false;
       add=false;
       int x=0,y=0;
       Random r= new Random();
       boolean b=false;
       l1:for(int i=0;i<4;i++){
           for(int j=0;j<4;j++){
               if(arr[i][j]==0){
                   b=true;
                   break l1;
               }
           }
       }
           
          if(b){
           while (b) {  
           x=r.nextInt(4);
           y=r.nextInt(4);
           if(arr[x][y]==0){
               b=false;
           }
       }
       arr[x][y]=setNum();
       }
       
   }
   static boolean l=true;
   static boolean r=true;
   static boolean u=true;
   static boolean d=true;
   static boolean add=false;
   public static void playL(){
        for(int y=0;y<4;y++){
            for(int x=0;x<4;x++){
                for(int a=x+1;a<4;a++) {
                    if(arr[y][x]==0&&arr[y][a]!=0){
                        arr[y][x]=arr[y][a];
                        arr[y][a]=0;
                        x++;
                        A=true;
                        
                    }  
                        
                    
                }
                

            }
        }
        
        if(l){
           addL(); 
        }
        if((l==false&&A==true)||(l==false&&add==true)){
            addNum();
        }
        l=true;
   }
    public static void playR(){
        for(int y=0;y<4;y++){
            for(int x=3;x>-1;x--){
                for(int a=x-1;a>-1;a--) {
                    if(arr[y][x]==0&&arr[y][a]!=0){
                        arr[y][x]=arr[y][a];
                        arr[y][a]=0;
                        x--;
                        A=true;
                    }  
                        
                    
                }
                

            }
        }
        if(r){
           addR(); 
        }
        if((r==false&&A==true)||(r==false&&add==true)){
            addNum();
        }
        r=true;
            
   }
   public static void playU(){
        for(int x=0;x<4;x++){
            for(int y=0;y<4;y++){
                for(int a=y+1;a<4;a++) {
                    if(arr[y][x]==0&&arr[a][x]!=0){
                        arr[y][x]=arr[a][x];
                        arr[a][x]=0;
                        y++;
                        A=true;
                    }  
                        
                    
                }
                

            }
        }
        if(u){
           addU(); 
        }
        if((u==false&&A==true)||(u==false&&add==true)){
            addNum();
        }
        u=true;
            
   }
   public static void playD(){
        for(int x=0;x<4;x++){
            for(int y=3;y>-1;y--){
                for(int a=y-1;a>-1;a--) {
                    if(arr[y][x]==0&&arr[a][x]!=0){
                        arr[y][x]=arr[a][x];
                        arr[a][x]=0;
                        y--;
                        A=true;
                    }  
                        
                    
                }
                

            }
        }
        if(d){
           addD(); 
        }
        if((d==false&&A==true)||(d==false&&add==true)){
            addNum();
        }
        d=true;
            
   }
   public static void addL(){
       l=false;
       for(int y=0;y<4;y++){
            for(int x=0;x<4;x++){
                for(int a=x+1;a<4;a++) {
                    if(arr[y][x]==arr[y][a]&&arr[y][x]!=0){
                        arr[y][x]+=arr[y][a];
                        marks+=arr[y][x];
                        arr[y][a]=0;
                        add=true;
                    }  
                    x++;    
                    
                }
                

            }
        }    
        playL();
    
    }
    public static void addR(){
        r=false;
        for(int y=0;y<4;y++){
            for(int x=3;x>-1;x--){
                for(int a=x-1;a>-1;a--) {
                    if(arr[y][x]==arr[y][a]&&arr[y][x]!=0){
                        arr[y][x]+=arr[y][a];
                        marks+=arr[y][x];
                        arr[y][a]=0;
                        add=true;
                    }  
                    x--;    
                    
                }
                

            }
        }    
        playR();    
   }
   public static void addU(){
       u=false;
        for(int x=0;x<4;x++){
            for(int y=0;y<4;y++){
                for(int a=y+1;a<4;a++) {
                    if(arr[y][x]==arr[a][x]&&arr[y][x]!=0){
                        arr[y][x]+=arr[a][x];
                        marks+=arr[y][x];
                        arr[a][x]=0;
                        add=true;
                    }  
                    y++;    
                    
                }
                

            }
        }    
        playU();    
   }
   public static void addD(){
       d=false;
        for(int x=0;x<4;x++){
            for(int y=3;y>-1;y--){
                for(int a=y-1;a>-1;a--) {
                    if(arr[y][x]==arr[a][x]&&arr[y][x]!=0){
                        arr[y][x]+=arr[a][x];
                        marks+=arr[y][x];
                        arr[a][x]=0;
                        add=true;
                    }  
                    y--;    
                    
                }
                

            }
        }    
        playD();    
   }
   
   public static void mousePressed(int x,int y){
        xPre=x;
        yPre=y;
    }
   public static void mouseDragged(int x,int y){
        xTotal+=x-xPre;
        xPre=x;
        yTotal+=y-yPre;
        yPre=y;
    }
   public static void mouseReleased(){
        
       rotate(xTotal, yTotal);
        xTotal=0;
        yTotal=0;
        
    }
    public static void rotate(int x,int y){
        if((x>=0&&y>=0&&x>y)||(x>=0&&y<=0&&x>(-1*y))){
            //right
            
            playR();
        }
        if((x>=0&&y>=0&&y>x)||(x<=0&&y>=0&&y>(-1*x))){
            //down
            playD();
        }
        
        if((x<=0&&y>=0&&(-1*x)>y)||(x<=0&&y<=0&&(-1*x)>(-1*y))){
            //left
            playL();
        }
        
        if((x<=0&&y<=0&&(-1*y)>(-1*x))||(x>=0&&y<=0&&(-1*y)>x)){
            //up
            playU();
        }
        
    }
      
   
}
