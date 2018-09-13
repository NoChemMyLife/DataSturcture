package cn.itcast.Array;

/**
 * 数组
 * @author Administrator
 *
 */
public class MyArray {
	
	private	int[] array ;
	//定义数组的长度
	private int len;
	
	//设置默认数组长度50
	public MyArray(){
		array = new int[50];
	}
	
	public void MyArray(int maxSize){
		array = new int[maxSize];
	}
	
	//添加元素
	public void add(int value){
		array[len] = value;
		len++;
	}
	
	//显示元素
	public void display(){
		System.out.print("[");
		for(int i = 0 ;i<len; i++){
			if(i<len-1)
			{
				System.out.print(array[i]+ ",");
			}else {
				System.out.print(array[i]);
				}
		}
		
		System.out.println("]");
	}
	//删除
	 public void delete(int in) {
		 int index = in - 1;
		 if(index<0 || index>len-1 ){
			 throw new ArrayIndexOutOfBoundsException();
		 }
		 
		 for(int i = 0 ;i<len; i++){
			 array[index+i] = array[index+1+i];
		 }
		 len--;
	 }
	 //按照索引查找
	 public void findById(int in){
		 int index = in-1;
		 if(index < 0 || index>len-1){
			 throw new ArrayIndexOutOfBoundsException("索引不在合适的范围内!");
		 }
		 System.out.println(array[index]);
	 
	 } 
	 //按照值查询 索引
	 public void findByIndex(int value){
		 int i = 0 ;
		 for(i = 0 ;i<len; i++){
			 if(value == array[i]){
				 System.out.println(i+1);
				 return ;
			 }
			
			 }
		 if(i>=len){
			 System.out.println(-1);
		 
		 }
	 }
	
	 //修改某个值
	 public void update(int in, int value ){
		 int index = in - 1;
		 if(index<0 || index>len-1){
			 throw new ArrayIndexOutOfBoundsException();
		 }
		 array[index] = value;
		 
	 }
	 
	 //在特定位置插入某个值 
	  public void insert(int in , int value){
		  int index = in - 1;
		  if(index < 0 || index > len){
			  throw new ArrayIndexOutOfBoundsException();
		  }
		  len++;
		  for(int i = 0 ;i<len-index; i++){
			  	  array[len-i] = array[len-i-1];
			  	  
		  }
	 	 array[index] = value;
		  
	  }
	 //二分法查找
	  public int sort(int value){
		  int small = 0;
		  int big = len ;
		 
		  while(small<= big){
			  int ave = (small + big)/2;
			  if(array[ave] >value){
				  big = ave-1;
			  }else if(array[ave] < value){
				  small = ave+1;
			  }else if(array[ave] == value){
				 return ave;
			  }   
			  
		  }
		  return -1;
		  
	  }
	 
	
}
