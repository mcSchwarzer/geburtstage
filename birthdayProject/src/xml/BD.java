package xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement (name="bd")
@XmlAccessorType (XmlAccessType.FIELD)
public class BD {

	/**xmlElements**/
	@XmlElement(name="bd_day")
	private int bd_day;
	@XmlElement(name="bd_month")
	private int bd_month;
	@XmlElement(name="bd_year")
	private int bd_year;
	
		
	
	@Override
	public String toString(){
		return "[" + getDay() + "." + getMonth() + "." + getYear()   + "]";
	}
	
	
	
	
	
	
	
	
	
	/**getters**/
	public int getDay() {
		return bd_day;
	}
	public int getMonth() {
		return bd_month;
	}
	public int getYear() {
		return bd_year;
	}
	
	
	/**setters**/
	public void setDay(int bd_day) {
		this.bd_day = bd_day;
	}
	public void setMonth(int bd_month) {
		this.bd_month = bd_month;
	}
	public void setYear(int bd_year) {
		this.bd_year = bd_year;
	}
	
	
}
