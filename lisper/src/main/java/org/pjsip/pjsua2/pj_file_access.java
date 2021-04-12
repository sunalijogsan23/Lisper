/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.pjsip.pjsua2;

public final class pj_file_access {
  public final static pj_file_access PJ_O_RDONLY = new pj_file_access("PJ_O_RDONLY", pjsua2JNI.PJ_O_RDONLY_get());
  public final static pj_file_access PJ_O_WRONLY = new pj_file_access("PJ_O_WRONLY", pjsua2JNI.PJ_O_WRONLY_get());
  public final static pj_file_access PJ_O_RDWR = new pj_file_access("PJ_O_RDWR", pjsua2JNI.PJ_O_RDWR_get());
  public final static pj_file_access PJ_O_APPEND = new pj_file_access("PJ_O_APPEND", pjsua2JNI.PJ_O_APPEND_get());

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static pj_file_access swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + pj_file_access.class + " with value " + swigValue);
  }

  private pj_file_access(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private pj_file_access(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private pj_file_access(String swigName, pj_file_access swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static pj_file_access[] swigValues = { PJ_O_RDONLY, PJ_O_WRONLY, PJ_O_RDWR, PJ_O_APPEND };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}

