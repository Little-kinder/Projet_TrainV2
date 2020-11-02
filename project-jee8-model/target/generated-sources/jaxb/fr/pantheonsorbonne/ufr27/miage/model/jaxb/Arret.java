//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.3.2 
// Voir <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2020.10.30 à 05:15:57 PM CET 
//


package fr.pantheonsorbonne.ufr27.miage.model.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java pour arret complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="arret"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="idArret" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="idTrain" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="idTrainphysique" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="idGare" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="numeroVoie" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="heureArrive" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="heureDepart" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "arret", propOrder = {
    "idArret",
    "idTrain",
    "idTrainphysique",
    "idGare",
    "numeroVoie",
    "heureArrive",
    "heureDepart"
})
@XmlRootElement(name = "arret")
public class Arret {

    protected int idArret;
    protected int idTrain;
    protected int idTrainphysique;
    protected int idGare;
    protected int numeroVoie;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar heureArrive;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar heureDepart;

    /**
     * Obtient la valeur de la propriété idArret.
     * 
     */
    public int getIdArret() {
        return idArret;
    }

    /**
     * Définit la valeur de la propriété idArret.
     * 
     */
    public void setIdArret(int value) {
        this.idArret = value;
    }

    /**
     * Obtient la valeur de la propriété idTrain.
     * 
     */
    public int getIdTrain() {
        return idTrain;
    }

    /**
     * Définit la valeur de la propriété idTrain.
     * 
     */
    public void setIdTrain(int value) {
        this.idTrain = value;
    }

    /**
     * Obtient la valeur de la propriété idTrainphysique.
     * 
     */
    public int getIdTrainphysique() {
        return idTrainphysique;
    }

    /**
     * Définit la valeur de la propriété idTrainphysique.
     * 
     */
    public void setIdTrainphysique(int value) {
        this.idTrainphysique = value;
    }

    /**
     * Obtient la valeur de la propriété idGare.
     * 
     */
    public int getIdGare() {
        return idGare;
    }

    /**
     * Définit la valeur de la propriété idGare.
     * 
     */
    public void setIdGare(int value) {
        this.idGare = value;
    }

    /**
     * Obtient la valeur de la propriété numeroVoie.
     * 
     */
    public int getNumeroVoie() {
        return numeroVoie;
    }

    /**
     * Définit la valeur de la propriété numeroVoie.
     * 
     */
    public void setNumeroVoie(int value) {
        this.numeroVoie = value;
    }

    /**
     * Obtient la valeur de la propriété heureArrive.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getHeureArrive() {
        return heureArrive;
    }

    /**
     * Définit la valeur de la propriété heureArrive.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setHeureArrive(XMLGregorianCalendar value) {
        this.heureArrive = value;
    }

    /**
     * Obtient la valeur de la propriété heureDepart.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getHeureDepart() {
        return heureDepart;
    }

    /**
     * Définit la valeur de la propriété heureDepart.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setHeureDepart(XMLGregorianCalendar value) {
        this.heureDepart = value;
    }

}
