public class ArrayList implements ICSList
{
    //instance variable
    int size;
    int[] list;
    
    //constructor
    public ArrayList()
    {
        size=0;
        list=new int[10];
    }
    
    public ArrayList(int capacity)
    {
        size=0;
        list=new int[capacity];
    } 
    
    
    
    //methods
    private void ensureCapacity()
    {
        if(size>=list.length)
        {
            int[] newList=new int[list.length*2];
            for(int i=0;i<size;i++) newList[i]=list[i];
            list=newList;
        }
    }
    

    /**
     * Adds value to the end of the list. 
     * 
     * @param value the value that will be added to the list
     */
    public void add(int value)
    {
        ensureCapacity();
        list[size]=value;
        size++;
    }
    

    //~ /**
     //~ * Changes value at specified index. 
     //~ * 
     //~ * @param index the index of the element to be changed
     //~ * @param value the new element value
     //~ * @throws IndexOutOfBoundsException if index<0 || index>=size
     //~ */
    //~ public void add(int index, int value)
    //~ {
        //~ if(index<0 || index>=size) throw new IndexOutOfBoundsException();
        //~ int prev=list[index];
        //~ list[index]=value;
    //~ }
    

	/**
     * Returns the index of the first instance of a specific value or returns -1 if the value is not in the list.  
     * 
     * @param value value that is being searched for 
     * @return the index of the first instance of a specific value or returns -1 if the value is not in the list.  
     */
    public int indexOf(int value)
    {
		int index = -1;
        for(int i=0;i<size;i++)
        {
            if (list[i]==value)
            {
				index = i;
				break;
			}	
        }
        return index;
    }
    

	//~ /**
     //~ * Returns a portion of the list from an inclusive fromIndex to an exclusive toIndex.
     //~ * 
     //~ * @param fromIndex index at which the specified range will begin; it is inclusive.
     //~ * @param toIndex index at which the specified range will stop; it is exclusive.
     //~ * @return a portion of the list from an inclusive fromIndex to an exclusive toIndex
     //remember to put in the throws
     //~ */
    //~ public ICSList subList(int fromIndex, int toIndex)
    //~ {
		//~ int subsize = toIndex-fromIndex;
        //~ int[] sublist=new int[subsize];
        //~ for (i=0;i<subsize;i++)
        //~ {
			//~ sublist.add(list[i]);
		//~ }
		//~ return sublist;
    //~ }
    

    /**
     * Changes value at specified index. 
     * 
     * @param index the index of the element to be changed
     * @param value the new element value
     * @return the old value that got replaced
     * @throws IndexOutOfBoundsException if index<0 || index>=size
     */
    public int set(int index, int value)
    {
        if(index<0 || index>=size) throw new IndexOutOfBoundsException();
        int prev=list[index];
        list[index]=value;
        return prev;
    }
    

	/**
     * Returns value at a specific index. 
     * 
     * @param index the index of the element to be viewed
     * @return the value at that index
     * @throws IndexOutOfBoundsException if index>=size
     */
    public int get(int index)
    {
        if(index>=size)throw new ArrayIndexOutOfBoundsException();
        return list[index];
    }
    

    /**
     * Clears the list be removing all of the elements in the list.
     */
    public void clear()
    {
        size=0;
    }
    

	/**
     * Returns true if a specific value is in the list or returns false if it is not.
     * 
     * @param value value that is being searched for in the list
     * @return boolean according to whether or not a specific value is in the list
     */
    public boolean contains(int value)
    {
		boolean flag = false;
        for(int i=0;i<size;i++)
        {
            if (list[i]==value) flag = true;	
        }
        return flag;
    }
    

	/**
     * Returns true if the list is has no values or returns false if the list does have values.
     * 
     * @return boolean true if the list is has no values or returns false if the list does have values.
     */
    public boolean isEmpty()
    {
        if (size == 0)return true;
        else return false;
    }
    
    
    /**
     * Deletes the element from a specific index and moves up the elements behind that index
     * 
     * @param index the index of the element to be deleted
     * @return the value that was deleted
     * @throws IndexOutOfBoundsException if index>=size
     */
    public int delete(int index)
    {
		if(index<0 || index>=size) throw new IndexOutOfBoundsException();
		int prevValue = list[index];
		for(int i=index;i<size;i++) list[i] = list[i+1];
		size -= 1;
		return prevValue;
	}
    
    
    /**
     * Deletes the first instance of a specific value.
     * 
     * @param value value that will be deleted
     * @return true if value is found and deleted or false if value is not found in the list
     */
    public boolean remove(int value)
    {
		boolean flag = false;
        for(int i=0;i<size;i++)
        {
            if (list[i]==value)
            {
				for(int j=i;j<size;j++) list[j] = list[j+1];
				flag = true;
				size -= 1;
				break;
			}	
        }
        return flag;
	}
    

    /**
     * Returns the number of the element in the list. 
     * 
     * @return size of the list
     */
    public int size()
    {
        return size;
    }
    

	/**
     * Returns the array with the elements of the list in order.
     * 
     * @return the array of the list of elements
     */
    public String toString()
    {
        String s="";
        for(int i=0;i<size;i++)
        {
            s+=list[i];
            if(i<size-1)s+=", ";
        }
        return "["+s+"]";
    }
    
    
    
    
    
    
    
    
    
    
    
    public void add(int index, int value){throw new UnsupportedOperationException();}
    public ICSList subList(int fromIndex, int toIndex){throw new UnsupportedOperationException();}
    public boolean	equals(ICSList list){throw new UnsupportedOperationException();}
    public int[] toArray(){throw new UnsupportedOperationException();}

}
