package practice.Threading.concurrency;

public final class ImmutableClass {
	
	private final int iNum;
	private final String iName;
	private final String mutableString;
	
	public ImmutableClass(int iNum,String iName)
	{
		this.iNum=iNum;
		this.iName=iName;
		this.mutableString=iName;
	}

	public String getIName() {
		return iName;
	}

	public int getINum() {
		return iNum;
	}
	

}
