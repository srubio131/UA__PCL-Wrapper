%nspace pcl::PointXYZRGB;

%include <stdint.i>

%{
#include <pcl/point_types.h>
%}


namespace pcl
{
	struct PointXYZRGB
	{
		PointXYZRGB ();
		PointXYZRGB (float _x, float _y, float _z, float _rgb);
		float x, y, z, rgb;
		float data[4];
	};
}
