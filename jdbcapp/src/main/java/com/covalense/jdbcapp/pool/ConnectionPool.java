package com.covalense.jdbcapp.pool;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Vector; //vector is synchronized

public class ConnectionPool {
	private Vector<Connection> pool;
	private Connection con = null;
	private String userNM;
	private String password;
	private String driverClassNM;
	private String dbUrl;
	private int poolSize;
	private static ConnectionPool poolRef = null;

	public static ConnectionPool getConnectionPool() throws Exception {
		if (poolRef == null) {
			poolRef = new ConnectionPool();
		}
		return poolRef;
	}

	private void loadProperties() throws Exception {
		poolSize = 10;
		// poolSize =
		// Integer.parseInt(PropertyUtil.getPropertyUtil().getProperty(ConnectionPoolConstants.POOL_SIZE));
		userNM = PropertyUtil.getPropertyUtil().getProperty(ConnectionPoolConstants.USER_NM);
		password = PropertyUtil.getPropertyUtil().getProperty(ConnectionPoolConstants.PASSWORD);
		driverClassNM = PropertyUtil.getPropertyUtil().getProperty(ConnectionPoolConstants.DRIVER_CLASSNM);
		dbUrl = PropertyUtil.getPropertyUtil().getProperty(ConnectionPoolConstants.DB_URL);

	}

	private void initializeProperties() throws Exception {
		pool = new Vector<>();
		
		Class.forName(driverClassNM);
		for (int i = 0; i < poolSize; i++) {
			con = DriverManager.getConnection(dbUrl, userNM, password);
			pool.add(con);

		}
	}

	private ConnectionPool() throws Exception {
		loadProperties();
		initializeProperties();
	}

	public void returnConnectionToPool(Connection con) {
		pool.add(con);
	}

	public Connection getConnectionFromPool() {
		return pool.remove(0);
	}

}
