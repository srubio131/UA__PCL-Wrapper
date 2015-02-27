/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package wrapper.pcl.search;

public class KdTree_PointXYZRGBA extends wrapper.pcl.search.Search_PointXYZRGBA {
  private long swigCPtr;
  private boolean swigCMemOwnDerived;

  public KdTree_PointXYZRGBA(long cPtr, boolean cMemoryOwn) {
    super(wrapper.pcl_moduleJNI.pcl_search_KdTree_PointXYZRGBA_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(KdTree_PointXYZRGBA obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwnDerived) {
        swigCMemOwnDerived = false;
        wrapper.pcl_moduleJNI.delete_pcl_search_KdTree_PointXYZRGBA(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public void setIndices_(wrapper.vector_int value) {
    wrapper.pcl_moduleJNI.pcl_search_KdTree_PointXYZRGBA_indices__set(swigCPtr, this, wrapper.vector_int.getCPtr(value), value);
  }

  public wrapper.vector_int getIndices_() {
    long cPtr = wrapper.pcl_moduleJNI.pcl_search_KdTree_PointXYZRGBA_indices__get(swigCPtr, this);
    return (cPtr == 0) ? null : new wrapper.vector_int(cPtr, true);
  }

  public void setInput_(wrapper.pcl.PointCloud_PointXYZRGBA value) {
    wrapper.pcl_moduleJNI.pcl_search_KdTree_PointXYZRGBA_input__set(swigCPtr, this, wrapper.pcl.PointCloud_PointXYZRGBA.getCPtr(value));
  }

  public wrapper.pcl.PointCloud_PointXYZRGBA getInput_() {
    long cPtr = wrapper.pcl_moduleJNI.pcl_search_KdTree_PointXYZRGBA_input__get(swigCPtr, this);
    return (cPtr == 0) ? null : new wrapper.pcl.PointCloud_PointXYZRGBA(cPtr, true);
  }

  public wrapper.vector_int getIndices() {
    long cPtr = wrapper.pcl_moduleJNI.pcl_search_KdTree_PointXYZRGBA_getIndices(swigCPtr, this);
    return (cPtr == 0) ? null : new wrapper.vector_int(cPtr, true);
  }

  public wrapper.pcl.PointCloud_PointXYZRGBA getInputCloud() {
    long cPtr = wrapper.pcl_moduleJNI.pcl_search_KdTree_PointXYZRGBA_getInputCloud(swigCPtr, this);
    return (cPtr == 0) ? null : new wrapper.pcl.PointCloud_PointXYZRGBA(cPtr, true);
  }

  public int nearestKSearch(wrapper.pcl.PointCloud_PointXYZRGBA cloud, int index, int k, wrapper.vector_int k_indices, wrapper.SWIGTYPE_p_std__vectorT_float_t k_sqr_distances) {
    return wrapper.pcl_moduleJNI.pcl_search_KdTree_PointXYZRGBA_nearestKSearch__SWIG_0_0(swigCPtr, this, wrapper.pcl.PointCloud_PointXYZRGBA.getCPtr(cloud), cloud, index, k, wrapper.vector_int.getCPtr(k_indices), k_indices, wrapper.SWIGTYPE_p_std__vectorT_float_t.getCPtr(k_sqr_distances));
  }

  public int nearestKSearch(int index, int k, wrapper.vector_int k_indices, wrapper.SWIGTYPE_p_std__vectorT_float_t k_sqr_distances) {
    return wrapper.pcl_moduleJNI.pcl_search_KdTree_PointXYZRGBA_nearestKSearch__SWIG_0_1(swigCPtr, this, index, k, wrapper.vector_int.getCPtr(k_indices), k_indices, wrapper.SWIGTYPE_p_std__vectorT_float_t.getCPtr(k_sqr_distances));
  }

  public void nearestKSearch(wrapper.pcl.PointCloud_PointXYZRGBA cloud, wrapper.vector_int indices, int k, wrapper.SWIGTYPE_p_std__vectorT_std__vectorT_int_t_t k_indices, wrapper.SWIGTYPE_p_std__vectorT_std__vectorT_float_t_t k_sqr_distances) {
    wrapper.pcl_moduleJNI.pcl_search_KdTree_PointXYZRGBA_nearestKSearch__SWIG_0_2(swigCPtr, this, wrapper.pcl.PointCloud_PointXYZRGBA.getCPtr(cloud), cloud, wrapper.vector_int.getCPtr(indices), indices, k, wrapper.SWIGTYPE_p_std__vectorT_std__vectorT_int_t_t.getCPtr(k_indices), wrapper.SWIGTYPE_p_std__vectorT_std__vectorT_float_t_t.getCPtr(k_sqr_distances));
  }

  public int radiusSearch(wrapper.pcl.PointCloud_PointXYZRGBA cloud, int index, double radius, wrapper.vector_int k_indices, wrapper.SWIGTYPE_p_std__vectorT_float_t k_sqr_distances, long max_nn) {
    return wrapper.pcl_moduleJNI.pcl_search_KdTree_PointXYZRGBA_radiusSearch__SWIG_0_0(swigCPtr, this, wrapper.pcl.PointCloud_PointXYZRGBA.getCPtr(cloud), cloud, index, radius, wrapper.vector_int.getCPtr(k_indices), k_indices, wrapper.SWIGTYPE_p_std__vectorT_float_t.getCPtr(k_sqr_distances), max_nn);
  }

  public int radiusSearch(wrapper.pcl.PointCloud_PointXYZRGBA cloud, int index, double radius, wrapper.vector_int k_indices, wrapper.SWIGTYPE_p_std__vectorT_float_t k_sqr_distances) {
    return wrapper.pcl_moduleJNI.pcl_search_KdTree_PointXYZRGBA_radiusSearch__SWIG_0_1(swigCPtr, this, wrapper.pcl.PointCloud_PointXYZRGBA.getCPtr(cloud), cloud, index, radius, wrapper.vector_int.getCPtr(k_indices), k_indices, wrapper.SWIGTYPE_p_std__vectorT_float_t.getCPtr(k_sqr_distances));
  }

  public int radiusSearch(int index, double radius, wrapper.vector_int k_indices, wrapper.SWIGTYPE_p_std__vectorT_float_t k_sqr_distances, long max_nn) {
    return wrapper.pcl_moduleJNI.pcl_search_KdTree_PointXYZRGBA_radiusSearch__SWIG_0_2(swigCPtr, this, index, radius, wrapper.vector_int.getCPtr(k_indices), k_indices, wrapper.SWIGTYPE_p_std__vectorT_float_t.getCPtr(k_sqr_distances), max_nn);
  }

  public int radiusSearch(int index, double radius, wrapper.vector_int k_indices, wrapper.SWIGTYPE_p_std__vectorT_float_t k_sqr_distances) {
    return wrapper.pcl_moduleJNI.pcl_search_KdTree_PointXYZRGBA_radiusSearch__SWIG_0_3(swigCPtr, this, index, radius, wrapper.vector_int.getCPtr(k_indices), k_indices, wrapper.SWIGTYPE_p_std__vectorT_float_t.getCPtr(k_sqr_distances));
  }

  public void radiusSearch(wrapper.pcl.PointCloud_PointXYZRGBA cloud, wrapper.vector_int indices, double radius, wrapper.SWIGTYPE_p_std__vectorT_std__vectorT_int_t_t k_indices, wrapper.SWIGTYPE_p_std__vectorT_std__vectorT_float_t_t k_sqr_distances, long max_nn) {
    wrapper.pcl_moduleJNI.pcl_search_KdTree_PointXYZRGBA_radiusSearch__SWIG_0_4(swigCPtr, this, wrapper.pcl.PointCloud_PointXYZRGBA.getCPtr(cloud), cloud, wrapper.vector_int.getCPtr(indices), indices, radius, wrapper.SWIGTYPE_p_std__vectorT_std__vectorT_int_t_t.getCPtr(k_indices), wrapper.SWIGTYPE_p_std__vectorT_std__vectorT_float_t_t.getCPtr(k_sqr_distances), max_nn);
  }

  public void radiusSearch(wrapper.pcl.PointCloud_PointXYZRGBA cloud, wrapper.vector_int indices, double radius, wrapper.SWIGTYPE_p_std__vectorT_std__vectorT_int_t_t k_indices, wrapper.SWIGTYPE_p_std__vectorT_std__vectorT_float_t_t k_sqr_distances) {
    wrapper.pcl_moduleJNI.pcl_search_KdTree_PointXYZRGBA_radiusSearch__SWIG_0_5(swigCPtr, this, wrapper.pcl.PointCloud_PointXYZRGBA.getCPtr(cloud), cloud, wrapper.vector_int.getCPtr(indices), indices, radius, wrapper.SWIGTYPE_p_std__vectorT_std__vectorT_int_t_t.getCPtr(k_indices), wrapper.SWIGTYPE_p_std__vectorT_std__vectorT_float_t_t.getCPtr(k_sqr_distances));
  }

  public void setSorted_results_(boolean value) {
    wrapper.pcl_moduleJNI.pcl_search_KdTree_PointXYZRGBA_sorted_results__set(swigCPtr, this, value);
  }

  public boolean getSorted_results_() {
    return wrapper.pcl_moduleJNI.pcl_search_KdTree_PointXYZRGBA_sorted_results__get(swigCPtr, this);
  }

  public void setPointRepresentation(wrapper.SWIGTYPE_p_boost__shared_ptrT_pcl__PointRepresentationT_pcl__PointXYZRGBA_t_const_t point_representation) {
    wrapper.pcl_moduleJNI.pcl_search_KdTree_PointXYZRGBA_setPointRepresentation(swigCPtr, this, wrapper.SWIGTYPE_p_boost__shared_ptrT_pcl__PointRepresentationT_pcl__PointXYZRGBA_t_const_t.getCPtr(point_representation));
  }

  public wrapper.SWIGTYPE_p_boost__shared_ptrT_pcl__PointRepresentationT_pcl__PointXYZRGBA_t_const_t getPointRepresentation() {
    return new wrapper.SWIGTYPE_p_boost__shared_ptrT_pcl__PointRepresentationT_pcl__PointXYZRGBA_t_const_t(wrapper.pcl_moduleJNI.pcl_search_KdTree_PointXYZRGBA_getPointRepresentation(swigCPtr, this), true);
  }

  public void setSortedResults(boolean sorted_results) {
    wrapper.pcl_moduleJNI.pcl_search_KdTree_PointXYZRGBA_setSortedResults(swigCPtr, this, sorted_results);
  }

  public void setEpsilon(float eps) {
    wrapper.pcl_moduleJNI.pcl_search_KdTree_PointXYZRGBA_setEpsilon(swigCPtr, this, eps);
  }

  public float getEpsilon() {
    return wrapper.pcl_moduleJNI.pcl_search_KdTree_PointXYZRGBA_getEpsilon(swigCPtr, this);
  }

  public void setInputCloud(wrapper.pcl.PointCloud_PointXYZRGBA cloud, wrapper.vector_int indices) {
    wrapper.pcl_moduleJNI.pcl_search_KdTree_PointXYZRGBA_setInputCloud__SWIG_0(swigCPtr, this, wrapper.pcl.PointCloud_PointXYZRGBA.getCPtr(cloud), wrapper.vector_int.getCPtr(indices), indices);
  }

  public void setInputCloud(wrapper.pcl.PointCloud_PointXYZRGBA cloud) {
    wrapper.pcl_moduleJNI.pcl_search_KdTree_PointXYZRGBA_setInputCloud__SWIG_1(swigCPtr, this, wrapper.pcl.PointCloud_PointXYZRGBA.getCPtr(cloud));
  }

  public int nearestKSearch(wrapper.pcl.PointXYZRGBA point, int k, wrapper.vector_int k_indices, wrapper.SWIGTYPE_p_std__vectorT_float_t k_sqr_distances) {
    return wrapper.pcl_moduleJNI.pcl_search_KdTree_PointXYZRGBA_nearestKSearch__SWIG_1(swigCPtr, this, wrapper.pcl.PointXYZRGBA.getCPtr(point), point, k, wrapper.vector_int.getCPtr(k_indices), k_indices, wrapper.SWIGTYPE_p_std__vectorT_float_t.getCPtr(k_sqr_distances));
  }

  public int radiusSearch(wrapper.pcl.PointXYZRGBA point, double radius, wrapper.vector_int k_indices, wrapper.SWIGTYPE_p_std__vectorT_float_t k_sqr_distances, long max_nn) {
    return wrapper.pcl_moduleJNI.pcl_search_KdTree_PointXYZRGBA_radiusSearch__SWIG_1(swigCPtr, this, wrapper.pcl.PointXYZRGBA.getCPtr(point), point, radius, wrapper.vector_int.getCPtr(k_indices), k_indices, wrapper.SWIGTYPE_p_std__vectorT_float_t.getCPtr(k_sqr_distances), max_nn);
  }

  public int radiusSearch(wrapper.pcl.PointXYZRGBA point, double radius, wrapper.vector_int k_indices, wrapper.SWIGTYPE_p_std__vectorT_float_t k_sqr_distances) {
    return wrapper.pcl_moduleJNI.pcl_search_KdTree_PointXYZRGBA_radiusSearch__SWIG_2(swigCPtr, this, wrapper.pcl.PointXYZRGBA.getCPtr(point), point, radius, wrapper.vector_int.getCPtr(k_indices), k_indices, wrapper.SWIGTYPE_p_std__vectorT_float_t.getCPtr(k_sqr_distances));
  }

}