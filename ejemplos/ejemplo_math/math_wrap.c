/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.2
 *
 * This file is not intended to be easily readable and contains a number of
 * coding conventions designed to improve portability and efficiency. Do not make
 * changes to this file unless you know what you are doing--modify the SWIG
 * interface file instead.
 * ----------------------------------------------------------------------------- */

#define SWIGJAVA

/* -----------------------------------------------------------------------------
 *  This section contains generic SWIG labels for method/variable
 *  declarations/attributes, and other compiler dependent labels.
 * ----------------------------------------------------------------------------- */

/* template workaround for compilers that cannot correctly implement the C++ standard */
#ifndef SWIGTEMPLATEDISAMBIGUATOR
# if defined(__SUNPRO_CC) && (__SUNPRO_CC <= 0x560)
#  define SWIGTEMPLATEDISAMBIGUATOR template
# elif defined(__HP_aCC)
/* Needed even with `aCC -AA' when `aCC -V' reports HP ANSI C++ B3910B A.03.55 */
/* If we find a maximum version that requires this, the test would be __HP_aCC <= 35500 for A.03.55 */
#  define SWIGTEMPLATEDISAMBIGUATOR template
# else
#  define SWIGTEMPLATEDISAMBIGUATOR
# endif
#endif

/* inline attribute */
#ifndef SWIGINLINE
# if defined(__cplusplus) || (defined(__GNUC__) && !defined(__STRICT_ANSI__))
#   define SWIGINLINE inline
# else
#   define SWIGINLINE
# endif
#endif

/* attribute recognised by some compilers to avoid 'unused' warnings */
#ifndef SWIGUNUSED
# if defined(__GNUC__)
#   if !(defined(__cplusplus)) || (__GNUC__ > 3 || (__GNUC__ == 3 && __GNUC_MINOR__ >= 4))
#     define SWIGUNUSED __attribute__ ((__unused__))
#   else
#     define SWIGUNUSED
#   endif
# elif defined(__ICC)
#   define SWIGUNUSED __attribute__ ((__unused__))
# else
#   define SWIGUNUSED
# endif
#endif

#ifndef SWIG_MSC_UNSUPPRESS_4505
# if defined(_MSC_VER)
#   pragma warning(disable : 4505) /* unreferenced local function has been removed */
# endif
#endif

#ifndef SWIGUNUSEDPARM
# ifdef __cplusplus
#   define SWIGUNUSEDPARM(p)
# else
#   define SWIGUNUSEDPARM(p) p SWIGUNUSED
# endif
#endif

/* internal SWIG method */
#ifndef SWIGINTERN
# define SWIGINTERN static SWIGUNUSED
#endif

/* internal inline SWIG method */
#ifndef SWIGINTERNINLINE
# define SWIGINTERNINLINE SWIGINTERN SWIGINLINE
#endif

/* exporting methods */
#if (__GNUC__ >= 4) || (__GNUC__ == 3 && __GNUC_MINOR__ >= 4)
#  ifndef GCC_HASCLASSVISIBILITY
#    define GCC_HASCLASSVISIBILITY
#  endif
#endif

#ifndef SWIGEXPORT
# if defined(_WIN32) || defined(__WIN32__) || defined(__CYGWIN__)
#   if defined(STATIC_LINKED)
#     define SWIGEXPORT
#   else
#     define SWIGEXPORT __declspec(dllexport)
#   endif
# else
#   if defined(__GNUC__) && defined(GCC_HASCLASSVISIBILITY)
#     define SWIGEXPORT __attribute__ ((visibility("default")))
#   else
#     define SWIGEXPORT
#   endif
# endif
#endif

/* calling conventions for Windows */
#ifndef SWIGSTDCALL
# if defined(_WIN32) || defined(__WIN32__) || defined(__CYGWIN__)
#   define SWIGSTDCALL __stdcall
# else
#   define SWIGSTDCALL
# endif
#endif

/* Deal with Microsoft's attempt at deprecating C standard runtime functions */
#if !defined(SWIG_NO_CRT_SECURE_NO_DEPRECATE) && defined(_MSC_VER) && !defined(_CRT_SECURE_NO_DEPRECATE)
# define _CRT_SECURE_NO_DEPRECATE
#endif

/* Deal with Microsoft's attempt at deprecating methods in the standard C++ library */
#if !defined(SWIG_NO_SCL_SECURE_NO_DEPRECATE) && defined(_MSC_VER) && !defined(_SCL_SECURE_NO_DEPRECATE)
# define _SCL_SECURE_NO_DEPRECATE
#endif



/* Fix for jlong on some versions of gcc on Windows */
#if defined(__GNUC__) && !defined(__INTEL_COMPILER)
  typedef long long __int64;
#endif

/* Fix for jlong on 64-bit x86 Solaris */
#if defined(__x86_64)
# ifdef _LP64
#   undef _LP64
# endif
#endif

#include <jni.h>
#include <stdlib.h>
#include <string.h>


/* Support for throwing Java exceptions */
typedef enum {
  SWIG_JavaOutOfMemoryError = 1, 
  SWIG_JavaIOException, 
  SWIG_JavaRuntimeException, 
  SWIG_JavaIndexOutOfBoundsException,
  SWIG_JavaArithmeticException,
  SWIG_JavaIllegalArgumentException,
  SWIG_JavaNullPointerException,
  SWIG_JavaDirectorPureVirtual,
  SWIG_JavaUnknownError
} SWIG_JavaExceptionCodes;

typedef struct {
  SWIG_JavaExceptionCodes code;
  const char *java_exception;
} SWIG_JavaExceptions_t;


static void SWIGUNUSED SWIG_JavaThrowException(JNIEnv *jenv, SWIG_JavaExceptionCodes code, const char *msg) {
  jclass excep;
  static const SWIG_JavaExceptions_t java_exceptions[] = {
    { SWIG_JavaOutOfMemoryError, "java/lang/OutOfMemoryError" },
    { SWIG_JavaIOException, "java/io/IOException" },
    { SWIG_JavaRuntimeException, "java/lang/RuntimeException" },
    { SWIG_JavaIndexOutOfBoundsException, "java/lang/IndexOutOfBoundsException" },
    { SWIG_JavaArithmeticException, "java/lang/ArithmeticException" },
    { SWIG_JavaIllegalArgumentException, "java/lang/IllegalArgumentException" },
    { SWIG_JavaNullPointerException, "java/lang/NullPointerException" },
    { SWIG_JavaDirectorPureVirtual, "java/lang/RuntimeException" },
    { SWIG_JavaUnknownError,  "java/lang/UnknownError" },
    { (SWIG_JavaExceptionCodes)0,  "java/lang/UnknownError" }
  };
  const SWIG_JavaExceptions_t *except_ptr = java_exceptions;

  while (except_ptr->code != code && except_ptr->code)
    except_ptr++;

  (*jenv)->ExceptionClear(jenv);
  excep = (*jenv)->FindClass(jenv, except_ptr->java_exception);
  if (excep)
    (*jenv)->ThrowNew(jenv, excep, msg);
}


/* Contract support */

#define SWIG_contract_assert(nullreturn, expr, msg) if (!(expr)) {SWIG_JavaThrowException(jenv, SWIG_JavaIllegalArgumentException, msg); return nullreturn; } else


#include <math.h>


#ifdef __cplusplus
extern "C" {
#endif

SWIGEXPORT jdouble JNICALL Java_swig_mathJNI_cos(JNIEnv *jenv, jclass jcls, jdouble jarg1) {
  jdouble jresult = 0 ;
  double arg1 ;
  double result;
  
  (void)jenv;
  (void)jcls;
  arg1 = (double)jarg1; 
  result = (double)cos(arg1);
  jresult = (jdouble)result; 
  return jresult;
}


SWIGEXPORT jdouble JNICALL Java_swig_mathJNI_sin(JNIEnv *jenv, jclass jcls, jdouble jarg1) {
  jdouble jresult = 0 ;
  double arg1 ;
  double result;
  
  (void)jenv;
  (void)jcls;
  arg1 = (double)jarg1; 
  result = (double)sin(arg1);
  jresult = (jdouble)result; 
  return jresult;
}


SWIGEXPORT jdouble JNICALL Java_swig_mathJNI_tan(JNIEnv *jenv, jclass jcls, jdouble jarg1) {
  jdouble jresult = 0 ;
  double arg1 ;
  double result;
  
  (void)jenv;
  (void)jcls;
  arg1 = (double)jarg1; 
  result = (double)tan(arg1);
  jresult = (jdouble)result; 
  return jresult;
}


SWIGEXPORT jdouble JNICALL Java_swig_mathJNI_acos(JNIEnv *jenv, jclass jcls, jdouble jarg1) {
  jdouble jresult = 0 ;
  double arg1 ;
  double result;
  
  (void)jenv;
  (void)jcls;
  arg1 = (double)jarg1; 
  result = (double)acos(arg1);
  jresult = (jdouble)result; 
  return jresult;
}


SWIGEXPORT jdouble JNICALL Java_swig_mathJNI_asin(JNIEnv *jenv, jclass jcls, jdouble jarg1) {
  jdouble jresult = 0 ;
  double arg1 ;
  double result;
  
  (void)jenv;
  (void)jcls;
  arg1 = (double)jarg1; 
  result = (double)asin(arg1);
  jresult = (jdouble)result; 
  return jresult;
}


SWIGEXPORT jdouble JNICALL Java_swig_mathJNI_atan(JNIEnv *jenv, jclass jcls, jdouble jarg1) {
  jdouble jresult = 0 ;
  double arg1 ;
  double result;
  
  (void)jenv;
  (void)jcls;
  arg1 = (double)jarg1; 
  result = (double)atan(arg1);
  jresult = (jdouble)result; 
  return jresult;
}


SWIGEXPORT jdouble JNICALL Java_swig_mathJNI_atan2(JNIEnv *jenv, jclass jcls, jdouble jarg1, jdouble jarg2) {
  jdouble jresult = 0 ;
  double arg1 ;
  double arg2 ;
  double result;
  
  (void)jenv;
  (void)jcls;
  arg1 = (double)jarg1; 
  arg2 = (double)jarg2; 
  result = (double)atan2(arg1,arg2);
  jresult = (jdouble)result; 
  return jresult;
}


SWIGEXPORT jdouble JNICALL Java_swig_mathJNI_cosh(JNIEnv *jenv, jclass jcls, jdouble jarg1) {
  jdouble jresult = 0 ;
  double arg1 ;
  double result;
  
  (void)jenv;
  (void)jcls;
  arg1 = (double)jarg1; 
  result = (double)cosh(arg1);
  jresult = (jdouble)result; 
  return jresult;
}


SWIGEXPORT jdouble JNICALL Java_swig_mathJNI_sinh(JNIEnv *jenv, jclass jcls, jdouble jarg1) {
  jdouble jresult = 0 ;
  double arg1 ;
  double result;
  
  (void)jenv;
  (void)jcls;
  arg1 = (double)jarg1; 
  result = (double)sinh(arg1);
  jresult = (jdouble)result; 
  return jresult;
}


SWIGEXPORT jdouble JNICALL Java_swig_mathJNI_tanh(JNIEnv *jenv, jclass jcls, jdouble jarg1) {
  jdouble jresult = 0 ;
  double arg1 ;
  double result;
  
  (void)jenv;
  (void)jcls;
  arg1 = (double)jarg1; 
  result = (double)tanh(arg1);
  jresult = (jdouble)result; 
  return jresult;
}


SWIGEXPORT jdouble JNICALL Java_swig_mathJNI_exp(JNIEnv *jenv, jclass jcls, jdouble jarg1) {
  jdouble jresult = 0 ;
  double arg1 ;
  double result;
  
  (void)jenv;
  (void)jcls;
  arg1 = (double)jarg1; 
  result = (double)exp(arg1);
  jresult = (jdouble)result; 
  return jresult;
}


SWIGEXPORT jdouble JNICALL Java_swig_mathJNI_log(JNIEnv *jenv, jclass jcls, jdouble jarg1) {
  jdouble jresult = 0 ;
  double arg1 ;
  double result;
  
  (void)jenv;
  (void)jcls;
  arg1 = (double)jarg1; 
  result = (double)log(arg1);
  jresult = (jdouble)result; 
  return jresult;
}


SWIGEXPORT jdouble JNICALL Java_swig_mathJNI_log10(JNIEnv *jenv, jclass jcls, jdouble jarg1) {
  jdouble jresult = 0 ;
  double arg1 ;
  double result;
  
  (void)jenv;
  (void)jcls;
  arg1 = (double)jarg1; 
  result = (double)log10(arg1);
  jresult = (jdouble)result; 
  return jresult;
}


SWIGEXPORT jdouble JNICALL Java_swig_mathJNI_pow(JNIEnv *jenv, jclass jcls, jdouble jarg1, jdouble jarg2) {
  jdouble jresult = 0 ;
  double arg1 ;
  double arg2 ;
  double result;
  
  (void)jenv;
  (void)jcls;
  arg1 = (double)jarg1; 
  arg2 = (double)jarg2; 
  result = (double)pow(arg1,arg2);
  jresult = (jdouble)result; 
  return jresult;
}


SWIGEXPORT jdouble JNICALL Java_swig_mathJNI_sqrt(JNIEnv *jenv, jclass jcls, jdouble jarg1) {
  jdouble jresult = 0 ;
  double arg1 ;
  double result;
  
  (void)jenv;
  (void)jcls;
  arg1 = (double)jarg1; 
  result = (double)sqrt(arg1);
  jresult = (jdouble)result; 
  return jresult;
}


SWIGEXPORT jdouble JNICALL Java_swig_mathJNI_fabs(JNIEnv *jenv, jclass jcls, jdouble jarg1) {
  jdouble jresult = 0 ;
  double arg1 ;
  double result;
  
  (void)jenv;
  (void)jcls;
  arg1 = (double)jarg1; 
  result = (double)fabs(arg1);
  jresult = (jdouble)result; 
  return jresult;
}


SWIGEXPORT jdouble JNICALL Java_swig_mathJNI_ceil(JNIEnv *jenv, jclass jcls, jdouble jarg1) {
  jdouble jresult = 0 ;
  double arg1 ;
  double result;
  
  (void)jenv;
  (void)jcls;
  arg1 = (double)jarg1; 
  result = (double)ceil(arg1);
  jresult = (jdouble)result; 
  return jresult;
}


SWIGEXPORT jdouble JNICALL Java_swig_mathJNI_floor(JNIEnv *jenv, jclass jcls, jdouble jarg1) {
  jdouble jresult = 0 ;
  double arg1 ;
  double result;
  
  (void)jenv;
  (void)jcls;
  arg1 = (double)jarg1; 
  result = (double)floor(arg1);
  jresult = (jdouble)result; 
  return jresult;
}


SWIGEXPORT jdouble JNICALL Java_swig_mathJNI_fmod(JNIEnv *jenv, jclass jcls, jdouble jarg1, jdouble jarg2) {
  jdouble jresult = 0 ;
  double arg1 ;
  double arg2 ;
  double result;
  
  (void)jenv;
  (void)jcls;
  arg1 = (double)jarg1; 
  arg2 = (double)jarg2; 
  result = (double)fmod(arg1,arg2);
  jresult = (jdouble)result; 
  return jresult;
}


SWIGEXPORT jdouble JNICALL Java_swig_mathJNI_M_1E_1get(JNIEnv *jenv, jclass jcls) {
  jdouble jresult = 0 ;
  double result;
  
  (void)jenv;
  (void)jcls;
  result = (double)(2.7182818284590452354);
  jresult = (jdouble)result; 
  return jresult;
}


SWIGEXPORT jdouble JNICALL Java_swig_mathJNI_M_1LOG2E_1get(JNIEnv *jenv, jclass jcls) {
  jdouble jresult = 0 ;
  double result;
  
  (void)jenv;
  (void)jcls;
  result = (double)(1.4426950408889634074);
  jresult = (jdouble)result; 
  return jresult;
}


SWIGEXPORT jdouble JNICALL Java_swig_mathJNI_M_1LOG10E_1get(JNIEnv *jenv, jclass jcls) {
  jdouble jresult = 0 ;
  double result;
  
  (void)jenv;
  (void)jcls;
  result = (double)(0.43429448190325182765);
  jresult = (jdouble)result; 
  return jresult;
}


SWIGEXPORT jdouble JNICALL Java_swig_mathJNI_M_1LN2_1get(JNIEnv *jenv, jclass jcls) {
  jdouble jresult = 0 ;
  double result;
  
  (void)jenv;
  (void)jcls;
  result = (double)(0.69314718055994530942);
  jresult = (jdouble)result; 
  return jresult;
}


SWIGEXPORT jdouble JNICALL Java_swig_mathJNI_M_1LN10_1get(JNIEnv *jenv, jclass jcls) {
  jdouble jresult = 0 ;
  double result;
  
  (void)jenv;
  (void)jcls;
  result = (double)(2.30258509299404568402);
  jresult = (jdouble)result; 
  return jresult;
}


SWIGEXPORT jdouble JNICALL Java_swig_mathJNI_M_1PI_1get(JNIEnv *jenv, jclass jcls) {
  jdouble jresult = 0 ;
  double result;
  
  (void)jenv;
  (void)jcls;
  result = (double)(3.14159265358979323846);
  jresult = (jdouble)result; 
  return jresult;
}


SWIGEXPORT jdouble JNICALL Java_swig_mathJNI_M_1PI_12_1get(JNIEnv *jenv, jclass jcls) {
  jdouble jresult = 0 ;
  double result;
  
  (void)jenv;
  (void)jcls;
  result = (double)(1.57079632679489661923);
  jresult = (jdouble)result; 
  return jresult;
}


SWIGEXPORT jdouble JNICALL Java_swig_mathJNI_M_1PI_14_1get(JNIEnv *jenv, jclass jcls) {
  jdouble jresult = 0 ;
  double result;
  
  (void)jenv;
  (void)jcls;
  result = (double)(0.78539816339744830962);
  jresult = (jdouble)result; 
  return jresult;
}


SWIGEXPORT jdouble JNICALL Java_swig_mathJNI_M_11_1PI_1get(JNIEnv *jenv, jclass jcls) {
  jdouble jresult = 0 ;
  double result;
  
  (void)jenv;
  (void)jcls;
  result = (double)(0.31830988618379067154);
  jresult = (jdouble)result; 
  return jresult;
}


SWIGEXPORT jdouble JNICALL Java_swig_mathJNI_M_12_1PI_1get(JNIEnv *jenv, jclass jcls) {
  jdouble jresult = 0 ;
  double result;
  
  (void)jenv;
  (void)jcls;
  result = (double)(0.63661977236758134308);
  jresult = (jdouble)result; 
  return jresult;
}


SWIGEXPORT jdouble JNICALL Java_swig_mathJNI_M_12_1SQRTPI_1get(JNIEnv *jenv, jclass jcls) {
  jdouble jresult = 0 ;
  double result;
  
  (void)jenv;
  (void)jcls;
  result = (double)(1.12837916709551257390);
  jresult = (jdouble)result; 
  return jresult;
}


SWIGEXPORT jdouble JNICALL Java_swig_mathJNI_M_1SQRT2_1get(JNIEnv *jenv, jclass jcls) {
  jdouble jresult = 0 ;
  double result;
  
  (void)jenv;
  (void)jcls;
  result = (double)(1.41421356237309504880);
  jresult = (jdouble)result; 
  return jresult;
}


SWIGEXPORT jdouble JNICALL Java_swig_mathJNI_M_1SQRT1_12_1get(JNIEnv *jenv, jclass jcls) {
  jdouble jresult = 0 ;
  double result;
  
  (void)jenv;
  (void)jcls;
  result = (double)(0.70710678118654752440);
  jresult = (jdouble)result; 
  return jresult;
}


#ifdef __cplusplus
}
#endif
