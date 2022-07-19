package n2749.tetris;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.*;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.utils.viewport.FitViewport;
import com.badlogic.gdx.utils.viewport.Viewport;

public class Tetris extends ApplicationAdapter {
	ShapeRenderer renderer;
	PlayGround playGround;
	private Viewport viewport;
	private Camera camera;

	private SpriteBatch batch;
	private Texture texture;
	private BitmapFont font;

	@Override
	public void create () {
		font = new BitmapFont();
		font.setColor(0, 0, 0, 1);

		Pixmap pixmap = new Pixmap(16, 16, Pixmap.Format.RGBA8888);
		pixmap.setColor(1, 1, 1, 1);
		pixmap.fill();
		texture = new Texture(pixmap);
		camera = new PerspectiveCamera();
		viewport = new FitViewport(800, 480, camera);
		renderer = new ShapeRenderer();
		playGround = new PlayGround();
		batch = new SpriteBatch();
	}

	@Override
	public void render () {
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
//		Gdx.gl.glClearColor(255f, 250f,235f, 1f);
//		batch.begin();
//		batch.setColor(Color.GREEN);
//		batch.draw(texture, -4096, -4096, 4096, 4096, 8192, 8192, 1, 1, 0, 0, 0, 16, 16, false, false);
//		batch.end();
		renderer.begin(ShapeRenderer.ShapeType.Filled);
		renderer.setColor(new Color(255f, 250f,235f, 1f));
		playGround.draw(renderer);
		renderer.end();
	}
	@Override
	public void resize(int width, int height) {
		viewport.update(width, height);
	}
}
