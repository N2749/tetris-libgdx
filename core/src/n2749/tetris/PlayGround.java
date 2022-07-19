package n2749.tetris;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

public class PlayGround {
    int height, width, tileSize, gap;

    public PlayGround() {
        height = 20;
        width = 10;
        tileSize = 15;
        gap = 3;
    }

    public void update() {

    }

    public void draw(ShapeRenderer renderer) {
        for (int y = 0; y < height * (tileSize + gap); y += tileSize + gap) {
            for (int x = 0; x < width * (tileSize + gap); x += tileSize + gap) {
                renderer.rect(x, y, tileSize, tileSize);
            }
        }
    }
}
