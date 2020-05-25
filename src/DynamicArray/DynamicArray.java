
package DynamicArray;

public class DynamicArray {
 private int array[];
 private int count;
 private int size;
 public DynamicArray()
 {
 array = new int[1];
 count=0;
 size=1;
 }
 public void add(int element)
 {
     resize();
 array[count] = element;
 count++;
 }
 
 public void addAt(int index,int element)
 {
   resize();
   for(int from = count-1; from >= index ;from--)
   {
       array[from + 1] = array[from];
   }
 
   array[index] = element;
   count++;
   
 }
 
 
public void resize()
{
    int tempArray[] = null;
  if(count == size)
  {
  tempArray = new int[size*2];
  for(int i =0 ; i<size ; i++)
  {
      tempArray[i] = array[i];
  }
  array = tempArray;
  size = size * 2;
  }
}
 
 
 
    public static void main(String[] args) {
        DynamicArray obj =new DynamicArray();
        System.out.println("Before Addition-----");
        System.out.println("Count " + obj.count);
        System.out.println("Sizee " + obj.size);
        obj.add(5);
        obj.add(10)
        obj.add(15);
        obj.addAt(1, 30);
        System.out.println("After Addition---------");
        for(int i = 0 ; i < obj.count ; i++)
        System.out.println(obj.array[i]);
        
        System.out.println("Count " + obj.count);
        System.out.println("Sizee " + obj.size);

    }

    
}
