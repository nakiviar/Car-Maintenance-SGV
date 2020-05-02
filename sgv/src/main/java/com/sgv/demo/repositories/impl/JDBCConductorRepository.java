package com.sgv.demo.repositories.impl;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;

import com.sgv.demo.model.Conductor;
import com.sgv.demo.model.Licencia;
import com.sgv.demo.repositories.ConductorRepository;


@Repository
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
		      		+ "  INSERT INTO TB_EMPLEADO(\"DNI\",\"nombre\",\"primer_apellido\",\"segundo_apellido\",\"telefono_celular\",\"direccion\",\"correo\"," + 
		      		"    \"id_tipoLicen\",\"cod_licencia\",\"nro_hijos\",\"cuenta_ahorros\",\"foto\",\"id_dispon\") VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)";
		      
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
		      System.out.println("Cliente creado con el id : "+ conductor.getId_empleado());
	
		    }catch (Exception e) {
		    	System.out.println(e);
		    	
		      paramTransactionStatus.setRollbackOnly();
		      System.out.println("ERROR EN EL INSERT CONDUCTOR");
		    }
		    }
		  });
	}

	@Override
	public Conductor get(String primaryKey) {
		// TODO Auto-generated method stub
		String sqlQuery ="SELECT * FROM TB_EMPLEADO WHERE \"id_empleado\" = ?";

		 return jdbcTemplate.queryForObject(
	               sqlQuery,
	                new Object[]{primaryKey},
	                (rs, rowNum) ->
	                        new Conductor(
	    							rs.getString("id_empleado"),
	    							rs.getLong("DNI"),
	    							rs.getString("nombre"),
	    							rs.getString("primer_apellido"),
	    							rs.getString("segundo_apellido"),
	    							rs.getLong("telefono_celular"),
	    							rs.getString("direccion"),
	    							rs.getString("correo"),
	    							rs.getString("id_tipoLicen"),
	    							rs.getString("cod_licencia"),
	    							rs.getLong("nro_hijos"),
	    							rs.getLong("cuenta_ahorros"),
	    							rs.getString("foto"),
	    							rs.getLong("id_dispon")
	    							
	    							));
	}

	@Override
	public List<Conductor> all() {
	
			return jdbcTemplate.query("SELECT * FROM TB_EMPLEADO", 
					(rs, rowNum)-> new Conductor(
							rs.getString("id_empleado"),
							rs.getLong("DNI"),
							rs.getString("nombre"),
							rs.getString("primer_apellido"),
							rs.getString("segundo_apellido"),
							rs.getLong("telefono_celular"),
							rs.getString("direccion"),
							rs.getString("correo"),
							rs.getString("id_tipoLicen"),
							rs.getString("cod_licencia"),
							rs.getLong("nro_hijos"),
							rs.getLong("cuenta_ahorros"),
							rs.getString("foto"),
							rs.getLong("id_dispon")
							));
	}

	@Override
	public void changeState(String id) {
		
		jdbcTemplate.update(
                "update TB_EMPLEADO set \"id_dispon\" = 3 where \"id_empleado\" = ?",
                id);

	}

	@Override
	public int update(Conductor conductor) {
		int i =0;
	try {
		System.out.println(conductor.getId_empleado());
		System.out.println(conductor.getCorreo());
	 i=	jdbcTemplate.update(
                "update TB_EMPLEADO set \"DNI\"=?,\"nombre\"=?,\"primer_apellido\"=?,\"segundo_apellido\"=?,"
                + "\"telefono_celular\"=?,\"direccion\"=?,\"correo\"=?, \"id_tipoLicen\"=?,\"cod_licencia\"=?,"
                + "\"nro_hijos\"=?,\"cuenta_ahorros\"=?,\"foto\"=?,\"id_dispon\"=? where \"id_empleado\" = ?",
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
	  			  conductor.getId_dispon(),
	  			  conductor.getId_empleado());

		System.out.println(conductor.getNombre());
	}catch (Exception e) {
		System.out.println(e);
	}
	return i ;
	
	}




	
}
