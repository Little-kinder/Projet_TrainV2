//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.3.2 
// Voir <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2020.10.30 à 05:15:57 PM CET 
//


package fr.pantheonsorbonne.ufr27.miage.model.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour passager complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="passager"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="idPass" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="idTrain" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="correspondance" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "passager", propOrder = {
    "idPass",
    "idTrain",
    "correspondance"
})
@XmlRootElement(name = "passager")
public class Passager {

    protected int idPass;
    protected int idTrain;
    protected boolean correspondance;

    /**
     * Obtient la valeur de la propriété idPass.
     * 
     */
    public int getIdPass() {
        return idPass;
    }

    /**
     * Définit la valeur de la propriété idPass.
     * 
     */
    public void setIdPass(int value) {
        this.idPass = value;
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
     * Obtient la valeur de la propriété correspondance.
     * 
     */
    public boolean isCorrespondance() {
        return correspondance;
    }

    /**
     * Définit la valeur de la propriété correspondance.
     * 
     */
    public void setCorrespondance(boolean value) {
        this.correspondance = value;
    }

}
