package com.regiocom.test.managedbeans;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: M46923
 * Date: 08.01.13
 * Time: 14:11
 * To change this template use File | Settings | File Templates.
 */

@ManagedBean(name="eintragslistenBean")
@ApplicationScoped
public class EintragslistenBean {
    ArrayList<Eintrag> GaestebuchEintraege = new ArrayList<Eintrag>();

    public ArrayList<Eintrag> getGaestebuchEintraege() {
        return GaestebuchEintraege;
    }
}