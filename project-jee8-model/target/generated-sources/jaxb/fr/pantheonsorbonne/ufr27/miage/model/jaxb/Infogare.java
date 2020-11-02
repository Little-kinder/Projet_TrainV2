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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour infogare complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="infogare"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="idInfogare" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="typeInfogare" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="chemin" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="idTrain" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="idTrainPhysique" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="idGare" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "infogare", propOrder = {
    "idInfogare",
    "typeInfogare",
    "chemin",
    "idTrain",
    "idTrainPhysique",
    "idGare"
})
@XmlRootElement(name = "infogare")
public class Infogare {

    protected int idInfogare;
    @XmlElement(required = true)
    protected String typeInfogare;
    @XmlElement(required = true)
    protected String chemin;
    protected int idTrain;
    protected int idTrainPhysique;
    protected int idGare;

    /**
     * Obtient la valeur de la propriété idInfogare.
     * 
     */
    public int getIdInfogare() {
        return idInfogare;
    }

    /**
     * Définit la valeur de la propriété idInfogare.
     * 
     */
    public void setIdInfogare(int value) {
        this.idInfogare = value;
    }

    /**
     * Obtient la valeur de la propriété typeInfogare.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeInfogare() {
        return typeInfogare;
    }

    /**
     * Définit la valeur de la propriété typeInfogare.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeInfogare(String value) {
        this.typeInfogare = value;
    }

    /**
     * Obtient la valeur de la propriété chemin.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChemin() {
        return chemin;
    }

    /**
     * Définit la valeur de la propriété chemin.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChemin(String value) {
        this.chemin = value;
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
     * Obtient la valeur de la propriété idTrainPhysique.
     * 
     */
    public int getIdTrainPhysique() {
        return idTrainPhysique;
    }

    /**
     * Définit la valeur de la propriété idTrainPhysique.
     * 
     */
    public void setIdTrainPhysique(int value) {
        this.idTrainPhysique = value;
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

}
