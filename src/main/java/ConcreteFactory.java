public class ConcreteFactory extends AbstractFactoryConn {

    @Override
    public IConexion factoryDB(TipoBD conexion) {
        switch (conexion){
            case MONGO:
                return  new ConnMONGODB();
            case ORACLE:
                return new ConnOracle();
            case SQLSERVER:
                return new ConnSQLSERVER();
        }
        return null;
    }
}
