package com.sgv.demo.repositories.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;

import com.sgv.demo.model.Vehiculo;
import com.sgv.demo.repositories.VehiculoRepository;

//public class JDBCVehiculoRepository {
@Repository
public class JDBCVehiculoRepository implements VehiculoRepository {
	
	@Autowired
	private JdbcTemplate jdbctemplate;
	
	@Autowired
	private TransactionTemplate transactionTemplate;
		
		
	@Override
	public void save(Vehiculo vehiculo) {
			transactionTemplate.execute(new TransactionCallbackWithoutResult() {
				protected void doInTransactionWithoutResult(TransactionStatus paramTransactionStatus) {
					try {
						String sql = "insert into tb_vehiculo( \"matricula\",\"id_tipo_vehiculo\",      \r\n" + 
								"\"carga_max\",\"marca_vehiculo\",\r\n" + 
								"\"gasolina\",\"modelo_vehiculo\",\r\n" + 
								"\"años_vehiculo\",\"frenos delanteros\",\r\n" + 
								"\"motor_vehiculo\",\"nro_llantas\",\r\n" + 
								"\"repuesto_llantas\",\"foto\",\"id_estado\")".concat("values(?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
						jdbctemplate.update(sql,
								vehiculo.getMatricula(),
								vehiculo.getId_tipo_vehiculo(),
								vehiculo.getCarga_max(),
								vehiculo.getMarca_vehiculo(),
								vehiculo.getGasolina(),
								vehiculo.getModelo_vehiculo(),
								vehiculo.getAños_vehiculo(),
								vehiculo.getFrenos_delanteros(),
								vehiculo.getMotor_vehiculo(),
								vehiculo.getNro_llantas(),
								vehiculo.getRepuesto_llantas(),
								vehiculo.getFoto(),
								vehiculo.getId_estado());
					} catch (Exception e) {
						 paramTransactionStatus.setRollbackOnly();
					}
				}
			});
		}
	
		@Override
		public Vehiculo get(String primaryKey) {
			String sqlQuery ="SELECT * FROM TB_vehiculo WHERE \"matricula\" = ?";
			 return jdbctemplate.queryForObject(
		               sqlQuery,
		                new Object[]{primaryKey},
		                (rs, rowNum) ->
		                        new Vehiculo(
		                        		rs.getString("matricula"),
		        						rs.getInt("id_tipo_vehiculo"),
		        						rs.getInt("carga_max"),
		        						rs.getString("marca_vehiculo"),
		        						rs.getString("gasolina"),
		        						rs.getString("modelo_vehiculo"),
		        						rs.getInt("años_vehiculo"),
		        						rs.getDouble("kilometraje"),
		        						rs.getString("frenos_delanteros"),
		        						rs.getString("motor_vehiculo"),
		        						rs.getInt("nro_llantas"),
		        						rs.getInt("repuesto_llantas"),
		        						rs.getString("foto"),
		        						rs.getInt("id_estado")
		    							));
		}
		@Override
		public List<Vehiculo> all() {
			String sql="select * from tb_vehiculos";
			return jdbctemplate.query(sql, 
					(rs, rowNum)-> new Vehiculo(
							rs.getString("matricula"),
							rs.getInt("id_tipo_vehiculo"),
							rs.getInt("carga_max"),
							rs.getString("marca_vehiculo"),
							rs.getString("gasolina"),
							rs.getString("modelo_vehiculo"),
							rs.getInt("años_vehiculo"),
							rs.getDouble("kilometraje"),
							rs.getString("frenos_delanteros"),
							rs.getString("motor_vehiculo"),
							rs.getInt("nro_llantas"),
							rs.getInt("repuesto_llantas"),
							rs.getString("foto"),
							rs.getInt("id_estado")
							));
		}
	
		public void changeState(String id) {
			jdbctemplate.update(
	                "update tb_vehiculo set \"id_estado\" = 3 where \"matricula\"= ?; ",
	                	id);
		}
		public int update(Vehiculo vehiculo) {
			return jdbctemplate.update(
	                "update tb_vehiculo set \"id_estado\" = ? where \"matricula\"= ?",
	                vehiculo.getId_estado(),
	                vehiculo.getMatricula());
		}

		
}