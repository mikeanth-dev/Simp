package objects.filters.binary;

import objects.image.Pixel;

public class ORFilter extends AbstractBinaryFilter {
	/** Performs a bitwise OR operation between each color channel of pixels a and b */
	@Override
	protected Pixel binOp(Pixel a, Pixel b) {
		return new Pixel(
			a.getRedChannel() | b.getRedChannel(),
			a.getGreenChannel() | b.getGreenChannel(),
			a.getBlueChannel() | b.getBlueChannel()
		);
	}
}
