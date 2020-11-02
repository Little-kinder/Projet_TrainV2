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
 * <p>Classe Java pour trainPhysique complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="trainPhysique"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="idTrainPhys" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="idTrain" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="localisationTrain" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "trainPhysique", propOrder = {
    "idTrainPhys",
    "type",
    "idTrain",
    "localisationTrain"
})
@XmlRootElement(name = "trainPhysique")
public class TrainPhysique {

    protected int idTrainPhys;
    @XmlElement(required = true)
    protected String type;
    @XmlElement(required = true)
    protected String idTrain;
    @XmlElement(required = true)
    protected String localisationTrain;

    /**
     * Obtient la valeur de la propriété idTrainPhys.
     * 
     */
    public int getIdTrainPhys() {
        return idTrainPhys;
    }

    /**
     * Définit la valeur de la propriété idTrainPhys.
     * 
     */
    public void setIdTrainPhys(int value) {
        this.idTrainPhys = value;
    }

    /**
     * Obtient la valeur de la propriété type.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Définit la valeur de la propriété type.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Obtient la valeur de la propriété idTrain.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdTrain() {
        return idTrain;
    }

    /**
     * Définit la valeur de la propriété idTrain.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdTrain(String value) {
        this.idTrain = value;
    }

    /**
     * Obtient la valeur de la propriété localisationTrain.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalisationTrain() {
        return localisationTrain;
    }

    /**
     * Définit la valeur de la propriété localisationTrain.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalisationTrain(String value) {
        this.localisationTrain = value;
    }

}
