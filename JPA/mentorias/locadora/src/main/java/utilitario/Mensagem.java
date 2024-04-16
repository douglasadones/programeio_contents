package utilitario;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

/**
 *
 * @author dougl
 */
public class Mensagem {

    public static void msg(String mensagem) {
        FacesContext.getCurrentInstance().
                addMessage(null, new FacesMessage(mensagem));
    }

}
