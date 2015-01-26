package com.jianinz.chinesewatchface;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Bundle;
import android.support.wearable.watchface.CanvasWatchFaceService;
import android.view.SurfaceHolder;

public class ChineseWatchFaceService extends CanvasWatchFaceService {
	@Override
	public Engine onCreateEngine() {
		/* provide your watch face implementation */
		return new Engine();
	}

	/* implement service callback methods */
	private class Engine extends CanvasWatchFaceService.Engine {
		@Override
		public void onVisibilityChanged(boolean visible) {
			super.onVisibilityChanged(visible);
			/* the watch face became visible or invisible */
		}

		@Override
		public void onCreate(SurfaceHolder holder) {
			super.onCreate(holder);
			/* initialize your watch face */
		}

		@Override
		public void onTimeTick() {
			super.onTimeTick();
			/* the time changed */
		}

		@Override
		public void onPropertiesChanged(Bundle properties) {
			super.onPropertiesChanged(properties);
			/* get device features (burn-in, low-bit ambient) */
		}

		@Override
		public void onAmbientModeChanged(boolean inAmbientMode) {
			super.onAmbientModeChanged(inAmbientMode);
			/* the wearable switched between modes */
		}

		@Override
		public void onDraw(Canvas canvas, Rect bounds) {
			super.onDraw(canvas, bounds);
			/* draw your watch face */
		}
	}
}
