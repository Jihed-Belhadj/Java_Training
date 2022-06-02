package ch.epfl.moocprog;

import ch.epfl.moocprog.utils.Vec2d;
import static ch.epfl.moocprog.app.Context.getConfig;
import static ch.epfl.moocprog.config.Config.*;

public final class ToricPosition {
	private Vec2d v;
	
	/*algorithme de projection QUESTION 1*/
	private static Vec2d clampedPosition(double x, double y) {
		Vec2d z;		
		if(x < getConfig().getInt(WORLD_WIDTH))
			x+=getConfig().getInt(WORLD_WIDTH);
		else
			if(x >= getConfig().getInt(WORLD_WIDTH))
				x-=getConfig().getInt(WORLD_WIDTH);

		if(y < getConfig().getInt(WORLD_HEIGHT))
			y+=getConfig().getInt(WORLD_HEIGHT);
		else
			if(y >= getConfig().getInt(WORLD_HEIGHT))
				y-=getConfig().getInt(WORLD_HEIGHT);
		return z = new Vec2d(x,y);
	}

	/* constructeur a 2 arguments QUESTION 2*/
	public ToricPosition(double x, double y) {
		this.v= new Vec2d(clampedPosition(x, y).getX(), clampedPosition(x,y).getY());
	}
	
	/* constructeur avec un vecteur comme argument QUESTION 3*/
	public ToricPosition(Vec2d z) {
		this.v=new Vec2d(clampedPosition(z.getX(), z.getY()).getX(), clampedPosition(z.getX(), z.getY()).getY());
	}
	
	/* constructeur par defaut QUESTION 4*/
	public ToricPosition() {
		this.v=new Vec2d(0.0,0.0);
	}
	
	/*QUESTION 5*/
	private ToricPosition add(ToricPosition that) {
		return new ToricPosition(this.v.add(that.v));
	}
	
	/*QUESTION 6*/
	private ToricPosition add(Vec2d vec) {
		return new ToricPosition(this.v.add(vec));
	}
	/*

	private Vec2d toVec2d() {
		return Vec2d ;
	}
	
	private Vec2d toricVector(ToricPosition that) {
		
	}*/

}
