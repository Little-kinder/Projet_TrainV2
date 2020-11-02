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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour information complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="information"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="idInfo" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="typeInfo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="messageInfo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="idTrain" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "information", propOrder = {
    "idInfo",
    "typeInfo",
    "messageInfo",
    "idTrain"
})
public class Information {

    protected int idInfo;
    @XmlElement(required = true)
    protected String typeInfo;
    @XmlElement(required = true)
    protected String messageInfo;
    @XmlElement(required = true)
    protected String idTrain;

    /**
     * Obtient la valeur de la propriété idInfo.
     * 
     */
    public int getIdInfo() {
        return idInfo;
    }

    /**
     * Définit la valeur de la propriété idInfo.
     * 
     */
    public void setIdInfo(int value) {
        this.idInfo = value;
    }

    /**
     * Obtient la valeur de la propriété typeInfo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeInfo() {
        return typeInfo;
    }

    /**
     * Définit la valeur de la propriété typeInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeInfo(String value) {
        this.typeInfo = value;
    }

    /**
     * Obtient la valeur de la propriété messageInfo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageInfo() {
        return messageInfo;
    }

    /**
     * Définit la valeur de la propriété messageInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageInfo(String value) {
        this.messageInfo = value;
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

}
