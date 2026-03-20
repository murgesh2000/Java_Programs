package practise;

public class test1 {

	public static void main(String[] args) {


		/*int arr[] = {2,4,2,5,2,2,1}
		Target = 2
		output = [4,5,1,0,0,0,0]*/
		
		int arr[] = {2,4,2,5,2,2,1};
		int tar = 2;
		int x = 0;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i] != tar)
			{
				
				arr[x] = arr[i];
				x++;
			}
		}
		
		while (x < arr.length) {
            arr[x] = 0;
            x++;
        }
		

		for(int a :arr)
		{
			System.out.print(a);
		}

	}

}
