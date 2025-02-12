package tim.prune.gui.colour;

import java.awt.Color;

import tim.prune.config.Config;
import tim.prune.data.Track;
import tim.prune.data.TrackInfo;
import tim.prune.gui.profile.GradientData;

/**
 * Colourer based on gradient or glide slope values
 */
public class GradientColourer extends ProfileDataColourer
{
	/**
	 * Constructor
	 * @param inStartColour start colour
	 * @param inEndColour end colour
	 * @param inWideHues true for wide mode, false for narrow
	 */
	public GradientColourer(Color inStartColour, Color inEndColour, boolean inWideHues)
	{
		super(inStartColour, inEndColour, inWideHues);
	}

	@Override
	public void calculateColours(TrackInfo inTrackInfo, Config inConfig)
	{
		Track track = inTrackInfo == null ? null : inTrackInfo.getTrack();
		// Calculate gradient value for each point
		GradientData data = new GradientData(track);
		calculateColours(track, inConfig, data);
	}
}
