package ejb;

import entity.Credencial;
import java.io.Serializable;
import javax.ejb.Stateful;
import javax.enterprise.context.SessionScoped;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Named ("credencialBean")
@SessionScoped
@Stateful /* CDI */
public class CredencialEJB implements Serializable{
    
    private Credencial credencial;
    
    public Credencial getCredencial(){
        return credencial;
    }
    
    public void setCredencial(Credencial credencial){
        this.credencial = credencial;
    }
    
    public String logout() {
    
        FacesContext context = FacesContext.getCurrentInstance();
    
        // Remove data from beans
        for (String bean : context.getExternalContext().getSessionMap().keySet()) {
            context.getExternalContext().getSessionMap().remove(bean);
        }
    
        // Destroy session
        HttpSession httpSession = (HttpSession) context.getExternalContext().getSession(false);
        httpSession.invalidate();
        System.out.println(">>> Logout finished! ");
        return "/index.xhtml?faces-redirect=true";
    }
    
    public Boolean estaLogado() {
        
        Object requestObject = FacesContext.getCurrentInstance().getExternalContext().getRequest();
        
        if (!(requestObject instanceof HttpServletRequest)) {
            System.out.println(">> Request isn\'t HttpServletRequest.");
            return false;
        }
        
        HttpServletRequest request = (HttpServletRequest) requestObject;
        
        System.out.println(">>> request.getUserPrincipal() = " + request.getUserPrincipal());
        
        return request.getUserPrincipal() != null;
    
    }

}
