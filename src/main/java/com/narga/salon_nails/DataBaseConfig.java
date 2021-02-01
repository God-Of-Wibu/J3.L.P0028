package com.narga.salon_nails;

import javax.sql.DataSource;

import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class DataBaseConfig {
	
	public DataSource dataSource() {
		DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
		driverManagerDataSource.setDriverClassName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		driverManagerDataSource.setUsername("sa");
		driverManagerDataSource.setPassword("Narga1408");
		driverManagerDataSource.setUrl("jdbc:sqlserver://localhost:1433;databaseName=");
		return driverManagerDataSource;
	}

}
