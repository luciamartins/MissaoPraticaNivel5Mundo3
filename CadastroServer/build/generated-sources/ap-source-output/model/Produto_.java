package model;

import javax.annotation.processing.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Movimento;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-11-18T22:19:32", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Produto.class)
public class Produto_ { 

    public static volatile SingularAttribute<Produto, Long> precoVenda;
    public static volatile SingularAttribute<Produto, Integer> idProduto;
    public static volatile SingularAttribute<Produto, String> nome;
    public static volatile CollectionAttribute<Produto, Movimento> movimentoCollection;
    public static volatile SingularAttribute<Produto, Integer> quantidade;

}