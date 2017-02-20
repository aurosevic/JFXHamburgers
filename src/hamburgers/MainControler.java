package hamburgers;

import java.net.URL;
import java.util.ResourceBundle;

import com.jfoenix.controls.JFXHamburger;
import com.jfoenix.transitions.hamburger.HamburgerBackArrowBasicTransition;
import com.jfoenix.transitions.hamburger.HamburgerBasicCloseTransition;
import com.jfoenix.transitions.hamburger.HamburgerNextArrowBasicTransition;
import com.jfoenix.transitions.hamburger.HamburgerSlideCloseTransition;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

public class MainControler implements Initializable {

    @FXML
    private AnchorPane anchorPane;

    @FXML
    private JFXHamburger hamburgerOne;

    @FXML
    private JFXHamburger hamburgerTwo;

    @FXML
    private JFXHamburger hamburgerThree;

    @FXML
    private JFXHamburger hamburgerFour;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		// Slide Close Transition
		HamburgerSlideCloseTransition transitionOne = new HamburgerSlideCloseTransition(hamburgerOne);
		transitionOne.setRate(-1);
		hamburgerOne.addEventHandler(MouseEvent.MOUSE_CLICKED, (e) -> {
			transitionOne.setRate(transitionOne.getRate() * -1);
			transitionOne.play();
		});
		
		// Basic Close Transition
		HamburgerBasicCloseTransition transitionTwo = new HamburgerBasicCloseTransition(hamburgerTwo);
		transitionTwo.setRate(-1);
		hamburgerTwo.addEventHandler(MouseEvent.MOUSE_CLICKED, (e) -> {
			transitionTwo.setRate(transitionTwo.getRate() * -1);
			transitionTwo.play();
		});
		
		// Back Arrow Basic Transition
		HamburgerBackArrowBasicTransition transitionThree = new HamburgerBackArrowBasicTransition(hamburgerThree);
		transitionThree.setRate(-1);
		hamburgerThree.addEventHandler(MouseEvent.MOUSE_CLICKED, (e) -> {
			transitionThree.setRate(transitionThree.getRate() * -1);
			transitionThree.play();
		});

		// Next Arrow Basic Transition
		HamburgerNextArrowBasicTransition transitionFour = new HamburgerNextArrowBasicTransition(hamburgerFour);
		transitionFour.setRate(-1);
		hamburgerFour.addEventHandler(MouseEvent.MOUSE_CLICKED, (e) -> {
			transitionFour.setRate(transitionFour.getRate() * -1);
			transitionFour.play();
		});
	}
}