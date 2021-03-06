/**
 * RunQueryResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package biz.oceaninformatics.www.OceanEhr.EhrBank.EhrService;

public class RunQueryResponse  implements java.io.Serializable {
    private int runQueryResult;

    public RunQueryResponse() {
    }

    public RunQueryResponse(
           int runQueryResult) {
           this.runQueryResult = runQueryResult;
    }


    /**
     * Gets the runQueryResult value for this RunQueryResponse.
     * 
     * @return runQueryResult
     */
    public int getRunQueryResult() {
        return runQueryResult;
    }


    /**
     * Sets the runQueryResult value for this RunQueryResponse.
     * 
     * @param runQueryResult
     */
    public void setRunQueryResult(int runQueryResult) {
        this.runQueryResult = runQueryResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RunQueryResponse)) return false;
        RunQueryResponse other = (RunQueryResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.runQueryResult == other.getRunQueryResult();
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        _hashCode += getRunQueryResult();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RunQueryResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.oceaninformatics.biz/OceanEhr/EhrBank/EhrService", ">RunQueryResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("runQueryResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.oceaninformatics.biz/OceanEhr/EhrBank/EhrService", "RunQueryResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
