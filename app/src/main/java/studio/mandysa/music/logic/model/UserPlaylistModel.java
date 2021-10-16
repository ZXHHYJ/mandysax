package studio.mandysa.music.logic.model;

import mandysax.anna2.annotation.Path;
import mandysax.anna2.annotation.Value;

/**
 * @author liuxiaoliu66
 */
public class UserPlaylistModel {
    @Value("id")
    public String id;

    @Value("name")
    public String name;

    @Value("nickname")
    @Path("creator")
    public String nickname;

    @Value("coverImgUrl")
    public String coverImgUrl;

    @Value("signature")
    public String signature;

}
