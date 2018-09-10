import java.io.*;
class stk
{
  int ele;
  int top=-1;
int arr[]= new int[15];
  void push()throws IOException
  {
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    System.out.println("enter the number: ");
    ele=Integer.parseInt(br.readLine());
    if(top==14) 
     System.out.println("stsck is overflow");
    else
     arr[++top]=ele;
    }
   void pop()
   {
     if(top==-1)
     System.out.println("stack is underflow");
     else
      top=top-1;
    }
    void display()
    {
     int temp;
     for(temp=0;temp<=top;temp++)
     System.out.println(arr[temp]);
     }
     public static void main(String args[])throws IOException
     {
       int ch;
       stk obj=new stk();
       
       while(true)
       {
       System.out.println("1.push 2.pop 3.display 4.exit enter your choice: ");
       BufferedReader br1=new BufferedReader(new InputStreamReader(System.in));
       ch=Integer.parseInt(br1.readLine());
       switch(ch)
       {
         case 1:
          obj.push();
          break;
        case 2:
          obj.pop();
          break;
        case 3:
          obj.display();
          break;
       case 4:
         System.exit(0);
       }
     }
 }
}
