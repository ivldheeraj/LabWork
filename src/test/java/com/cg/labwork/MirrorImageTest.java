package test.java.com.cg.labwork;

import org.junit.jupiter.api.Test;
import main.java.com.cg.labwork.MirrorImage;
import static org.junit.Assert.assertEquals;
import org.junit.Before;

public class MirrorImageTest {
	private  MirrorImage mirrorImage;
	
	@Before
	public void setup()
	{
		mirrorImage = new MirrorImage();
	}
	@Test
	public void get_StringAsEmpty_AndreturnnullAsString() {
		String ar="";
		String arr=mirrorImage.getImage(ar);
		assertEquals("",arr);
	}
	@Test
	public void getStringsAs_morethan2_AndreturnMirrorimageAsString(){
		String ar= "4321";
		String arr=mirrorImage.getImage(ar);
		StringBuilder str=new StringBuilder(ar);
	    StringBuilder st=new StringBuilder(ar);
	    st=st.reverse();
	    StringBuilder res=str.append("|"+st);
		String ar1=res.toString();
		assertEquals(ar1,arr);
	}	
}