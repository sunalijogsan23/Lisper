/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.pjsip.pjsua2;

public final class pjsua_nat64_opt {
  public final static pjsua_nat64_opt PJSUA_NAT64_DISABLED = new pjsua_nat64_opt("PJSUA_NAT64_DISABLED");
  public final static pjsua_nat64_opt PJSUA_NAT64_ENABLED = new pjsua_nat64_opt("PJSUA_NAT64_ENABLED");

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static pjsua_nat64_opt swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + pjsua_nat64_opt.class + " with value " + swigValue);
  }

  private pjsua_nat64_opt(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private pjsua_nat64_opt(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private pjsua_nat64_opt(String swigName, pjsua_nat64_opt swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static pjsua_nat64_opt[] swigValues = { PJSUA_NAT64_DISABLED, PJSUA_NAT64_ENABLED };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}

