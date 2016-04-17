package MVC;


public class ButtonController implements IActionListener {

    private DataModel dataModel = new DataModel(); // модель данных
    private IButton button; // абстрактный view (кнопка)
    
        
    @Override
    public void action() {
        button.setText(dataModel.getLabel());
        
    }
    
    public void setButton(IButton button){
        this.button = button;
    }
    
}
