/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package wrapper.pcl;

public class Feature_PointXYZ_Normal extends wrapper.pcl.PCLBase_PointXYZ {
  private long swigCPtr;

  public Feature_PointXYZ_Normal(long cPtr, boolean cMemoryOwn) {
    super(wrapper.pcl_moduleJNI.pcl_Feature_PointXYZ_Normal_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(Feature_PointXYZ_Normal obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        wrapper.pcl_moduleJNI.delete_pcl_Feature_PointXYZ_Normal(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public void setIndices_(wrapper.vector_int value) {
    wrapper.pcl_moduleJNI.pcl_Feature_PointXYZ_Normal_indices__set(swigCPtr, this, wrapper.vector_int.getCPtr(value), value);
  }

  public wrapper.vector_int getIndices_() {
    long cPtr = wrapper.pcl_moduleJNI.pcl_Feature_PointXYZ_Normal_indices__get(swigCPtr, this);
    return (cPtr == 0) ? null : new wrapper.vector_int(cPtr, true);
  }

  public void setInput_(wrapper.pcl.PointCloud_PointXYZ value) {
    wrapper.pcl_moduleJNI.pcl_Feature_PointXYZ_Normal_input__set(swigCPtr, this, wrapper.pcl.PointCloud_PointXYZ.getCPtr(value));
  }

  public wrapper.pcl.PointCloud_PointXYZ getInput_() {
    long cPtr = wrapper.pcl_moduleJNI.pcl_Feature_PointXYZ_Normal_input__get(swigCPtr, this);
    return (cPtr == 0) ? null : new wrapper.pcl.PointCloud_PointXYZ(cPtr, true);
  }

  public void setSearchSurface(wrapper.pcl.PointCloud_PointXYZ cloud) {
    wrapper.pcl_moduleJNI.pcl_Feature_PointXYZ_Normal_setSearchSurface(swigCPtr, this, wrapper.pcl.PointCloud_PointXYZ.getCPtr(cloud));
  }

  public wrapper.pcl.PointCloud_PointXYZ getSearchSurface() {
    long cPtr = wrapper.pcl_moduleJNI.pcl_Feature_PointXYZ_Normal_getSearchSurface(swigCPtr, this);
    return (cPtr == 0) ? null : new wrapper.pcl.PointCloud_PointXYZ(cPtr, true);
  }

  public void setSearchMethod(wrapper.pcl.search.Search_PointXYZ tree) {
    wrapper.pcl_moduleJNI.pcl_Feature_PointXYZ_Normal_setSearchMethod(swigCPtr, this, wrapper.pcl.search.Search_PointXYZ.getCPtr(tree));
  }

  public wrapper.pcl.search.Search_PointXYZ getSearchMethod() {
    long cPtr = wrapper.pcl_moduleJNI.pcl_Feature_PointXYZ_Normal_getSearchMethod(swigCPtr, this);
    return (cPtr == 0) ? null : new wrapper.pcl.search.Search_PointXYZ(cPtr, true);
  }

  public double getSearchParameter() {
    return wrapper.pcl_moduleJNI.pcl_Feature_PointXYZ_Normal_getSearchParameter(swigCPtr, this);
  }

  public void setKSearch(int k) {
    wrapper.pcl_moduleJNI.pcl_Feature_PointXYZ_Normal_setKSearch(swigCPtr, this, k);
  }

  public int getKSearch() {
    return wrapper.pcl_moduleJNI.pcl_Feature_PointXYZ_Normal_getKSearch(swigCPtr, this);
  }

  public void setRadiusSearch(double radius) {
    wrapper.pcl_moduleJNI.pcl_Feature_PointXYZ_Normal_setRadiusSearch(swigCPtr, this, radius);
  }

  public double getRadiusSearch() {
    return wrapper.pcl_moduleJNI.pcl_Feature_PointXYZ_Normal_getRadiusSearch(swigCPtr, this);
  }

  public void compute(wrapper.pcl.PointCloud_Normal output) {
    wrapper.pcl_moduleJNI.pcl_Feature_PointXYZ_Normal_compute(swigCPtr, this, wrapper.pcl.PointCloud_Normal.getCPtr(output), output);
  }

}
