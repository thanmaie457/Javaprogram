public class Array{
		public static void main(String[] args) {
			int a[]={11,13,20,25,50};
			int e=0,o=0,ev=0,od=0;
		    for(int i=0;i<a.length;i++){
		        if(a[i]%2==0){
		        	ev=a[i];
				   e++;
			    }
			    else{
			    	od=a[i];
			    	o++;
			    }
		    }
		    System.out.println("even:"+e);
		    System.out.println("odd:"+o);		
	   }
}