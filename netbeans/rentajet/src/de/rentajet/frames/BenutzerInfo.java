/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package de.rentajet.frames;

import de.rentajet.base.H2InternalFrame;
import java.awt.BorderLayout;
import javax.swing.JPanel;

/**
 *
 * @author Petersen
 */
public class BenutzerInfo {
	private pnlBenutzer pnlBenutzer;
	private int iID;
	private int iNummer;
	private int iBenutzergruppeID;
	private String sVorname;
	private String sNachname;
	private String sInitialen;
	private String sLogin;
	private String sPasswort;
	private boolean bgesperrt;
	
	public BenutzerInfo() {
		pnlBenutzer = new pnlBenutzer();
	}
	
	public void show( JPanel pnlMain ) {
		H2InternalFrame frmBenutzer = new H2InternalFrame( "Benutzer" );
		frmBenutzer.add( pnlBenutzer, BorderLayout.CENTER );
		frmBenutzer.setVisible( true );
		pnlMain.add( frmBenutzer );
		try {
			frmBenutzer.setSelected(true);
    } 
		catch (java.beans.PropertyVetoException e) {
		}
	}	
	
	public void setzeAnzeige() {
		
	}
	
	public void aktualisiereAnzeige() {
		
	}
	
	public void ersterDatensatz() {
		
	}
	
	public void vorherigerdatensatz() {
		
	}
	
	public void naechsterDatensatz() {
		
	}
	
	public void sucheDatensatz() {
		
	}
	
	public void speichern() {
		speichereDB();
	}
	
	public void abbrechen() {
		
	}
	
	public void loeschen() {
		
	}
	
	public void aktualisieren() {
		
	}
	
	public void drucken() {
		
	}
	
	public void speichereDB() {
		
	}
	
	public void zeigeArchiv() {
		
	}
	
	public void ladeDB(){
		
	}
	
	public void loescheDB(){
		
	}
}
