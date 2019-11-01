package entity;

import entity.Papel;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-11-01T00:02:47")
@StaticMetamodel(Credencial.class)
public class Credencial_ { 

    public static volatile SingularAttribute<Credencial, String> senha;
    public static volatile SingularAttribute<Credencial, String> identificacao;
    public static volatile SingularAttribute<Credencial, Integer> id;
    public static volatile SingularAttribute<Credencial, Papel> pap;

}