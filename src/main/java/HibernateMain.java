import hibernate.OrmTeams;

import hibernate.config.HibernateUtil;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.hibernate.HibernateException;
import org.hibernate.Session;

import java.util.List;

public class HibernateMain extends Application {

	public static void main(String[] args) {
		launch(args);
		
//		Session session = HibernateUtil.getSessionFactory().openSession();
//
//		try {
//			List<OrmTeams> teamsList = (List<OrmTeams>) session.createQuery(
//					"FROM OrmTeams s ORDER BY s.id ASC").list();
//			System.out.println( teamsList.toString()+"!!!!!!");
//		} catch (HibernateException e) {
//			e.printStackTrace();
//		} finally {
//			if ( session != null && session.isOpen() ) {
//				session.close();
//			}
//			// Shutting down the application
//			HibernateUtil.shutdown();
//		}
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Parent root = FXMLLoader.load(
				getClass().getClassLoader().getResource("fx_samples/sample.fxml"));
		primaryStage.setTitle("Milestone 3: Visual Sensitivity Analysis");
		primaryStage.setScene(new Scene(root, 1200, 800));
		primaryStage.show();
	}
}
