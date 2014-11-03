package com.regiocom.test.managedbeans;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

/**
 * Created with IntelliJ IDEA.
 * User: M46923
 * Date: 07.01.13
 * Time: 13:51
 * To change this template use File | Settings | File Templates.
 */

@ManagedBean(name="neuereintragBean")
@SessionScoped

public class NeuereintragBean {
    private EintragslistenBean eintragslistenBean;

    private Eintrag neuenEintrag;

    public Eintrag getNeuenEintrag() {
        return neuenEintrag;
    }

    public void setNeuenEintrag(Eintrag neuenEintrag) {
        this.neuenEintrag = neuenEintrag;
    }

    public NeuereintragBean() {
        FacesContext context = FacesContext.getCurrentInstance();
        eintragslistenBean = (EintragslistenBean)context.getApplication()
                .createValueBinding("#{eintragslistenBean}").getValue(context);
        this.neuenEintrag = new Eintrag();
    }

    public void save() {
        eintragslistenBean.GaestebuchEintraege.add(neuenEintrag);
        neuenEintrag = new Eintrag();
    }

}