import java.util.*;

public class Program
{
	
    public static void main(String[] args)
    {
		addTest1();
		addTest2();
		add2Test1();
		add2Test2();
		indexOfTest1();
		indexOfTest2();
        setTest1();
        setTest2();
        subListTest1();
        subListTest2();
        getTest1();
        getTest2();
        clearTest1();
        clearTest2();
        containsTest1();
        containsTest2();
        equalsTest1();
        equalsTest2();
        isEmptyTest1();
        isEmptyTest2();
        deleteTest1();
        deleteTest2();
        removeTest1();
        removeTest2();
        sizeTest1();
        sizeTest2();
        toArrayTest1();
        toArrayTest2();
    
        addTimeTest();
        deleteTimeTest();
    }
    
    
    
    public static void addTest1()
    {
		ArrayList list=new ArrayList();
		list.add(5);
        list.add(6);
        list.add(8);
        list.add(16);
        list.add(314);
        if(list.get(0)==5 && list.get(1)==6 && list.get(2)==8 && list.get(3)==16 && list.get(4)==314) System.out.println("SUCCESS: ADD TEST 1");
        else System.out.println("FAIL: ADD TEST 1");
	}
	
	
	public static void addTest2()
    {
		boolean flag = false;
		ArrayList list=new ArrayList();
		for(int i=0;i<100;i++) list.add(i);
        for(int i=0;i<100;i++)
        {
			if (list.get(i) == i) flag = true;
		}
		if (flag == true) System.out.println("SUCCESS: ADD TEST 2");
		else System.out.println("FAIL: ADD TEST 2");
	}
    
    
    public static void add2Test1()
    {
		ArrayList list=new ArrayList();
		list.add(5);
        list.add(6);
        list.add(8);
        list.add(16);
        list.add(314);
        list.add(2,7);
        if(list.get(2)==7 && list.get(4)==16 && list.size()== 6) System.out.println("SUCCESS: ADD 2 TEST 1");
        else System.out.println("FAIL: ADD 2 TEST 1");
	}
	
	
	public static void add2Test2()
    {
		ArrayList list=new ArrayList();
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        try
        {
            list.set(5,234);
            System.out.println("FAIL: ADD 2 TEST 2");
        }
        catch(IndexOutOfBoundsException e)
        {
            System.out.println("SUCCESS: ADD 2 TEST 2");
        }
        catch(Exception e)
        {
            System.out.println("FAIL: ADD 2 TEST 2");
        } 
	}
    
    
    public static void indexOfTest1()
    {
		ArrayList list=new ArrayList();
		list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        if(list.indexOf(5) == 0 && list.indexOf(9) == -1)System.out.println("SUCCESS: INDEX OF TEST 1");
        else System.out.println("FAIL: INDEX OF TEST 1");
	}
	
	
	public static void indexOfTest2()
    {
		ArrayList list=new ArrayList();
		list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        if(list.indexOf(6) == 1 && list.indexOf(10) == -1)System.out.println("SUCCESS: INDEX OF TEST 2");
        else System.out.println("FAIL: INDEX OF TEST 2");
	}
    
    
    public static void setTest1()
    {
        ArrayList list=new ArrayList();
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        int v=list.set(1,14);
        int v2=list.get(1);
        if(v==6  && v2==14 )System.out.println("SUCCESS: SET TEST 1");
        else System.out.println("FAIL: SET TEST 1");
    }
    
    
    public static void setTest2()
    {
        ArrayList list=new ArrayList();
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        try
        {
            list.set(4,234);
            System.out.println("FAIL: SET TEST 2");
        }
        catch(IndexOutOfBoundsException e)
        {
            System.out.println("SUCCESS: SET TEST 2");
        }
        catch(Exception e)
        {
            System.out.println("FAIL: SET TEST 2");
        } 
    }
    
    
    public static void subListTest1()
    {
		ArrayList list=new ArrayList();
		list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(12);
        list.add(90);
        list.add(64);
        ICSList sublist = list.subList(2,6);
        if(sublist.size() == 4 && sublist.get(0) == 7 && sublist.get(1) == 8 && sublist.get(2) == 12 && sublist.get(3) == 90)System.out.println("SUCCESS: SUBLIST TEST 1");
        else System.out.println("FAIL: SUBLIST TEST 1");
	}
	
	
	public static void subListTest2()
    {
		ArrayList list=new ArrayList();
		list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(12);
        list.add(90);
        list.add(64);
        try
        {
            list.subList(3,8);
            System.out.println("FAIL: SUBLIST TEST 2");
        }
        catch(IndexOutOfBoundsException e)
        {
            System.out.println("SUCCESS: SUBLIST TEST 2");
        }
        catch(Exception e)
        {
            System.out.println("FAIL: SUBLIST TEST 2");
        } 
	}
    
    
    public static void getTest1()
    {
		ArrayList list=new ArrayList();
		list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        if(list.get(1) == 6 && list.get(3) == 8)System.out.println("SUCCESS: GET TEST 1");
        else System.out.println("FAIL: GET TEST 1");
	}
    
    
    public static void getTest2()
    {
		ArrayList list=new ArrayList();
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        try
        {
            list.get(5);
            System.out.println("FAIL: GET TEST 2");
        }
        catch(IndexOutOfBoundsException e)
        {
            System.out.println("SUCCESS: GET TEST 2");
        }
        catch(Exception e)
        {
            System.out.println("FAIL: GET TEST 2");
        } 
	}
    
    
    public static void clearTest1()
    {
		ArrayList list=new ArrayList();
		list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.clear();
        if(list.size == 0)System.out.println("SUCCESS: CLEAR TEST 1");
        else System.out.println("FAIL: CLEAR TEST 1");
	}
	
	
	public static void clearTest2()
    {
		ArrayList list=new ArrayList();
		list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        int a1v1 = list.get(1);
        int a1v2 = list.get(2);
        list.clear();
        list.add(82);
        list.add(10);
        list.add(44);
        list.add(58);
        int a2v1 = list.get(1);
        int a2v2 = list.get(2);
        if(a1v1 == 6 && a1v2 == 7 && a2v1 == 10 && a2v2 == 44)System.out.println("SUCCESS: CLEAR TEST 2");
        else System.out.println("FAIL: CLEAR TEST 2");
	}
    
    
    public static void containsTest1()
    {
		ArrayList list=new ArrayList();
		list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        if(list.contains(6) == true)System.out.println("SUCCESS: CONTAINS TEST 1");
        else System.out.println("FAIL: CONTAINS TEST 1");
	}
    
    
    public static void containsTest2()
    {
		ArrayList list=new ArrayList();
		list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        if(list.contains(1) == false)System.out.println("SUCCESS: CONTAINS TEST 2");
        else System.out.println("FAIL: CONTAINS TEST 2");
	}
    
    
    public static void equalsTest1()
    {
		ArrayList list=new ArrayList();
		list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        ArrayList list2=new ArrayList();
		list2.add(5);
        list2.add(6);
        list2.add(7);
        list2.add(8);
        if(list.equals(list2) == true)System.out.println("SUCCESS: EQUALS TEST 1");
        else System.out.println("FAIL: EQUALS TEST 1");
	}
    
    
    public static void equalsTest2()
    {
		ArrayList list=new ArrayList();
		list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        ArrayList list2=new ArrayList();
		list2.add(5);
        list2.add(3);
        list2.add(9);
        list2.add(8);
        list2.add(10);
        if(list.equals(list2) == false)System.out.println("SUCCESS: EQUALS TEST 2");
        else System.out.println("FAIL: EQUALS TEST 2");
	}
    
    
    public static void isEmptyTest1()
    {
		ArrayList list=new ArrayList();
		ArrayList anotherlist=new ArrayList();
		list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.clear();
        if(list.isEmpty() == true && anotherlist.isEmpty() == true)System.out.println("SUCCESS: IS EMPTY TEST 1");
        else System.out.println("FAIL: IS EMPTY TEST 1");
	}
    
    
    public static void isEmptyTest2()
    {
		ArrayList list=new ArrayList();
		list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        if(list.isEmpty() == false)System.out.println("SUCCESS: IS EMPTY TEST 2");
        else System.out.println("FAIL: IS EMPTY TEST 2");
	}
    
    
    public static void deleteTest1()
    {
		ArrayList list=new ArrayList();
		list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.delete(1);
        if(list.size() == 3 && list.get(1) == 7 && list.get(2) == 8)System.out.println("SUCCESS: DELETE TEST 1");
        else System.out.println("FAIL: DELETE TEST 1");
	}
    
    
    public static void deleteTest2()
    {
		ArrayList list=new ArrayList();
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(3);
        try
        {
            list.delete(7);
            System.out.println("FAIL: DELETE TEST 2");
        }
        catch(IndexOutOfBoundsException e)
        {
            System.out.println("SUCCESS: DELETE TEST 2");
        }
        catch(Exception e)
        {
            System.out.println("FAIL: DELETE TEST 2");
        } 
	}
	
	
	public static void removeTest1()
    {
		ArrayList list=new ArrayList();
		list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(3);
        if(list.remove(6) == true)System.out.println("SUCCESS: REMOVE TEST 1");
        else System.out.println("FAIL: REMOVE TEST 1");
	}
    
    
    public static void removeTest2()
    {
		ArrayList list=new ArrayList();
		list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(3);
        list.remove(6);
        if(list.get(1)== 7 && list.indexOf(6) == -1  && list.contains(6) == false)System.out.println("SUCCESS: REMOVE TEST 2");
        else System.out.println("FAIL: REMOVE TEST 2");
	}
    
    
    public static void sizeTest1()
    {
		ArrayList list=new ArrayList();
		list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        if(list.size()== 4)System.out.println("SUCCESS: SIZE TEST 1");
        else System.out.println("FAIL: SIZE TEST 1");
	}
    
    
    public static void sizeTest2()
    {
		ArrayList list=new ArrayList();
		ArrayList anotherlist=new ArrayList();
		list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.clear();
		anotherlist.add(5);
        anotherlist.add(6);
        anotherlist.add(7);
        anotherlist.add(8);
        anotherlist.remove(6);
        if(list.size()== 0 && anotherlist.size() == 3)System.out.println("SUCCESS: SIZE TEST 2");
        else System.out.println("FAIL: SIZE TEST 2");
	}
    
    
    public static void toArrayTest1()
    {
		ArrayList list=new ArrayList();
		list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        int[] list2 = list.toArray();
        if(list.size() == list2.length)System.out.println("SUCCESS: TO ARRAY TEST 1");
        else System.out.println("FAIL: TO ARRAY TEST 1");
	}
	
	
	public static void toArrayTest2()
    {
		ArrayList list=new ArrayList();
		list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        int[] list2 = list.toArray();
        boolean flag = true;
        for(int i =0;i<list.size();i++)
        {
			if (list.get(i) != list2[i]) flag = false;
		}
        if(flag == true)System.out.println("SUCCESS: TO ARRAY TEST 1");
        else System.out.println("FAIL: TO ARRAY TEST 1");
	}
    
    
    
	public static void addTimeTest()
    {
        for(int i=0;i<27;i++)
        {
            int n=(int)Math.pow(2,i);
            double time=timeAdd(n);
            System.out.println(i+","+n+","+time);
        }
    }
    
    
    public static void deleteTimeTest()
    {
        for(int i=0;i<27;i++)
        {
            int n=(int)Math.pow(2,i);
            double time=timeDelete(n);
            System.out.println(i+","+n+","+time);
        }
    }
    
    
    public static double timeAdd(int n)
    {
        ArrayList list=new ArrayList();
        long start=System.nanoTime();
        for(int i=0;i<n;i++)list.add(i);
        return (System.nanoTime()-start)/1e9; 
    }
    
    
    public static double timeDelete( int n)
    {
		ArrayList list=new ArrayList();
        for(int i=0;i<n;i++)list.add(i);
        long start=System.nanoTime();
        for(int i=0;i<n;i++)list.delete(0);
        return (System.nanoTime()-start)/1e9;
    }
}    
    

