/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.example.avro;
@org.apache.avro.specific.AvroGenerated
public enum AlertStatus implements org.apache.avro.generic.GenericEnumSymbol<AlertStatus> {
  Critical, Major, Minor, Warning  ;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"enum\",\"name\":\"AlertStatus\",\"namespace\":\"com.example.avro\",\"symbols\":[\"Critical\",\"Major\",\"Minor\",\"Warning\"]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  @Override
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
}