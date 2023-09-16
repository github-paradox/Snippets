#include<stdio.h>
#include<stdlib.h>
typedef struct Slist
{
    int data;
    struct Slist *link;
}node;
node *head=NULL,*temp,*newnode;
int count=0;
void creation()
{
    count++;
    newnode=(node *)malloc(sizeof(node));
    newnode->data=count;
     newnode->link=NULL;
    if(head==NULL)
    head=temp=newnode;
    else
    {
        temp->link=newnode;
        temp=newnode;

    }
}
void display()
{
   node* temp1=head;
    while(temp1!=NULL)
    {
        printf("%d   ",temp1->data);
        temp1=temp1->link;
    }
}
void insertion(int position)
{
    if(position>count)
    {
        printf("Invalid");
        return;
    }
    if(position==count)
    {
        creation();
        return;
    }
    if(position==0)
    {
        node *new=(node*)malloc(sizeof(node));
        new->link=head;
        new->data=5656;
        count++;
        head=new;
        return;
    }
    int pos=1;
    node *tem,*prev;
    tem=prev=head;
    while(pos<=position && pos<=count)
    {
        pos++;
        prev=tem;
        tem=tem->link;
    }
    node *new=(node*)malloc(sizeof(node));
    new->data=13;
    prev->link=new;
    new->link=tem;
}
void deletion(int position)
{
    if(position==1)
    {
        count--;
        head=head->link;
        return;
    }
    if(position>count)
    {
        printf("Invalid Position");
        return;
    }
    int pos=1;
    node *prev,*temp1;
    prev=temp1=head;
    while(pos<position)
    {
        pos++;
        prev=temp1;
       temp1=temp1->link;
       
    }
    prev->link=temp1->link;
    count--;
    
}
void Reverse()
{
   node *last=head,*start=head;
   while(last->link!=NULL)
   {
     last=last->link;                //Address Calculation of Last Node;
   }
    // Till Here The Address of last node is calculated;
   int var;
   
   while(start!=last)
   {
    node *temp=start;
    while(temp->link!=last)
    {
       temp=temp->link;
    }

     var=start->data;
    start->data=last->data;
    last->data=var;

    start=start->link;
    if(start==last)
    return;
    last=temp;
   }
}
void Revering()      // Reversing List using Links
{
   node *temp1,*prev,*temp2=head->link;
   prev=temp1=head;
   while(temp2!=NULL)
   {
      temp1=temp2;
      if(prev==head)
      prev->link=NULL;

      temp2=temp1->link;
      temp1->link=prev;
      prev=temp1;
   }
   head=prev;
    }

int main()
{ 
    int choice;
    int pos;
    while(1)
    {
         printf("\n1 for Creation\n2 for Display\n3 for Insertion\n4 for Deletion\n5 for Reverse\n6 for Reversing Links\n7 for Exit\n");
    scanf("%d",&choice);
       switch(choice)
       {
        case 1:
        creation();
        break;
        case 2:
        printf("\nThe LIst : ");
        display();
        printf("\n");
        break;
        case 3:
        printf("Position to be entered\n");
        scanf("%d",&pos);
        insertion(pos);
        break;
        case 4:
        printf("Position to be deleted\n");
        scanf("%d",&pos);
        deletion(pos);
        break;
        case 5:
        printf("The Reversed Linked List\n");
        Reverse();
        display();
        break;
        case 6:
        printf("Links Reversed\n");
        Revering();
        display();
        break;
        case 7:
        exit(0);
        break;
        default:
        printf("Wrong choice");
       }
    }
    return 0;
}
