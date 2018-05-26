package xml;

import java.util.ArrayList;
import java.util.Collections;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="bdpc")
@XmlAccessorType(XmlAccessType.FIELD)
public class BDPC {
	
	@XmlElement(name="bdp")
	ArrayList<BDP> bd_list = new ArrayList<BDP>();

	
	
	/**getter**/
	public ArrayList<BDP> getBd_list() {
		return bd_list;
	}

	
	/**setter**/
	public void setBd_list(ArrayList<BDP> bd_list) {
		this.bd_list = bd_list;
	}
	
	public void sort(){
		Collections.sort(this.bd_list);
	}

}
