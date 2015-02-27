/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package wrapper.pcl;

public class PointCloud_Point_types {
  private long swigCPtr;
  private boolean swigCMemOwn;

  public PointCloud_Point_types(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(PointCloud_Point_types obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        wrapper.pcl_moduleJNI.delete_pcl_PointCloud_Point_types(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public PointCloud_Point_types() {
    this(wrapper.pcl_moduleJNI.new_pcl_PointCloud_Point_types__SWIG_0(), true);
  }

  public PointCloud_Point_types(wrapper.pcl.PointCloud_Point_types pc) {
    this(wrapper.pcl_moduleJNI.new_pcl_PointCloud_Point_types__SWIG_1(wrapper.pcl.PointCloud_Point_types.getCPtr(pc), pc), true);
  }

  public PointCloud_Point_types(wrapper.pcl.PointCloud_Point_types pc, wrapper.vector_int indices) {
    this(wrapper.pcl_moduleJNI.new_pcl_PointCloud_Point_types__SWIG_3(wrapper.pcl.PointCloud_Point_types.getCPtr(pc), pc, wrapper.vector_int.getCPtr(indices), indices), true);
  }

  public PointCloud_Point_types(long width_, long height_, wrapper.SWIGTYPE_p_pcl__Point_types value_) {
    this(wrapper.pcl_moduleJNI.new_pcl_PointCloud_Point_types__SWIG_4(width_, height_, wrapper.SWIGTYPE_p_pcl__Point_types.getCPtr(value_)), true);
  }

  public PointCloud_Point_types(long width_, long height_) {
    this(wrapper.pcl_moduleJNI.new_pcl_PointCloud_Point_types__SWIG_5(width_, height_), true);
  }

  public wrapper.pcl.PointCloud_Point_types Add_To_Self(wrapper.pcl.PointCloud_Point_types rhs) {
    return new wrapper.pcl.PointCloud_Point_types(wrapper.pcl_moduleJNI.pcl_PointCloud_Point_types_Add_To_Self(swigCPtr, this, wrapper.pcl.PointCloud_Point_types.getCPtr(rhs), rhs), true);
  }

  public wrapper.pcl.PointCloud_Point_types Add(wrapper.pcl.PointCloud_Point_types rhs) {
    return new wrapper.pcl.PointCloud_Point_types(wrapper.pcl_moduleJNI.pcl_PointCloud_Point_types_Add(swigCPtr, this, wrapper.pcl.PointCloud_Point_types.getCPtr(rhs), rhs), true);
  }

  public wrapper.SWIGTYPE_p_pcl__Point_types at(int column, int row) {
    return new wrapper.SWIGTYPE_p_pcl__Point_types(wrapper.pcl_moduleJNI.pcl_PointCloud_Point_types_at__SWIG_0(swigCPtr, this, column, row), false);
  }

  public wrapper.SWIGTYPE_p_pcl__Point_types at(long column, long row) {
    return new wrapper.SWIGTYPE_p_pcl__Point_types(wrapper.pcl_moduleJNI.pcl_PointCloud_Point_types_at__SWIG_2(swigCPtr, this, column, row), false);
  }

  public boolean isOrganized() {
    return wrapper.pcl_moduleJNI.pcl_PointCloud_Point_types_isOrganized(swigCPtr, this);
  }

  public wrapper.SWIGTYPE_p_std__vectorT_pcl__Point_types_Eigen__aligned_allocatorT_pcl__Point_types_t_t__iterator begin() {
    return new wrapper.SWIGTYPE_p_std__vectorT_pcl__Point_types_Eigen__aligned_allocatorT_pcl__Point_types_t_t__iterator(wrapper.pcl_moduleJNI.pcl_PointCloud_Point_types_begin__SWIG_0(swigCPtr, this), true);
  }

  public wrapper.SWIGTYPE_p_std__vectorT_pcl__Point_types_Eigen__aligned_allocatorT_pcl__Point_types_t_t__iterator end() {
    return new wrapper.SWIGTYPE_p_std__vectorT_pcl__Point_types_Eigen__aligned_allocatorT_pcl__Point_types_t_t__iterator(wrapper.pcl_moduleJNI.pcl_PointCloud_Point_types_end__SWIG_0(swigCPtr, this), true);
  }

  public long size() {
    return wrapper.pcl_moduleJNI.pcl_PointCloud_Point_types_size(swigCPtr, this);
  }

  public void reserve(long n) {
    wrapper.pcl_moduleJNI.pcl_PointCloud_Point_types_reserve(swigCPtr, this, n);
  }

  public boolean empty() {
    return wrapper.pcl_moduleJNI.pcl_PointCloud_Point_types_empty(swigCPtr, this);
  }

  public void resize(long n) {
    wrapper.pcl_moduleJNI.pcl_PointCloud_Point_types_resize(swigCPtr, this, n);
  }

  public wrapper.SWIGTYPE_p_pcl__Point_types at(long n) {
    return new wrapper.SWIGTYPE_p_pcl__Point_types(wrapper.pcl_moduleJNI.pcl_PointCloud_Point_types_at__SWIG_4(swigCPtr, this, n), false);
  }

  public wrapper.SWIGTYPE_p_pcl__Point_types front() {
    return new wrapper.SWIGTYPE_p_pcl__Point_types(wrapper.pcl_moduleJNI.pcl_PointCloud_Point_types_front__SWIG_0(swigCPtr, this), false);
  }

  public wrapper.SWIGTYPE_p_pcl__Point_types back() {
    return new wrapper.SWIGTYPE_p_pcl__Point_types(wrapper.pcl_moduleJNI.pcl_PointCloud_Point_types_back__SWIG_0(swigCPtr, this), false);
  }

  public void push_back(wrapper.SWIGTYPE_p_pcl__Point_types pt) {
    wrapper.pcl_moduleJNI.pcl_PointCloud_Point_types_push_back(swigCPtr, this, wrapper.SWIGTYPE_p_pcl__Point_types.getCPtr(pt));
  }

  public wrapper.SWIGTYPE_p_std__vectorT_pcl__Point_types_Eigen__aligned_allocatorT_pcl__Point_types_t_t__iterator insert(wrapper.SWIGTYPE_p_std__vectorT_pcl__Point_types_Eigen__aligned_allocatorT_pcl__Point_types_t_t__iterator position, wrapper.SWIGTYPE_p_pcl__Point_types pt) {
    return new wrapper.SWIGTYPE_p_std__vectorT_pcl__Point_types_Eigen__aligned_allocatorT_pcl__Point_types_t_t__iterator(wrapper.pcl_moduleJNI.pcl_PointCloud_Point_types_insert__SWIG_0(swigCPtr, this, wrapper.SWIGTYPE_p_std__vectorT_pcl__Point_types_Eigen__aligned_allocatorT_pcl__Point_types_t_t__iterator.getCPtr(position), wrapper.SWIGTYPE_p_pcl__Point_types.getCPtr(pt)), true);
  }

  public void insert(wrapper.SWIGTYPE_p_std__vectorT_pcl__Point_types_Eigen__aligned_allocatorT_pcl__Point_types_t_t__iterator position, long n, wrapper.SWIGTYPE_p_pcl__Point_types pt) {
    wrapper.pcl_moduleJNI.pcl_PointCloud_Point_types_insert__SWIG_1(swigCPtr, this, wrapper.SWIGTYPE_p_std__vectorT_pcl__Point_types_Eigen__aligned_allocatorT_pcl__Point_types_t_t__iterator.getCPtr(position), n, wrapper.SWIGTYPE_p_pcl__Point_types.getCPtr(pt));
  }

  public wrapper.SWIGTYPE_p_std__vectorT_pcl__Point_types_Eigen__aligned_allocatorT_pcl__Point_types_t_t__iterator erase(wrapper.SWIGTYPE_p_std__vectorT_pcl__Point_types_Eigen__aligned_allocatorT_pcl__Point_types_t_t__iterator position) {
    return new wrapper.SWIGTYPE_p_std__vectorT_pcl__Point_types_Eigen__aligned_allocatorT_pcl__Point_types_t_t__iterator(wrapper.pcl_moduleJNI.pcl_PointCloud_Point_types_erase__SWIG_0(swigCPtr, this, wrapper.SWIGTYPE_p_std__vectorT_pcl__Point_types_Eigen__aligned_allocatorT_pcl__Point_types_t_t__iterator.getCPtr(position)), true);
  }

  public wrapper.SWIGTYPE_p_std__vectorT_pcl__Point_types_Eigen__aligned_allocatorT_pcl__Point_types_t_t__iterator erase(wrapper.SWIGTYPE_p_std__vectorT_pcl__Point_types_Eigen__aligned_allocatorT_pcl__Point_types_t_t__iterator first, wrapper.SWIGTYPE_p_std__vectorT_pcl__Point_types_Eigen__aligned_allocatorT_pcl__Point_types_t_t__iterator last) {
    return new wrapper.SWIGTYPE_p_std__vectorT_pcl__Point_types_Eigen__aligned_allocatorT_pcl__Point_types_t_t__iterator(wrapper.pcl_moduleJNI.pcl_PointCloud_Point_types_erase__SWIG_1(swigCPtr, this, wrapper.SWIGTYPE_p_std__vectorT_pcl__Point_types_Eigen__aligned_allocatorT_pcl__Point_types_t_t__iterator.getCPtr(first), wrapper.SWIGTYPE_p_std__vectorT_pcl__Point_types_Eigen__aligned_allocatorT_pcl__Point_types_t_t__iterator.getCPtr(last)), true);
  }

  public void swap(wrapper.pcl.PointCloud_Point_types rhs) {
    wrapper.pcl_moduleJNI.pcl_PointCloud_Point_types_swap(swigCPtr, this, wrapper.pcl.PointCloud_Point_types.getCPtr(rhs), rhs);
  }

  public void clear() {
    wrapper.pcl_moduleJNI.pcl_PointCloud_Point_types_clear(swigCPtr, this);
  }

  public wrapper.pcl.PointCloud_Point_types makeShared() {
    long cPtr = wrapper.pcl_moduleJNI.pcl_PointCloud_Point_types_makeShared(swigCPtr, this);
    return (cPtr == 0) ? null : new wrapper.pcl.PointCloud_Point_types(cPtr, true);
  }

  public void setHeader(wrapper.SWIGTYPE_p_pcl__PCLHeader value) {
    wrapper.pcl_moduleJNI.pcl_PointCloud_Point_types_header_set(swigCPtr, this, wrapper.SWIGTYPE_p_pcl__PCLHeader.getCPtr(value));
  }

  public wrapper.SWIGTYPE_p_pcl__PCLHeader getHeader() {
    return new wrapper.SWIGTYPE_p_pcl__PCLHeader(wrapper.pcl_moduleJNI.pcl_PointCloud_Point_types_header_get(swigCPtr, this), true);
  }

  public void setPoints(wrapper.SWIGTYPE_p_std__vectorT_pcl__Point_types_Eigen__aligned_allocatorT_pcl__Point_types_t_t value) {
    wrapper.pcl_moduleJNI.pcl_PointCloud_Point_types_points_set(swigCPtr, this, wrapper.SWIGTYPE_p_std__vectorT_pcl__Point_types_Eigen__aligned_allocatorT_pcl__Point_types_t_t.getCPtr(value));
  }

  public wrapper.SWIGTYPE_p_std__vectorT_pcl__Point_types_Eigen__aligned_allocatorT_pcl__Point_types_t_t getPoints() {
    long cPtr = wrapper.pcl_moduleJNI.pcl_PointCloud_Point_types_points_get(swigCPtr, this);
    return (cPtr == 0) ? null : new wrapper.SWIGTYPE_p_std__vectorT_pcl__Point_types_Eigen__aligned_allocatorT_pcl__Point_types_t_t(cPtr, false);
  }

  public void setWidth(long value) {
    wrapper.pcl_moduleJNI.pcl_PointCloud_Point_types_width_set(swigCPtr, this, value);
  }

  public long getWidth() {
    return wrapper.pcl_moduleJNI.pcl_PointCloud_Point_types_width_get(swigCPtr, this);
  }

  public void setHeight(long value) {
    wrapper.pcl_moduleJNI.pcl_PointCloud_Point_types_height_set(swigCPtr, this, value);
  }

  public long getHeight() {
    return wrapper.pcl_moduleJNI.pcl_PointCloud_Point_types_height_get(swigCPtr, this);
  }

  public void setIs_dense(boolean value) {
    wrapper.pcl_moduleJNI.pcl_PointCloud_Point_types_is_dense_set(swigCPtr, this, value);
  }

  public boolean getIs_dense() {
    return wrapper.pcl_moduleJNI.pcl_PointCloud_Point_types_is_dense_get(swigCPtr, this);
  }

  public void setSensor_origin_(wrapper.SWIGTYPE_p_Eigen__Vector4f value) {
    wrapper.pcl_moduleJNI.pcl_PointCloud_Point_types_sensor_origin__set(swigCPtr, this, wrapper.SWIGTYPE_p_Eigen__Vector4f.getCPtr(value));
  }

  public wrapper.SWIGTYPE_p_Eigen__Vector4f getSensor_origin_() {
    return new wrapper.SWIGTYPE_p_Eigen__Vector4f(wrapper.pcl_moduleJNI.pcl_PointCloud_Point_types_sensor_origin__get(swigCPtr, this), true);
  }

  public void setSensor_orientation_(wrapper.SWIGTYPE_p_Eigen__Quaternionf value) {
    wrapper.pcl_moduleJNI.pcl_PointCloud_Point_types_sensor_orientation__set(swigCPtr, this, wrapper.SWIGTYPE_p_Eigen__Quaternionf.getCPtr(value));
  }

  public wrapper.SWIGTYPE_p_Eigen__Quaternionf getSensor_orientation_() {
    return new wrapper.SWIGTYPE_p_Eigen__Quaternionf(wrapper.pcl_moduleJNI.pcl_PointCloud_Point_types_sensor_orientation__get(swigCPtr, this), true);
  }

}
