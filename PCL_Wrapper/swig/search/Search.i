%nspace pcl::search::Search;

%{
#include <pcl/search/search.h>
%}

//making smart pointers here
%shared_ptr(pcl::search::Search<pcl::PointXYZ>)//for making a smart pointer of this class, because swig complaines about making kdtree a smart pointer and it's parent "Search" is not

%shared_ptr(pcl::search::Search<pcl::PointXYZRGBA>)

namespace pcl
{
  namespace search
  {
    /** \brief Generic search class. All search wrappers must inherit from this.
      *
      * Each search method must implement 2 different types of search:
      *   - \b nearestKSearch - search for K-nearest neighbors.
      *   - \b radiusSearch - search for all nearest neighbors in a sphere of a given radius
      *
      * The input to each search method can be given in 3 different ways:
      *   - as a query point
      *   - as a (cloud, index) pair
      *   - as an index
      *
      * For the latter option, it is assumed that the user specified the input
      * via a \ref setInputCloud () method first.
      *
      * \note In case of an error, all methods are supposed to return 0 as the number of neighbors found.
      *
      * \note libpcl_search deals with three-dimensional search problems. For higher
      * level dimensional search, please refer to the libpcl_kdtree module.
      *
      * \author Radu B. Rusu
      * \ingroup search
      */
    template<typename PointT>
    class Search
    {
      public:
        typedef pcl::PointCloud<PointT> PointCloud;
        typedef typename PointCloud::Ptr PointCloudPtr;
        typedef typename PointCloud::ConstPtr PointCloudConstPtr;

        typedef boost::shared_ptr<pcl::search::Search<PointT> > Ptr;
        typedef boost::shared_ptr<const pcl::search::Search<PointT> > ConstPtr;

        typedef boost::shared_ptr<std::vector<int> > IndicesPtr;
        typedef boost::shared_ptr<const std::vector<int> > IndicesConstPtr;

        /** Constructor. */
        Search (const std::string& name = "", bool sorted = false);

        /** Destructor. */
        virtual
        ~Search ();

        /** \brief Returns the search method name
          */
        virtual const std::string& 
        getName () const;

        /** \brief sets whether the results should be sorted (ascending in the distance) or not
          * \param[in] sorted should be true if the results should be sorted by the distance in ascending order.
          * Otherwise the results may be returned in any order.
          */
        virtual void 
        setSortedResults (bool sorted);

        /** \brief Gets whether the results should be sorted (ascending in the distance) or not
          * Otherwise the results may be returned in any order.
          */
        virtual bool 
        getSortedResults ();

        
        /** \brief Pass the input dataset that the search will be performed on.
          * \param[in] cloud a const pointer to the PointCloud data
          * \param[in] indices the point indices subset that is to be used from the cloud
          */
        virtual void
        setInputCloud (const PointCloudConstPtr& cloud, 
                       const IndicesConstPtr &indices = IndicesConstPtr ());

        /** \brief Get a pointer to the input point cloud dataset. */
        virtual PointCloudConstPtr
        getInputCloud () const;

        /** \brief Get a pointer to the vector of indices used. */
        virtual IndicesConstPtr
        getIndices () const;

        /** \brief Search for the k-nearest neighbors for the given query point.
          * \param[in] point the given query point
          * \param[in] k the number of neighbors to search for
          * \param[out] k_indices the resultant indices of the neighboring points (must be resized to \a k a priori!)
          * \param[out] k_sqr_distances the resultant squared distances to the neighboring points (must be resized to \a k
          * a priori!)
          * \return number of neighbors found
          */
        virtual int
        nearestKSearch (const PointT &point, int k, std::vector<int> &k_indices,
                        std::vector<float> &k_sqr_distances) const = 0;

        /** \brief Search for k-nearest neighbors for the given query point.
          * This method accepts a different template parameter for the point type.
          * \param[in] point the given query point
          * \param[in] k the number of neighbors to search for
          * \param[out] k_indices the resultant indices of the neighboring points (must be resized to \a k a priori!)
          * \param[out] k_sqr_distances the resultant squared distances to the neighboring points (must be resized to \a k
          * a priori!)
          * \return number of neighbors found
          */
        template <typename PointTDiff> inline int
        nearestKSearchT (const PointTDiff &point, int k,
                         std::vector<int> &k_indices, std::vector<float> &k_sqr_distances) const;

        /** \brief Search for k-nearest neighbors for the given query point.
          *
          * \attention This method does not do any bounds checking for the input index
          * (i.e., index >= cloud.points.size () || index < 0), and assumes valid (i.e., finite) data.
          *
          * \param[in] cloud the point cloud data
          * \param[in] index a \a valid index in \a cloud representing a \a valid (i.e., finite) query point
          * \param[in] k the number of neighbors to search for
          * \param[out] k_indices the resultant indices of the neighboring points (must be resized to \a k a priori!)
          * \param[out] k_sqr_distances the resultant squared distances to the neighboring points (must be resized to \a k
          * a priori!)
          *
          * \return number of neighbors found
          *
          * \exception asserts in debug mode if the index is not between 0 and the maximum number of points
          */
        virtual int
        nearestKSearch (const PointCloud &cloud, int index, int k,
                        std::vector<int> &k_indices, 
                        std::vector<float> &k_sqr_distances) const;

        /** \brief Search for k-nearest neighbors for the given query point (zero-copy).
          *
          * \attention This method does not do any bounds checking for the input index
          * (i.e., index >= cloud.points.size () || index < 0), and assumes valid (i.e., finite) data.
          *
          * \param[in] index a \a valid index representing a \a valid query point in the dataset given
          * by \a setInputCloud. If indices were given in setInputCloud, index will be the position in
          * the indices vector.
          *
          * \param[in] k the number of neighbors to search for
          * \param[out] k_indices the resultant indices of the neighboring points (must be resized to \a k a priori!)
          * \param[out] k_sqr_distances the resultant squared distances to the neighboring points (must be resized to \a k
          * a priori!)
          * \return number of neighbors found
          *
          * \exception asserts in debug mode if the index is not between 0 and the maximum number of points
          */
        virtual int
        nearestKSearch (int index, int k,
                        std::vector<int> &k_indices, 
                        std::vector<float> &k_sqr_distances) const;

        /** \brief Search for the k-nearest neighbors for the given query point.
          * \param[in] cloud the point cloud data
          * \param[in] indices a vector of point cloud indices to query for nearest neighbors
          * \param[in] k the number of neighbors to search for
          * \param[out] k_indices the resultant indices of the neighboring points, k_indices[i] corresponds to the neighbors of the query point i
          * \param[out] k_sqr_distances the resultant squared distances to the neighboring points, k_sqr_distances[i] corresponds to the neighbors of the query point i
          */
        virtual void
        nearestKSearch (const PointCloud& cloud, const std::vector<int>& indices, 
                        int k, std::vector< std::vector<int> >& k_indices,
                        std::vector< std::vector<float> >& k_sqr_distances) const;

        /** \brief Search for the k-nearest neighbors for the given query point. Use this method if the query points are of a different type than the points in the data set (e.g. PointXYZRGBA instead of PointXYZ).
          * \param[in] cloud the point cloud data
          * \param[in] indices a vector of point cloud indices to query for nearest neighbors
          * \param[in] k the number of neighbors to search for
          * \param[out] k_indices the resultant indices of the neighboring points, k_indices[i] corresponds to the neighbors of the query point i
          * \param[out] k_sqr_distances the resultant squared distances to the neighboring points, k_sqr_distances[i] corresponds to the neighbors of the query point i
          * \note This method copies the input point cloud of type PointTDiff to a temporary cloud of type PointT and performs the batch search on the new cloud. You should prefer the single-point search if you don't use a search algorithm that accelerates batch NN search.
          */
        template <typename PointTDiff> void
        nearestKSearchT (const pcl::PointCloud<PointTDiff> &cloud, const std::vector<int>& indices, int k, std::vector< std::vector<int> > &k_indices,
                         std::vector< std::vector<float> > &k_sqr_distances) const;

        /** \brief Search for all the nearest neighbors of the query point in a given radius.
          * \param[in] point the given query point
          * \param[in] radius the radius of the sphere bounding all of p_q's neighbors
          * \param[out] k_indices the resultant indices of the neighboring points
          * \param[out] k_sqr_distances the resultant squared distances to the neighboring points
          * \param[in] max_nn if given, bounds the maximum returned neighbors to this value. If \a max_nn is set to
          * 0 or to a number higher than the number of points in the input cloud, all neighbors in \a radius will be
          * returned.
          * \return number of neighbors found in radius
          */
        virtual int
        radiusSearch (const PointT& point, double radius, std::vector<int>& k_indices,
                      std::vector<float>& k_sqr_distances, unsigned int max_nn = 0) const = 0;

        /** \brief Search for all the nearest neighbors of the query point in a given radius.
          * \param[in] point the given query point
          * \param[in] radius the radius of the sphere bounding all of p_q's neighbors
          * \param[out] k_indices the resultant indices of the neighboring points
          * \param[out] k_sqr_distances the resultant squared distances to the neighboring points
          * \param[in] max_nn if given, bounds the maximum returned neighbors to this value. If \a max_nn is set to
          * 0 or to a number higher than the number of points in the input cloud, all neighbors in \a radius will be
          * returned.
          * \return number of neighbors found in radius
          */
        template <typename PointTDiff> inline int
        radiusSearchT (const PointTDiff &point, double radius, std::vector<int> &k_indices,
                       std::vector<float> &k_sqr_distances, unsigned int max_nn = 0) const;

        /** \brief Search for all the nearest neighbors of the query point in a given radius.
          *
          * \attention This method does not do any bounds checking for the input index
          * (i.e., index >= cloud.points.size () || index < 0), and assumes valid (i.e., finite) data.
          *
          * \param[in] cloud the point cloud data
          * \param[in] index a \a valid index in \a cloud representing a \a valid (i.e., finite) query point
          * \param[in] radius the radius of the sphere bounding all of p_q's neighbors
          * \param[out] k_indices the resultant indices of the neighboring points
          * \param[out] k_sqr_distances the resultant squared distances to the neighboring points
          * \param[in] max_nn if given, bounds the maximum returned neighbors to this value. If \a max_nn is set to
          * 0 or to a number higher than the number of points in the input cloud, all neighbors in \a radius will be
          * returned.
          * \return number of neighbors found in radius
          *
          * \exception asserts in debug mode if the index is not between 0 and the maximum number of points
          */
        virtual int
        radiusSearch (const PointCloud &cloud, int index, double radius,
                      std::vector<int> &k_indices, std::vector<float> &k_sqr_distances,
                      unsigned int max_nn = 0) const;

        /** \brief Search for all the nearest neighbors of the query point in a given radius (zero-copy).
          *
          * \attention This method does not do any bounds checking for the input index
          * (i.e., index >= cloud.points.size () || index < 0), and assumes valid (i.e., finite) data.
          *
          * \param[in] index a \a valid index representing a \a valid query point in the dataset given
          * by \a setInputCloud. If indices were given in setInputCloud, index will be the position in
          * the indices vector.
          *
          * \param[in] radius the radius of the sphere bounding all of p_q's neighbors
          * \param[out] k_indices the resultant indices of the neighboring points
          * \param[out] k_sqr_distances the resultant squared distances to the neighboring points
          * \param[in] max_nn if given, bounds the maximum returned neighbors to this value. If \a max_nn is set to
          * 0 or to a number higher than the number of points in the input cloud, all neighbors in \a radius will be
          * returned.
          * \return number of neighbors found in radius
          *
          * \exception asserts in debug mode if the index is not between 0 and the maximum number of points
          */
        virtual int
        radiusSearch (int index, double radius, std::vector<int> &k_indices,
                      std::vector<float> &k_sqr_distances, unsigned int max_nn = 0) const;

        /** \brief Search for all the nearest neighbors of the query point in a given radius.
          * \param[in] cloud the point cloud data
          * \param[in] indices the indices in \a cloud. If indices is empty, neighbors will be searched for all points.
          * \param[in] radius the radius of the sphere bounding all of p_q's neighbors
          * \param[out] k_indices the resultant indices of the neighboring points, k_indices[i] corresponds to the neighbors of the query point i
          * \param[out] k_sqr_distances the resultant squared distances to the neighboring points, k_sqr_distances[i] corresponds to the neighbors of the query point i
          * \param[in] max_nn if given, bounds the maximum returned neighbors to this value. If \a max_nn is set to
          * 0 or to a number higher than the number of points in the input cloud, all neighbors in \a radius will be
          * returned.
          */
        virtual void
        radiusSearch (const PointCloud& cloud,
                      const std::vector<int>& indices,
                      double radius,
                      std::vector< std::vector<int> >& k_indices,
                      std::vector< std::vector<float> > &k_sqr_distances,
                      unsigned int max_nn = 0) const;

        /** \brief Search for all the nearest neighbors of the query points in a given radius.
          * \param[in] cloud the point cloud data
          * \param[in] indices a vector of point cloud indices to query for nearest neighbors
          * \param[in] radius the radius of the sphere bounding all of p_q's neighbors
          * \param[out] k_indices the resultant indices of the neighboring points, k_indices[i] corresponds to the neighbors of the query point i
          * \param[out] k_sqr_distances the resultant squared distances to the neighboring points, k_sqr_distances[i] corresponds to the neighbors of the query point i
          * \param[in] max_nn if given, bounds the maximum returned neighbors to this value. If \a max_nn is set to
          * 0 or to a number higher than the number of points in the input cloud, all neighbors in \a radius will be
          * returned.
          * \note This method copies the input point cloud of type PointTDiff to a temporary cloud of type PointT and performs the batch search on the new cloud. You should prefer the single-point search if you don't use a search algorithm that accelerates batch NN search.
          */
        template <typename PointTDiff> void
        radiusSearchT (const pcl::PointCloud<PointTDiff> &cloud,
                       const std::vector<int>& indices,
                       double radius,
                       std::vector< std::vector<int> > &k_indices,
                       std::vector< std::vector<float> > &k_sqr_distances,
                       unsigned int max_nn = 0) const;

      protected:
        void 
        sortResults (std::vector<int>& indices, std::vector<float>& distances) const;

        PointCloudConstPtr input_;
        IndicesConstPtr indices_;
        bool sorted_results_;
        std::string name_;
        
      private:
        struct Compare
        {
          Compare (const std::vector<float>& distances)
          : distances_ (distances)
          {
          }
          
          bool 
          operator () (int first, int second) const
          {
            return (distances_ [first] < distances_[second]);
          }

          const std::vector<float>& distances_;
        };
    }; // class Search    
  } // namespace search
} // namespace pcl


//making instances of the template to be used within java
%import "../point_types/Normal.i"
%template (Search_PointXYZ) pcl::search::Search<pcl::PointXYZ>;
%template (Search_PointXYZRGBA) pcl::search::Search<pcl::PointXYZRGBA>;
//don't forget to use make smart pointers of this instance of template at line 7
