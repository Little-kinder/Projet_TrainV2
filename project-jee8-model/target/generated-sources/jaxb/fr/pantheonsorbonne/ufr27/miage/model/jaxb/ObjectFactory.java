//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.3.2 
// Voir <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2020.10.30 à 05:15:57 PM CET 
//


package fr.pantheonsorbonne.ufr27.miage.model.jaxb;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the fr.pantheonsorbonne.ufr27.miage.model.jaxb package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Information_QNAME = new QName("", "information");
    private final static QName _Infocentre_QNAME = new QName("", "infocentre");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: fr.pantheonsorbonne.ufr27.miage.model.jaxb
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link User }
     * 
     */
    public User createUser() {
        return new User();
    }

    /**
     * Create an instance of {@link Address }
     * 
     */
    public Address createAddress() {
        return new Address();
    }

    /**
     * Create an instance of {@link Ccinfo }
     * 
     */
    public Ccinfo createCcinfo() {
        return new Ccinfo();
    }

    /**
     * Create an instance of {@link FreeTrialPlan }
     * 
     */
    public FreeTrialPlan createFreeTrialPlan() {
        return new FreeTrialPlan();
    }

    /**
     * Create an instance of {@link Train }
     * 
     */
    public Train createTrain() {
        return new Train();
    }

    /**
     * Create an instance of {@link TrainPhysique }
     * 
     */
    public TrainPhysique createTrainPhysique() {
        return new TrainPhysique();
    }

    /**
     * Create an instance of {@link Arret }
     * 
     */
    public Arret createArret() {
        return new Arret();
    }

    /**
     * Create an instance of {@link Gare }
     * 
     */
    public Gare createGare() {
        return new Gare();
    }

    /**
     * Create an instance of {@link Passager }
     * 
     */
    public Passager createPassager() {
        return new Passager();
    }

    /**
     * Create an instance of {@link Infogare }
     * 
     */
    public Infogare createInfogare() {
        return new Infogare();
    }

    /**
     * Create an instance of {@link Information }
     * 
     */
    public Information createInformation() {
        return new Information();
    }

    /**
     * Create an instance of {@link Infocentre }
     * 
     */
    public Infocentre createInfocentre() {
        return new Infocentre();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Information }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Information }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "information")
    public JAXBElement<Information> createInformation(Information value) {
        return new JAXBElement<Information>(_Information_QNAME, Information.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Information }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Information }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "infocentre")
    public JAXBElement<Information> createInfocentre(Information value) {
        return new JAXBElement<Information>(_Infocentre_QNAME, Information.class, null, value);
    }

}
