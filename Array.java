package laba1;

//класс array 
public class Array {
	
	protected int element;//числовое значение
	protected Array next = null;//ссылка на следующий элемент
	protected int size=0;//размер списка
	protected Array begin=null;//переменная, хранящая ссылку на начало списка
	
//метод для вставки нового элемента в начало 

	public void AddFirst(int newelement)
	{
					
		if (size!=0)
		{
			next=begin.next;
		}
			Array NewElem=new Array();
			NewElem.element=newelement;
			element=NewElem.element;
			NewElem.next=begin;
			begin=NewElem;           
			size++;
	}
	//методо для вставки нового элемента в конец
			
	public void AddLast(int NewElement)
	{ 	
		Array NewElem=new Array();
		NewElem.element=NewElement;	
		if (size==0)
		{
			begin=NewElem;
			element= NewElem.element;
		}
	else 
		{			
			Array CurrElem=begin;
			for (int i=0;i<size-1;i++)
				CurrElem=CurrElem.next;
			CurrElem.next=NewElem;
			CurrElem.next.element=NewElement;
			
		}
		size++;
		
	}
	
	//метод для поиска элемента, по позиции, если же позиция находиться не в пределах списка, то возвращается null
	//иначе метод возвращает узел
	public Array FindElem (int position)
	{
		if (position>=size) return null;
		else			
		{   Array CurElem=begin;
			for (int i=0;i<position;i++)
				CurElem=CurElem.next;
			return CurElem;
		}
	}
	
	//метод выводит все элементы с их порядковым значением
	public void PrintAllElems()
	{  
		Array CurElem=this.begin;
		for (int i=0;i<size;i++)
		{
			System.out.println(i+1+" "+CurElem.element);
			CurElem=CurElem.next;
		}
	
	}
	
	//метод возвращает элемент по его позиции при этом удаляя его из листа,
	//если позиция выходи за пределы листа, то возвращается null
	public Array Pop(int position)
	{
		Array returnElem = null;	
		if (position<size)
		{	if (position==size-1)
			{
			Array CurElem=FindElem (position-1);	
			returnElem=CurElem.next;
			CurElem=null;
			

			}
		if (position==0)
			{
			
			returnElem = begin;
			
			begin=returnElem.next;

			}			
		else
		{
			Array CurElem=FindElem (position-1);
			returnElem=CurElem.next;
			CurElem.next=CurElem.next.next;

			
		}
		size--;
		}
		
		 return returnElem;	
		}	

	//метод удаляет элемент по его номеру
	//если номер находится в листе, то метод возвращает True, иначе метод возвращает False
	public Boolean Delete(int position)	
	{
		Boolean Return=false;

		if (position<size)
		{   
			Return=true;
			if (position==size-1)
			{
			Array CurElem=FindElem (position-1);	
			//returnElem=CurElem.next;
			CurElem=null;
			

			}
		if (position==0)
			{
					
			begin=begin.next;

			}			
		else
		{
			Array CurElem=FindElem (position-1);
			//returnElem=CurElem.next;
			CurElem.next=CurElem.next.next;

			
		}
		size--;
		}
		
		 return Return;	
		}	
}
