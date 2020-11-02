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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour infocentre complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="infocentre"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="idTrainReseau"&gt;
 *           &lt;simpleType&gt;
 *             &lt;list itemType="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="idGare"&gt;
 *           &lt;simpleType&gt;
 *             &lt;list itemType="{http://www.w3.org/2001/XMLSchema}int" /&gt;
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
@XmlType(name = "infocentre", propOrder = {
    "idTrainReseau",
    "idGare"
})
public class Infocentre {

    @XmlList
    @XmlElement(type = Integer.class)
    protected List<Integer> idTrainReseau;
    @XmlList
    @XmlElement(type = Integer.class)
    protected List<Integer> idGare;

    /**
     * Gets the value of the idTrainReseau property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the idTrainReseau property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIdTrainReseau().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getIdTrainReseau() {
        if (idTrainReseau == null) {
            idTrainReseau = new ArrayList<Integer>();
        }
        return this.idTrainReseau;
    }

    /**
     * Gets the value of the idGare property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the idGare property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIdGare().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getIdGare() {
        if (idGare == null) {
            idGare = new ArrayList<Integer>();
        }
        return this.idGare;
    }

}
