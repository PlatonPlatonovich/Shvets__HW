package MVC;

public class DataModel {
	private String label = "off";
	
	public void setLabel() {
		if (this.label.equals("off"))
			this.label = "on";
		else this.label = "off";
	}
	
	public String getLabel() {
		this.setLabel();
		return this.label;
	}

}
