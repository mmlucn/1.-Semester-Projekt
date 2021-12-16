package controller;
import model.*;


public class ToolsController{
    private ToolsContainer toolsContainer;

    public ToolsController()
    {
        toolsContainer = ToolsContainer.getInstance();
    }
    
    public Tools findTools(String barcode){
        return toolsContainer.findTools(barcode);
    }
    
    public void createTools(String id, String name, String description, String barcode, 
    String location, String placement, Double quantity, Double pricePerDay){
        Tools toolObject = new Tools(id, name, description, barcode, location, placement, 
        quantity, pricePerDay);
        toolsContainer.addTools(toolObject);
    }
    
    public void deleteCustomer(String barcode){
        toolsContainer.deleteTools(barcode);
    }
    
    public void updateTools(Tools toolsToUpdate, String id, String name, String description){
        if (id != null){
            toolsToUpdate.setId(id);
        }
        if (name  != null){
            toolsToUpdate.setName(name);
        }
        if (description  != null){
            toolsToUpdate.setDescription(description);
        }
    }
    
}
