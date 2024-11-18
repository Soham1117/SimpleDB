/**
 * 
 */
/**
 * 
 */
module SimpleDB_Engine {
	requires java.sql;
	requires java.rmi;
	requires org.apache.derby.tools;
	exports simpledb.jdbc.network; // Allow other modules (like java.rmi) to access this package
//    requires java.rmi;
}