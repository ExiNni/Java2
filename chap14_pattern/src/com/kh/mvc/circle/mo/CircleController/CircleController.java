package com.kh.mvc.circle.mo.CircleController;

import com.kh.mvc.circle.mo.CircleModel.CircleModel;
import com.kh.mvc.circle.mo.CircleView.CircleView;

public class CircleController {
	private CircleModel circlemodel;
	private CircleView circleview;
	
	public CircleController(CircleModel circlemodel, CircleView circleview) {
		this.circlemodel = circlemodel;
		this.circleview = circleview;
	}
	
	public void setRadius() {
		circlemodel.setRadius(5);
	}
	
	public void setPI() {
		circlemodel.setPI(3.14);
	}
	
	public void getRadius() {
		circlemodel.getRadius();
	}
	
	public void getPI() {
		circlemodel.getPI();
	}
	
	public void updateView() {
		circleview.displayInfo(circlemodel.getRadius(), circlemodel.getPI());
	}

}
