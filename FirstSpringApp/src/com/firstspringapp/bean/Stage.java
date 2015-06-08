package com.firstspringapp.bean;

public class Stage {

	private Stage() {
	}

	private static class StageSingletonHolder {
		static Stage stage = new Stage();
	}

	public static Stage getInstance() {
		return StageSingletonHolder.stage;
	}

	public void printStage() {
		System.out.println("stage~~");
	}
}
