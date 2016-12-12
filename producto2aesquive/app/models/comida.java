package models;

import java.util.*;


import play.data.validation.*;



/**
 * Company entity managed by Ebean
 */
@Entity 
public class comida extends com.avaje.ebean.Model {

    private static final long serialVersionUID = 1L;

	@Id
    public Long id;
    
    @Constraints.Required
    public String name;
    public String tipodecomida;
    public String calorias;
    
    /**
     * Generic query helper for entity Company with id Long
     */
    public static Find<Long,comida> find = new Find<Long,comida>(){};
    
    public static List<comida> listadodecomida() {
		return
		find.all();
		
	};

    public static Map<String,String> options() {
        LinkedHashMap<String,String> options = new LinkedHashMap<String,String>();
        for(comida c: comida.find.orderBy("name").findList()) {
            options.put(c.id.toString(), c.name);
        }
        return options;
    }

}

