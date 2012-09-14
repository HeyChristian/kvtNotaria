/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Account;

import Entities.Clients;
import java.io.Serializable;
import java.util.Calendar;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author pollo
 */
@ManagedBean
@ViewScoped
public class ClientImp extends Clients implements Serializable {

    public void saveClient() {


        System.out.println("Save Client Event!!!!!");
        try {

            
            
            
            this.setName("Christian");
            this.setLastName("Vazquez");
            this.setGender("male");
            this.setSecondLastName("Trinidad");
            this.setSocialSecurity("000-00-0000");
            this.setMaritalStatus("single");
            

            Clients clt = new Clients();
            clt.setAccId(1);
            clt.setName(this.getName());
            clt.setLastName(this.getLastName());
            clt.setSecondLastName(this.getSecondLastName());
            clt.setGender(this.getGender());
            clt.setSocialSecurity(this.getSocialSecurity());
            clt.setMaritalStatus(this.getMaritalStatus());
            clt.setCreationDate(Calendar.getInstance().getTime());
            clt.setCreationUser(0);
            clt.setUpdateDate(Calendar.getInstance().getTime());
            clt.setUpdateUser(0);

            appconfig.EntityManagerHelper.beginTransaction();
            appconfig.EntityManagerHelper.getEntityManager().persist(clt);
            appconfig.EntityManagerHelper.commit();

            System.out.println("Save Client Sussessfully");


            FacesMessage msg = new FacesMessage("Succesful", "Client is saved.");
            FacesContext.getCurrentInstance().addMessage(null, msg);

        } catch (Exception ex) {
            FacesMessage msg = new FacesMessage("An Error Ocuur", ex.getMessage());
            FacesContext.getCurrentInstance().addMessage(null, msg);

            ex.printStackTrace();
        }


    }
}
