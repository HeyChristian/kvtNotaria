
import Entities.ProductType;
import appconfig.EntityManagerHelper;
import java.io.Serializable;
import java.util.Calendar;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pollo
 */
@ManagedBean
@ViewScoped
public class RecordImp implements Serializable{
    
    
    
    public RecordImp(){
        
    }
    
    public void startRecord(){
        
        System.out.println("startRecord");
        try{
        
        ProductType type= new ProductType();
        
        type.setName("ProdTest");
        type.setDescription("Product Test Description");
        type.setCreationDate( Calendar.getInstance().getTime());
        type.setCreationUser(0);
        type.setUpdateDate(Calendar.getInstance().getTime());
        type.setUpdateUser(0);
        
        
        EntityManagerHelper.beginTransaction();
        EntityManagerHelper.getEntityManager().persist(type);
        EntityManagerHelper.commit();
        
        System.out.println("Save Susses");
        
        
        }catch(Exception ex){
        
            ex.printStackTrace();
        }
        
        
    }
}
