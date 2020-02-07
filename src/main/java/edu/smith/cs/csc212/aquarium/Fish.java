package edu.smith.cs.csc212.aquarium;

import java.awt.Color;
import java.awt.Graphics2D;

public class Fish {
	// Every fish has an x which is an int
	int x;
	int y;
	Color color;
	boolean isLittle;
	boolean facingLeft;
	// every fish has a destination
	int destX;
	int destY;
	
	public Fish(Color c, int startX, int startY, boolean isLittle) {
		this.color = c;
		this.x = startX;
		this.y = startY;
		this.isLittle = isLittle;
		
		this.destX = 450;
		this.destY = 450;
	}
	
	public void swim() {
		if(this.y < this.destY) {
		this.y += 1;
		}
	}
	public void draw(Graphics2D g) {
		this.swim();
		DrawFish.smallFacingLeft(g, this.color, this.x, this.y);
		// this is where the setup for the if statement shows up !!!
	}
	
}
