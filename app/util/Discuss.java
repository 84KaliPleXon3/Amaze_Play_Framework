package util;

import play.data.validation.Constraints.Required;

public class Discuss {
    @Required
    public int commodityId;
    @Required
    public String content;
}
