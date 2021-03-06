/**
 * GetOriginalContentResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package biz.oceaninformatics.www.OceanEhr.EhrBank.EhrService;

public class GetOriginalContentResponse  implements java.io.Serializable {
    private org.openehr.schemas.v1.DV_ENCAPSULATED getOriginalContentResult;

    public GetOriginalContentResponse() {
    }

    public GetOriginalContentResponse(
           org.openehr.schemas.v1.DV_ENCAPSULATED getOriginalContentResult) {
           this.getOriginalContentResult = getOriginalContentResult;
    }


    /**
     * Gets the getOriginalContentResult value for this GetOriginalContentResponse.
     * 
     * @return getOriginalContentResult
     */
    public org.openehr.schemas.v1.DV_ENCAPSULATED getGetOriginalContentResult() {
        return getOriginalContentResult;
    }


    /**
     * Sets the getOriginalContentResult value for this GetOriginalContentResponse.
     * 
     * @param getOriginalContentResult
     */
    public void setGetOriginalContentResult(org.openehr.schemas.v1.DV_ENCAPSULATED getOriginalContentResult) {
        this.getOriginalContentResult = getOriginalContentResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetOriginalContentResponse)) return false;
        GetOriginalContentResponse other = (GetOriginalContentResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getOriginalContentResult==null && other.getGetOriginalContentResult()==null) || 
             (this.getOriginalContentResult!=null &&
              this.getOriginalContentResult.equals(other.getGetOriginalContentResult())));
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
        if (getGetOriginalContentResult() != null) {
            _hashCode += getGetOriginalContentResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetOriginalContentResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.oceaninformatics.biz/OceanEhr/EhrBank/EhrService", ">GetOriginalContentResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getOriginalContentResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.oceaninformatics.biz/OceanEhr/EhrBank/EhrService", "GetOriginalContentResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.openehr.org/v1", "DV_ENCAPSULATED"));
        elemField.setMinOccurs(0);
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
