package com.sgv.demo.repositories.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;

import com.sgv.demo.model.Conductor;
import com.sgv.demo.model.Licencia;
import com.sgv.demo.repositories.ConductorRepository;

public class JDBCConductorRepository implements ConductorRepository{

	@Autowired 
	private JdbcTemplate jdbcTemplate;
/*	
	@Autowired 
	private PlatformTransactionManager platformTransactionManager;
*/
	@Autowired 
	private TransactionTemplate transactionTemplate;
	
	@Override
	public void save(Conductor conductor) {
		// TODO Auto-generated method stub
		transactionTemplate.execute(new TransactionCallbackWithoutResult() {
		    protected void doInTransactionWithoutResult(TransactionStatus paramTransactionStatus) {
		    try{
		      String sqlQuery = ""
		      		+ "  INSERT INTO TB_EMPLEADO(\"DNI\",\"nombre\",\"primer_apellido\",\"segundo_apellido\",\"telefono_celular\",\"direccion\",\"correo\",\r\n" + 
		      		"    \"id_tipoLicen\",\"cod_licencia\",\"nro_hijos\",\"cuenta_ahorros\",\"foto\",\"id_dispon\") \r\n" + 
		      		"    VALUES (?,?,?, ?,?,?,?,?,?,?,?,?,?)";
		      
		      jdbcTemplate.update(sqlQuery, 
		    		  			  conductor.getDNI(),
		    		  			  conductor.getNombre(),
		    		  			  conductor.getPrimer_apellido(),
		    		  			  conductor.getSegundo_apellido(),
		    		  			  conductor.getTelefono_celular(),
		    		  			  conductor.getDireccion(),
		    		  			  conductor.getCorreo(),
		    		  			  conductor.getId_tipoLicen(),
		    		  			  conductor.getCod_licencia(),
		    		  			  conductor.getNro_hijos(),
		    		  			  conductor.getCuenta_ahorros(),
		    		  			  conductor.getFoto(),
		    		  			  conductor.getId_dispon());
		    }catch (Exception e) {
		      paramTransactionStatus.setRollbackOnly();
		    }
		    }
		  });
	}

	@Override
	public Conductor get(Integer primaryKey) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Conductor> all() {
		/*	
			return jdbcTemplate.query("SELECT * FROM TB_TIPO_LICENCIA", 
					(rs, rowNum)-> new Conductor(
							
							rs.getString("id_tipoLicen"),
							rs.getString("alcance_licencia"),
							rs.getString("vehiculos_licencia")
							
							));*/
return null;
	}

	@Override
	public void delete(Integer primaryKey) {
		// TODO Auto-generated method stub
		
	}

	
}
