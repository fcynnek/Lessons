package com.coderscampus.lesson1;

public interface CustomList<T> {
	/**
	 * This method should add a new item into the <code>CustomList</code> and should
	 * return <code>true</code> if it was successfully able to insert an item.
	 * @param item the item to be added to the <code>CustomList</code>
	 * @return <code>true</code> if item was successfully added, <code>false</code> if the item was not successfully added (note: it should always be able to add an item to the list) 
	 *
	 */
	boolean add (T item);
	
	/**
	 * This method should return the size of the <code>CustomList</code>
	 * based on the number of actual elements stored inside of the <code>CustomList</code>
	 * @return an <code>int</code> representing the number of elements stored in the <code>CustomList</code>
	 */
	int getSize();
	
	/**
	 * This method will return the actual element from the <code>CustomList</code> based on the
	 * index that is passed in.
	 * @param index represents the position in the backing <code>Object</code> array that we want to access
	 * @return The element that is stored inside of the <code>CustomList</code> at the given index
	 */
	T get(int index);
}
