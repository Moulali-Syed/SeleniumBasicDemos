package collectionsFreamwork;

public class CollectionsDemo {

}
/*
Collection : is a group of objects
single entity representing multiple objects

we have 3 students
	stud1 , stud2 , stud3
	
we can store in ArrayList

to store a value in a variable
int a=10;
int b=10;

this is not good practice , we cant create 100 variables for storing 100 numbers
int a[] = new int[100];
array can be defined , which can store multiple values , as above 100 memory locations will be created



suppose i have array
int a[] = new int[10];
array can only store homogenous data

Student stud[] = new Student[10];
can only store student objects

we can overcome using Object array
Object a[] = new Object[5];
now we can store multiple data type values

Now lets see what is problem with array?
i cant store morethan the defined size. Fixed size
AT run time we cant change the the size
can store only homogeneous data
array is not using any datastructure , we dont have predefined readymade methods 


To overcome these, we have collections framework

ArrayList  List  Hashmap  hashtable Tree Stack Queue

Array						Collection
Fixed size					growable in nature, at run time we can add and remove elements,no wastage of memory
homogenous 					homogeneous+heterogenous
NoUnderlyingDataStructure    implemented using data structures , has inbuilt readymade methods



*/