/** 
 *  Generated by OpenJPA MetaModel Generator Tool.
**/

package org.apache.openmeetings.persistence.beans.flvrecord;

import java.lang.Long;
import java.lang.String;
import java.util.Date;
import javax.persistence.metamodel.SingularAttribute;

@javax.persistence.metamodel.StaticMetamodel
(value=org.apache.openmeetings.persistence.beans.flvrecord.FlvRecordingLog.class)
@javax.annotation.Generated
(value="org.apache.openjpa.persistence.meta.AnnotationProcessor6",date="Tue Mar 05 10:12:10 CST 2013")
public class FlvRecordingLog_ {
    public static volatile SingularAttribute<FlvRecordingLog,String> exitValue;
    public static volatile SingularAttribute<FlvRecordingLog,FlvRecording> flvRecording;
    public static volatile SingularAttribute<FlvRecordingLog,Long> flvRecordingLogId;
    public static volatile SingularAttribute<FlvRecordingLog,String> fullMessage;
    public static volatile SingularAttribute<FlvRecordingLog,Date> inserted;
    public static volatile SingularAttribute<FlvRecordingLog,String> msgType;
}
