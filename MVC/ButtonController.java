package MVC;


public class ButtonController implements IActionListener {

    private DataModel dataModel = new DataModel(); // ������ ������
    private IButton button; // ����������� view (������)
    
        
    @Override
    public void action() {
        button.setText(dataModel.getLabel());
        
    }
    
    public void setButton(IButton button){
        this.button = button;
    }
    
}
