 
 
import java.util.ArrayList;
import java.util.List;

import org.bson.types.ObjectId;

import com.mongodb.BasicDBObjectBuilder;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
  
public class MongoDBClass {
    
//implementação   do MongoDB   para expor diferentes 
 //operações que podemos executar para o objeto Usuario no banco de dados do MongoDB.
 
	private DBCollection col;

	public MongoDBClass(MongoClient mongo) {
		this.col = mongo.getDB("Projetoweb").getCollection("Usuarios");
	}

	public Usuario createUsuario(Usuario p) {
		DBObject doc = UsuarioConverter.toDBObject(p);
		this.col.insert(doc);
		ObjectId id = (ObjectId) doc.get("_id");
		p.setId(id.toString());
		return p;
	}

	public void updateUsuario(Usuario p) {
		DBObject query = BasicDBObjectBuilder.start()
				.append("_id", new ObjectId(p.getId())).get();
		this.col.update(query, UsuarioConverter.toDBObject(p));
	}

	public List<Usuario> readAllPerson() {
		List<Usuario> data = new ArrayList<Usuario>();
		DBCursor cursor = col.find();
		while (cursor.hasNext()) {
			DBObject doc = cursor.next();
			Usuario p = UsurioConverter.toUsuario(doc);
			data.add(p);
		}
		return data;
	}

	public void deleteUsuario(Usuario p) {
		DBObject query = BasicDBObjectBuilder.start()
				.append("_id", new ObjectId(p.getId())).get();
		this.col.remove(query);
	}

	public Usuario readUsuario(Usuario p) {
		DBObject query = BasicDBObjectBuilder.start()
				.append("_id", new ObjectId(p.getId())).get();
		DBObject data = this.col.findOne(query);
		return UsuarioConverter.toUsuario(data);
                
        }
}