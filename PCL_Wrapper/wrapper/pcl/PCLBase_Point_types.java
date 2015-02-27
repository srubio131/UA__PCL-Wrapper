/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package wrapper.pcl;

public class PCLBase_Point_types {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public PCLBase_Point_types(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(PCLBase_Point_types obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        wrapper.pcl_moduleJNI.delete_pcl_PCLBase_Point_types(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public PCLBase_Point_types() {
    this(wrapper.pcl_moduleJNI.new_pcl_PCLBase_Point_types__SWIG_0(), true);
  }

  public PCLBase_Point_types(wrapper.pcl.PCLBase_Point_types base) {
    this(wrapper.pcl_moduleJNI.new_pcl_PCLBase_Point_types__SWIG_1(wrapper.pcl.PCLBase_Point_types.getCPtr(base), base), true);
  }

  public void setInputCloud(wrapper.pcl.PointCloud_Point_types cloud) {
    wrapper.pcl_moduleJNI.pcl_PCLBase_Point_types_setInputCloud(swigCPtr, this, wrapper.pcl.PointCloud_Point_types.getCPtr(cloud));
  }

  public wrapper.pcl.PointCloud_Point_types getInputCloud() {
    long cPtr = wrapper.pcl_moduleJNI.pcl_PCLBase_Point_types_getInputCloud(swigCPtr, this);
    return (cPtr == 0) ? null : new wrapper.pcl.PointCloud_Point_types(cPtr, true);
  }

  public void setIndices(wrapper.vector_int indices) {
    wrapper.pcl_moduleJNI.pcl_PCLBase_Point_types_setIndices__SWIG_0(swigCPtr, this, wrapper.vector_int.getCPtr(indices), indices);
  }

  public void setIndices(wrapper.SWIGTYPE_p_boost__shared_ptrT_PointIndices_const_t indices) {
    wrapper.pcl_moduleJNI.pcl_PCLBase_Point_types_setIndices__SWIG_1(swigCPtr, this, wrapper.SWIGTYPE_p_boost__shared_ptrT_PointIndices_const_t.getCPtr(indices));
  }

  public void setIndices(long row_start, long col_start, long nb_rows, long nb_cols) {
    wrapper.pcl_moduleJNI.pcl_PCLBase_Point_types_setIndices__SWIG_2(swigCPtr, this, row_start, col_start, nb_rows, nb_cols);
  }

  public wrapper.vector_int getIndices() {
    long cPtr = wrapper.pcl_moduleJNI.pcl_PCLBase_Point_types_getIndices(swigCPtr, this);
    return (cPtr == 0) ? null : new wrapper.vector_int(cPtr, true);
  }

  public wrapper.SWIGTYPE_p_pcl__Point_types at(long pos) {
    return new wrapper.SWIGTYPE_p_pcl__Point_types(wrapper.pcl_moduleJNI.pcl_PCLBase_Point_types_at(swigCPtr, this, pos), false);
  }

}
