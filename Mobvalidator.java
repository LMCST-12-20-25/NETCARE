package soft;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Mobvalidator {
	
	private Pattern pattern;
    private Matcher matcher;

    private static final String mob_PATTERN = 
        "\\d{10}";
    
    public Mobvalidator() {
        pattern = Pattern.compile(mob_PATTERN);
    }

    /**
     * Validate hex with regular expression
     * 
     * @param hex
     *            hex for validation
     * @return true valid hex, false invalid hex
     */
    public boolean validate(final String hex) {

        matcher = pattern.matcher(hex);
        return matcher.matches();

    }

}
