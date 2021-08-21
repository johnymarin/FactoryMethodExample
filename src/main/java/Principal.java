import java.util.Random;

public class Principal {
    public static void main(String[] args){
        IConexion conexion = null;
        ConcreteFactory concreteFactory = new ConcreteFactory();
        Random rnd = new Random();
        Integer var = 0;

        var = rnd.nextInt(4);

        switch (var){
            case 0:
                conexion = concreteFactory.factoryDB(TipoBD.MONGO);
                break;
            case 1:
                conexion = concreteFactory.factoryDB(TipoBD.ORACLE);
                break;
            case 2:
                conexion = concreteFactory.factoryDB(TipoBD.SQLSERVER);
                break;
        }
        conexion.conectarse();
    }
}
