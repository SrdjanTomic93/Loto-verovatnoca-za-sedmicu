package lotoBrojevi;

public class lotoVerovatnoca {

	public static void main(String[] args) {
		// verovatnoca za loto brojeve dobija se po formuli (39!/((39-7)!*7!)) tj. (39*38..*33)/7!
		
		long a=1;
		long b=1;
		for(int i=39;i>32;i--)
		{
			a*=i;
		}
		
		for(int i=7;i>0;i--)
		{
			b*=i;
		}
		
		long verovatnoca=a/b;
		
		System.out.println("Verovatnoca dobiti sedmicu na lotuo je 1 prema "+verovatnoca);

	}


	}


