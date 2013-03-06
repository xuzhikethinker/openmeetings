/** 
 *  Generated by OpenJPA MetaModel Generator Tool.
**/

package org.apache.openmeetings.persistence.beans.basic;

import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Long;
import java.lang.String;
import java.util.Calendar;
import java.util.Date;
import javax.persistence.metamodel.SingularAttribute;
import org.apache.openmeetings.persistence.beans.user.User;

@javax.persistence.metamodel.StaticMetamodel
(value=org.apache.openmeetings.persistence.beans.basic.Server.class)
@javax.annotation.Generated
(value="org.apache.openjpa.persistence.meta.AnnotationProcessor6",date="Tue Mar 05 10:12:09 CST 2013")
public class Server_ {
    public static volatile SingularAttribute<Server,Boolean> active;
    public static volatile SingularAttribute<Server,String> address;
    public static volatile SingularAttribute<Server,String> comment;
    public static volatile SingularAttribute<Server,Boolean> deleted;
    public static volatile SingularAttribute<Server,Long> id;
    public static volatile SingularAttribute<Server,Date> inserted;
    public static volatile SingularAttribute<Server,User> insertedby;
    public static volatile SingularAttribute<Server,Calendar> lastPing;
    public static volatile SingularAttribute<Server,String> name;
    public static volatile SingularAttribute<Server,String> pass;
    public static volatile SingularAttribute<Server,Integer> port;
    public static volatile SingularAttribute<Server,String> protocol;
    public static volatile SingularAttribute<Server,Date> updated;
    public static volatile SingularAttribute<Server,User> updatedby;
    public static volatile SingularAttribute<Server,String> user;
    public static volatile SingularAttribute<Server,String> webapp;
}
