package cn.itcast.Array;

import org.junit.Test;

public class TestMyArray {
		@Test
		public void Demo(){
			MyArray myArray = new MyArray();
			myArray.add(10);
			myArray.add(11);
			myArray.add(12);
			myArray.add(13);
			myArray.add(14);
			myArray.display();
			
			int index = myArray.sort(10);
			System.out.println(index);
			//myArray.display();
			
		}
}
