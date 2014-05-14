package ordenacionArrays;

public class Prueba
{
	public int[] burbuja (int array[])
	{
		int[] miResultado = new int[4];
		//int[] array = new int[4];
		
		int i,j,aux;
		for (i=0; i < array.length -1; i++)
		{
			for (j = array.length -1; j > i; j--)
			{
				if (array[j] < array[j-1])
				{
					//intercambio de elementos
					aux = array[j];
					array[j] = array[j-1];
					array[j-1] = aux;
				}
			}
		}
		
		return array;
	}
}