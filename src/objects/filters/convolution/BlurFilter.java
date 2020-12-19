package objects.filters.convolution;

public class BlurFilter extends AbstractConvolutionFilter {
	public static final double[][] BOX_BLUR = {
		{ 1/9.0, 1/9.0, 1/9.0},
		{ 1/9.0, 1/9.0, 1/9.0},
		{ 1/9.0, 1/9.0, 1/9.0}
	};
	public static final double[][] GAUSSIAN_BLUR_3 = {
		{ 1/16.0, 2/16.0, 1/16.0},
		{ 2/16.0, 4/16.0, 2/16.0},
		{ 1/16.0, 2/16.0, 1/16.0}
	};
	public static final double[][] GAUSSIAN_BLUR_5 = {
		{1/256.0,  4/256.0,  6/256.0,  4/256.0, 1/256.0},
		{4/256.0, 16/256.0, 24/256.0, 16/256.0, 4/256.0},
		{6/256.0, 24/256.0, 36/256.0, 24/256.0, 6/256.0},
		{4/256.0, 16/256.0, 24/256.0, 16/256.0, 4/256.0},
		{1/256.0,  4/256.0,  6/256.0,  4/256.0, 1/256.0}
	};

	public BlurFilter(double[][] kernel) {
		this.kernel = kernel;
	}
}
