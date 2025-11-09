#include<stdio.h>
#include<conio.h>
#include<ctype.h>
int main()
{
    char str[100];
    int i,flag;
    printf("Enter a String : ");
    gets(str);
    /* Replacing _ and - with ~ */
    i=0;
    while(str[i]!='\0')
    {
       if(str[i]=='_' || str[i]=='-')
         str[i]='~';
         
       i++;  
    }
    
    /* Capitalizing the Alternate Letters */
    i=0;
    flag=0;
    while(str[i]!='\0')
    {
	   if((str[i]>=65 && str[i]<=90)||(str[i]>=97 && str[i]<=122))
	   {
	      if(flag==0)
	      {
             str[i]=toupper(str[i]);
             flag=1;
          }
          else
          {
	   	     str[i]=tolower(str[i]);
		   	 flag=0;
		  }
       }
       else if(str[i]!='~')
         flag=(flag==0?1:0);
         
       i++;
    }
    printf("Spookey Case : %s",str);
    getch();
}