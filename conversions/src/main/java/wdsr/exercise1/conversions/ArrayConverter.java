package wdsr.exercise1.conversions;

import java.io.IOException;
import java.util.Arrays;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by Marek on 14.02.2016.
 */
public class ArrayConverter {
	private static final Logger log = LogManager.getLogger();
	
	public int[] convertToInts(String[] strings) {
		log.debug("entered [strings={}]", Arrays.toString(strings));    	
    	
		if (strings.length == 0) {
            log.debug("No input provided");
        }
        
        int[] result = Arrays.stream(strings).mapToInt(Integer::valueOf).toArray();
        log.debug("exiting  with [result={}]",Arrays.toString(result));
        return result;
    }
}
