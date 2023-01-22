package com.coderscampus.lesson1;

public class CustomArrayList<T> implements CustomList<T> {
	
	int capacity = 10; // initial max capacity of items array
	
	Object[] items = new Object[capacity];
	
	int sizeOfList = 0;

	@Override
	public boolean add(T item) {
		
		items[sizeOfList] = item;
		sizeOfList++;
		
		if (sizeOfList == capacity) {
			capacity = 2 * capacity;
			Object[] newItems = new Object[capacity];
			
			int i = 0;
				
			while (i <= sizeOfList-1) {
				newItems[i] = items[i];
				i++;
			}
						
			items = newItems;
		} 
		
		return false;
	}

	@Override
	public int getSize() {
		
		if (sizeOfList == 0) {
			System.out.println("The list is currently empty");
		}
		return sizeOfList;
	}

	@SuppressWarnings("unchecked")
	@Override
	public T get(int index) {
		
		if (index >= getSize() || index < 0)  {
			System.out.println("Index is out of bounds");
		} else {
			return (T) items[index];
		}
		return null;
	}
	
}
