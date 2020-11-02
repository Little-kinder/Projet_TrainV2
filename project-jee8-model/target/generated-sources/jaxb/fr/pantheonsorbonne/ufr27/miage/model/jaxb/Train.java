//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.3.2 
// Voir <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2020.10.30 à 05:15:57 PM CET 
//


package fr.pantheonsorbonne.ufr27.miage.model.jaxb;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java pour train complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="train"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="idTrain" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="heureDepart" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="heureArrive" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="etat" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="nbPassager" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="chemin"&gt;
 *           &lt;simpleType&gt;
 *             &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "train", propOrder = {
    "idTrain",
    "heureDepart",
    "heureArrive",
    "etat",
    "nbPassager",
    "chemin"
})
@XmlRootElement(name = "train")
public class Train {

    protected int idTrain;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar heureDepart;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar heureArrive;
    protected boolean etat;
    protected int nbPassager;
    @XmlList
    @XmlElement(required = true)
    protected List<String> chemin;

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
     * Obtient la valeur de la propriété etat.
     * 
     */
    public boolean isEtat() {
        return etat;
    }

    /**
     * Définit la valeur de la propriété etat.
     * 
     */
    public void setEtat(boolean value) {
        this.etat = value;
    }

    /**
     * Obtient la valeur de la propriété nbPassager.
     * 
     */
    public int getNbPassager() {
        return nbPassager;
    }

    /**
     * Définit la valeur de la propriété nbPassager.
     * 
     */
    public void setNbPassager(int value) {
        this.nbPassager = value;
    }

    /**
     * Gets the value of the chemin property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the chemin property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChemin().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getChemin() {
        if (chemin == null) {
            chemin = new ArrayList<String>();
        }
        return this.chemin;
    }

}
