 
 import com.mongodb.BasicDBObjectBuilder;
import com.mongodb.DBObject;
  
public class UsuarioConverter {
    
     // classe auxiliar para converter objetos Usuario em MongoDB DBObject e vice-versa.
	public static DBObject toDBObject(Usuario p) {

		BasicDBObjectBuilder builder = BasicDBObjectBuilder.start()
				.append("nome", p.getName());
		if (p.getId() != null)
			builder = builder.append("_id", new ObjectId(p.getId()));
		return builder.get();
	}

	 
	public static Usuario toUsuario(DBObject doc) {
		Usuario p = new Usuario();
		p.setName((String) doc.get("nome")); 
		ObjectId id = (ObjectId) doc.get("_id");
		p.setId(id.toString());
		return p;

	}
	
}
 
    
