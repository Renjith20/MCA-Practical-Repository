#include<stdio.h>  
#include<stdlib.h>  
struct node  
{  
    struct node *prev;  
    struct node *next;  
    int data;  
};  
struct node *head;  
void insertbeg();
void insertlast();
void insertpos();
void delbeg();
void delpos();
void display();  
void search();  
void main ()  
{
int choice =0;
clrscr();
    while(choice != 9)
    {
       printf("1.Insert in begining\n");
       printf("2.Insert at last\n");
       printf("3.Insert at position\n");
       printf("4.Delete from Beginning\n");
       printf("5.Delete at any position\n");
       printf("6.Search\n");
       printf("7.Display\n");
       printf("8.Exit\n");
       printf("\nEnter your choice:\n");
       scanf("\n%d",&choice);
	switch(choice)
	{
	    case 1:
	    insertbeg();
	    break;
	    case 2:
	    insertlast();
	    break;
	    case 3:
	    insertpos();
	    break;
	    case 4:
	    delbeg();
	    break;
	    case 5:
	    delpos();
	    break;
	    case 6:
	    search();
	    break;
	    case 7:
	    display();
	    break;
	    case 8:
	    exit(0);
	    break;
	    default:
	    printf("Please enter valid choice..");
	}
    }
}
void insertbeg()
{
   struct node *ptr;
   int item;
   ptr = (struct node *)malloc(sizeof(struct node));
   if(ptr == NULL)
   {
       printf("\nOVERFLOW");
   }
   else
   {
    printf("\nEnter the element :");
    scanf("%d",&item);

   if(head==NULL)
   {
       ptr->next = NULL;
       ptr->prev=NULL;
       ptr->data=item;
       head=ptr;
   }
   else
   {
       ptr->data=item;
       ptr->prev=NULL;
       ptr->next = head;
       head->prev=ptr;
       head=ptr;
   }
   printf("\nNode inserted\n");
}

}
void insertlast()
{
   struct node *ptr,*temp;
   int item;
   ptr = (struct node *) malloc(sizeof(struct node));
   if(ptr == NULL)
   {
       printf("\nOVERFLOW");
   }
   else
   {
       printf("\nEnter value");
       scanf("%d",&item);
	ptr->data=item;
       if(head == NULL)
       {
	   ptr->next = NULL;
	   ptr->prev = NULL;
	   head = ptr;
       }
       else
       {
	  temp = head;
	  while(temp->next!=NULL)
	  {
	      temp = temp->next;
	  }
	  temp->next = ptr;
	  ptr ->prev=temp;
	  ptr->next = NULL;
	  }

       }
     printf("\nnode inserted\n");
    }
void insertpos()
{
   struct node *ptr,*temp;
   int item,loc,i;
   ptr = (struct node *)malloc(sizeof(struct node));
   if(ptr == NULL)
   {
       printf("\n OVERFLOW");
   }
   else
   {
       temp=head;
       printf("Enter the location");
       scanf("%d",&loc);
       for(i=0;i<loc;i++)
       {
	   temp = temp->next;
	   if(temp == NULL)
	   {
	       printf("\n There are less than %d elements", loc);
	       return;
	   }
       }
       printf("Enter value");
       scanf("%d",&item);
       ptr->data = item;
       ptr->next = temp->next;
       ptr -> prev = temp;
       temp->next = ptr;
       temp->next->prev=ptr;
       printf("\nnode inserted\n");
   }
}
void delbeg()
{
    struct node *ptr;
    if(head == NULL)
    {
	printf("\n UNDERFLOW");
    }
    else if(head->next == NULL)
    {
	head = NULL;
	free(head);
	printf("\nnode deleted\n");
    }
    else
    {
	ptr = head;
	head = head -> next;
	head -> prev = NULL;
	free(ptr);
	printf("\nnode deleted\n");
    }

}
void delpos()
{
    struct node *ptr, *temp;
    int val;
    printf("\n Enter the location : ");
    scanf("%d", &val);
    ptr = head;
    while(ptr -> data != val)
    ptr = ptr -> next;
    if(ptr -> next == NULL)
    {
	printf("\nCan't delete\n");
    }
    else if(ptr -> next -> next == NULL)
    {
	ptr ->next = NULL;
    }
    else
    {
	temp = ptr -> next;
	ptr -> next = temp -> next;
	temp -> next -> prev = ptr;
	free(temp);
	printf("\nnode deleted\n");
    }
}
void display()
{
    struct node *ptr;
    printf("\n List is:\n");
    ptr = head;
    while(ptr != NULL)
    {
	printf("%d\n",ptr->data);
	ptr=ptr->next;
    }
}
void search()
{
    struct node *ptr;
    int item,i=0,flag;
    ptr = head;
    if(ptr == NULL)
    {
	printf("\nEmpty List\n");
    }
    else
    {
	printf("\nEnter element to be searched\n");
	scanf("%d",&item);
	while (ptr!=NULL)
	{
	    if(ptr->data == item)
	    {
		printf("\nitem found at location %d ",i+1);
		flag=0;
		break;
	    }
	    else
	    {
		flag=1;
	    }
	    i++;
	    ptr = ptr -> next;
	}
	if(flag==1)
	{
	    printf("\nItem not found\n");
	}
    }

}
