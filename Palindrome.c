#include<stdio.h>
#include<string.h>
void main()
{
    char str[50],rev[50];
    int i,l,j=0,c;
    printf("Enter the number or word\n");
    gets(str);
    l=strlen(str);
    for(i=l-1; i>=0; i--)
    {
        rev[j]=str[i];
        j++;
    }
    rev[j]='\0';
    c=strcmp(rev,str);
    if(c==0)
    {
        printf("Given number or word is palindrome");
    }
    else
    {
        printf("Given number or word is not palindrome");
    }
}

