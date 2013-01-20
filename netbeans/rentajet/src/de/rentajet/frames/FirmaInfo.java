/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package de.rentajet.frames;

import de.rentajet.base.H2InternalFrame;
import java.awt.BorderLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Petersen
 */
public class FirmaInfo {
	private pnlFirma pnlFirma;
	private int iID;
	private int iOrtID;
	private String sBezeichnung;
	private String sName1;
	private String sName2;
	private String sName3;
	private String sStrasse;
	private String sSteuernummer;
	private String sBetriebsnummer;
	private String sUSTIdentNummer;
	private String sTelefon;
	private String sTelefax;
	private String sLogo;
	
	private String sOrt;
	private String sPLZ;
	
	public FirmaInfo() {
		
	}
	
	public void show( JPanel pnlMain ) {
		pnlFirma = new pnlFirma();
		H2InternalFrame frmFirma = new H2InternalFrame( "Firma" );
		frmFirma.add( pnlFirma, BorderLayout.CENTER );
		frmFirma.setVisible( true );
		pnlMain.add( frmFirma );
		try {
			frmFirma.setSelected(true);
    } 
		catch (java.beans.PropertyVetoException e) {
		}
	}
	
	private void setzeAnzeige() {
		pnlFirma.setBezeichnung( sBezeichnung );
		pnlFirma.setName1( sName1 );
		pnlFirma.setName2( sName2 );
		pnlFirma.setName3( sName3 );
		pnlFirma.setStrasse( sStrasse );
		pnlFirma.setPLZ( sPLZ );
		pnlFirma.setOrt( sOrt );
		pnlFirma.setSteuernummer( sSteuernummer );
		pnlFirma.setBetriebsnummer( sBetriebsnummer );
		pnlFirma.setUSTIdentNummer( sUSTIdentNummer );
		pnlFirma.setTelefon( sTelefon );
		pnlFirma.setTelefax( sTelefax );
		pnlFirma.setLogo( sLogo );
	}
	
	private void leseausAnzeige() {
		sBezeichnung = pnlFirma.getBezeichnung();
		sName1 = pnlFirma.getName1();
		sName2 = pnlFirma.getName2();
		sName3 = pnlFirma.getName3();
		sStrasse = pnlFirma.getStrasse();
		sOrt = pnlFirma.getOrt();
		sPLZ = pnlFirma.getPLZ();
		sSteuernummer = pnlFirma.getSteuernummer();
		sBetriebsnummer = pnlFirma.getBetriebsnummer();
		sUSTIdentNummer = pnlFirma.getUSTIdentNummer();
		sTelefon = pnlFirma.getTelefon();
		sTelefax = pnlFirma.getTelefax();
		sLogo = pnlFirma.getLogo();
	}
	
	private void aktualisiereAnzeige() {
		sBezeichnung = "";
		sName1 = "";
		sName2 = "";
		sName3 = "";
		sStrasse = "";
		sOrt = "";
		sPLZ = "";
		sSteuernummer = "";
		sBetriebsnummer = "";
		sUSTIdentNummer = "";
		sTelefon = "";
		sTelefax = "";
		sLogo = "";
		iOrtID = 0;
		setzeAnzeige();
	}
	
	public void ersterDatensatz() {
		ersterDatensatzDB();
		setzeAnzeige();
	}
	
	public void vorherigerdatensatz() {
		vorherigerdatensatzDB();
		setzeAnzeige();
	}
	
	public void naechsterDatensatz() {
		naechsterDatensatzDB();
		setzeAnzeige();
	}
	
	public void letzterDatensatz() {
		letzterDatensatzDB();
		setzeAnzeige();
	}
	
	public void sucheDatensatz() {
		// ToDo: Erstellung eines Suchfensters
	}
	
	public void speichern() {
		speichereDB();
		aktualisiereAnzeige();
	}
	
	public void abbrechen() {
		aktualisiereAnzeige();
	}
	
	public void loeschen() {
		loescheDB();
		aktualisiereAnzeige();
	}
	
	public void aktualisieren() {
		setzeAnzeige();
	}
	
	public void drucken() {
		JOptionPane.showMessageDialog(
			null, "Es stehen keine Druckdaten zur Verfügung", "Drucken", 
			JOptionPane.OK_OPTION
		);	
	}
		
	public void zeigeArchiv() {
		JOptionPane.showMessageDialog(
			null, "Es stehen keine Archivdaten zur Verfügung", "Archiv", 
			JOptionPane.OK_OPTION
		);	
	}

	public void speichereDB() {
		
	}
	
	public void ladeDB(){
		
	}
	
	public void loescheDB(){
		
	}
	
	
	public void ersterDatensatzDB() {
		
	}
	
	public void vorherigerdatensatzDB() {
		
	}
	
	public void naechsterDatensatzDB() {
		
	}
	
	public void letzterDatensatzDB() {
		
	}
}
