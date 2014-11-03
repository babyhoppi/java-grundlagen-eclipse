package com.regiocom.test.managedbeans;

/**
 * Created with IntelliJ IDEA.
 * User: M46923
 * Date: 08.01.13
 * Time: 15:00
 * To change this template use File | Settings | File Templates.
 */
public class Eintrag {
    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNachricht() {
        return nachricht;
    }

    public void setNachricht(String nachricht) {
        this.nachricht = nachricht;
    }

    String vorname;
    String nachname;
    String email;
    String nachricht;
}
