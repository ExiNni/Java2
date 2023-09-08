package com.kh.mvc.circle.mo.CircleMain;

import com.kh.mvc.circle.mo.CircleController.CircleController;
import com.kh.mvc.circle.mo.CircleModel.CircleModel;
import com.kh.mvc.circle.mo.CircleView.CircleView;

public class CircleMain {

	public static void main(String[] args) {

		CircleModel cModel = new CircleModel(5, 3.14);
		
		CircleView cView = new CircleView();
		
		CircleController cController = new CircleController(cModel, cView);
		
		cController.updateView();
	}

}
