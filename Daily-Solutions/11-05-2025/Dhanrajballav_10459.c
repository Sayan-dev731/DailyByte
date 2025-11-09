
// This program counts the words in a sentence by counting spaces in the input string.
// Each space represents a word separation, so total words = spaces + 1.


#include<stdio.h>
#include<conio.h>
int main()
{
    char str[100];
    int i,c=0;
    printf("Enter a String : ");
    gets(str);
    i=0;
    while(str[i]!='\0')
    {
      if(str[i]==' ')
        c++;
        
      i++;
    }
    printf("Total Number of Words : %d",c+1);
    getch();
    return 0;
}


